package com.example.hibernate_many_to_many;

import com.example.hibernate_many_to_many.entity.Child;
import com.example.hibernate_many_to_many.entity.Section;
import com.example.hibernate_many_to_many.repository.ChildRepository;
import com.example.hibernate_many_to_many.repository.SectionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AddToDB {

    @Autowired
    ChildRepository childRepository;

    @Autowired
    SectionRepository sectionRepository;

    @Test
    public void addToDB() {
        Child child1 = new Child();
        child1.setName("Sergey");
        child1.setAge(12l);

        Child child2 = new Child();
        child2.setName("Igor");
        child2.setAge(10l);

        Child child3 = new Child();
        child3.setName("Mary");
        child3.setAge(9l);


        Section section1 = new Section();
        section1.setName("Football");

        Section section2 = new Section();
        section2.setName("Basketball");

        Section section3 = new Section();
        section3.setName("Golf");

        Section section4 = new Section();
        section4.setName("karate");


        section1.addChildToSection(child1);
        section1.addChildToSection(child2);
       section1.addChildToSection(child3);
//        section2.addChildToSection(child1);
//        section2.addChildToSection(child2);
//        section2.addChildToSection(child3);
//        section3.addChildToSection(child3);
//        section4.addChildToSection(child2);


        sectionRepository.save(section1);
        sectionRepository.save(section2);



    }

}
