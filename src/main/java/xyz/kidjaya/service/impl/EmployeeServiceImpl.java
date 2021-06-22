package xyz.kidjaya.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import xyz.kidjaya.entity.Employee;
import xyz.kidjaya.mapper.EmployeeMapper;
import xyz.kidjaya.service.EmployeeService;

/**
 * @author kidjaya
 * @since 2021-06-07
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

}
