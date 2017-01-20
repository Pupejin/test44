package com.dormitory.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(finders = { "findFitnessServicesByName" })
public class FitnessService {

    /**
     */
    @ManyToOne
    private Customer name;

    /**
     */
    @NotNull
    @Size(min = 2)
    private String sex;

    /**
     */
    @NotNull
    @Size(min = 2)
    private String age;

    /**
     */
    @NotNull
    @Size(max = 10)
    private String phone;
}
