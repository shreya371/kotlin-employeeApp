package com.axis.service

import com.axis.model.Employee

//business logics
class EmployeeService {

    /*
        description:this method is used to display employee details
        @param: it takes employee object as parameter
        returns: Unit
     */
    fun displayEmployeeDetails(employee: Employee){
        println("----------employee info")
        println("id = ${employee.id}")
        println("name = ${employee.name}")
        println("salary = ${employee.salary}")

    }

    /*
    description:find per day salary

     */
    fun perDaySalary(employee:Employee):Int{
        return employee.salary/30

    }

    fun increaseSalaryByTenPercentage(employee:Employee):Double{
        var incrementedSalary =employee.salary*0.10
        println("10% of salary:  $incrementedSalary ")
        return incrementedSalary+employee.salary
    }


}