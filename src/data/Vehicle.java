package data;

public class Vehicle {
	private String make;
	private String model;
	private String modelType;
	private String vehicleType;
	private String mileage;
		
	// Constructors
	public Vehicle() {
	}
	
	public Vehicle(String make, String model, String modelType, String vehicleType, String mileage) {
		this.make = make;
		this.model = model;
		this.modelType = modelType;
		this.vehicleType = vehicleType;
		this.mileage = mileage;
	}
	
	// Getter and Setters
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

	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", modelType=" + modelType + ", vehicleType=" + vehicleType + ", mileage" + mileage + "]";
	}

}