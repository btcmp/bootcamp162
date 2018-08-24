package com.xsis.bootcamp162.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xsis.bootcamp162.dao.PesertaDao;
import com.xsis.bootcamp162.model.Peserta;

@Controller
@RequestMapping("/peserta")
public class PesertaController {

	@Autowired
	PesertaDao pesertaDao;
	
	@RequestMapping
	public String index(Model model) {
		List<Peserta> pesertas = pesertaDao.getAllPeserta();
		model.addAttribute("pesertas", pesertas);
		
		return "view-peserta";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String save(@ModelAttribute Peserta peserta) {
		pesertaDao.save(peserta);
		return "redirect:/peserta";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String update(@ModelAttribute Peserta peserta) {
		pesertaDao.update(peserta);
		return "redirect:/peserta";
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public String delete(@PathVariable int id) {
		pesertaDao.delete(id);
		return "redirect:/peserta";
	}
	
	@RequestMapping(value="/view-edit", method=RequestMethod.GET)
	public String viewEdit(@RequestParam("idpeserta") int id, Model model) {
		Peserta peserta = pesertaDao.getPesertaById(id);
		
		model.addAttribute("peserta", peserta);
		return "view-peserta-edit";
	}
}
