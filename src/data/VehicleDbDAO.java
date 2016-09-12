package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VehicleDbDAO implements VehicleDAO {
	private static String url = "jdbc:mysql://localhost:3306/trackerdb";
	private static final String user = "tracker";
	private static final String pass = "tracker";

	public VehicleDbDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace(System.err);
		}
	}

	@Override
	public Vehicle getDataById(Integer id) {
		Vehicle vehicle = null;
		try {
			Connection conn = DriverManager.getConnection(url, user, pass);
			String sqltxt;
			sqltxt = " SELECT id, make, model, modeltype,numDoor, vehicleType, mileage FROM model_name WHERE id= ?";
			PreparedStatement stmt = conn.prepareStatement(sqltxt);
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				// Integer id, String make, String model, String modelType,
				// String numDoor, String vehicleType, String mileage
				vehicle = new Vehicle(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException sqle) {
			sqle.printStackTrace(System.err);
		}
		return vehicle;
	}

	@Override
	public Vehicle getDataByMake(String make) {
		Vehicle vehicle = null;
		try {
			Connection conn = DriverManager.getConnection(url, user, pass);
			String sqltxt;
			sqltxt = " SELECT id, make, model, modeltype, numDoor, vehicleType, mileage FROM model_name WHERE make= ?";
			PreparedStatement stmt = conn.prepareStatement(sqltxt);
			stmt.setString(1, make);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				// Integer id, String make, String model, String modelType,
				// String numDoor, String vehicleType, String mileage
				vehicle = new Vehicle(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException sqle) {
			sqle.printStackTrace(System.err);
		}
		return vehicle;
	}

	@Override
	public Vehicle getDataByModel(String model) {
		Vehicle vehicle = null;
		try {
			Connection conn = DriverManager.getConnection(url, user, pass);
			String sqltxt;
			sqltxt = " SELECT id, make, model, modeltype,numDoor, vehicleType, mileage FROM model_name WHERE model= ?";
			PreparedStatement stmt = conn.prepareStatement(sqltxt);
			stmt.setString(1, model);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				// Integer id, String make, String model, String modelType,
				// String numDoor, String vehicleType, String mileage
				vehicle = new Vehicle(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException sqle) {
			sqle.printStackTrace(System.err);
		}
		return vehicle;
	}

	@Override
	public Vehicle getDataByModelType(String modelType) {
		Vehicle vehicle = null;
		try {
			Connection conn = DriverManager.getConnection(url, user, pass);
			String sqltxt;
			sqltxt = " SELECT id, make, model, modeltype,numDoor, vehicleType, mileage FROM model_name WHERE modelType= ?";
			PreparedStatement stmt = conn.prepareStatement(sqltxt);
			stmt.setString(1, modelType);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				// Integer id, String make, String model, String modelType,
				// String numDoor, String vehicleType, String mileage
				vehicle = new Vehicle(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException sqle) {
			sqle.printStackTrace(System.err);
		}
		return vehicle;
	}

	@Override
	public Vehicle getDataByNumDoor(String numDoor) {
		Vehicle vehicle = null;
		try {
			Connection conn = DriverManager.getConnection(url, user, pass);
			String sqltxt;
			sqltxt = " SELECT id, make, model, modeltype,numDoor, vehicleType, mileage FROM model_name WHERE numDoor= ?";
			PreparedStatement stmt = conn.prepareStatement(sqltxt);
			stmt.setString(1, numDoor);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				// Integer id, String make, String model, String modelType,
				// String numDoor, String vehicleType, String mileage
				vehicle = new Vehicle(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException sqle) {
			sqle.printStackTrace(System.err);
		}
		return vehicle;
	}

	@Override
	public Vehicle getDataByVehicleType(String vehicleType) {
		Vehicle vehicle = null;
		try {
			Connection conn = DriverManager.getConnection(url, user, pass);
			String sqltxt;
			sqltxt = " SELECT id, make, model, modeltype,numDoor, vehicleType, mileage FROM model_name WHERE vehicleType= ?";
			PreparedStatement stmt = conn.prepareStatement(sqltxt);
			stmt.setString(1, vehicleType);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				// Integer id, String make, String model, String modelType,
				// String numDoor, String vehicleType, String mileage
				vehicle = new Vehicle(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException sqle) {
			sqle.printStackTrace(System.err);
		}
		return vehicle;
	}

	@Override
	public Vehicle getDataByMileage(String mileage) {
		Vehicle vehicle = null;
		try {
			Connection conn = DriverManager.getConnection(url, user, pass);
			String sqltxt;
			sqltxt = " SELECT id, make, model, modeltype,numDoor, vehicleType, mileage FROM model_name WHERE mileage= ?";
			PreparedStatement stmt = conn.prepareStatement(sqltxt);
			stmt.setString(1, mileage);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				// Integer id, String make, String model, String modelType,
				// String numDoor, String vehicleType, String mileage
				vehicle = new Vehicle(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException sqle) {
			sqle.printStackTrace(System.err);
		}
		return vehicle;
	}

	 @Override
	 public void addVehicle1(Vehicle vehicle) {
	 try{ Connection conn = DriverManager.getConnection(url, user, pass);
	 String sqltxt;
	 sqltxt = " INSERT id, make, model, modeltype,numDoor, vehicleType, mileage FROM maodel_name WHERE id= ?";
	 PreparedStatement stmt = conn.prepareStatement(sqltxt);
	// stmt.setString(1, id);
	 ResultSet rs = stmt.executeQuery();
	 if (rs.next()) {
	 // Integer id, String make, String model, String modelType, String numDoor, String vehicleType, String mileage
	 vehicle = new Vehicle(rs.getInt(1),rs.getString(2),rs.getString(3), rs.getString(4),rs.getString(5),rs.getString(6), rs.getString(7));
	 }
	 rs.close();
	 stmt.close();
	 conn.close();
	 }
	 catch (SQLException sqle){
	 sqle.printStackTrace(System.err);
	 };
	 }

	 @Override
	 public void removeVehicle(Vehicle vehicle) {
	 try{ Connection conn = DriverManager.getConnection(url, user, pass);
	 String sqltxt;
	 sqltxt = " SELECT id, make, model, modeltype,numDoor, vehicleType, mileage FROM model_name WHERE id= ?";
	 PreparedStatement stmt = conn.prepareStatement(sqltxt);
//	 stmt.setString(1, id);
	 ResultSet rs = stmt.executeQuery();
	 if (rs.next()) {
	 // Integer id, String make, String model, String modelType, String numDoor, String vehicleType, String mileage
	 vehicle = new Vehicle(rs.getInt(1),rs.getString(2),rs.getString(3), rs.getString(4),rs.getString(5),rs.getString(6), rs.getString(7));
	 }
	 rs.close();
	 stmt.close();
	 conn.close();
	 }
	 catch (SQLException sqle){
	 sqle.printStackTrace(System.err);
	 }
	 
	 }
	 
	@Override
	public List<Vehicle> getVehicles() {
		List <Vehicle> vehicles = new ArrayList<>();
		Vehicle vehicle = null;
		try {
			Connection conn = DriverManager.getConnection(url, user, pass);
			String sqltxt;
			sqltxt = " SELECT id, make, model, modeltype,numDoor, vehicleType, mileage FROM model_name";
			PreparedStatement stmt = conn.prepareStatement(sqltxt);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				// Integer id, String make, String model, String modelType,
				// String numDoor, String vehicleType, String mileage
				vehicle = new Vehicle(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getString(7));
				System.out.println(vehicle);
				vehicles.add(vehicle);
				System.out.println(vehicles);
				
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException sqle) {
			sqle.printStackTrace(System.err);
		}
		return vehicles;
	}

	@Override
	public void addVehicle(Vehicle vehicle) {
		try {
			Connection conn = DriverManager.getConnection(url, user, pass);
			String sqltxt;
			sqltxt = " INSERT INTO model_name (id, make, model, modelType, numDoor, vehicleType, mileage )"
					+ " VALUES ( ?, ?, ?, ?, ?, ?, ?) ";
			PreparedStatement stmt = conn.prepareStatement(sqltxt);
			stmt.setInt(1, vehicle.getId());
			stmt.setString(2, vehicle.getMake());
			stmt.setString(3, vehicle.getModel());
			stmt.setString(4, vehicle.getModelType());
			stmt.setString(5, vehicle.getNumDoor());
			stmt.setString(6, vehicle.getVehicleType());
			stmt.setString(7, vehicle.getMileage());
			int uc = stmt.executeUpdate();
			if (uc == 1) {
				System.out.println("vehicle added.");
			} else {
				System.err.println("No vehicle added.");
			}
			stmt.close();
			conn.close();
		} catch (SQLException sqle) {
			sqle.printStackTrace(System.err);
		}
		getVehicles() ;
	}

	@Override
	public void deleteVehicle(Vehicle vehicle) {
		try {
			Connection conn = DriverManager.getConnection(url, user, pass);
			String sqltxt;
			sqltxt = " DELETE model_name (id, make, model, modelType, numDoor, vehicleType, mileage)"
					+ " VALUES ( ?, ?, ?, ?, ?, ?,?) ";
			PreparedStatement stmt = conn.prepareStatement(sqltxt);
			stmt.setInt(1, vehicle.getId());
			stmt.setString(2, vehicle.getMake());
			stmt.setString(3, vehicle.getModel());
			stmt.setString(4, vehicle.getModelType());
			stmt.setString(5, vehicle.getNumDoor());
			stmt.setString(6, vehicle.getVehicleType());
			stmt.setString(7, vehicle.getMileage());
			int uc = stmt.executeUpdate();
			if (uc == 1) {
				System.out.println("Vehicle deleted.");
			} else {
				System.err.println("No vehicle deleted.");
			}
			stmt.close();
			conn.close();
		} catch (SQLException sqle) {
			sqle.printStackTrace(System.err);
		}
		getVehicles();
	}

	@Override
	public List<Vehicle> editVehicle(Vehicle s) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Vehicle> edit(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void updateVehicle(Vehicle v) {
		// TODO Auto-generated method stub
	}
	@Override
	public void removeVehicle(Integer id) {
		// TODO Auto-generated method stub	
	}


}
