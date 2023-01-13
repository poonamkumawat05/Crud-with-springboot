package com.example.recriuter.CRUDHTML.Service;

import com.example.recriuter.CRUDHTML.Entity.JOBS;
import com.example.recriuter.CRUDHTML.Repository.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service

public class JobServiceImpl implements JobService {
    @Autowired
    private JobRepo repo;

    @Override
    public List<JOBS> getAllJOBS() {
        return repo.findAll();

    }

    @Override
    public void save(JOBS form) {
        repo.save(form);

    }

    @Override
    public JOBS getById(int id) {

        Optional<JOBS> optional = repo.findById(id);

        JOBS form = null;

        if (optional.isPresent())

            form = optional.get();

        else

            throw new RuntimeException(

                    "JOBS not found for id : " + id);

        return form;

    }

    @Override
    public void deleteViaId(int id) {
        repo.deleteById(id);
    }
}
