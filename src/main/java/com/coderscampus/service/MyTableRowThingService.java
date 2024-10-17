package com.coderscampus.service;

import com.coderscampus.domain.MyTableRowThing;
import com.coderscampus.repository.MyTableRowThingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyTableRowThingService {

    private final MyTableRowThingRepository myTableRowThingRepository;

    public MyTableRowThingService(MyTableRowThingRepository myTableRowThingRepository) {
        this.myTableRowThingRepository = myTableRowThingRepository;
    }

    public MyTableRowThing save(MyTableRowThing myTableRowThing) {
        return myTableRowThingRepository.save(myTableRowThing);
    }

    public List<MyTableRowThing> findAll() {
        return myTableRowThingRepository.findAll();
    }

    public MyTableRowThing findById(Long id) {
        return myTableRowThingRepository.findById(id).get();
    }

    public void delete(MyTableRowThing myTableRowThing) {
        myTableRowThingRepository.delete(myTableRowThing);
    }

}