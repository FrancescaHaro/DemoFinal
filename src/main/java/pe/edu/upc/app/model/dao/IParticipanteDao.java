package pe.edu.upc.app.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.app.model.entity.Participante;

@Repository
public interface IParticipanteDao extends JpaRepository<Participante, Long>{

}
