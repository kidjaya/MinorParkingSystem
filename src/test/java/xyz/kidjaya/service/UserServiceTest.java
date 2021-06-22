package xyz.kidjaya.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import xyz.kidjaya.entity.User;
import xyz.kidjaya.mapper.UserMapper;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @MockBean
    private UserMapper userMapper;

    private User user;

    @Before
    public void before() {
        user = new User();
        user.setId("21u3oadnsk1o23u");
        user.setNickname("kidjaya");
        user.setCover("https://www.baidu.com");
        user.setOpenid("akjsdlkjl123");
        user.setGmtCreate(new Date());
        user.setGmtModified(new Date());
    }

    /**
     * 创建用户测试
     */
    @Test
    public void given_user_when_newUserRegister_then_success(){
        Mockito.when(userMapper.insert(Mockito.any(User.class))).thenReturn(1);
        int result = userService.save(this.user)? 1 : 0;

        Assert.assertEquals(result,1);
    }

    /**
     * 查询用户测试
     */
    @Test
    public void given_user_when_findAUser_then_success(){
        Mockito.when(userMapper.selectById(this.user.getId())).thenReturn(this.user);
        User user = userService.getById(this.user.getId());

        Assert.assertNotNull(user);
        Assert.assertEquals(user.getId(), this.user.getId());
    }
}
