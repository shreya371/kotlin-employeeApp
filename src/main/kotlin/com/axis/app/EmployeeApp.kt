package com.axis.app

import com.axis.model.Employee
import com.axis.service.EmployeeService

//main function
fun main(){

    var employee= Employee(101,"shreya",30000)
    var employeeService=EmployeeService()

    employeeService.displayEmployeeDetails(employee)
    println("per day salary is ${employeeService.perDaySalary(employee)}")
    println("salary after 10% increment: ${employeeService.increaseSalaryByTenPercentage(employee)}")


}