package pe.edu.upc.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import pe.edu.upc.app.model.entity.Participante;
import pe.edu.upc.app.model.entity.Resultado;
import pe.edu.upc.app.service.IParticipanteService;
import pe.edu.upc.app.service.IResultadoService;

@Controller
@SessionAttributes("resultado")
@RequestMapping(value="/resultado")
public class ResultadoController {
	
	@Autowired
	private IResultadoService resultadoService;

	@Autowired
	private IParticipanteService participanteService;
	
	@GetMapping(value="/listar")
	public String listar(Model model) {
		
		model.addAttribute("titulo", "Resultados");
		model.addAttribute("resultados",resultadoService.findAll());
		return "/resultado/listar";
	}
	
	@GetMapping(value="/crear/{participanteId}")
	public String crear(@PathVariable(value="participanteId") Long participanteId, Model model) {
		
		Participante participante = participanteService.findById(participanteId);
		Resultado resultado = new Resultado();
		resultado.setParticipante(participante);
		
		model.addAttribute("titulo", "Registrar Puntaje");
		model.addAttribute("resultado", resultado);
		return "/resultado/crear";
	}
	
	@PostMapping(value ="/crear")
	public String guardar(Model model, @Valid Resultado resultado) {
		resultadoService.save(resultado);
		return "redirect:/participante/listar";
	}
}
