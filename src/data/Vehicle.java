package data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Vehicle {
	@NotNull
	private Integer id;
	private String make;
	private String model;
	private String modelType;
	private String numDoor;
	private String vehicleType;
	@NotNull
	private String mileage;
		
	// Constructors
	public Vehicle() {
	}
	
	public Vehicle(Integer id, String make, String model, String modelType, String numDoor, String vehicleType, String mileage) {
		this.id =id;
		this.make = make;
		this.model = model;
		this.modelType = modelType;
		this.numDoor= numDoor;
		this.vehicleType = vehicleType;
		this.mileage = mileage;
	}
	
	// Getter and Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getMake() {
		return make;
	}
	
	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getModelType() {
		return modelType;
	}

	public void setModelType(String modelType) {
		this.modelType = modelType;
	}

	public String getNumDoor() {
		return numDoor;
	}

	public void setNumDoor(String numDoor) {
		this.numDoor = numDoor;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getMileage() {
		return mileage;
	}

	public void setMileage(String mileage) {
		this.mileage = mileage;
	}
	
	public void setVehicle(Integer id, String make, String model, String modelType, String numDoor, String vehicleType, String mileage) {
		this.id =id;
		this.make = make;
		this.model = model;
		this.modelType = modelType;
		this.numDoor= numDoor;
		this.vehicleType = vehicleType;
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", modelType=" + modelType + ", Style=" + numDoor + ", vehicleType=" + vehicleType + ", mileage" + mileage + "]";
	}

}
