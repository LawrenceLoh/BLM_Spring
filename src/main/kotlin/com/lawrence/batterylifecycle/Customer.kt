package com.lawrence.batterylifecycle

import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "customer")
class Customer {
    var id: String = ""
    var firstName:String = ""
    var lastName:String = ""

    constructor(firstName:String, lastName:String) {

        this.firstName = firstName
        this.lastName = lastName
    }
    override fun toString():String {
        return String.format(
                "Customer[ firstName='%s', lastName='%s']",
                 firstName, lastName)
    }
}