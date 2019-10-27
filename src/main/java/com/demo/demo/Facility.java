package com.demo.demo;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
public class Facility {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private double facilityArea;

    private double compoundArea;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "facility_id")
    private Set<Classroom> classRooms = new HashSet<Classroom>();
}
