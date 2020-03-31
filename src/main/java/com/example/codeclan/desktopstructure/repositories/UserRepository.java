package com.example.codeclan.desktopstructure.repositories;

import com.example.codeclan.desktopstructure.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
