package com.lab6.CollegeFest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lab6.CollegeFest.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	public User findByUserName(String username);
}
