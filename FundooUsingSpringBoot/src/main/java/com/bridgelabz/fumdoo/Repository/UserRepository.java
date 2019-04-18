package com.bridgelabz.fumdoo.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.fumdoo.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	public Optional<User> findByEmailId(String emailId);

	public Optional<User> findByUserId(Long userId);
}