package xyz.kidjaya.mapper;

import org.apache.ibatis.annotations.Mapper;
import xyz.kidjaya.entity.Payment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @author kidjaya
 * @since 2021-06-17
 */
@Mapper
public interface PaymentMapper extends BaseMapper<Payment> {

}
