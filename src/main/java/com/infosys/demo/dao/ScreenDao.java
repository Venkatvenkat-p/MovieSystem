package com.infosys.demo.dao;

import java.util.List;

import com.infosys.demo.bean.Movie;
import com.infosys.demo.bean.Screen;

public interface ScreenDao {
void save(Screen screen);
    
    // Get a Screen by ID
    Screen getById(Integer screenId);
    
    // Get all Screens
    List<Screen> getAllScreens();
    
    // Update a Screen object
    void update(Screen screen);
    
    // Delete a Screen by ID
    void delete(Integer screenId);

	Integer generateScreenId();
	
	public List<Integer> getAllIds();
}
