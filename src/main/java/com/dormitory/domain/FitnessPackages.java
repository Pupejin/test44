package com.dormitory.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class FitnessPackages {

    /**
     */
    @ManyToOne
    private PackageName package_name;

    /**
     */
    @NotNull
    @Size(min = 2)
    private String duration;

    /**
     */
    @ManyToOne
    private Trainer trainer;

    /**
     */
    private Float price;
}
