package com.dormitory.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.ManyToOne;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(finders = { "findMaintenancesByNameEquals" })
public class Maintenance {

    /**
     */
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date maintenanceDate;

    /**
     */
    @ManyToOne
    private Room roomNumber;

    /**
     */
    @ManyToOne
    private Customer name;

    /**
     */
    private String phone;

    /**
     */
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<DurableArticles> nameDurableArticles = new HashSet<DurableArticles>();
}
