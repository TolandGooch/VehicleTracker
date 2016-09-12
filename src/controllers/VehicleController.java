package controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import data.Vehicle;
import data.VehicleDAO;

@Controller
@SessionAttributes("vehicles")
public class VehicleController {
	
	@Autowired
	private VehicleDAO vehicleDAO;
	
	@ModelAttribute("vehicles")
	public List<Vehicle> initSessionObject() {
	     ArrayList<Vehicle> vehicles = new ArrayList<>();
	     return vehicles;
	}
	
	// Fill table for all vehicles
	@RequestMapping(path="GetVehicle.do", 
			method=RequestMethod.GET)
	public ModelAndView getVehicles(@ModelAttribute("vehicles") List<Vehicle> vehicles) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("vehicles", vehicleDAO.getVehicles());
		mv.setViewName("results.jsp");
	  //System.out.println(vehicleDAO.getVehicles()); // debug statement
		return mv;
	}
	
	// Delete vehicle
	@RequestMapping(path = "removeVehicle.do", method = RequestMethod.GET)
	public ModelAndView editJob(@ModelAttribute("vehicles") List<Vehicle> vehicle, @RequestParam("id") Integer id) {
		ModelAndView mv = new ModelAndView();
		System.out.println("in remove vehicle");
		mv.setViewName("results.jsp");
		mv.addObject("vehicle");
		return mv;
	}
	
	// Edit Vehicle 
	@RequestMapping(path = "editVehicle.do", method = RequestMethod.GET)
	public ModelAndView editVehicle(@RequestParam("id") Integer id){
		System.out.println("in update vehicle");
		System.out.println(id);
		System.out.println(vehicleDAO.getDataById(id).getMake());
		ModelAndView mv = new ModelAndView();
//		Vehicle veh = new Vehicle();
//		veh.setId(id);
//		veh.setMake(make);
//		veh.setModel(model);
//		veh.setModelType(modelType);
//		veh.setNumDoor(numDoor);
//		veh.setVehicleType(vehicleType);
//		veh.setMileage(mileage);
//		mv.addObject("vehicles", vehicleDAO.editVehicle(veh));
		mv.setViewName("edit.jsp");
//		mv.addObject("vehicles", vehicleDAO.getVehicles());
     mv.addObject("vehicle", vehicleDAO.getDataById(id));
		return mv;
	}
	
	// Edit Vehicle 
	@RequestMapping(path = "editVehicleFinal.do", method = RequestMethod.GET)
	public ModelAndView editVehicleFinal(Vehicle vehicle){
		System.out.println("in update vehicle final");
		System.out.println(vehicle.getId());
		System.out.println(vehicle.getMake());
		System.out.println(vehicle.getModel());
		ModelAndView mv = new ModelAndView();
//		Vehicle veh = new Vehicle();
//		veh.setId(id);
//		veh.setMake(make);
//		veh.setModel(model);
//		veh.setModelType(modelType);
//		veh.setNumDoor(numDoor);
//		veh.setVehicleType(vehicleType);
//		veh.setMileage(mileage);
//		mv.addObject("vehicles", vehicleDAO.editVehicle(veh));
		mv.setViewName("results.jsp");
//		mv.addObject("vehicles", vehicleDAO.getVehicles());
		mv.addObject("vehicles", vehicleDAO.editVehicle(vehicle));
		return mv;
	}
	
	
	// Add Vehicle 
	@RequestMapping(path = "addVehicle.do", method = RequestMethod.GET)
	public ModelAndView addVehicle() {
		ModelAndView mv = new ModelAndView();
		
//		mv.addObject("vehicles", vehicleDAO.add());
		mv.setViewName("add.jsp");
//		mv.addObject("v", vehicleDAO.getDataById(id));	
		return mv;
	}
	
	// Add Vehicle 
	@RequestMapping(path = "addVehicleFinal.do", method = RequestMethod.GET)
	public ModelAndView addVehicleFinal(Vehicle vehicle) {
		ModelAndView mv = new ModelAndView();
		vehicle.setId((vehicleDAO.getVehicles().get(vehicleDAO.getVehicles().size()-1).getId())+1);
		System.out.println(vehicle.getMake());
		System.out.println(vehicle.getId());
		System.out.println(vehicle.getModel());
//		mv.addObject("vehicles", vehicleDAO.add());
		mv.setViewName("results.jsp");
		mv.addObject("vehicles");	
		return mv;
	}
	
	 //Update Vehicle 
	@RequestMapping(path = "updateVehicle.do", method = RequestMethod.GET)
	public ModelAndView updateVehicle(
		   	@RequestParam("id") int id, 
			@RequestParam("make") String make, 
			@RequestParam("make") String model, 
			@RequestParam("model") String modelType,
			@RequestParam("numDoor") String numDoor,
			@RequestParam("vehicleType") String vehicleType,
			@RequestParam("mileage") String mileage) {
		System.out.println("in update vehicle");
		System.out.println(id);
		System.out.println(vehicleDAO.getDataById(id).getMake());
		ModelAndView mv = new ModelAndView();
		Vehicle veh = new Vehicle();
		veh.setId(id);
		veh.setMake(make);
		veh.setModel(model);
		veh.setModelType(modelType);
		veh.setNumDoor(numDoor);
		veh.setVehicleType(vehicleType);
		veh.setMileage(mileage);
//		mv.addObject("vehicles", vehicleDAO.edit());
		mv.setViewName("results.jsp");
		mv.addObject("vehicles", vehicleDAO.getVehicles());
		mv.addObject("v", vehicleDAO.getDataById(id));
		return mv;
	}
	
	@RequestMapping(value="/VehicleMaintenanceTracker-servlet", params="Edit",method=RequestMethod.POST)
    public void edit() {
        System.out.println("Edit block called");
    }
	
	@RequestMapping(value="/VehicleMaintenanceTracker-servlet", params="Delete",method=RequestMethod.POST)
	public void delete() {
		System.out.println("Delete block called");
	}
	
	@RequestMapping(value="/VehicleMaintenanceTracker-servlet", params="Add",method=RequestMethod.POST)
	public void add() {
		System.out.println("Add block called");
	}

	
}
	

