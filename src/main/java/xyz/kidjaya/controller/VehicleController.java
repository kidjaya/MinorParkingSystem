package xyz.kidjaya.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xyz.kidjaya.entity.Vehicle;
import xyz.kidjaya.service.VehicleService;
import xyz.kidjaya.utils.Result;

/**
 * @author kidjaya
 * @since 2021-06-07
 */
@RestController
@RequestMapping("/vehicle")
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;

    @PostMapping
    public Result addVehicle(Vehicle vehicle) {
        vehicleService.save(vehicle);
        return Result.ok();
    }

    @PutMapping
    public Result alterVehicle(Vehicle vehicle) {
        vehicleService.updateById(vehicle);
        return Result.ok();
    }

    @GetMapping
    public Result getVehicleById(String id) {
        return Result.ok();
    }

    @DeleteMapping
    public Result deleteVehicleById(String id) {
        return Result.ok();
    }
}

