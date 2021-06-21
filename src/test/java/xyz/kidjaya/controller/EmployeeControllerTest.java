package xyz.kidjaya.controller;

import org.junit.Test;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.transaction.annotation.Transactional;
import xyz.kidjaya.base.ControllerTestBase;
import xyz.kidjaya.utils.AssertResult;

import java.util.HashMap;

@Transactional
public class EmployeeControllerTest extends ControllerTestBase {

    @Override
    public void beforeTest() {

    }

    @Override
    public void afterTest() {

    }

    @Test
    public void given_newEmployee_when_newEmployeeJoin_then_addEmployeeInfoSuccess() throws Exception {
        String requestUrl = "/employee";
        HashMap<String, String> requestParams = new HashMap<>();
        requestParams.put("id","123123");
        requestParams.put("name","王大锤");
        requestParams.put("position","岗亭收费员");
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
    public void given_employee_when_searchEmployee_then_returnEmployeeInfoSuccess() throws Exception {
        String requestUrl = "/employee";
        HashMap<String, String> requestParams = new HashMap<>();
        requestParams.put("id","123");
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

    @Test
    public void given_employee_when_changeEmployeeInfo_then_alterEmployeeInfoSuccess() throws Exception {
        String requestUrl = "/employee";
        HashMap<String, String> requestParams = new HashMap<>();
        requestParams.put("id","123");
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
    public void given_employee_when_employeeLeave_then_removeEmployeeSuccess() throws Exception {
        String requestUrl = "/employee";
        HashMap<String, String> requestParams = new HashMap<>();
        requestParams.put("id","123");
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
}
