package data;

import java.util.List;

public interface VehicleDAO {
	public Vehicle getDataByMake(String make);
	public Vehicle getDataByModel(String model);
	public Vehicle getDataByModelType(String modelType);	
	public Vehicle getDataByNumDoor(String numDoor);	
	public Vehicle getDataByVehicleType(String vehicleType);
	public Vehicle getDataByMileage(String mileage);
	public void addVehicle(Vehicle vehicle);
	public List<Vehicle> getVehicles();
}
