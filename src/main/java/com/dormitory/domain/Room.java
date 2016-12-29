package com.dormitory.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.persistence.ManyToOne;
import javax.persistence.Enumerated;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(finders = { "findRoomsByStatus" })
public class Room {

    /**
     */
    @NotNull
    private String roomNumber;

    /**
     */
    @ManyToOne
    private Roomtype roomType;

    /**
     */
    @Enumerated
    private RoomStatus status;
}
