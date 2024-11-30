package com.infosys.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.infosys.demo.bean.TheatreScreenMovieShow;
import com.infosys.demo.bean.TheatreScreenMovieShowEmbed;



@Repository
public interface theatre_screen_movie_showRepository extends JpaRepository<TheatreScreenMovieShow,TheatreScreenMovieShowEmbed>{

	@Query("SELECT t FROM TheatreScreenMovieShow t WHERE t.embeddedId.theatreScreenEmbed.theatreId = ?1")
	public List<TheatreScreenMovieShow> getScreenMovieShowsByTheatreId(Integer theatreId);
	
}
