package xyz.kidjaya.dao;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import xyz.kidjaya.entity.User;
import xyz.kidjaya.mapper.UserMapper;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    private User user;

    @Before
    public void before() {
        user = new User();
        user.setId("1asd23j23kajdl3ka");
        user.setNickname("kidjaya");
        user.setCover("https://www.baidu.com/ajsdkl/1.jpg");
        user.setOpenid("ajsd12kl1223");
        user.setGmtCreate(new Date());
        user.setGmtModified(new Date());
    }

    @Test
    public void addUser() {
        int result = userMapper.insert(user);

        Assert.assertEquals(1, result);
    }
}
