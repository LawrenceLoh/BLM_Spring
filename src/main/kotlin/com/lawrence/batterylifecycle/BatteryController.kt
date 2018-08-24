package com.lawrence.batterylifecycle

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/batteries")
class BatteryController{
    @Autowired
    var repository: BatteryRepository? = null

    @GetMapping("/getAll")
    fun getAllBatteries(): MutableList<Battery> {
        return repository?.findAll()!!
    }
}