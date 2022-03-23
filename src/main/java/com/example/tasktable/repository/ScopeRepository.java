package com.example.tasktable.repository;

import com.example.tasktable.models.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScopeRepository extends JpaRepository<Scope,Long> {
}
