package pe.edu.upc.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upc.app.model.dao.IParticipanteDao;
import pe.edu.upc.app.model.entity.Participante;

@Service
public class ParticipanteService implements IParticipanteService {

	@Autowired
	private IParticipanteDao pDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<Participante> findAll() {
		// TODO Auto-generated method stub
		return pDao.findAll();
	}

	@Override
	@Transactional
	public void save(Participante participante) {
		// TODO Auto-generated method stub
		pDao.save(participante);

	}

	@Override
	@Transactional
	public Participante findById(Long id) {
		// TODO Auto-generated method stub
		return pDao.findById(id).orElse(null);
	}

}
