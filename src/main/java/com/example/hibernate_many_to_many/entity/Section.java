package com.example.hibernate_many_to_many.entity;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
public class Section {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;


    @ToString.Exclude
    @ManyToMany(cascade = CascadeType.MERGE,fetch = FetchType.EAGER)
    @JoinTable(name = "child_section", joinColumns = @JoinColumn(name = "section_id")
            ,inverseJoinColumns = @JoinColumn(name = "child_id"))
    private Set <Child> childList;


    public void addChildToSection(Child child) {
        if (childList==null) {
            childList = new HashSet<>();
        }
        childList.add(child);
    }
}
