package org.portfoliomanager.helpers;

import org.apache.log4j.Logger;

/**
 * Created by wgayton on 2/6/16.
 */
public class JerseyLoggingFacade extends java.util.logging.Logger {
    Logger logger = Logger.getLogger(getClass());

    public JerseyLoggingFacade() {
        super("Jersey",null);
    }
    @Override
    public void info(String logMessage) {
        logger.debug(logMessage);
    }
}
