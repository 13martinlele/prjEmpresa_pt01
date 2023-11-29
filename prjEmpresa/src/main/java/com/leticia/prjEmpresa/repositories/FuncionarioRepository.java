package com.leticia.prjEmpresa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leticia.prjEmpresa.entities.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
	
}
