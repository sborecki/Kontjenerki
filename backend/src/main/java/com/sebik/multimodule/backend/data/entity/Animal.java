package com.sebik.multimodule.backend.data.entity;

import javax.persistence.*;

@Entity
@Table(name="ANIMAL")
@lombok.Getter
@lombok.Setter
public class Animal {

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="NAME")
    private String name;

    @Column(name="PRIORITY")
    private int priority;

    @Column(name="REMARKS")
    private String remarks;

}

