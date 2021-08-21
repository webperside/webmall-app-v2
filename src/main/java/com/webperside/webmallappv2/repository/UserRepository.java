package com.webperside.webmallappv2.repository;

import com.webperside.webmallappv2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
