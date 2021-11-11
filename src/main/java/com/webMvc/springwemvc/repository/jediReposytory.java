package com.webMvc.springwemvc.repository;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Repository;

import com.webMvc.springwemvc.model.Jedi;

@Repository
public class jediReposytory {
     
	private List<Jedi> jedis;	
	
	
	public jediReposytory() {

		jedis = new ArrayList<>();
		jedis.add(new Jedi("lukeee", "skyuyi"));

	}

	public List<Jedi> getAllJedi() {


		return jedis;
	}

	public void add(Jedi jedi) {
		
		this.jedis.add(jedi);
		
	}
}
