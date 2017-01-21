// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.dormitory.domain;

import com.dormitory.domain.CleaningRooms;
import com.dormitory.domain.Customer;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

privileged aspect CleaningRooms_Roo_Finder {
    
    public static Long CleaningRooms.countFindCleaningRoomsesByNameEquals(Customer name) {
        if (name == null) throw new IllegalArgumentException("The name argument is required");
        EntityManager em = CleaningRooms.entityManager();
        TypedQuery q = em.createQuery("SELECT COUNT(o) FROM CleaningRooms AS o WHERE o.name = :name", Long.class);
        q.setParameter("name", name);
        return ((Long) q.getSingleResult());
    }
    
    public static TypedQuery<CleaningRooms> CleaningRooms.findCleaningRoomsesByNameEquals(Customer name) {
        if (name == null) throw new IllegalArgumentException("The name argument is required");
        EntityManager em = CleaningRooms.entityManager();
        TypedQuery<CleaningRooms> q = em.createQuery("SELECT o FROM CleaningRooms AS o WHERE o.name = :name", CleaningRooms.class);
        q.setParameter("name", name);
        return q;
    }
    
    public static TypedQuery<CleaningRooms> CleaningRooms.findCleaningRoomsesByNameEquals(Customer name, String sortFieldName, String sortOrder) {
        if (name == null) throw new IllegalArgumentException("The name argument is required");
        EntityManager em = CleaningRooms.entityManager();
        StringBuilder queryBuilder = new StringBuilder("SELECT o FROM CleaningRooms AS o WHERE o.name = :name");
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            queryBuilder.append(" ORDER BY ").append(sortFieldName);
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                queryBuilder.append(" ").append(sortOrder);
            }
        }
        TypedQuery<CleaningRooms> q = em.createQuery(queryBuilder.toString(), CleaningRooms.class);
        q.setParameter("name", name);
        return q;
    }
    
}