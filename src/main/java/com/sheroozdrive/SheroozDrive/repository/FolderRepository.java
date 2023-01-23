package com.sheroozdrive.SheroozDrive.repository;

import com.sheroozdrive.SheroozDrive.model.Folder;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface FolderRepository extends MongoRepository<Folder, String> {
    List<Folder> findByOwnerId(String ownerId);
}
