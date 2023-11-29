package com.leticia.prjEmpresa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table (name="tb_Departamento")
public class Departamento {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long depcodigo;

		@NotNull
		private String depnome;
		
		public Departamento() {
			
		}

		public Departamento(Long depcodigo, String depnome) {
			super();
			this.depcodigo = depcodigo;
			this.depnome = depnome;
		}
		public Long getdepcodigo() {
			return depcodigo;
		}

		public void setdepcodigo(Long depcodigo) {
			this.depcodigo = depcodigo;
		}

		public String getDepnome() {
			return depnome;
		}

		public void setDepnome(String depnome) {
			this.depnome = depnome;
		}	
}
