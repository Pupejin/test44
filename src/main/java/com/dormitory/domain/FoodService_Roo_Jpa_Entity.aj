// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.dormitory.domain;

import com.dormitory.domain.FoodService;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

privileged aspect FoodService_Roo_Jpa_Entity {
    
    declare @type: FoodService: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long FoodService.id;
    
    @Version
    @Column(name = "version")
    private Integer FoodService.version;
    
    public Long FoodService.getId() {
        return this.id;
    }
    
    public void FoodService.setId(Long id) {
        this.id = id;
    }
    
    public Integer FoodService.getVersion() {
        return this.version;
    }
    
    public void FoodService.setVersion(Integer version) {
        this.version = version;
    }
    
}
