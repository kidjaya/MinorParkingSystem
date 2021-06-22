package xyz.kidjaya.mapper;

import org.apache.ibatis.annotations.Mapper;
import xyz.kidjaya.entity.Vehicle;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @author kidjaya
 * @since 2021-06-07
 */
@Mapper
public interface VehicleMapper extends BaseMapper<Vehicle> {

}
