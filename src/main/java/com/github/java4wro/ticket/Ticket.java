package com.github.java4wro.ticket;


import javax.persistence.*;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public String id;
    @ManyToOne
    public Long rov;
    public Long place;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getRov() {
        return rov;
    }

    public void setRov(Long rov) {
        this.rov = rov;
    }

    public Long getPlace() {
        return place;
    }

    public void setPlace(Long place) {
        this.place = place;
    }
}
