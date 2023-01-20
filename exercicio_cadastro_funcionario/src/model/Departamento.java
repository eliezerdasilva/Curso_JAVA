package model;

import java.util.ArrayList;

public class Departamento {

	private int Codigo;
	private String Nome;
	ArrayList<Funcionario> ListaFunc;
	
	//metodo construtor 
	public Departamento() {
		ListaFunc = new ArrayList();
	}
	
	public Departamento(int codigo, String nome) {
		Codigo = codigo;
		Nome = nome;
		ListaFunc = new ArrayList();
	}

	public int getCodigo() {
		return Codigo;
	}

	public void setCodigo(int codigo) {
		Codigo = codigo;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public ArrayList<Funcionario> getListaFunc() {
		return ListaFunc;
	}

	public void setListaFunc(ArrayList<Funcionario> listaFunc) {
		ListaFunc = listaFunc;
	}
	public void addFunc(Funcionario F) {
		F.setDep(this);
		ListaFunc.add(F);
	}
	
	
	
	
	
}
