package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import data.VehicleDAO;

@Controller
public class VehicleController {
	@Autowired
	private VehicleDAO vehicleDAO;
	
	@RequestMapping(path="GetVehicle.do", 
			method=RequestMethod.GET)
	public ModelAndView getVehicles() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("results.jsp");
		mv.addObject("vehicles", vehicleDAO.getVehicles());
		System.out.println(vehicleDAO.getVehicles());
		return mv;
		
	}
	
}
	

