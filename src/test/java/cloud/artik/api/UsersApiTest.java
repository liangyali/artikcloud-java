/*
 * ARTIK Cloud API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package cloud.artik.api;

import cloud.artik.client.ApiException;
import cloud.artik.model.AppProperties;
import cloud.artik.model.DeviceSharingEnvelope;
import cloud.artik.model.DeviceTypesEnvelope;
import cloud.artik.model.DevicesEnvelope;
import cloud.artik.model.PropertiesEnvelope;
import cloud.artik.model.RulesEnvelope;
import cloud.artik.model.UserEnvelope;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersApi
 */
@Ignore
public class UsersApiTest {

    private final UsersApi api = new UsersApi();

    
    /**
     * Create User Application Properties
     *
     * Create application properties for a user
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createUserPropertiesTest() throws ApiException {
        String userId = null;
        AppProperties properties = null;
        String aid = null;
        PropertiesEnvelope response = api.createUserProperties(userId, properties, aid);

        // TODO: test validations
    }
    
    /**
     * Delete User Application Properties
     *
     * Deletes a user&#39;s application properties
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteUserPropertiesTest() throws ApiException {
        String userId = null;
        String aid = null;
        PropertiesEnvelope response = api.deleteUserProperties(userId, aid);

        // TODO: test validations
    }
    
    /**
     * Get Current User Profile
     *
     * Get&#39;s the current user&#39;s profile
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSelfTest() throws ApiException {
        UserEnvelope response = api.getSelf();

        // TODO: test validations
    }
    
    /**
     * Get User Device Types
     *
     * Retrieve User&#39;s Device Types
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserDeviceTypesTest() throws ApiException {
        String userId = null;
        Integer offset = null;
        Integer count = null;
        Boolean includeShared = null;
        DeviceTypesEnvelope response = api.getUserDeviceTypes(userId, offset, count, includeShared);

        // TODO: test validations
    }
    
    /**
     * Get User Devices
     *
     * Retrieve User&#39;s Devices
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserDevicesTest() throws ApiException {
        String userId = null;
        Integer offset = null;
        Integer count = null;
        Boolean includeProperties = null;
        String owner = null;
        Boolean includeShareInfo = null;
        String dtid = null;
        DevicesEnvelope response = api.getUserDevices(userId, offset, count, includeProperties, owner, includeShareInfo, dtid);

        // TODO: test validations
    }
    
    /**
     * Get User application properties
     *
     * Get application properties of a user
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserPropertiesTest() throws ApiException {
        String userId = null;
        String aid = null;
        PropertiesEnvelope response = api.getUserProperties(userId, aid);

        // TODO: test validations
    }
    
    /**
     * Get User Rules
     *
     * Retrieve User&#39;s Rules
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserRulesTest() throws ApiException {
        String userId = null;
        Boolean excludeDisabled = null;
        Integer count = null;
        Integer offset = null;
        String owner = null;
        RulesEnvelope response = api.getUserRules(userId, excludeDisabled, count, offset, owner);

        // TODO: test validations
    }
    
    /**
     * Get User shares
     *
     * Get User shares
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAllSharesForUserTest() throws ApiException {
        String userId = null;
        String filter = null;
        Integer count = null;
        Integer offset = null;
        DeviceSharingEnvelope response = api.listAllSharesForUser(userId, filter, count, offset);

        // TODO: test validations
    }
    
    /**
     * Update User Application Properties
     *
     * Updates application properties of a user
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateUserPropertiesTest() throws ApiException {
        String userId = null;
        AppProperties properties = null;
        String aid = null;
        PropertiesEnvelope response = api.updateUserProperties(userId, properties, aid);

        // TODO: test validations
    }
    
}
