package com.infosys.demo.dao;

import java.util.List;

import com.infosys.demo.bean.Movie;
import com.infosys.demo.bean.Screen;
import com.infosys.demo.bean.Theatre;

public interface TheatreDao {

	void saveTheatre(Theatre theatre);
    List<Theatre> getAllTheatres();
    Theatre getTheatreById(Integer id);
    void updateTheatre(Theatre theatre);  // Update method
    void deleteTheatre(Integer id); 
    public Integer generateTheatreId();
    public List<Theatre> findAll();

	
	
}
