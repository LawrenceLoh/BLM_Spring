package com.lawrence.batterylifecycle

import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "batteries")
class Battery{
    var id: String = ""
    var name : String = ""
    var temperature : String = ""
    var condition : String = ""
    var serialNo : String = ""

    override fun toString(): String {
        return "Battery(id='$id', name='$name', temperature='$temperature', condition='$condition', serialNo='$serialNo')"
    }


}