package xyz.kidjaya.mapper;

import org.apache.ibatis.annotations.Mapper;
import xyz.kidjaya.entity.Employee;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @author kidjaya
 * @since 2021-06-07
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {

}
