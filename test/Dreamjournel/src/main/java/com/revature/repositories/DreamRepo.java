package com.revature.repositories;

import com.revature.Models.Dream;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DreamRepo extends JpaRepository<Dream, Integer> {

    List<Dream> findAll();

    Dream findDreamById(int id);

}