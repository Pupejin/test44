// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.dormitory.domain;

import com.dormitory.domain.DurableArticles;
import com.dormitory.domain.Fine;
import com.dormitory.domain.Room;
import java.util.Set;

privileged aspect Fine_Roo_JavaBean {
    
    public Room Fine.getRoom() {
        return this.Room;
    }
    
    public void Fine.setRoom(Room Room) {
        this.Room = Room;
    }
    
    public Set<DurableArticles> Fine.getDurableArticles() {
        return this.DurableArticles;
    }
    
    public void Fine.setDurableArticles(Set<DurableArticles> DurableArticles) {
        this.DurableArticles = DurableArticles;
    }
    
    public String Fine.getNote() {
        return this.Note;
    }
    
    public void Fine.setNote(String Note) {
        this.Note = Note;
    }
    
    public Float Fine.getTotalPrice() {
        return this.TotalPrice;
    }
    
    public void Fine.setTotalPrice(Float TotalPrice) {
        this.TotalPrice = TotalPrice;
    }
    
}