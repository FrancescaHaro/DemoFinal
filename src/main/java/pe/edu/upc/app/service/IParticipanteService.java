package pe.edu.upc.app.service;

import java.util.List;

import pe.edu.upc.app.model.entity.Participante;

public interface IParticipanteService {
	

	public List<Participante> findAll();
	
	public void save(Participante participante);
	
	public Participante findById(Long id);

}
