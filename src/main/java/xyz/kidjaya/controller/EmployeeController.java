package xyz.kidjaya.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xyz.kidjaya.entity.Employee;
import xyz.kidjaya.service.EmployeeService;
import xyz.kidjaya.utils.Result;

/**
 * @author kidjaya
 * @since 2021-06-07
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public Result getEmployeeById(String id) {
        return Result.ok();
    }

    @PostMapping
    public Result addEmployee(Employee employee) {
        return Result.ok();
    }

    @PutMapping
    public Result alterEmployeeInfo(Employee employee) {
        return Result.ok();
    }

    @DeleteMapping
    public Result deleteEmployeeById(String id) {
        return Result.ok();
    }
}

