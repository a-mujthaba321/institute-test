package com.demo.demo;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Institute {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String instituteName;


    @OneToOne(cascade = CascadeType.ALL)
    private Facility facility;


}
