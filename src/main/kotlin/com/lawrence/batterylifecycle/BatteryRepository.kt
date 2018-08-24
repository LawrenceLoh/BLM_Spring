package com.lawrence.batterylifecycle

import org.springframework.data.mongodb.repository.MongoRepository


interface BatteryRepository: MongoRepository<Battery, String> {

}