package xyz.kidjaya.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xyz.kidjaya.entity.Duty;
import xyz.kidjaya.service.DutyService;
import xyz.kidjaya.service.EmployeeService;
import xyz.kidjaya.service.WatchboxService;
import xyz.kidjaya.utils.Result;

/**
 * @author kidjaya
 * @since 2021-06-07
 */
@RestController
@RequestMapping("/duty")
public class DutyController {
    @Autowired
    private DutyService dutyService;

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private WatchboxService watchboxService;

    @GetMapping
    public Result getEmployeeDutyById(String employeeId) {
        return Result.ok();
    }

    @PostMapping
    public Result addEmployeeDuty(Duty duty) {
        return Result.ok();
    }

    @DeleteMapping
    public Result deleteEmployeeDutyById(String dutyId) {
        return Result.ok();
    }

    @PutMapping
    public Result alterEmployeeDutyById(Duty duty) {
        return Result.ok();
    }


}

