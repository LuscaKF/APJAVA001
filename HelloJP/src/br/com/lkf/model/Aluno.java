package br.com.lkf.model;

public class Aluno extends Pessoa {
	private String matricula;
	private int anoMatricula;
	
	// Construtor
	public Aluno(String matricula, int anoMatricula, String nome, String telefone, String email) {
		super(nome, telefone, email);
		this.matricula = matricula;
		this.anoMatricula = anoMatricula;
	}
	
	// Getters Setters
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getAnoMatricula() {
		return anoMatricula;
	}

	public void setAnoMatricula(int anoMatricula) {
		this.anoMatricula = anoMatricula;
	}
	
	@Override
	public String toString() {
		String retorno = "[Matricula: " + this.matricula + ", " +
						 "Ano da mátricula: " + this.anoMatricula + ", " +
						 "Nome: " + super.getNome() + ", " +
						 "Telefone: " + super.getTelefone() + ", " +
						 "E-mail: " + super.getEmail() + "]";
		return retorno;
	}
	
}
