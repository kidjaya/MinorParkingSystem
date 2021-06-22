package xyz.kidjaya.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import xyz.kidjaya.entity.User;

/**
 * @author kidjaya
 * @since 2021-06-07
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
