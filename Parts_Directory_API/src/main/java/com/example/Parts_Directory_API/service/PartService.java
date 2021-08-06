package com.example.Parts_Directory_API.service;

import com.example.Parts_Directory_API.dao.PartDao;
import com.example.Parts_Directory_API.pojo.Part;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PartService {

    private final PartDao partDao;

    @Autowired
    public PartService(@Qualifier("mysql") PartDao partDao){
        this.partDao = partDao;
    }

    //Adds to DB
    public int addPart(Part part){
        return partDao.insertParts(part);
    }

    //Returns List of Parts
    public List<Part> getAllParts(){
        return partDao.selectAllParts();
    }

    //Returns Specified Part
    public Optional<Part> getPartById(UUID id){
        return partDao.selectPartById(id);
    }

    //Removes Part from DB
    public int deletePart(UUID id){
        return partDao.deletePartById(id);
    }

    //Changes Part
    public int updatePart(UUID id, Part newPart){
        return partDao.updatePartById(id, newPart);
    }
}
