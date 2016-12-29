package com.dormitory.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.persistence.ManyToOne;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(finders = { "findPaymentsByName" })
public class Payment {

    /**
     */
    @ManyToOne
    private Customer name;

    /**
     */
    @ManyToOne
    private Room roomNumber;

    /**
     */
    private Float Price;
}
