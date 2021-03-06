// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.dormitory.domain;

import com.dormitory.domain.Customer;
import com.dormitory.domain.FitnessService;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

privileged aspect FitnessService_Roo_Finder {
    
    public static Long FitnessService.countFindFitnessServicesByName(Customer name) {
        if (name == null) throw new IllegalArgumentException("The name argument is required");
        EntityManager em = FitnessService.entityManager();
        TypedQuery q = em.createQuery("SELECT COUNT(o) FROM FitnessService AS o WHERE o.name = :name", Long.class);
        q.setParameter("name", name);
        return ((Long) q.getSingleResult());
    }
    
    public static TypedQuery<FitnessService> FitnessService.findFitnessServicesByName(Customer name) {
        if (name == null) throw new IllegalArgumentException("The name argument is required");
        EntityManager em = FitnessService.entityManager();
        TypedQuery<FitnessService> q = em.createQuery("SELECT o FROM FitnessService AS o WHERE o.name = :name", FitnessService.class);
        q.setParameter("name", name);
        return q;
    }
    
    public static TypedQuery<FitnessService> FitnessService.findFitnessServicesByName(Customer name, String sortFieldName, String sortOrder) {
        if (name == null) throw new IllegalArgumentException("The name argument is required");
        EntityManager em = FitnessService.entityManager();
        StringBuilder queryBuilder = new StringBuilder("SELECT o FROM FitnessService AS o WHERE o.name = :name");
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            queryBuilder.append(" ORDER BY ").append(sortFieldName);
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                queryBuilder.append(" ").append(sortOrder);
            }
        }
        TypedQuery<FitnessService> q = em.createQuery(queryBuilder.toString(), FitnessService.class);
        q.setParameter("name", name);
        return q;
    }
    
}
