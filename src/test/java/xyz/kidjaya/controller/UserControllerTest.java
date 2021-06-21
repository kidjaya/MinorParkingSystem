package xyz.kidjaya.controller;

import org.junit.Test;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.transaction.annotation.Transactional;
import xyz.kidjaya.base.ControllerTestBase;
import xyz.kidjaya.utils.AssertResult;

import java.util.HashMap;
import java.util.UUID;

@Transactional
public class UserControllerTest extends ControllerTestBase {

    @Override
    public void beforeTest() {

    }

    @Override
    public void afterTest() {

    }

    @Test
    public void given_user_when_newUserRegister_then_addUserInfoSuccess() throws Exception {
        String requestUrl = "/user";
        HashMap<String, String> requestParams = new HashMap<>();
        requestParams.put("id", UUID.randomUUID().toString());
        requestParams. put("nickname", "kidjaya");
        HashMap<String, Object> expectResult = new HashMap<>();
        expectResult.put("$.success", true);
        expectResult.put("$.code", 20000);
        expectResult.put("$.message", "成功");

        ResultActions result = post(
                requestUrl,
                requestParams
        );
        AssertResult.match(
                result,
                expectResult
        );
    }

    @Test
    public void given_user_when_searchUserInfo_then_returnUserInfoSuccess() throws Exception {
        String requestUrl = "/user";
        HashMap<String, String> requestParams = new HashMap<>();
        requestParams.put("id", "123123");
        HashMap<String, Object> expectResult = new HashMap<>();
        expectResult.put("$.success", true);
        expectResult.put("$.code", 20000);
        expectResult.put("$.message", "成功");

        ResultActions result = get(
                requestUrl,
                requestParams
        );

        AssertResult.match(
                result,
                expectResult
        );
    }

    @Test()
    public void given_user_when_userLogoutAccountOrBlacklist_then_removeUserSuccess() throws Exception {
        String requestUrl = "/user";
        HashMap<String, String> requestParams = new HashMap<>();
        requestParams.put("id", "123123");
        HashMap<String, Object> expectResult = new HashMap<>();
        expectResult.put("$.success", true);
        expectResult.put("$.code", 20000);
        expectResult.put("$.message", "成功");

        ResultActions result = delete(
                requestUrl,
                requestParams
        );
        AssertResult.match(
                result,
                expectResult
        );


    }

    @Test
    public void given_user_when_userChangeAccountInfo_then_alterUserInfoSuccess() throws Exception {
        String requestUrl = "/user";
        HashMap<String, String> requestParams = new HashMap<>();
        requestParams.put("id", "123123");
        HashMap<String, Object> expectResult = new HashMap<>();
        expectResult.put("$.success", true);
        expectResult.put("$.code", 20000);
        expectResult.put("$.message", "成功");

        ResultActions result = put(
                requestUrl,
                requestParams
        );

        AssertResult.match(
                result,
                expectResult
        );

    }

    @Test
    public void given_user_when_bindOfficialAccounts_then_bindAccountSuccess() throws Exception {
        String requestUrl = "/user/bindOfficialAccounts";
        HashMap<String, String> requestParams = new HashMap<>();
        requestParams.put("id", "123123");
        HashMap<String, Object> expectResult = new HashMap<>();
        expectResult.put("$.success", true);
        expectResult.put("$.code", 20000);
        expectResult.put("$.message", "成功");

        ResultActions result = post(
                requestUrl,
                requestParams
        );

        AssertResult.match(
                result,
                expectResult
        );
    }

    @Test
    public void given_userAndVehicle_when_bindVehicle_then_bindVehicleSuccess() throws Exception {
        String requestUrl = "/user/bindVehicle";
        HashMap<String, String> requestParams = new HashMap<>();
        requestParams.put("user_id", "123123");
        requestParams.put("car_id", "123123");
        HashMap<String, Object> expectResult = new HashMap<>();
        expectResult.put("$.success", true);
        expectResult.put("$.code", 20000);
        expectResult.put("$.message", "成功");

        ResultActions result = post(
                requestUrl,
                requestParams
        );

        AssertResult.match(
                result,
                expectResult
        );
    }
}