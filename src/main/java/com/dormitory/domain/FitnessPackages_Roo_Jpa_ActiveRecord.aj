// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.dormitory.domain;

import com.dormitory.domain.FitnessPackages;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

privileged aspect FitnessPackages_Roo_Jpa_ActiveRecord {
    
    @PersistenceContext
    transient EntityManager FitnessPackages.entityManager;
    
    public static final List<String> FitnessPackages.fieldNames4OrderClauseFilter = java.util.Arrays.asList("package_name", "duration", "trainer", "price");
    
    public static final EntityManager FitnessPackages.entityManager() {
        EntityManager em = new FitnessPackages().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long FitnessPackages.countFitnessPackageses() {
        return entityManager().createQuery("SELECT COUNT(o) FROM FitnessPackages o", Long.class).getSingleResult();
    }
    
    public static List<FitnessPackages> FitnessPackages.findAllFitnessPackageses() {
        return entityManager().createQuery("SELECT o FROM FitnessPackages o", FitnessPackages.class).getResultList();
    }
    
    public static List<FitnessPackages> FitnessPackages.findAllFitnessPackageses(String sortFieldName, String sortOrder) {
        String jpaQuery = "SELECT o FROM FitnessPackages o";
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            jpaQuery = jpaQuery + " ORDER BY " + sortFieldName;
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                jpaQuery = jpaQuery + " " + sortOrder;
            }
        }
        return entityManager().createQuery(jpaQuery, FitnessPackages.class).getResultList();
    }
    
    public static FitnessPackages FitnessPackages.findFitnessPackages(Long id) {
        if (id == null) return null;
        return entityManager().find(FitnessPackages.class, id);
    }
    
    public static List<FitnessPackages> FitnessPackages.findFitnessPackagesEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM FitnessPackages o", FitnessPackages.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    public static List<FitnessPackages> FitnessPackages.findFitnessPackagesEntries(int firstResult, int maxResults, String sortFieldName, String sortOrder) {
        String jpaQuery = "SELECT o FROM FitnessPackages o";
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            jpaQuery = jpaQuery + " ORDER BY " + sortFieldName;
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                jpaQuery = jpaQuery + " " + sortOrder;
            }
        }
        return entityManager().createQuery(jpaQuery, FitnessPackages.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public void FitnessPackages.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void FitnessPackages.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            FitnessPackages attached = FitnessPackages.findFitnessPackages(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void FitnessPackages.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void FitnessPackages.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public FitnessPackages FitnessPackages.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        FitnessPackages merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}
