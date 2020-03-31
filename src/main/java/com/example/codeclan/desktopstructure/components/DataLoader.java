package com.example.codeclan.desktopstructure.components;

import com.example.codeclan.desktopstructure.models.File;
import com.example.codeclan.desktopstructure.models.Folder;
import com.example.codeclan.desktopstructure.models.User;
import com.example.codeclan.desktopstructure.repositories.FileRepository;
import com.example.codeclan.desktopstructure.repositories.FolderRepository;
import com.example.codeclan.desktopstructure.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){

        User bob = new User("Bob Jones");
        userRepository.save(bob);

        User jane = new User("Jane Doe");
        userRepository.save(jane);

        Folder twitter = new Folder("Twitter Stuff", bob);
        folderRepository.save(twitter);

        Folder instagram = new Folder("Instagram Stuff", jane);
        folderRepository.save(instagram);

        File file1 = new File("Cracking shit", "JavaScript", "700MB", twitter);
        fileRepository.save(file1);




    }
}
