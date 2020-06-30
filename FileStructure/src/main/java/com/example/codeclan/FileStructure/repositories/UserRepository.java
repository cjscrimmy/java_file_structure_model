package com.example.codeclan.FileStructure.repositories;

import com.example.codeclan.FileStructure.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
