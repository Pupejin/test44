// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.dormitory.domain;

import com.dormitory.domain.Customer;
import com.dormitory.domain.LeaseAgreement;
import com.dormitory.domain.Room;
import java.util.Date;

privileged aspect LeaseAgreement_Roo_JavaBean {
    
    public Customer LeaseAgreement.getName() {
        return this.name;
    }
    
    public void LeaseAgreement.setName(Customer name) {
        this.name = name;
    }
    
    public String LeaseAgreement.getPhone() {
        return this.phone;
    }
    
    public void LeaseAgreement.setPhone(String phone) {
        this.phone = phone;
    }
    
    public Date LeaseAgreement.getDays() {
        return this.Days;
    }
    
    public void LeaseAgreement.setDays(Date Days) {
        this.Days = Days;
    }
    
    public Integer LeaseAgreement.getAge() {
        return this.age;
    }
    
    public void LeaseAgreement.setAge(Integer age) {
        this.age = age;
    }
    
    public Room LeaseAgreement.getRoomnumber() {
        return this.roomnumber;
    }
    
    public void LeaseAgreement.setRoomnumber(Room roomnumber) {
        this.roomnumber = roomnumber;
    }
    
}