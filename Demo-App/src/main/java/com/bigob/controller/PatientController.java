package com.bigob.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bigob.bean.Patient;
import com.bigob.util.PropertyUtil;
import com.bigob.util.ServiceCons;
import com.google.gson.JsonObject;

@Controller
@RequestMapping("/patient")
public class PatientController {

	@Autowired
	PropertyUtil prop;
	
	@RequestMapping("/getPatient")
	public @ResponseBody Patient getPatientDetails() {
		return new Patient()
				.setfName("Manoj")
				.setId(101)
				.setlName("kumar")
				.setCreatedDate(getPatientDateFromat(prop.getValueFromKey(ServiceCons.PATIENT_DATE_FORMAT)));
	}
	
	@RequestMapping(value="/create",method=RequestMethod.POST)
	public ResponseEntity<String> addPatient(@RequestBody Patient patient){
		patient.setId(101)
		.setCreatedDate(getPatientDateFromat(prop.getValueFromKey(ServiceCons.PATIENT_DATE_FORMAT)));
		JsonObject jsonObject=new JsonObject();
		jsonObject.addProperty("status", HttpStatus.CREATED.toString());
		jsonObject.addProperty("patientDetails", patient.toString());
		return new ResponseEntity<String>(jsonObject.toString(), HttpStatus.CREATED);
	}
	
	private String getPatientDateFromat(String format) {
		return new SimpleDateFormat(format).format(new Date());
	}
}
