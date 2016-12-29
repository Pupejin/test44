// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.dormitory.domain;

import com.dormitory.domain.Color;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

privileged aspect Color_Roo_Jpa_ActiveRecord {
    
    @PersistenceContext
    transient EntityManager Color.entityManager;
    
    public static final List<String> Color.fieldNames4OrderClauseFilter = java.util.Arrays.asList("name");
    
    public static final EntityManager Color.entityManager() {
        EntityManager em = new Color().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long Color.countColors() {
        return entityManager().createQuery("SELECT COUNT(o) FROM Color o", Long.class).getSingleResult();
    }
    
    public static List<Color> Color.findAllColors() {
        return entityManager().createQuery("SELECT o FROM Color o", Color.class).getResultList();
    }
    
    public static List<Color> Color.findAllColors(String sortFieldName, String sortOrder) {
        String jpaQuery = "SELECT o FROM Color o";
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            jpaQuery = jpaQuery + " ORDER BY " + sortFieldName;
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                jpaQuery = jpaQuery + " " + sortOrder;
            }
        }
        return entityManager().createQuery(jpaQuery, Color.class).getResultList();
    }
    
    public static Color Color.findColor(Long id) {
        if (id == null) return null;
        return entityManager().find(Color.class, id);
    }
    
    public static List<Color> Color.findColorEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM Color o", Color.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    public static List<Color> Color.findColorEntries(int firstResult, int maxResults, String sortFieldName, String sortOrder) {
        String jpaQuery = "SELECT o FROM Color o";
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            jpaQuery = jpaQuery + " ORDER BY " + sortFieldName;
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                jpaQuery = jpaQuery + " " + sortOrder;
            }
        }
        return entityManager().createQuery(jpaQuery, Color.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public void Color.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void Color.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            Color attached = Color.findColor(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void Color.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void Color.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public Color Color.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        Color merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}
