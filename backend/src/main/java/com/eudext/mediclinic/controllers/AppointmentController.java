package com.eudext.mediclinic.controllers;

import com.eudext.mediclinic.models.Appointment;
import com.eudext.mediclinic.models.Response;
import com.eudext.mediclinic.services.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


@RestController
@RequestMapping("/api")
public class AppointmentController {

    //public static final Logger log =  Logger.getLogger(AppointmentController.class.getName());

    @Autowired
    AppointmentService service;

    @GetMapping("/hello")
    public String getApp() {
         return "hello world javaacc";
    }

    @GetMapping("/getall")
    public List<Appointment> getAllAppointments() {
        return service.getAllAppointments();
    }

    @PostMapping("/save")
    public Appointment saveAppointment(@RequestBody Appointment appointment) {
        return service.saveAppointment(appointment);
    }

    @GetMapping("/get/{id}")
    public Appointment getAppointById(@PathVariable int id) {
        return service.getAppointmentById(id);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteAppointment(@PathVariable int id) {

        service.deleteAppointment(id);
        return new ResponseEntity<Void>(HttpStatus.OK);

    }

}
