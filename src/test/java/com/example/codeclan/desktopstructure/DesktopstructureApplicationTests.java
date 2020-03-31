package com.example.codeclan.desktopstructure;

import com.example.codeclan.desktopstructure.models.File;
import com.example.codeclan.desktopstructure.models.Folder;
import com.example.codeclan.desktopstructure.models.User;
import com.example.codeclan.desktopstructure.repositories.FileRepository;
import com.example.codeclan.desktopstructure.repositories.FileRepository;
import com.example.codeclan.desktopstructure.repositories.FolderRepository;
import com.example.codeclan.desktopstructure.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DesktopstructureApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	FileRepository fileRepository;


	@Test
	void contextLoads() {
	}

	@Test
	public void createFolderAndFileAndUserData(){
		User user = new User("Peter Gemmell");
		userRepository.save(user);

		Folder folder = new Folder("Projects", user);
		folderRepository.save(folder);

		File file = new File("My New App", "Java", "500MB", folder);
		fileRepository.save(file);

		folder.addFile(file);
		folderRepository.save(folder);

		user.addFolder(folder);
		userRepository.save(user);

	}

}
