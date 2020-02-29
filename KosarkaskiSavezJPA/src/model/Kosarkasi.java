package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the kosarkasi database table.
 * 
 */
@Entity
@NamedQuery(name="Kosarkasi.findAll", query="SELECT k FROM Kosarkasi k")
public class Kosarkasi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idKosarkasi;

	private String email;

	private String ime;

	private String klub;

	private String liga;

	private String prezime;

	public Kosarkasi() {
	}

	public int getIdKosarkasi() {
		return this.idKosarkasi;
	}

	public void setIdKosarkasi(int idKosarkasi) {
		this.idKosarkasi = idKosarkasi;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIme() {
		return this.ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getKlub() {
		return this.klub;
	}

	public void setKlub(String klub) {
		this.klub = klub;
	}

	public String getLiga() {
		return this.liga;
	}

	public void setLiga(String liga) {
		this.liga = liga;
	}

	public String getPrezime() {
		return this.prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

}