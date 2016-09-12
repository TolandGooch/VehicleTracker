package data;

import java.util.List;

public interface VehicleDAO {
	public Vehicle getDataById(Integer id);
	public Vehicle getDataByMake(String make);
	public Vehicle getDataByModel(String model);
	public Vehicle getDataByModelType(String modelType);	
	public Vehicle getDataByNumDoor(String numDoor);	
	public Vehicle getDataByVehicleType(String vehicleType);
	public Vehicle getDataByMileage(String mileage);
//	public void removeVehicle(Vehicle vehicle);
	public void addVehicle1(Vehicle vehicle);	
	public void removeVehicle(Vehicle vehicle);	
	public List<Vehicle> edit(Vehicle vehicle);	
	public List<Vehicle> getVehicles();
	List<Vehicle> editVehicle(Vehicle s);
	
	
	public void addVehicle( Vehicle v);
	public void updateVehicle( Vehicle v);
	public void deleteVehicle( Vehicle v);
//	public  Vehicle getVehicleBy Id(Integer id);
	public void removeVehicle(Integer id);
	
}
