package com.dormitory.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.persistence.ManyToOne;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Size;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Fine {

    /**
     */
    @ManyToOne
    private Room Room;

    /**
     */
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<DurableArticles> DurableArticles = new HashSet<DurableArticles>();

    /**
     */
    @Size(min = 2, max = 200)
    private String Note;

    /**
     */
    private Float TotalPrice;
}
