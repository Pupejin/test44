// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.dormitory.domain;

import com.dormitory.domain.LeaseAgreement;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

privileged aspect LeaseAgreement_Roo_Jpa_ActiveRecord {
    
    @PersistenceContext
    transient EntityManager LeaseAgreement.entityManager;
    
    public static final List<String> LeaseAgreement.fieldNames4OrderClauseFilter = java.util.Arrays.asList("name", "phone", "Days", "age", "roomnumber");
    
    public static final EntityManager LeaseAgreement.entityManager() {
        EntityManager em = new LeaseAgreement().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long LeaseAgreement.countLeaseAgreements() {
        return entityManager().createQuery("SELECT COUNT(o) FROM LeaseAgreement o", Long.class).getSingleResult();
    }
    
    public static List<LeaseAgreement> LeaseAgreement.findAllLeaseAgreements() {
        return entityManager().createQuery("SELECT o FROM LeaseAgreement o", LeaseAgreement.class).getResultList();
    }
    
    public static List<LeaseAgreement> LeaseAgreement.findAllLeaseAgreements(String sortFieldName, String sortOrder) {
        String jpaQuery = "SELECT o FROM LeaseAgreement o";
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            jpaQuery = jpaQuery + " ORDER BY " + sortFieldName;
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                jpaQuery = jpaQuery + " " + sortOrder;
            }
        }
        return entityManager().createQuery(jpaQuery, LeaseAgreement.class).getResultList();
    }
    
    public static LeaseAgreement LeaseAgreement.findLeaseAgreement(Long id) {
        if (id == null) return null;
        return entityManager().find(LeaseAgreement.class, id);
    }
    
    public static List<LeaseAgreement> LeaseAgreement.findLeaseAgreementEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM LeaseAgreement o", LeaseAgreement.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    public static List<LeaseAgreement> LeaseAgreement.findLeaseAgreementEntries(int firstResult, int maxResults, String sortFieldName, String sortOrder) {
        String jpaQuery = "SELECT o FROM LeaseAgreement o";
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            jpaQuery = jpaQuery + " ORDER BY " + sortFieldName;
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                jpaQuery = jpaQuery + " " + sortOrder;
            }
        }
        return entityManager().createQuery(jpaQuery, LeaseAgreement.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public void LeaseAgreement.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void LeaseAgreement.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            LeaseAgreement attached = LeaseAgreement.findLeaseAgreement(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void LeaseAgreement.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void LeaseAgreement.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public LeaseAgreement LeaseAgreement.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        LeaseAgreement merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}
