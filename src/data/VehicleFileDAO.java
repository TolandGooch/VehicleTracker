package data;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.WebApplicationContext;


public class VehicleFileDAO implements VehicleDAO {
	private static final String FILE_NAME="/WEB-INF/vehicle.csv";
	private List<Vehicle> vehicles = new ArrayList<>();

@Autowired 
private WebApplicationContext wac;

@PostConstruct
public void init() {
	try (
			InputStream is = wac.getServletContext().getResourceAsStream(FILE_NAME);
			BufferedReader buf = new BufferedReader(new InputStreamReader(is));
		) {
		String line = buf.readLine();
		while ((line = buf.readLine()) != null) {
			String[] tokens = line.split(",");
			Integer id = Integer.parseInt(tokens[0]);
			System.out.println("Int #:" + tokens[0]);
			String make = tokens[1];
			String model = tokens[2];
			String modelType = tokens[3];
			String numDoor = tokens[4];
			String vehicleType = tokens[5];
			String mileage = tokens[6];
			
			vehicles.add(new Vehicle( id, make,  model, modelType, numDoor, vehicleType,  mileage));
		}
	} catch (Exception e) {
		System.err.println(e);
	}
}

public List<Vehicle> getVehicles() {
	return vehicles;
}

public void setVehicle(List<Vehicle> vehicles) {
	this.vehicles = vehicles;
}

public WebApplicationContext getWac() {
	return wac;
}

public void setWac(WebApplicationContext wac) {
	this.wac = wac;
}

public static String getFileName() {
	return FILE_NAME;
}

public void updateVehicle(Vehicle vehicle) {
    Vehicle vehicleToUpdate = getVehicle(vehicle.getId());
    vehicleToUpdate.setId(vehicle.getId());
    vehicleToUpdate.setMake(vehicle.getMake());
    vehicleToUpdate.setModel(vehicle.getModel());
    vehicleToUpdate.setModelType(vehicle.getModelType());
    vehicleToUpdate.setVehicleType(vehicle.getVehicleType());
    vehicleToUpdate.setMileage(vehicle.getMileage());
}

public Vehicle getVehicle(Integer id) {
    Vehicle vehicle = new Vehicle();
    for (Vehicle v : vehicles) {
		if(v.getId()==id){
			vehicle = v;
		}
	}
    return vehicle;
}

public void deleteVehicle(Integer id) {
    int index = vehicles.indexOf(getVehicle(id));
    vehicles.remove(index);
}


@Override
public Vehicle getDataById(Integer id) {
	Vehicle v = new Vehicle();
	for (Vehicle vehicle : vehicles) {
		if (vehicle.getId() ==id) {
			v = vehicle;
			break;
		}
	}
	return v;
}

@Override
public Vehicle getDataByMake(String make) {
	Vehicle v = null;
	for (Vehicle vehicle : vehicles) {
		if (vehicle.getMake().equalsIgnoreCase(make)) {
			v = vehicle;
			break;
		}
	}
	return v;
}

@Override
public Vehicle getDataByModel(String model) {
	Vehicle v = null;
	for (Vehicle vehicle : vehicles) {
		if (vehicle.getModel().equalsIgnoreCase(model)) {
			v = vehicle;
			break;
		}
	}
	return v;
}

@Override
public Vehicle getDataByModelType(String modelType) {
	Vehicle v = null;
	for (Vehicle vehicle : vehicles) {
		if (vehicle.getMake().equalsIgnoreCase(modelType)) {
			v = vehicle;
			break;
		}
	}
	return null;
}

@Override
public Vehicle getDataByNumDoor(String numDoor) {
	Vehicle v = null;
	for (Vehicle vehicle : vehicles) {
		if (vehicle.getVehicleType().equalsIgnoreCase(numDoor)) {
			v = vehicle;
			break;
		}
	}
	return v;
}

@Override
public Vehicle getDataByVehicleType(String vehicleType) {
	Vehicle v = null;
	for (Vehicle vehicle : vehicles) {
		if (vehicle.getVehicleType().equalsIgnoreCase(vehicleType)) {
			v = vehicle;
			break;
		}
	}
	return v;
}

@Override
public Vehicle getDataByMileage(String mileage) {
	Vehicle v = null;
	for (Vehicle vehicle : vehicles) {
		if (vehicle.getMileage().equalsIgnoreCase(mileage)) {
			v = vehicle;
			break;
		}
	}
	return v;
}

@Override
public List<Vehicle> addVehicle1(Vehicle vehicle) {
	vehicles.add(vehicle);
	return vehicles;
}

@Override
public List<Vehicle> removeVehicle(Vehicle vehicle) {
	vehicles.remove(vehicle);
	return vehicles;
}

@Override
public List<Vehicle> editVehicle(Vehicle vehicle) {
//	vehicles.edit(vehicle);
	int index = 0;
	for (Vehicle v : vehicles) {
		if(v.getId()==vehicle.getId()){
			index = vehicles.indexOf(v);
		}
	}
	vehicles.set(index, vehicle);

	return vehicles;
}

@Override
public List<Vehicle> edit(Vehicle vehicle) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void addVehicle(Vehicle v) {
	// TODO Auto-generated method stub
	
}

@Override
public void deleteVehicle(Vehicle v) {
	// TODO Auto-generated method stub
	
}

@Override
public void removeVehicle(Integer id) {
	// TODO Auto-generated method stub
	
}

}