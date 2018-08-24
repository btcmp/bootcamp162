package com.xsis.bootcamp162.dao;

import java.util.List;

import com.xsis.bootcamp162.model.Peserta;

public interface PesertaDao {

	public void save(Peserta peserta);
	public List<Peserta> getAllPeserta();
	public void delete(int id);
	public Peserta getPesertaById(int id);
	public void update(Peserta peserta);
}
