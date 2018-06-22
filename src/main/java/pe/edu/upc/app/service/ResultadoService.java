package pe.edu.upc.app.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.app.model.dao.IResultadoDao;
import pe.edu.upc.app.model.entity.Resultado;

@Service
public class ResultadoService implements IResultadoService {

	@Autowired
	private IResultadoDao rDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<Resultado> findAll() {

		return rDao.findAll();
	}

	@Override
	@Transactional
	public void save(Resultado resultado) {

		this.AsignarPuntaje(resultado);
		rDao.save(resultado);

	}

	private void AsignarPuntaje(Resultado resultado) {

		switch (resultado.getPuesto()) {
		case 1:
			resultado.setPuntaje(5);
			break;
		case 2:
			resultado.setPuntaje(3);
			break;
		case 3:
			resultado.setPuntaje(2);
			break;
			
		default:
			resultado.setPuntaje(1);
		
		}
	}
	


	

	
}
