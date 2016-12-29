package com.dormitory.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Reservation {

    /**
     */
    @ManyToOne
    private Customer name;

    /**
     */
    @Size(max = 10)
    private String phone;

    /**
     */
    private String email;

    /**
     */
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Room> room = new HashSet<Room>();

    /**
     */
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<DurableArticles> durableArticles = new HashSet<DurableArticles>();
}
