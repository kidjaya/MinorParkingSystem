package xyz.kidjaya.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import xyz.kidjaya.entity.Payment;
import xyz.kidjaya.mapper.PaymentMapper;
import xyz.kidjaya.service.PaymentService;

/**
 * @author kidjaya
 * @since 2021-06-17
 */
public class PaymentServiceImpl extends ServiceImpl<PaymentMapper, Payment> implements PaymentService {

    @Override
    public Payment getByCarNumber(String carNumber) {
        return null;
    }
}
