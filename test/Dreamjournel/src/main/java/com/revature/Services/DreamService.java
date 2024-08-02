package com.revature.services;


import com.revature.models.Dream;

import java.util.List;

public interface DreamService   {

    List<Dream> getAllDreams();

    Dream getDream(int id);
}
