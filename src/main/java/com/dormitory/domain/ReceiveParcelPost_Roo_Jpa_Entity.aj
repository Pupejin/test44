// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.dormitory.domain;

import com.dormitory.domain.ReceiveParcelPost;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

privileged aspect ReceiveParcelPost_Roo_Jpa_Entity {
    
    declare @type: ReceiveParcelPost: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long ReceiveParcelPost.id;
    
    @Version
    @Column(name = "version")
    private Integer ReceiveParcelPost.version;
    
    public Long ReceiveParcelPost.getId() {
        return this.id;
    }
    
    public void ReceiveParcelPost.setId(Long id) {
        this.id = id;
    }
    
    public Integer ReceiveParcelPost.getVersion() {
        return this.version;
    }
    
    public void ReceiveParcelPost.setVersion(Integer version) {
        this.version = version;
    }
    
}