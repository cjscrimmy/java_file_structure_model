package com.example.codeclan.FileStructure.repositories;

import com.example.codeclan.FileStructure.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
