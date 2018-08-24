package com.lawrence.batterylifecycle

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "customer")
class Customer {
    @Id
    var id : String = ""
    var firstName:String = ""
    var lastName:String = ""

    constructor(id: String, firstName:String, lastName:String) {
        this.id = id
        this.firstName = firstName
        this.lastName = lastName
    }
    override fun toString():String {
        return String.format(
                "Customer[id=%s, firstName='%s', lastName='%s']",
                id, firstName, lastName)
    }
}