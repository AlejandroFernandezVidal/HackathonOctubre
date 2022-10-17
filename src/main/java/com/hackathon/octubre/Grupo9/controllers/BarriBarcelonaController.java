package com.hackathon.octubre.Grupo9.controllers;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.octubre.Grupo9.model.domain.BarriBarcelona;
import com.hackathon.octubre.Grupo9.model.service.BarriBarcelonaService;


@RestController
@RequestMapping("/barri")
public class BarriBarcelonaController {
	
	@Autowired
	private BarriBarcelonaService barriBarcelonaService;
	
	@PostMapping("/add")
	public ResponseEntity<?> addBarri(@RequestBody BarriBarcelona barriBarcelona){
		return ResponseEntity.status(HttpStatus.CREATED).body(barriBarcelonaService.addBarri(barriBarcelona));
	}
	@PutMapping("/update")
	public ResponseEntity<?> updateBarri(@RequestBody BarriBarcelona barriBarcelona){
		Optional<BarriBarcelona> barriBarcelonaActualizar = barriBarcelonaService.getOneBarri(barriBarcelona.getId());
		if(barriBarcelonaActualizar.isPresent()) {
			BarriBarcelona _barriBarcelona = barriBarcelonaActualizar.get();
			_barriBarcelona.setNomDivisioTerritorial(barriBarcelona.getNomDivisioTerritorial());
			_barriBarcelona.setPoblacion(barriBarcelona.getPoblacion());
			return ResponseEntity.status(HttpStatus.OK).body(barriBarcelonaService.updateBarri(_barriBarcelona));
		}else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("El barri amb id " + barriBarcelona.getId() + " no existeix.");
		}
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteBarri(@PathVariable String id){
		if(!barriBarcelonaService.getOneBarri(id).isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("El barri amb id " + id + " no existeix.");
		}else {
			barriBarcelonaService.deleteBarri(id);
			return ResponseEntity.status(HttpStatus.OK).body("El barri amb id " + id + " eliminat correctament.");
		}
	}
	@GetMapping("/getOne/{id}")
	public ResponseEntity<?> getOneBarri(@PathVariable String id){
		Optional<BarriBarcelona> barriBuscar = barriBarcelonaService.getOneBarri(id);
		if(!barriBuscar.isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No tenim dades per aquest barri.");
		}else {
			return ResponseEntity.of(barriBuscar);
		}
	}
	@GetMapping("/getAll")
	public ResponseEntity<?> getAllBarri(){
		List<BarriBarcelona> barris = StreamSupport
				.stream(barriBarcelonaService.getAllBarri().spliterator(),false)
				.collect(Collectors.toList());
		if(barris.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No tenim barris al llistat.");
		}else {
			return ResponseEntity.ok(barris);
		}
	}
}
