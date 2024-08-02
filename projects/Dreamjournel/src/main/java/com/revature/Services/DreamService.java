package com.revature.Services;


import com.revature.Models.Dream;

import java.util.List;
import java.util.Optional;


public interface DreamService {

    List<Dream> getAllDreams();
    Dream getDream(int id);
    Dream addDream(Dream dream);
    Dream updateDream(int id, Dream dream);
   // List<Dream> getAllDreamsByUser(int userid);


}
