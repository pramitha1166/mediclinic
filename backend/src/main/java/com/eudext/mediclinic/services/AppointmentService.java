package com.eudext.mediclinic.services;

import com.eudext.mediclinic.models.Appointment;
import com.eudext.mediclinic.repositories.AppointmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {

    @Autowired
    AppointmentRepo repo;

    public Appointment saveAppointment(Appointment appointment) {
        return repo.save(appointment);
    }

    public List<Appointment> getAllAppointments() {
        return repo.findAll();
    }

    public Appointment getAppointmentById(int id) {
        return repo.findById(id).get();
    }

    public void deleteAppointment(int id) {
        repo.deleteById(id);
    }

}
