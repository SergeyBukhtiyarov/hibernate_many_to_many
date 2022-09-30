package com.example.hibernate_many_to_many.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Child {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private long age;

//    @ManyToMany
//    private List<Section> sectionList;
}
