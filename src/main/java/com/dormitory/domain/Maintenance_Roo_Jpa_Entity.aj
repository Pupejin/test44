// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.dormitory.domain;

import com.dormitory.domain.Maintenance;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

privileged aspect Maintenance_Roo_Jpa_Entity {
    
    declare @type: Maintenance: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long Maintenance.id;
    
    @Version
    @Column(name = "version")
    private Integer Maintenance.version;
    
    public Long Maintenance.getId() {
        return this.id;
    }
    
    public void Maintenance.setId(Long id) {
        this.id = id;
    }
    
    public Integer Maintenance.getVersion() {
        return this.version;
    }
    
    public void Maintenance.setVersion(Integer version) {
        this.version = version;
    }
    
}
