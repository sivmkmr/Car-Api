package com.car.carservice.implement;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.car.apiresponse.ApiResponse;
import com.car.cardetails.CarDetails;
import com.car.cardetailsmodel.CarDetailsModel;
import com.car.carrepository.CarRepository;
import com.car.carservice.CarService;
import com.car.globalconstant.GlobalConstant;

@Service
public class CarServiceImplement implements CarService {

	@Autowired
	CarRepository carRepository;

	

//	Dummy API for Testing

	public ApiResponse apiTest() {
		ApiResponse apiResponse = new ApiResponse();
		apiResponse.setMessage(GlobalConstant.dummyMessage);
		return apiResponse;
	}

//	Data Insertion method implementation

	public ApiResponse saveData(CarDetailsModel carDetailsModel) {
		ApiResponse apiResponse = new ApiResponse();
		CarDetails carDetails = new CarDetails();

		carDetails.setCarName(carDetailsModel.getCarName());
		carDetails.setCarModel(carDetailsModel.getCarModel());
		carDetails.setCarColor(carDetailsModel.getCarColor());
		carDetails.setCarClas(carDetailsModel.getCarClas());
		carDetails.setCarPrice(carDetailsModel.getCarPrice());

		carRepository.save(carDetails);
		apiResponse.setMessage(GlobalConstant.dataInsertionSuccess);
		return apiResponse;
	}

//	Get All Car Details

	public ApiResponse getAllCarDetails() {
		ApiResponse apiResponse = new ApiResponse();
		apiResponse.setListCarDetails(carRepository.findAll());
		return apiResponse;
	}

//	Get Car Details by id implementation

	public ApiResponse getCarDetailsById(Integer id) {
		ApiResponse apiResponse = new ApiResponse();
		Optional<CarDetails> dbcardetails = carRepository.findById(id);

		if (dbcardetails.isEmpty()) {
			apiResponse.setMessage(GlobalConstant.dataRetrievalFailure + id);
		} else {
			CarDetails getCarDetails = dbcardetails.get();
			apiResponse.setCarDetails(getCarDetails);
			apiResponse.setMessage(GlobalConstant.dataRetrievalSuccess);
		}
		return apiResponse;
	}

//	Update Car Details by id implementation

	public ApiResponse updateCarDetailsById(Integer id, CarDetails carDetails) {
		ApiResponse apiResponse = new ApiResponse();

		Optional<CarDetails> dbCarDetails = carRepository.findById(id);

		if (dbCarDetails.isEmpty()) {
			apiResponse.setMessage(GlobalConstant.dataUpdationFailure + id);
			apiResponse.setStatus(false);
		} else {
			CarDetails setCarDetails = dbCarDetails.get();
			setCarDetails.setCarName(carDetails.getCarName());
			setCarDetails.setCarModel(carDetails.getCarModel());
			setCarDetails.setCarColor(carDetails.getCarColor());
			setCarDetails.setCarClas(carDetails.getCarClas());
			setCarDetails.setCarPrice(carDetails.getCarPrice());

			carRepository.save(setCarDetails);
			apiResponse.setMessage(GlobalConstant.dataUpdationSuccess);
			apiResponse.setStatus(true);

		}

		return apiResponse;
	}

//	Car data deletion by id implementation

	public ApiResponse deleteCarDetailsById(Integer id) {
		ApiResponse apiResponse = new ApiResponse();

		Optional<CarDetails> dbCarDetails = carRepository.findById(id);

		if (dbCarDetails.isEmpty()) {
			apiResponse.setMessage(GlobalConstant.dataDeletionFailure + id);
		} else {
			carRepository.deleteById(id);
			apiResponse.setMessage(GlobalConstant.dataDeletionSuccess);
		}
		return apiResponse;
	}

//	@Override
//	public ApiResponse saveData(CarDetails carDetails) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
