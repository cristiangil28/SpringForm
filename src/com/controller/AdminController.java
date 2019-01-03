package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cristian.beans.pojo.Admin;
import com.cristian.service.AdminService;

@Controller
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@RequestMapping("/admin")
	public String showAdmin(Model model, @ModelAttribute("resultado")String resultado) {
		Admin admin = new Admin();
		model.addAttribute("admin", admin);
		model.addAttribute("resultado", resultado);
		return "admin";
	}
	@RequestMapping(value="/admin/save", method=RequestMethod.POST)
	public String handleAdmin(@ModelAttribute("admin")Admin adminform, Model model, RedirectAttributes re) {
		if (adminService.save(adminform)) {
			re.addFlashAttribute("resultado","cambios realizados correctamente");
		}
		else {
			re.addFlashAttribute("resultado","error al realizar los cambios");
		}
		
		return "redirect:/admin"; //ya no redirecciona a una vista si no a un controlador para evitar que al
									//cuando el usuario recarge, los datos que persistan no se sigan guardando 
	}								//en la base de datos, solo la primera vez que se envia la petición

}
