package com.xsis.bootcamp162.dao;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.xsis.bootcamp162.model.Peserta;

@Repository
@Transactional
public class PesertaDaoImpl implements PesertaDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void save(Peserta peserta) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(peserta);
		session.flush();
	}

	@Override
	public List<Peserta> getAllPeserta() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.createCriteria(Peserta.class).list();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Peserta peserta = new Peserta();
		peserta.setId(id);
		session.delete(peserta);
	}

	@Override
	public Peserta getPesertaById(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.get(Peserta.class, id);
	}

	@Override
	public void update(Peserta peserta) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.update(peserta);
		session.flush();
	}

}
