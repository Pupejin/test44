// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.dormitory.domain;

import com.dormitory.domain.DurableArticles;
import com.dormitory.domain.RentDurableArticles;
import com.dormitory.domain.Room;
import java.util.Date;
import java.util.Set;

privileged aspect RentDurableArticles_Roo_JavaBean {
    
    public String RentDurableArticles.getName() {
        return this.name;
    }
    
    public void RentDurableArticles.setName(String name) {
        this.name = name;
    }
    
    public String RentDurableArticles.getPhonenumber() {
        return this.phonenumber;
    }
    
    public void RentDurableArticles.setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    
    public String RentDurableArticles.getEmail() {
        return this.email;
    }
    
    public void RentDurableArticles.setEmail(String email) {
        this.email = email;
    }
    
    public Date RentDurableArticles.getDurableArticlesDate() {
        return this.DurableArticlesDate;
    }
    
    public void RentDurableArticles.setDurableArticlesDate(Date DurableArticlesDate) {
        this.DurableArticlesDate = DurableArticlesDate;
    }
    
    public Room RentDurableArticles.getRoomnumber() {
        return this.roomnumber;
    }
    
    public void RentDurableArticles.setRoomnumber(Room roomnumber) {
        this.roomnumber = roomnumber;
    }
    
    public Set<DurableArticles> RentDurableArticles.getDurableArticles() {
        return this.DurableArticles;
    }
    
    public void RentDurableArticles.setDurableArticles(Set<DurableArticles> DurableArticles) {
        this.DurableArticles = DurableArticles;
    }
    
}
