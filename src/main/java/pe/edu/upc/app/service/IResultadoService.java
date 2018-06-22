package pe.edu.upc.app.service;

import java.util.List;


import pe.edu.upc.app.model.entity.Resultado;

public interface IResultadoService{

    public List<Resultado> findAll();
	
	public void save(Resultado resultado);
	

	
}
