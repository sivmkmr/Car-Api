package com.car.apiresponse;

import java.util.List;

import com.car.cardetails.CarDetails;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse {
	
//	Instance Variables

	private String message;

	private CarDetails carDetails;

	private boolean status;

	private List<CarDetails> listCarDetails;

//	Getters and Setters 
	
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public List<CarDetails> getListCarDetails() {
		return listCarDetails;
	}

	public void setListCarDetails(List<CarDetails> listCarDetails) {
		this.listCarDetails = listCarDetails;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public CarDetails getCarDetails() {
		return carDetails;
	}

	public void setCarDetails(CarDetails carDetails) {
		this.carDetails = carDetails;
	}

}
