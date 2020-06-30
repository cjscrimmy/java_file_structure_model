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

@Component
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
        User paul = new User("paul");
        userRepository.save(paul);

        User nicola = new User("nicola");
        userRepository.save(nicola);

        Folder work = new Folder("work", paul);
        paul.addFolder(work);
        folderRepository.save(work);

        Folder holiday = new Folder("holiday", nicola);
        nicola.addFolder(holiday);
        folderRepository.save(holiday);

        File homework = new File("homework", "doc", 4, work);
        work.addFile(homework);
        fileRepository.save(homework);

        File lab = new File("lab", "doc", 5, work);
        work.addFile(lab);
        fileRepository.save(lab);

        File holidayPlan = new File("holiday plan", "pdf", 12, holiday);
        holiday.addFile(holidayPlan);
        fileRepository.save(holidayPlan);

        File planeTickets = new File("plane tickets", "pdf", 20, holiday);
        holiday.addFile(planeTickets);
        fileRepository.save(planeTickets);
    }
}
