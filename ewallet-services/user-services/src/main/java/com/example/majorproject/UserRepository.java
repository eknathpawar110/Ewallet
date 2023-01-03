package com.example.majorproject;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,String> {

    User findByUserName(String userName);

    List<User> findAllByUserNameAndAge(String userName,int age);
    boolean exitsByUserName(String userName);
}
