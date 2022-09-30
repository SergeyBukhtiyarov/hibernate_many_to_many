package com.example.hibernate_many_to_many.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Section {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @ToString.Exclude
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "child_section", joinColumns = @JoinColumn(name = "section_id")
            ,inverseJoinColumns = @JoinColumn(name = "child_id"))
    private List<Child> childList;


    public void addChildToSection(Child child) {
        if (childList==null) {
            childList = new ArrayList<>();
        }
        childList.add(child);
    }
}
