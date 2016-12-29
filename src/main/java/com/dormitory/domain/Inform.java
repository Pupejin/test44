package com.dormitory.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(finders = { "findInformsByTypeAndColor" })
public class Inform {

    /**
     */
    @ManyToOne
    private Customer name;

    /**
     */
    @NotNull
    @Size(min = 2)
    private String phone;

    /**
     */
    @ManyToOne
    private Type type;

    /**
     */
    private Float amount;

    /**
     */
    @ManyToOne
    private Color color;

    /**
     */
    @NotNull
    @Size(min = 2)
    private String feature;
}
