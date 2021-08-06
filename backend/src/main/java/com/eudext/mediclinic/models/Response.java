package com.eudext.mediclinic.models;

public class Response {

    private String status;
    private Appointment appointment;

    public Response(String status, Appointment appointment) {
        this.status = status;
        this.appointment = appointment;
    }

    public Response(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }
}
