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
public class Child {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private long age;

    @ToString.Exclude
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "child_section", joinColumns = @JoinColumn(name = "child_id")
            ,inverseJoinColumns = @JoinColumn(name = "section_id"))
    private Set<Section> sectionList;

    public void addSectionToChild (Section section) {
        if (sectionList==null) {
            sectionList= new HashSet<>();
        }
        sectionList.add(section);
    }
}
