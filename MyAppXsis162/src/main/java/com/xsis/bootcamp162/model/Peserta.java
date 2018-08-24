package com.xsis.bootcamp162.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//POJO, plain old java object
@Entity
@Table(name="PESERTA_01")
public class Peserta {
	
	//properties
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	@Column(length=55)
	private String nama;
	private String noHp;
	private String alamat;
	private String gender;
	private String email;
	
	//setter
	public void setId(int id) {
		this.id = id;
	}
		
	public int getId() {
		return this.id;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getNoHp() {
		return noHp;
	}

	public void setNoHp(String noHp) {
		this.noHp = noHp;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
		
	
}
