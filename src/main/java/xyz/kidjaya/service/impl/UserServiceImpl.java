package xyz.kidjaya.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import xyz.kidjaya.entity.User;
import xyz.kidjaya.mapper.UserMapper;
import xyz.kidjaya.service.UserService;

/**
 * @author kidjaya
 * @since 2021-06-07
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
