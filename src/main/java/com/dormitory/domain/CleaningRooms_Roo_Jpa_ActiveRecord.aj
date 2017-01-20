// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.dormitory.domain;

import com.dormitory.domain.CleaningRooms;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

privileged aspect CleaningRooms_Roo_Jpa_ActiveRecord {
    
    @PersistenceContext
    transient EntityManager CleaningRooms.entityManager;
    
    public static final List<String> CleaningRooms.fieldNames4OrderClauseFilter = java.util.Arrays.asList("name", "Phone", "CleanDate", "Roomnumber");
    
    public static final EntityManager CleaningRooms.entityManager() {
        EntityManager em = new CleaningRooms().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long CleaningRooms.countCleaningRoomses() {
        return entityManager().createQuery("SELECT COUNT(o) FROM CleaningRooms o", Long.class).getSingleResult();
    }
    
    public static List<CleaningRooms> CleaningRooms.findAllCleaningRoomses() {
        return entityManager().createQuery("SELECT o FROM CleaningRooms o", CleaningRooms.class).getResultList();
    }
    
    public static List<CleaningRooms> CleaningRooms.findAllCleaningRoomses(String sortFieldName, String sortOrder) {
        String jpaQuery = "SELECT o FROM CleaningRooms o";
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            jpaQuery = jpaQuery + " ORDER BY " + sortFieldName;
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                jpaQuery = jpaQuery + " " + sortOrder;
            }
        }
        return entityManager().createQuery(jpaQuery, CleaningRooms.class).getResultList();
    }
    
    public static CleaningRooms CleaningRooms.findCleaningRooms(Long id) {
        if (id == null) return null;
        return entityManager().find(CleaningRooms.class, id);
    }
    
    public static List<CleaningRooms> CleaningRooms.findCleaningRoomsEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM CleaningRooms o", CleaningRooms.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    public static List<CleaningRooms> CleaningRooms.findCleaningRoomsEntries(int firstResult, int maxResults, String sortFieldName, String sortOrder) {
        String jpaQuery = "SELECT o FROM CleaningRooms o";
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            jpaQuery = jpaQuery + " ORDER BY " + sortFieldName;
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                jpaQuery = jpaQuery + " " + sortOrder;
            }
        }
        return entityManager().createQuery(jpaQuery, CleaningRooms.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public void CleaningRooms.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void CleaningRooms.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            CleaningRooms attached = CleaningRooms.findCleaningRooms(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void CleaningRooms.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void CleaningRooms.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public CleaningRooms CleaningRooms.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        CleaningRooms merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}
