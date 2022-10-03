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

        Child child4 = new Child();
        child3.setName("Stas");
        child3.setAge(11l);

        Child child5 = new Child();
        child3.setName("Milana");
        child3.setAge(7l);


        Section section1 = new Section();
        section1.setName("Football");

        Section section2 = new Section();
        section2.setName("Basketball");

        Section section3 = new Section();
        section3.setName("Golf");

        Section section4 = new Section();
        section4.setName("karate");

        Section section5 = new Section();
        section5.setName("kung-fu");

        sectionRepository.save(section1);
        sectionRepository.save(section2);
        sectionRepository.save(section3);
        sectionRepository.save(section4);
        sectionRepository.save(section5);

child1.addSectionToChild(section1);
child1.addSectionToChild(section2);
child1.addSectionToChild(section3);
child1.addSectionToChild(section4);
child1.addSectionToChild(section5);
child2.addSectionToChild(section1);
child2.addSectionToChild(section2);
child2.addSectionToChild(section3);
child2.addSectionToChild(section4);
child2.addSectionToChild(section5);
child3.addSectionToChild(section4);
child5.addSectionToChild(section4);
child4.addSectionToChild(section2);
childRepository.save(child1);
childRepository.save(child2);
childRepository.save(child3);
childRepository.save(child4);
childRepository.save(child5);






//        section1.addChildToSection(child1);
//        section1.addChildToSection(child2);
//        section1.addChildToSection(child3);

    //    section2.addChildToSection(child2);
      //  section3.addChildToSection(child3);
      //  section4.addChildToSection(child3);
//        section2.addChildToSection(child1);
//        section2.addChildToSection(child2);
//        section2.addChildToSection(child3);
//        section3.addChildToSection(child3);
//        section4.addChildToSection(child2);


//        sectionRepository.save(section1);
//        sectionRepository.save(section2);
//        sectionRepository.save(section3);
        //sectionRepository.save(section4);


    }

    @Test
    public void saveSection() {
//        sectionRepository.save(section2);
//        sectionRepository.save(section3);
//        sectionRepository.save(section4);

    }

}
