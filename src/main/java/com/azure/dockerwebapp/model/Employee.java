package com.azure.dockerwebapp.model;


public class Employee {

    private String name;
    private Integer empId;
    private  String departmentId;
    private Integer age;
    private String address;

    public void Employee(){

    }
    public Employee(String name, Integer empId, String departmentId, Integer age, String address) {
        this.name = name;
        this.empId = empId;
        this.departmentId = departmentId;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
