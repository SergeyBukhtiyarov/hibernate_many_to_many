package com.example.hibernate_many_to_many.repository;

import com.example.hibernate_many_to_many.entity.Child;
import com.example.hibernate_many_to_many.entity.Section;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SectionRepository extends JpaRepository<Section,Long> {
    Section deleteById(long id);
}
