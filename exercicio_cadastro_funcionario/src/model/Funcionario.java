package model;

public class Funcionario {
	private int matricula;
	private String Nome;
	private Departamento Dep;
	
	
	public Funcionario(int matricula, String nome) {
		super();
		this.matricula = matricula;
		Nome = nome;
	}


	public int getMatricula() {
		return matricula;
	}


	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}


	public String getNome() {
		return Nome;
	}


	public void setNome(String nome) {
		Nome = nome;
	}


	public Departamento getDep() {
		return Dep;
	}


	public void setDep(Departamento dep) {
		Dep = dep;
	}
	
	
	
	

}
