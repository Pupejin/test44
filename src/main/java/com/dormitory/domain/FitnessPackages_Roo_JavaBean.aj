// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.dormitory.domain;

import com.dormitory.domain.FitnessPackages;
import com.dormitory.domain.PackageName;
import com.dormitory.domain.Trainer;

privileged aspect FitnessPackages_Roo_JavaBean {
    
    public PackageName FitnessPackages.getPackage_name() {
        return this.package_name;
    }
    
    public void FitnessPackages.setPackage_name(PackageName package_name) {
        this.package_name = package_name;
    }
    
    public String FitnessPackages.getDuration() {
        return this.duration;
    }
    
    public void FitnessPackages.setDuration(String duration) {
        this.duration = duration;
    }
    
    public Trainer FitnessPackages.getTrainer() {
        return this.trainer;
    }
    
    public void FitnessPackages.setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }
    
    public Float FitnessPackages.getPrice() {
        return this.price;
    }
    
    public void FitnessPackages.setPrice(Float price) {
        this.price = price;
    }
    
}
