package org.portfoliomanager.helpers;


import org.apache.log4j.Logger;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.logging.LoggingFeature;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class SingletonHttpClient {
    private static volatile boolean initialized = false;
    private static final Boolean lock = Boolean.TRUE;
    private static WebTarget resource;

    private String username;
    private String password;
    private String uri;

    private Logger logger = Logger.getLogger(getClass());

    private SingletonHttpClient() {
        Properties prop = new Properties();
        InputStream inputStream = null;
        try {
            ClassLoader loader = Thread.currentThread().getContextClassLoader();
            inputStream = loader.getResourceAsStream("portfolioManager.properties");
            if (inputStream == null) {
                throw new IllegalArgumentException("Unable to load configuration from the "
                        + "portfolioManager.properties" + " file on the classpath");
            }
            prop.load(inputStream);

            username = prop.getProperty("portfolio_manager.live.username");
            password = prop.getProperty("portfolio_manager.live.password");
            uri      = prop.getProperty("portfolio_manager.live.uri");

        } catch (IOException ex) {
            logger.error(ex);
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    logger.error(e);
                }
            }
        }
    }

    public static WebTarget getResource() {
        if(!initialized) {
            SingletonHttpClient instance = new SingletonHttpClient();
            instance.initialize();
        }
        return resource;
    }

    @SuppressWarnings("Duplicates")
    private void initialize() {
        if(initialized) return;

        synchronized(lock){
            if(initialized) return;
            initialized = true;
            try{
                HttpAuthenticationFeature feature = HttpAuthenticationFeature.basicBuilder()
                        .nonPreemptive()
                        .credentials(username, password)
                        .build();

                ClientConfig clientConfig = new ClientConfig();
                clientConfig.register(LoggingFeature.class)
                        .register(JacksonFeature.class)
                        .register(feature)
                        .property(LoggingFeature.LOGGING_FEATURE_LOGGER_LEVEL, "INFO");

                resource = ClientBuilder.newClient(clientConfig).target(uri);
            } catch(Exception e){
                logger.error(e);
            }
        }
    }
}
