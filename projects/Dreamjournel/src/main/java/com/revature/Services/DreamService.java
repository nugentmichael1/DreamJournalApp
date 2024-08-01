package com.revature.Services;


import com.revature.Models.Dream;

import java.util.List;

public interface DreamService   {

    List<Dream> getAllDreams();

    Dream getDream(int id);
}
