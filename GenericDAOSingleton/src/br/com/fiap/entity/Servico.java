package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity

@Table(name="T_SERVICO")
@SequenceGenerator(name="seqServico", sequenceName="SQ_SERVICO", allocationSize=1)
public class Servico {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqServico")
	@Column(name="CD_SERVICO")
	private int codigo;
	
	@Column(name="NM_SERVICO", nullable=false)
	private String nome;
	
	@Column(name="VL_SERVICO", nullable=false)
	private double preco;

	/**
	 * CONTRUCTORS
	 */
	public Servico() {
		super();
	}

	/**
	 * @param codigo
	 * @param nome
	 * @param preco
	 */
	public Servico(int codigo, String nome, double preco) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Servico [codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + "]";
	}

}
