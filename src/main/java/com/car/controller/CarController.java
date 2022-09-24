package com.car.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.car.apiresponse.ApiResponse;
import com.car.cardetails.CarDetails;
import com.car.cardetailsmodel.CarDetailsModel;
import com.car.carrepository.CarRepository;
import com.car.carservice.implement.CarServiceImplement;

@RestController
public class CarController {

	@Autowired
	CarRepository carRepository;

	@Autowired
	CarServiceImplement carServiceImplement;

//	Dummy API for Testing

	@GetMapping("/dummy-api")
	public ApiResponse dummyAPI() {
		return carServiceImplement.apiTest();
	}

//	Data Insertion

	@PostMapping("/insert-data")
	public ApiResponse saveData(@RequestBody CarDetailsModel carDetailsModel) {
		return carServiceImplement.saveData(carDetailsModel);
	}

//	Get All Car Details 

	@GetMapping("/get-all-cardetails")
	public ApiResponse getAllCarDetails() {
		return carServiceImplement.getAllCarDetails();
	}

//	Get Car Details by id 

	@GetMapping("/get-cardetails-by-id/{id}")
	public ApiResponse getCarDetailsById(@PathVariable("id") Integer id) {
		return carServiceImplement.getCarDetailsById(id);
	}

//	Update Car Details by id 

	@PutMapping("/update-car-details-by-id/{id}")
	public ApiResponse updateCarDetailsById(@PathVariable("id") Integer id, @RequestBody CarDetails carDetails) {
		return carServiceImplement.updateCarDetailsById(id, carDetails);
//		this is for cheking boolean response
//		ApiResponse response = new ApiResponse();
//		boolean stats = response.isStatus();
//		return stats;
	}

//	

//	Car data deletion by id

	@DeleteMapping("/delete-cardetails-by-id/{id}")
	public ApiResponse deleteDetailsById(@PathVariable("id") Integer id) {
		return carServiceImplement.deleteCarDetailsById(id);
	}

}
