package xyz.kidjaya.service;

import org.junit.Assert;
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
    private static UserService userService;

    @MockBean
    private static UserMapper userMapper;

    /**
     * 创建用户测试
     */
    @Test
    public void addUser() throws Exception{
        User user = new User();
        user.setId("21u3oadnsk1o23u");
        user.setNickname("kidjaya");
        user.setCover("https://www.baidu.com");
        user.setOpenid("akjsdlkjl123");
        user.setGmtCreate(new Date());
        user.setGmtModified(new Date());

        Mockito.when(userService.save(Mockito.any(User.class))).thenReturn(true);
        boolean result = userService.save(user);

        Assert.assertTrue(result);
    }

    /**
     * 查询用户测试
     */
    @Test
    public void getUser(){
        String id = "123123abc";
        User userReturn = new User();
        userReturn.setOpenid("ajsdlkjald12");
        userReturn.setCover("http://www.baidu.com/asdjlk/123.jpg");
        userReturn.setNickname("kidjaya");
        userReturn.setId(id);
        userReturn.setGmtModified(new Date());
        userReturn.setGmtModified(new Date());

        Mockito.when(userMapper.selectById(id)).thenReturn(userReturn);
        User user = userService.getById(id);

        Assert.assertNotNull(user);
        Assert.assertEquals(user.getId(), id);
    }
}
