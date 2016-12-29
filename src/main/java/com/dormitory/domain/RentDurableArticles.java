package com.dormitory.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
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
@RooJpaActiveRecord(finders = { "findRentDurableArticlesesByNameEquals" })
public class RentDurableArticles {

    /**
     */
    @NotNull
    @Size(min = 2)
    private String name;

    /**
     */
    @NotNull
    @Size(min = 2)
    private String phonenumber;

    /**
     */
    @NotNull
    @Size(min = 2)
    private String email;

    /**
     */
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date DurableArticlesDate;

    /**
     */
    @ManyToOne
    private Room roomnumber;

    /**
     */
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<DurableArticles> DurableArticles = new HashSet<DurableArticles>();
}
