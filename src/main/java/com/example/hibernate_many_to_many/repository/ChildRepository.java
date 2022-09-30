package com.example.hibernate_many_to_many.repository;

import com.example.hibernate_many_to_many.entity.Child;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChildRepository extends JpaRepository<Child,Long> {
}
