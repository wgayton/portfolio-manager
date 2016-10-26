package org.portfoliomanager.clients;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AccountTest {

    private Account account;

    @Before
    public void setUp() throws Exception {
        Logger.getRootLogger().setLevel(Level.ALL);
        account = Account.getTestInstance();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetAccount() throws Exception {
//        ClassLoader loader = Thread.currentThread().getContextClassLoader();
//        URL url = loader.getResource("account_72906.tmp.xml");
//        Logger.getRootLogger().info(url.getFile());
//        final AccountType mock = Converter.fromXmlFile(url.getFile(), AccountType.class);
//        final AccountType account = this.account.getAccount();
//
//        String jsonMock = Converter.toJson(mock);
//        String jsonLive = Converter.toJson(account);
//
//        assertEquals(jsonMock, jsonLive);
    }

    @Test
    public void testCreateAccount() throws Exception {

    }

    @Test
    public void testUpdateAccount() throws Exception {

    }

    @Test
    public void testGetCustomFieldList() throws Exception {

    }

    @Test
    public void testGetCustomer() throws Exception {

    }

    @Test
    public void testGetCustomerList() throws Exception {

    }

    @Test
    public void testGetEspCustomerMapping() throws Exception {

    }

    @Test
    public void testCreateCustomer() throws Exception {

    }

    @Test
    public void testUpdateCustomer() throws Exception {

    }

    @Test
    public void testGetDataExchangeSettings() throws Exception {

    }

    @Test
    public void testUpdateDataExchangeSettings() throws Exception {

    }

    @Test
    public void testGetDataExchangeCustomField() throws Exception {

    }

    @Test
    public void testGetDataExchangeCustomFieldList() throws Exception {

    }

    @Test
    public void testCreateDataExchangeCustomField() throws Exception {

    }

    @Test
    public void testUpdateDataExchangeCustomField() throws Exception {

    }

    @Test
    public void testDeleteDataExchangeCustomField() throws Exception {

    }
}