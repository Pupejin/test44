// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.dormitory.domain;

import com.dormitory.domain.Customer;
import com.dormitory.domain.DurableArticles;
import com.dormitory.domain.Maintenance;
import com.dormitory.domain.Room;
import java.util.Date;
import java.util.Set;

privileged aspect Maintenance_Roo_JavaBean {
    
    public Date Maintenance.getMaintenanceDate() {
        return this.maintenanceDate;
    }
    
    public void Maintenance.setMaintenanceDate(Date maintenanceDate) {
        this.maintenanceDate = maintenanceDate;
    }
    
    public Room Maintenance.getRoomNumber() {
        return this.roomNumber;
    }
    
    public void Maintenance.setRoomNumber(Room roomNumber) {
        this.roomNumber = roomNumber;
    }
    
    public Customer Maintenance.getName() {
        return this.name;
    }
    
    public void Maintenance.setName(Customer name) {
        this.name = name;
    }
    
    public String Maintenance.getPhone() {
        return this.phone;
    }
    
    public void Maintenance.setPhone(String phone) {
        this.phone = phone;
    }
    
    public Set<DurableArticles> Maintenance.getNameDurableArticles() {
        return this.nameDurableArticles;
    }
    
    public void Maintenance.setNameDurableArticles(Set<DurableArticles> nameDurableArticles) {
        this.nameDurableArticles = nameDurableArticles;
    }
    
}
