// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.dormitory.domain;

import com.dormitory.domain.ReceiveParcelPost;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

privileged aspect ReceiveParcelPost_Roo_Finder {
    
    public static Long ReceiveParcelPost.countFindReceiveParcelPostsByTrackEquals(String track) {
        if (track == null || track.length() == 0) throw new IllegalArgumentException("The track argument is required");
        EntityManager em = ReceiveParcelPost.entityManager();
        TypedQuery q = em.createQuery("SELECT COUNT(o) FROM ReceiveParcelPost AS o WHERE o.track = :track", Long.class);
        q.setParameter("track", track);
        return ((Long) q.getSingleResult());
    }
    
    public static TypedQuery<ReceiveParcelPost> ReceiveParcelPost.findReceiveParcelPostsByTrackEquals(String track) {
        if (track == null || track.length() == 0) throw new IllegalArgumentException("The track argument is required");
        EntityManager em = ReceiveParcelPost.entityManager();
        TypedQuery<ReceiveParcelPost> q = em.createQuery("SELECT o FROM ReceiveParcelPost AS o WHERE o.track = :track", ReceiveParcelPost.class);
        q.setParameter("track", track);
        return q;
    }
    
    public static TypedQuery<ReceiveParcelPost> ReceiveParcelPost.findReceiveParcelPostsByTrackEquals(String track, String sortFieldName, String sortOrder) {
        if (track == null || track.length() == 0) throw new IllegalArgumentException("The track argument is required");
        EntityManager em = ReceiveParcelPost.entityManager();
        StringBuilder queryBuilder = new StringBuilder("SELECT o FROM ReceiveParcelPost AS o WHERE o.track = :track");
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            queryBuilder.append(" ORDER BY ").append(sortFieldName);
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                queryBuilder.append(" ").append(sortOrder);
            }
        }
        TypedQuery<ReceiveParcelPost> q = em.createQuery(queryBuilder.toString(), ReceiveParcelPost.class);
        q.setParameter("track", track);
        return q;
    }
    
}
