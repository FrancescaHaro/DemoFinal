package pe.edu.upc.app.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pe.edu.upc.app.model.entity.Resultado;

@Repository
public interface IResultadoDao extends JpaRepository<Resultado, Long>{


}
