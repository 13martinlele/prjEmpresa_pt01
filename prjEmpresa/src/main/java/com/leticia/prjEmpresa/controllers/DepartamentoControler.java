package com.leticia.prjEmpresa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leticia.prjEmpresa.entities.Departamento;
import com.leticia.prjEmpresa.services.DepartamentoService;

@RestController
@RequestMapping("/departamento")
public class DepartamentoControler {


	//@GetMapping("/home")
	@GetMapping("/home")
    public String paginaInicial() {
        return "index";
    }
	private final DepartamentoService departamentoService;
	
	@Autowired
	public DepartamentoControler(DepartamentoService DepartamentoService) {
		this.departamentoService = DepartamentoService;		
	}
	@GetMapping("/{id}")	
    public ResponseEntity<Departamento> getDepartamento(@PathVariable Long depcodigo) {
	Departamento departamento = departamentoService.getDepartamentoById(depcodigo);
        if (departamento != null) {
            return ResponseEntity.ok(departamento);
        } else {	
            return ResponseEntity.notFound().build();
        }
    }	
	@PostMapping
	public Departamento createDepartamento(@RequestBody Departamento departamento) {
		return departamentoService.saveDepartamento(departamento);
	}
	
	@GetMapping
	public List<Departamento> getAllDepartamentos(){
		return departamentoService.getAllDepartamentos();
	}
	
	@DeleteMapping("/{id}")
	public void deleteDepartamento(@PathVariable Long depcodigo) {
		departamentoService.deleteDepartamento(depcodigo);
	}
	

}
