package com.revature.repositories;

import com.revature.Models.Dream;
import com.revature.Models.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.revature.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
    List<User> findAll();

    User findByUsername(String username);
   // @Query("From users WHERE username= :username AND password=:password")
   User findByUsernameAndPassword( String username, String password);


}
