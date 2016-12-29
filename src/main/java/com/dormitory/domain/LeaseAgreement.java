package com.dormitory.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(finders = { "findLeaseAgreementsByRoomnumber" })
public class LeaseAgreement {

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
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date Days;

    /**
     */
    private Integer age;

    /**
     */
    @ManyToOne
    private Room roomnumber;
}
