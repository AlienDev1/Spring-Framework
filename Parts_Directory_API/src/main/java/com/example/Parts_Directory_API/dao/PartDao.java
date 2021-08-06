package com.example.Parts_Directory_API.dao;

import com.example.Parts_Directory_API.pojo.Part;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PartDao {

    int insertParts(UUID id, Part part);
    default int insertParts(Part part){
        UUID id = UUID.randomUUID();
        return insertParts(id, part);
    }

    List<Part> selectAllParts();
    Optional<Part> selectPartById(UUID id);

    int deletePartById(UUID id);
    int updatePartById(UUID id, Part part);
}
