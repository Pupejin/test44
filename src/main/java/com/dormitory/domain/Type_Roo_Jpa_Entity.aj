// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.dormitory.domain;

import com.dormitory.domain.Type;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

privileged aspect Type_Roo_Jpa_Entity {
    
    declare @type: Type: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long Type.id;
    
    @Version
    @Column(name = "version")
    private Integer Type.version;
    
    public Long Type.getId() {
        return this.id;
    }
    
    public void Type.setId(Long id) {
        this.id = id;
    }
    
    public Integer Type.getVersion() {
        return this.version;
    }
    
    public void Type.setVersion(Integer version) {
        this.version = version;
    }
    
}