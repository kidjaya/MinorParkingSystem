package xyz.kidjaya.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;
import xyz.kidjaya.entity.Payment;

/**
 * @author kidjaya
 * @since 2021-06-17
 */
@Service
public interface PaymentService extends IService<Payment> {


    Payment getByCarNumber(String carNumber);
}
