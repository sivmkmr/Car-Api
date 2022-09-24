package com.car.carservice;

import com.car.apiresponse.ApiResponse;
import com.car.cardetails.CarDetails;
import com.car.cardetailsmodel.CarDetailsModel;

public interface CarService {

	public ApiResponse apiTest();
	
	public ApiResponse saveData(CarDetailsModel carDetailsModel);
	
	public ApiResponse getAllCarDetails();
	
	public ApiResponse getCarDetailsById(Integer id);
	
	public ApiResponse updateCarDetailsById(Integer id, CarDetails carDetails);
	
	public ApiResponse deleteCarDetailsById(Integer id);
	
}
