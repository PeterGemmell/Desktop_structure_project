package com.example.codeclan.desktopstructure.repositories;

import com.example.codeclan.desktopstructure.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
