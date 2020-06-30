package com.example.codeclan.FileStructure.components;

import com.example.codeclan.FileStructure.models.File;
import com.example.codeclan.FileStructure.models.Folder;
import com.example.codeclan.FileStructure.models.User;
import com.example.codeclan.FileStructure.repositories.FolderRepository;
import com.example.codeclan.FileStructure.repositories.FileRepository;
import com.example.codeclan.FileStructure.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

public class DataLoader implements ApplicationRunner {
    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader(){

    }

    @Override
    public void run(ApplicationArguments args) {

    }
}
