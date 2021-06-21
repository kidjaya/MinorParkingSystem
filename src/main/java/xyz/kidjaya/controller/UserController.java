package xyz.kidjaya.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import xyz.kidjaya.entity.User;
import xyz.kidjaya.service.UserService;
import xyz.kidjaya.utils.Result;

/**

 * @author kidjaya
 * @since 2021-06-07
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public Result getUserById(String id) {
        User user = userService.getById(id);
        return Result.ok();
    }

    @PostMapping
    public Result addUser(User user) {
        userService.updateById(user);
        return Result.ok();
    }

    @DeleteMapping
    public Result removeUserById(String id) {
        userService.removeById(id);
        return Result.ok();
    }

    @PutMapping
    public Result updateUserInfo(User user) {
        return Result.ok();
    }

    @PostMapping("/bindOfficialAccounts")
    public Result bindWechatById(String id) {
        return Result.ok();
    }

    @PostMapping("/bindVehicle")
    public Result bindVehicleById(String userId, String carId) {
        return Result.ok();
    }

}

