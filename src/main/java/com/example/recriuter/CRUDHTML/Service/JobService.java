package com.example.recriuter.CRUDHTML.Service;

import com.example.recriuter.CRUDHTML.Entity.JOBS;

import java.util.List;

public interface JobService {

    List<JOBS> getAllJOBS();

    void save(JOBS form);

    JOBS getById(int id);

    void deleteViaId(int id);


}
