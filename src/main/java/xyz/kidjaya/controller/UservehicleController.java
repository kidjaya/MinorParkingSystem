package xyz.kidjaya.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.kidjaya.service.UserService;
import xyz.kidjaya.service.UservehicleService;
import xyz.kidjaya.service.VehicleService;
import xyz.kidjaya.utils.Result;

/**
 * @author kidjaya
 * @since 2021-06-07
 */
@RestController
@RequestMapping("/uservehicle")
public class UservehicleController {
    @Autowired
    private UserService userService;

    @Autowired
    private VehicleService vehicleService;

    @Autowired
    private UservehicleService uservehicleService;

    @GetMapping("/car_user")
    public Result getCarUserById(String vehicleId) {
        return Result.ok();
    }

    @GetMapping("/user_car")
    public Result getUserCarById(String userId) {
        return Result.ok();
    }

    @PostMapping
    public Result bindUserAndCar(String userId, String carId) {
        return Result.ok();
    }
}

