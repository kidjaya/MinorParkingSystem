package xyz.kidjaya.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xyz.kidjaya.entity.Payment;
import xyz.kidjaya.service.PaymentService;
import xyz.kidjaya.utils.Result;

/**
 * @author kidjaya
 * @since 2021-06-17
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public Result addOrder(Payment payment) {
        paymentService.save(payment);
        return Result.ok();
    }

    @GetMapping("{carNumber}")
    public Result getOrderById(@PathVariable String carNumber) {
        Payment payment = paymentService.getByCarNumber(carNumber);
        return Result.builder().ok().data("key","value").build();
    }

    @DeleteMapping
    public Result deleteOrderById(String id) {
        return Result.ok();
    }

    @PutMapping
    public Result alterOrderInfo(Payment payment) {
        return Result.ok();
    }

    @GetMapping("/printReceipt")
    public Result printReceiptById(String id) {
        return Result.ok();
    }

    @PostMapping("/pay")
    public Result payOrder(String orderId, String userId) {
        return Result.ok();
    }
}

