package xyz.kidjaya.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xyz.kidjaya.entity.Carport;
import xyz.kidjaya.service.CarportService;
import xyz.kidjaya.utils.Result;

/**
 * @author kidjaya
 * @since 2021-06-07
 */
@RestController
@RequestMapping("/carport")
public class CarportController {
    @Autowired
    private CarportService carportService;

    @GetMapping
    public Result getCarPortById(Carport carport) {
        return Result.ok();
    }

    @GetMapping("/all")
    public Result getAllCarPorts() {
        return Result.ok();
    }

    @PostMapping
    public Result addCarPort(Carport carport) {
        return Result.ok();
    }

    @DeleteMapping
    public Result deleteCarPortById(String id) {
        return Result.ok();
    }

    @PutMapping
    public Result alterCarPortInfo(Carport carport) {
        return Result.ok();
    }


}

