// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.dormitory.domain;

import com.dormitory.domain.LeaseAgreement;
import com.dormitory.domain.Room;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

privileged aspect LeaseAgreement_Roo_Finder {
    
    public static Long LeaseAgreement.countFindLeaseAgreementsByRoomnumber(Room roomnumber) {
        if (roomnumber == null) throw new IllegalArgumentException("The roomnumber argument is required");
        EntityManager em = LeaseAgreement.entityManager();
        TypedQuery q = em.createQuery("SELECT COUNT(o) FROM LeaseAgreement AS o WHERE o.roomnumber = :roomnumber", Long.class);
        q.setParameter("roomnumber", roomnumber);
        return ((Long) q.getSingleResult());
    }
    
    public static TypedQuery<LeaseAgreement> LeaseAgreement.findLeaseAgreementsByRoomnumber(Room roomnumber) {
        if (roomnumber == null) throw new IllegalArgumentException("The roomnumber argument is required");
        EntityManager em = LeaseAgreement.entityManager();
        TypedQuery<LeaseAgreement> q = em.createQuery("SELECT o FROM LeaseAgreement AS o WHERE o.roomnumber = :roomnumber", LeaseAgreement.class);
        q.setParameter("roomnumber", roomnumber);
        return q;
    }
    
    public static TypedQuery<LeaseAgreement> LeaseAgreement.findLeaseAgreementsByRoomnumber(Room roomnumber, String sortFieldName, String sortOrder) {
        if (roomnumber == null) throw new IllegalArgumentException("The roomnumber argument is required");
        EntityManager em = LeaseAgreement.entityManager();
        StringBuilder queryBuilder = new StringBuilder("SELECT o FROM LeaseAgreement AS o WHERE o.roomnumber = :roomnumber");
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            queryBuilder.append(" ORDER BY ").append(sortFieldName);
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                queryBuilder.append(" ").append(sortOrder);
            }
        }
        TypedQuery<LeaseAgreement> q = em.createQuery(queryBuilder.toString(), LeaseAgreement.class);
        q.setParameter("roomnumber", roomnumber);
        return q;
    }
    
}
