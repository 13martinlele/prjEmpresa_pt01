package com.leticia.prjEmpresa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leticia.prjEmpresa.entities.Funcionario;
import com.leticia.prjEmpresa.repositories.FuncionarioRepository;

@Service
public class FuncionarioService {

private final FuncionarioRepository funcionarioRepository;
	
	@Autowired
	public FuncionarioService(FuncionarioRepository funcionarioRepository) {
		this.funcionarioRepository =funcionarioRepository;
	}

		public Funcionario getFuncionarioById(Long funcodigo) {
			return funcionarioRepository.findById(funcodigo).orElse(null);
		}

		public  List<Funcionario> getAllFuncionarios(){
			return funcionarioRepository.findAll();
		}

		public Funcionario saveFuncionario(Funcionario funcionario) {
			return funcionarioRepository.save(funcionario);		
		}

		public void deleteFuncionario(Long funcodigo){
			funcionarioRepository.deleteById(funcodigo);	
		}	

}
	
