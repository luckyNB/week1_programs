package com.bridgelabz.oops.clinicManagementSystem;
/**
 * Appointment POJO Class for Clinic Management
 * ****************************/
public class Appointment {

	private String doctorName;
	private int doctorId;
	private String patientName;
	private int patientId;
	private String Availibility;
	private String patientPhone;

	public Appointment() {
		// TODO Auto-generated constructor stub
	}

	public Appointment(String doctorName, int doctorId, String patientName, int patientId, String patientPhone,
			String Availibility) {
		this.doctorName = doctorName;
		this.doctorId = doctorId;
		this.patientName = patientName;
		this.patientId = patientId;
		this.Availibility = Availibility;
		this.patientPhone = patientPhone;
	}

	public String getAvailibility() {
		return Availibility;
	}

	public void setAvailibility(String Availibility) {
		this.Availibility = Availibility;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientPhone() {
		return patientPhone;
	}

	public void setPatientPhone(String patientPhone) {
		this.patientPhone = patientPhone;
	}

	@Override
	public String toString() {
		return "Appointment [doctorName=" + doctorName + ", doctorId=" + doctorId + ", patientName=" + patientName
				+ ", patientId=" + patientId + ", Availibility=" + Availibility + ", patientPhone=" + patientPhone
				+ "]";
	}

}
