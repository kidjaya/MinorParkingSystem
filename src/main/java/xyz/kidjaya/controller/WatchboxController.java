package xyz.kidjaya.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xyz.kidjaya.entity.Watchbox;
import xyz.kidjaya.service.WatchboxService;
import xyz.kidjaya.utils.Result;

/**
 * @author kidjaya
 * @since 2021-06-07
 */
@RestController
@RequestMapping("/watchbox")
public class WatchboxController {
    @Autowired
    private WatchboxService watchboxService;

    @GetMapping("/list")
    public Result getWatchBoxes() {
        return Result.ok();
    }

    @GetMapping
    public Result getWatchBoxById(String id) {
        return Result.ok();
    }

    @PostMapping
    public Result addWatchBox(Watchbox watchbox) {
        return Result.ok();
    }

    @DeleteMapping
    public Result deleteWatchBoxById(String id) {
        return Result.ok();
    }

    @PutMapping
    public Result alterWatchBoxInfo(Watchbox watchbox) {
        return Result.ok();
    }
}

