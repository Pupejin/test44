// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.dormitory.web;

import com.domitory.domain.Maintenances;
import com.dormitory.domain.Customer;
import com.dormitory.domain.DurableArticles;
import com.dormitory.domain.Maintenance;
import com.dormitory.domain.RentDurableArticles;
import com.dormitory.domain.Reservation;
import com.dormitory.domain.Room;
import com.dormitory.domain.Roomtype;
import com.dormitory.web.ApplicationConversionServiceFactoryBean;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;

privileged aspect ApplicationConversionServiceFactoryBean_Roo_ConversionService {
    
    declare @type: ApplicationConversionServiceFactoryBean: @Configurable;
    
    public Converter<Maintenances, String> ApplicationConversionServiceFactoryBean.getMaintenancesToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<com.domitory.domain.Maintenances, java.lang.String>() {
            public String convert(Maintenances maintenances) {
                return new StringBuilder().append(maintenances.getMaintenanceDate()).append(' ').append(maintenances.getPhone()).append(' ').append(maintenances.getSymptomsDamaged()).toString();
            }
        };
    }
    
    public Converter<Long, Maintenances> ApplicationConversionServiceFactoryBean.getIdToMaintenancesConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, com.domitory.domain.Maintenances>() {
            public com.domitory.domain.Maintenances convert(java.lang.Long id) {
                return Maintenances.findMaintenances(id);
            }
        };
    }
    
    public Converter<String, Maintenances> ApplicationConversionServiceFactoryBean.getStringToMaintenancesConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, com.domitory.domain.Maintenances>() {
            public com.domitory.domain.Maintenances convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), Maintenances.class);
            }
        };
    }
    
    public Converter<Customer, String> ApplicationConversionServiceFactoryBean.getCustomerToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<com.dormitory.domain.Customer, java.lang.String>() {
            public String convert(Customer customer) {
                return new StringBuilder().append(customer.getName()).toString();
            }
        };
    }
    
    public Converter<Long, Customer> ApplicationConversionServiceFactoryBean.getIdToCustomerConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, com.dormitory.domain.Customer>() {
            public com.dormitory.domain.Customer convert(java.lang.Long id) {
                return Customer.findCustomer(id);
            }
        };
    }
    
    public Converter<String, Customer> ApplicationConversionServiceFactoryBean.getStringToCustomerConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, com.dormitory.domain.Customer>() {
            public com.dormitory.domain.Customer convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), Customer.class);
            }
        };
    }
    
    public Converter<DurableArticles, String> ApplicationConversionServiceFactoryBean.getDurableArticlesToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<com.dormitory.domain.DurableArticles, java.lang.String>() {
            public String convert(DurableArticles durableArticles) {
                return new StringBuilder().append(durableArticles.getName()).toString();
            }
        };
    }
    
    public Converter<Long, DurableArticles> ApplicationConversionServiceFactoryBean.getIdToDurableArticlesConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, com.dormitory.domain.DurableArticles>() {
            public com.dormitory.domain.DurableArticles convert(java.lang.Long id) {
                return DurableArticles.findDurableArticles(id);
            }
        };
    }
    
    public Converter<String, DurableArticles> ApplicationConversionServiceFactoryBean.getStringToDurableArticlesConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, com.dormitory.domain.DurableArticles>() {
            public com.dormitory.domain.DurableArticles convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), DurableArticles.class);
            }
        };
    }
    
    public Converter<Maintenance, String> ApplicationConversionServiceFactoryBean.getMaintenanceToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<com.dormitory.domain.Maintenance, java.lang.String>() {
            public String convert(Maintenance maintenance) {
                return new StringBuilder().append(maintenance.getMaintenanceDate()).append(' ').append(maintenance.getPhone()).toString();
            }
        };
    }
    
    public Converter<Long, Maintenance> ApplicationConversionServiceFactoryBean.getIdToMaintenanceConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, com.dormitory.domain.Maintenance>() {
            public com.dormitory.domain.Maintenance convert(java.lang.Long id) {
                return Maintenance.findMaintenance(id);
            }
        };
    }
    
    public Converter<String, Maintenance> ApplicationConversionServiceFactoryBean.getStringToMaintenanceConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, com.dormitory.domain.Maintenance>() {
            public com.dormitory.domain.Maintenance convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), Maintenance.class);
            }
        };
    }
    
    public Converter<RentDurableArticles, String> ApplicationConversionServiceFactoryBean.getRentDurableArticlesToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<com.dormitory.domain.RentDurableArticles, java.lang.String>() {
            public String convert(RentDurableArticles rentDurableArticles) {
                return new StringBuilder().append(rentDurableArticles.getName()).append(' ').append(rentDurableArticles.getPhonenumber()).append(' ').append(rentDurableArticles.getEmail()).append(' ').append(rentDurableArticles.getDurableArticlesDate()).toString();
            }
        };
    }
    
    public Converter<Long, RentDurableArticles> ApplicationConversionServiceFactoryBean.getIdToRentDurableArticlesConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, com.dormitory.domain.RentDurableArticles>() {
            public com.dormitory.domain.RentDurableArticles convert(java.lang.Long id) {
                return RentDurableArticles.findRentDurableArticles(id);
            }
        };
    }
    
    public Converter<String, RentDurableArticles> ApplicationConversionServiceFactoryBean.getStringToRentDurableArticlesConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, com.dormitory.domain.RentDurableArticles>() {
            public com.dormitory.domain.RentDurableArticles convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), RentDurableArticles.class);
            }
        };
    }
    
    public Converter<Reservation, String> ApplicationConversionServiceFactoryBean.getReservationToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<com.dormitory.domain.Reservation, java.lang.String>() {
            public String convert(Reservation reservation) {
                return new StringBuilder().append(reservation.getPhone()).append(' ').append(reservation.getEmail()).toString();
            }
        };
    }
    
    public Converter<Long, Reservation> ApplicationConversionServiceFactoryBean.getIdToReservationConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, com.dormitory.domain.Reservation>() {
            public com.dormitory.domain.Reservation convert(java.lang.Long id) {
                return Reservation.findReservation(id);
            }
        };
    }
    
    public Converter<String, Reservation> ApplicationConversionServiceFactoryBean.getStringToReservationConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, com.dormitory.domain.Reservation>() {
            public com.dormitory.domain.Reservation convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), Reservation.class);
            }
        };
    }
    
    public Converter<Room, String> ApplicationConversionServiceFactoryBean.getRoomToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<com.dormitory.domain.Room, java.lang.String>() {
            public String convert(Room room) {
                return new StringBuilder().append(room.getRoomNumber()).toString();
            }
        };
    }
    
    public Converter<Long, Room> ApplicationConversionServiceFactoryBean.getIdToRoomConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, com.dormitory.domain.Room>() {
            public com.dormitory.domain.Room convert(java.lang.Long id) {
                return Room.findRoom(id);
            }
        };
    }
    
    public Converter<String, Room> ApplicationConversionServiceFactoryBean.getStringToRoomConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, com.dormitory.domain.Room>() {
            public com.dormitory.domain.Room convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), Room.class);
            }
        };
    }
    
    public Converter<Roomtype, String> ApplicationConversionServiceFactoryBean.getRoomtypeToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<com.dormitory.domain.Roomtype, java.lang.String>() {
            public String convert(Roomtype roomtype) {
                return new StringBuilder().append(roomtype.getType()).toString();
            }
        };
    }
    
    public Converter<Long, Roomtype> ApplicationConversionServiceFactoryBean.getIdToRoomtypeConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, com.dormitory.domain.Roomtype>() {
            public com.dormitory.domain.Roomtype convert(java.lang.Long id) {
                return Roomtype.findRoomtype(id);
            }
        };
    }
    
    public Converter<String, Roomtype> ApplicationConversionServiceFactoryBean.getStringToRoomtypeConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, com.dormitory.domain.Roomtype>() {
            public com.dormitory.domain.Roomtype convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), Roomtype.class);
            }
        };
    }
    
    public void ApplicationConversionServiceFactoryBean.installLabelConverters(FormatterRegistry registry) {
        registry.addConverter(getMaintenancesToStringConverter());
        registry.addConverter(getIdToMaintenancesConverter());
        registry.addConverter(getStringToMaintenancesConverter());
        registry.addConverter(getCustomerToStringConverter());
        registry.addConverter(getIdToCustomerConverter());
        registry.addConverter(getStringToCustomerConverter());
        registry.addConverter(getDurableArticlesToStringConverter());
        registry.addConverter(getIdToDurableArticlesConverter());
        registry.addConverter(getStringToDurableArticlesConverter());
        registry.addConverter(getMaintenanceToStringConverter());
        registry.addConverter(getIdToMaintenanceConverter());
        registry.addConverter(getStringToMaintenanceConverter());
        registry.addConverter(getRentDurableArticlesToStringConverter());
        registry.addConverter(getIdToRentDurableArticlesConverter());
        registry.addConverter(getStringToRentDurableArticlesConverter());
        registry.addConverter(getReservationToStringConverter());
        registry.addConverter(getIdToReservationConverter());
        registry.addConverter(getStringToReservationConverter());
        registry.addConverter(getRoomToStringConverter());
        registry.addConverter(getIdToRoomConverter());
        registry.addConverter(getStringToRoomConverter());
        registry.addConverter(getRoomtypeToStringConverter());
        registry.addConverter(getIdToRoomtypeConverter());
        registry.addConverter(getStringToRoomtypeConverter());
    }
    
    public void ApplicationConversionServiceFactoryBean.afterPropertiesSet() {
        super.afterPropertiesSet();
        installLabelConverters(getObject());
    }
    
}
