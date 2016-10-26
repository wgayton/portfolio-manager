package org.portfoliomanager.clients;

import org.apache.log4j.Logger;
import org.portfoliomanager.entities.*;
import org.portfoliomanager.helpers.SingletonHttpClient;
import org.portfoliomanager.helpers.SingletonHttpClientTest;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.math.BigInteger;

@SuppressWarnings({"unused", "WeakerAccess"})
public class Account {
    protected Logger logger = Logger.getLogger(getClass());
    private WebTarget service;

    public Account() {}

    public Account(boolean testMode) {
        service = testMode ? SingletonHttpClientTest.getResource() : SingletonHttpClient.getResource();
    }

    static public Account getTestInstance() {
        return new Account(true);
    }

    static public Account getInstance() {
        return new Account(false);
    }



    public AccountType getAccount() {
        return service.path("account")
                .request()
                .get(AccountType.class);
    }

    public ResponseType createAccount(AccountType account) {
        return service.path("account")
                .request(MediaType.APPLICATION_XML)
                .post(Entity.entity(account, MediaType.APPLICATION_XML), ResponseType.class);
    }

    public ResponseType updateAccount(AccountType account) {
        return service.path("account")
                .request(MediaType.APPLICATION_XML)
                .put(Entity.entity(account, MediaType.APPLICATION_XML), ResponseType.class);
    }

    public CustomFieldList getCustomFieldList(Long accountId) {
        return service.path("account")
                .path(accountId.toString())
                .path("customFieldList")
                .request(MediaType.APPLICATION_XML)
                .get(CustomFieldList.class);
    }




    public Customer getCustomer(BigInteger customerId){
        return service.path("customer")
                .path(customerId.toString())
                .request(MediaType.APPLICATION_XML)
                .get(Customer.class);
    }

    public Customer getCustomerList(){
        return service.path("customer")
                .path("list")
                .request(MediaType.APPLICATION_XML)
                .get(Customer.class);
    }

    public MappingType getEspCustomerMapping(String espCustID){
        return service.path("mapping")
                .path("customer")
                .path(espCustID)
                .request(MediaType.APPLICATION_XML)
                .get(MappingType.class);
    }

    public ResponseType createCustomer(Customer customer){
        return service.path("customer")
                .request(MediaType.APPLICATION_XML)
                .post(Entity.entity(customer, MediaType.APPLICATION_XML), ResponseType.class);
    }

    public ResponseType updateCustomer(Customer customer, BigInteger customerId){
        return service.path("customer").path(customerId.toString())
                .request(MediaType.APPLICATION_XML)
                .put(Entity.entity(customer, MediaType.APPLICATION_XML), ResponseType.class);
    }



    public DataExchangeSettings getDataExchangeSettings() {
        return service.path("dataExchangeSettings")
                .request(MediaType.APPLICATION_XML)
                .get(DataExchangeSettings.class);
    }

    public ResponseType updateDataExchangeSettings(DataExchangeSettings dataExchangeSettings) {
        return service.path("dataExchangeSettings")
                .request(MediaType.APPLICATION_XML)
                .put(Entity.entity(dataExchangeSettings, MediaType.APPLICATION_XML), ResponseType.class);
    }

    public CustomField getDataExchangeCustomField(Long customFieldId) {
        return service.path("dataExchangeSettings")
                .path("customField")
                .path(customFieldId.toString())
                .request(MediaType.APPLICATION_XML)
                .get(CustomField.class);
    }

    public ResponseType getDataExchangeCustomFieldList() {
        return service.path("dataExchangeSettings")
                .path("customField")
                .path("list")
                .request(MediaType.APPLICATION_XML)
                .get(ResponseType.class);
    }

    public ResponseType createDataExchangeCustomField(CustomField customField) {
        return service.path("dataExchangeSettings")
                .path("customField")
                .request(MediaType.APPLICATION_XML)
                .post(Entity.entity(customField, MediaType.APPLICATION_XML), ResponseType.class);
    }

    public ResponseType updateDataExchangeCustomField(CustomField customField, Long customFieldId) {
        return service.path("dataExchangeSettings")
                .path("customField")
                .path(customFieldId.toString())
                .request(MediaType.APPLICATION_XML)
                .put(Entity.entity(customField, MediaType.APPLICATION_XML), ResponseType.class);
    }

    public ResponseType deleteDataExchangeCustomField(Long customFieldId) {
        return service.path("dataExchangeSettings")
                .path("customField")
                .path(customFieldId.toString())
                .request(MediaType.APPLICATION_XML)
                .delete(ResponseType.class);
    }
}
