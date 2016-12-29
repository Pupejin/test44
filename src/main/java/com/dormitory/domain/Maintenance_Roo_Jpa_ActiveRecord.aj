// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.dormitory.domain;

import com.dormitory.domain.Maintenance;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

privileged aspect Maintenance_Roo_Jpa_ActiveRecord {
    
    @PersistenceContext
    transient EntityManager Maintenance.entityManager;
    
    public static final List<String> Maintenance.fieldNames4OrderClauseFilter = java.util.Arrays.asList("maintenanceDate", "roomNumber", "name", "phone", "nameDurableArticles");
    
    public static final EntityManager Maintenance.entityManager() {
        EntityManager em = new Maintenance().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long Maintenance.countMaintenances() {
        return entityManager().createQuery("SELECT COUNT(o) FROM Maintenance o", Long.class).getSingleResult();
    }
    
    public static List<Maintenance> Maintenance.findAllMaintenances() {
        return entityManager().createQuery("SELECT o FROM Maintenance o", Maintenance.class).getResultList();
    }
    
    public static List<Maintenance> Maintenance.findAllMaintenances(String sortFieldName, String sortOrder) {
        String jpaQuery = "SELECT o FROM Maintenance o";
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            jpaQuery = jpaQuery + " ORDER BY " + sortFieldName;
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                jpaQuery = jpaQuery + " " + sortOrder;
            }
        }
        return entityManager().createQuery(jpaQuery, Maintenance.class).getResultList();
    }
    
    public static Maintenance Maintenance.findMaintenance(Long id) {
        if (id == null) return null;
        return entityManager().find(Maintenance.class, id);
    }
    
    public static List<Maintenance> Maintenance.findMaintenanceEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM Maintenance o", Maintenance.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    public static List<Maintenance> Maintenance.findMaintenanceEntries(int firstResult, int maxResults, String sortFieldName, String sortOrder) {
        String jpaQuery = "SELECT o FROM Maintenance o";
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            jpaQuery = jpaQuery + " ORDER BY " + sortFieldName;
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                jpaQuery = jpaQuery + " " + sortOrder;
            }
        }
        return entityManager().createQuery(jpaQuery, Maintenance.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public void Maintenance.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void Maintenance.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            Maintenance attached = Maintenance.findMaintenance(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void Maintenance.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void Maintenance.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public Maintenance Maintenance.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        Maintenance merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}
