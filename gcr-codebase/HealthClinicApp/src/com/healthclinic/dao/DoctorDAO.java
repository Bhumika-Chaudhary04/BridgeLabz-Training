package com.healthclinic.dao;

import java.sql.*;
import com.healthclinic.database.DBConnection;
import com.healthclinic.model.Doctor;

public class DoctorDAO {

	public void addDoctor(Doctor doctor) {

		String sql = "INSERT INTO doctors(name,specialization,contact,consultation_fee) VALUES(?,?,?,?)";

		try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {

			ps.setString(1, doctor.getName());
			ps.setString(2, doctor.getSpecialization());
			ps.setString(3, doctor.getContact());
			ps.setDouble(4, doctor.getFee());

			ps.executeUpdate();

			System.out.println("Doctor added successfully");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}