package xyz.kidjaya.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.kidjaya.entity.Payment;
import xyz.kidjaya.mapper.PaymentMapper;
import xyz.kidjaya.service.PaymentService;

/**
 * @author kidjaya
 * @since 2021-06-17
 */
@Service
public class PaymentServiceImpl extends ServiceImpl<PaymentMapper, Payment> implements PaymentService {
    @Autowired
    private PaymentMapper paymentMapper;

    @Override
    public Payment getByCarNumber(String carNumber) {
        return new Payment();
    }

    @Override
    public Boolean payOrder(String orderId) {
        return false;
    }
}
