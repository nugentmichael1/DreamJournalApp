package com.revature.repositories;

<<<<<<< HEAD
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo {
=======
import com.revature.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
>>>>>>> 9c73a5dc03eec89f760587bae0b9e144ea52aacf
}
