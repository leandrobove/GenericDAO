package br.com.fiap.entity;

import java.util.Arrays;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity

@Table(name = "T_ANIMAL")
@SequenceGenerator(name = "seqAnimal", sequenceName = "SQ_ANIMAL", allocationSize = 1)
public class Animal {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqAnimal")
	@Column(name = "CD_ANIMAL")
	private int codigo;

	@Column(name = "NM_ANIMAL", nullable = false)
	private String nome;

	@Column(name = "DS_PORTE", nullable = false)
	private Porte porte;

	@Column(name = "FL_FOTO", nullable = true)
	private byte[] foto;

	@Column(name = "DT_NASCIMENTO", nullable = false)
	@Temporal(TemporalType.DATE)
	private Calendar dataNascimento;

	/**
	 * CONSTRUCTOR
	 */
	public Animal() {
		super();
	}

	/**
	 * @param codigo
	 * @param nome
	 * @param porte
	 * @param foto
	 * @param dataNascimento
	 */
	public Animal(int codigo, String nome, Porte porte, byte[] foto, Calendar dataNascimento) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.porte = porte;
		this.foto = foto;
		this.dataNascimento = dataNascimento;
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

	public Porte getPorte() {
		return porte;
	}

	public void setPorte(Porte porte) {
		this.porte = porte;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "Animal [codigo=" + codigo + ", nome=" + nome + ", porte=" + porte + ", foto=" + Arrays.toString(foto)
				+ "]";
	}

}
