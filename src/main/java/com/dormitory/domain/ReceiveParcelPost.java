package com.dormitory.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import javax.validation.constraints.NotNull;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(finders = { "findReceiveParcelPostsByTrackEquals" })
public class ReceiveParcelPost {

    /**
     */
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date receiveParcelPostDate;

    /**
     */
    @NotNull
    private String track;

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
    @Size(max = 10)
    private String phone;
}
