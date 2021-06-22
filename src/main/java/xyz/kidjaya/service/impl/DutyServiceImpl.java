package xyz.kidjaya.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import xyz.kidjaya.entity.Duty;
import xyz.kidjaya.mapper.DutyMapper;
import xyz.kidjaya.service.DutyService;

/**
 * @author kidjaya
 * @since 2021-06-07
 */
@Service
public class DutyServiceImpl extends ServiceImpl<DutyMapper, Duty> implements DutyService {

}
