package model;

import java.io.Serializable;
import java.time.LocalDate;

public class Employee implements Serializable {
    private String code;
    private String name;
    private LocalDate birthday;
    private String address;
    private String phoneNumber;
    private String email;
    private EmployeeType type;
    private String salary;

    public Employee() {
    }

    public Employee withCode(String code) {
        this.code = code;
        return this;
    }

    public Employee withName(String name) {
        this.name = name;
        return this;
    }

    public Employee withBirthday(LocalDate birthday) {
        this.birthday = birthday;
        return this;
    }

    public Employee withAddress(String address) {
        this.address = address;
        return this;
    }

    public Employee withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public Employee withEmail(String email) {
        this.email = email;
        return this;
    }

    public Employee withType(EmployeeType employeeType) {
        this.type = employeeType;
        return this;
    }

    public Employee withSalary(String salary) {
        this.salary = salary;
        return this;
    }

    public Employee build() {
        return this;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EmployeeType getType() {
        return type;
    }

    public void setType(EmployeeType type) {
        this.type = type;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", type=" + type +
                ", salary='" + salary + '\'' +
                '}';
    }
}
