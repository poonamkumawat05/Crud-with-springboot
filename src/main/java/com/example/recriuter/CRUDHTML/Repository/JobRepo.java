package com.example.recriuter.CRUDHTML.Repository;

import com.example.recriuter.CRUDHTML.Entity.JOBS;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepo extends JpaRepository<JOBS,Integer> {
}
