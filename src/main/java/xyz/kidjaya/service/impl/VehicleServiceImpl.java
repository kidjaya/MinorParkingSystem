package xyz.kidjaya.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import xyz.kidjaya.entity.Vehicle;
import xyz.kidjaya.mapper.VehicleMapper;
import xyz.kidjaya.service.VehicleService;

/**
 * @author kidjaya
 * @since 2021-06-07
 */
@Service
public class VehicleServiceImpl extends ServiceImpl<VehicleMapper, Vehicle> implements VehicleService {

}
