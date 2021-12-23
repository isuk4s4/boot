package com.example.demo.REPO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.user;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.Nullable;

import java.util.List;

public interface userREPO extends JpaRepository<user,Long> {


    List<user> findAllById(Long id);

}
