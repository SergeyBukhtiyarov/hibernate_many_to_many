package com.example.hibernate_many_to_many.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Child {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private long age;

    @ToString.Exclude
    @ManyToMany
    @JoinTable(name = "child_section", joinColumns = @JoinColumn(name = "child_id")
            ,inverseJoinColumns = @JoinColumn(name = "section_id"))
    private List<Section> sectionList;

    public void addSectionToChild (Section section) {
        if (sectionList==null) {
            sectionList= new ArrayList<>();
        }
        sectionList.add(section);
    }
}
