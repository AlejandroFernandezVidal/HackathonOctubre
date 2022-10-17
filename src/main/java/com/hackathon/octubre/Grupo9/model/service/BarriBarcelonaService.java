package com.hackathon.octubre.Grupo9.model.service;

import java.util.Optional;

import com.hackathon.octubre.Grupo9.model.domain.BarriBarcelona;

public interface BarriBarcelonaService {
	
	public BarriBarcelona addBarri(BarriBarcelona barriBarcelona);
	
	public BarriBarcelona updateBarri(BarriBarcelona barriBarcelona);
	
	public void deleteBarri(String id);
	
	public Optional<BarriBarcelona> getOneBarri(String id);
	
	public Iterable<BarriBarcelona> getAllBarri();

}
