// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.dormitory.domain;

import com.dormitory.domain.FitnessPackages;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

privileged aspect FitnessPackages_Roo_Jpa_Entity {
    
    declare @type: FitnessPackages: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long FitnessPackages.id;
    
    @Version
    @Column(name = "version")
    private Integer FitnessPackages.version;
    
    public Long FitnessPackages.getId() {
        return this.id;
    }
    
    public void FitnessPackages.setId(Long id) {
        this.id = id;
    }
    
    public Integer FitnessPackages.getVersion() {
        return this.version;
    }
    
    public void FitnessPackages.setVersion(Integer version) {
        this.version = version;
    }
    
}
