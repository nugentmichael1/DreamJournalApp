package com.revature.repositories;

import com.revature.Models.Dream;
import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD
=======
import org.springframework.data.repository.CrudRepository;
>>>>>>> 9c73a5dc03eec89f760587bae0b9e144ea52aacf
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DreamRepo extends JpaRepository<Dream, Integer> {

<<<<<<< HEAD
    List<Dream> findAll();

    Dream findDreamById(int id);

}
=======
//    List<Dream> findAll();

//    Dream findDreamById(int id);

}
>>>>>>> 9c73a5dc03eec89f760587bae0b9e144ea52aacf
