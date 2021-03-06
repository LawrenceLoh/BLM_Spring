package com.lawrence.batterylifecycle

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/customers")
class CustomerController{
    @Autowired
    var repository: CustomerRepository? = null

    @GetMapping("/getAll")
    fun getAllCustomers(@RequestParam(value = "name", defaultValue = "World") name: String): MutableList<Customer> {
            println("Hello, $name")
//
//        var customers : MutableList<Customer> = mutableListOf<Customer>()
//        customers.add(Customer("Lawrence", "Smith"))
//        customers.add(Customer("Alice", "Smith"))
//        customers.add(Customer("Cammy", "Smith"))
//        repository?.saveAll(customers)
//        println(customers.size)
//
//        // fetch all customers
//        println("Customers found with findAll():")
//        println("-------------------------------")
//        for (customer in repository?.findAll()!!) {
//            println(customer)
//        }
//        println()

        return repository?.findAll()!!
    }
}