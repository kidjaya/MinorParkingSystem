package xyz.kidjaya.controller;

import org.junit.Test;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.transaction.annotation.Transactional;
import xyz.kidjaya.base.ControllerTestBase;
import xyz.kidjaya.utils.AssertResult;

import java.util.HashMap;

@Transactional
public class PaymentControllerTest extends ControllerTestBase {
    @Override
    public void beforeTest() {

    }

    @Override
    public void afterTest() {

    }

    @Test
    public void given_newCarWithCarNumber_when_enterParkingGate_then_createNewOrderSuccess() throws Exception {
        String requestUrl = "/payment";
        HashMap<String, String> requestParams = new HashMap<>();
        requestParams.put("id", "13ada098d0798as7d9a");
        requestParams.put("number", "粤B88888");
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
    public void given_userOrCar_when_queryOrderSolution_then_returnOrderListSuccess() throws Exception {
        String requestUrl = "/payment";
        HashMap<String, String> requestParams = new HashMap<>();
        requestParams.put("carNumber", "粤B88888");
        requestParams.put("userId", "123123");
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
    public void given_order_when_orderIsUnusual_then_modifyOrderSuccess() throws Exception {
        String requestUrl = "/payment";
        HashMap<String, String> requestParams = new HashMap<>();
        requestParams.put("orderId","123123abc");
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
    public void given_order_when_orderUnnecessary_then_deleteOrderSuccess() throws Exception {
        String requestUrl = "/payment";
        HashMap<String, String> requestParams = new HashMap<>();
        requestParams.put("orderId","123123abc");
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
    public void given_order_when_carLeftParkingAreaByManualPay_then_printReceiptSuccess() throws Exception {
        String requestUrl = "/payment/printReceipt";
        HashMap<String, String> requestParams = new HashMap<>();
        requestParams.put("orderId","132123abc");
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
    public void given_userAndOrder_when_userPayOnWechat_then_parkingAreaPassSuccess() throws Exception {
        String requestUrl = "/payment/pay";
        HashMap<String, String> requestParams = new HashMap<>();
        requestParams.put("userId","13132");
        requestParams.put("orderId","123132abc");
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
