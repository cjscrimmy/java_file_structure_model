package com.example.codeclan.FileStructure.repositories;

import com.example.codeclan.FileStructure.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
