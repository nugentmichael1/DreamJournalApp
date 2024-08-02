package com.revature.Services;


import com.revature.Models.Dream;

import java.util.List;

<<<<<<< HEAD
public interface DreamService   {

    List<Dream> getAllDreams();

    Dream getDream(int id);
=======
public interface DreamService {

    List<Dream> getAllDreams();
    Dream getDream(int id);
    Dream addDream(Dream dream);
    Dream updateDream(int id, Dream dream);

>>>>>>> 9c73a5dc03eec89f760587bae0b9e144ea52aacf
}
