package com.healthclinic.dao;

import java.sql.*;
import com.healthclinic.database.DBConnection;
import com.healthclinic.model.Appointment;

public class AppointmentDAO {

	public void bookAppointment(Appointment appointment) {

		String sql = "INSERT INTO appointments(patient_id,doctor_id,appointment_date,appointment_time,status) VALUES(?,?,?,?, 'SCHEDULED')";

		try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {

			ps.setInt(1, appointment.getPatientId());
			ps.setInt(2, appointment.getDoctorId());
			ps.setString(3, appointment.getDate());
			ps.setString(4, appointment.getTime());

			ps.executeUpdate();

			System.out.println("Appointment booked");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}