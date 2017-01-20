// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.dormitory.domain;

import com.dormitory.domain.ChangeRoom;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

privileged aspect ChangeRoom_Roo_Jpa_ActiveRecord {
    
    @PersistenceContext
    transient EntityManager ChangeRoom.entityManager;
    
    public static final List<String> ChangeRoom.fieldNames4OrderClauseFilter = java.util.Arrays.asList("dateChang", "name", "Room", "NewRoom");
    
    public static final EntityManager ChangeRoom.entityManager() {
        EntityManager em = new ChangeRoom().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long ChangeRoom.countChangeRooms() {
        return entityManager().createQuery("SELECT COUNT(o) FROM ChangeRoom o", Long.class).getSingleResult();
    }
    
    public static List<ChangeRoom> ChangeRoom.findAllChangeRooms() {
        return entityManager().createQuery("SELECT o FROM ChangeRoom o", ChangeRoom.class).getResultList();
    }
    
    public static List<ChangeRoom> ChangeRoom.findAllChangeRooms(String sortFieldName, String sortOrder) {
        String jpaQuery = "SELECT o FROM ChangeRoom o";
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            jpaQuery = jpaQuery + " ORDER BY " + sortFieldName;
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                jpaQuery = jpaQuery + " " + sortOrder;
            }
        }
        return entityManager().createQuery(jpaQuery, ChangeRoom.class).getResultList();
    }
    
    public static ChangeRoom ChangeRoom.findChangeRoom(Long id) {
        if (id == null) return null;
        return entityManager().find(ChangeRoom.class, id);
    }
    
    public static List<ChangeRoom> ChangeRoom.findChangeRoomEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM ChangeRoom o", ChangeRoom.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    public static List<ChangeRoom> ChangeRoom.findChangeRoomEntries(int firstResult, int maxResults, String sortFieldName, String sortOrder) {
        String jpaQuery = "SELECT o FROM ChangeRoom o";
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            jpaQuery = jpaQuery + " ORDER BY " + sortFieldName;
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                jpaQuery = jpaQuery + " " + sortOrder;
            }
        }
        return entityManager().createQuery(jpaQuery, ChangeRoom.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public void ChangeRoom.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void ChangeRoom.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            ChangeRoom attached = ChangeRoom.findChangeRoom(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void ChangeRoom.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void ChangeRoom.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public ChangeRoom ChangeRoom.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        ChangeRoom merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}
