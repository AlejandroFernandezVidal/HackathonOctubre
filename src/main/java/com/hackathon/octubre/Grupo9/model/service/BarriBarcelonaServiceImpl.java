package com.hackathon.octubre.Grupo9.model.service;


import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hackathon.octubre.Grupo9.model.domain.BarriBarcelona;
import com.hackathon.octubre.Grupo9.model.repository.BarriBarcelonaRepository;

@Service
public class BarriBarcelonaServiceImpl implements BarriBarcelonaService{
	
	@Autowired
	private BarriBarcelonaRepository barriBarcelonaRepository;

	@Override
	@Transactional
	public BarriBarcelona addBarri(BarriBarcelona barriBarcelona) {
		
		return barriBarcelonaRepository.save(barriBarcelona);
	}

	@Override
	@Transactional
	public BarriBarcelona updateBarri(BarriBarcelona barriBarcelona) {
	
		return barriBarcelonaRepository.save(barriBarcelona);
	}

	@Override
	@Transactional
	public void deleteBarri(String id) {
		
		barriBarcelonaRepository.deleteById(id);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<BarriBarcelona> getOneBarri(String id) {
		
		return barriBarcelonaRepository.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<BarriBarcelona> getAllBarri() {
		
		return barriBarcelonaRepository.findAll();
	}
	
}
