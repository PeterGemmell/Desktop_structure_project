package com.example.codeclan.desktopstructure.repositories;

import com.example.codeclan.desktopstructure.models.Folder;
import org.hibernate.validator.constraints.pl.REGON;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
