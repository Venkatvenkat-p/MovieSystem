package com.infosys.demo.dao;

import com.infosys.demo.bean.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TheatreRepository extends JpaRepository<Theatre, Integer> {
    
	
	@Query("select max(id) from Theatre")
	public Integer getLastId();
}
