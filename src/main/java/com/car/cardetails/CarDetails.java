package com.car.cardetails;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class CarDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer carId;
	private String carName;
	private String carModel;
	private String carColor;
	private String carClas;
	private String carPrice;
	

//	public CarDetails(Integer carId, String carName, String carModel, String carColor, String carClas,
//			String carPrice) {
//		this.carId = carId;
//		this.carName = carName;
//		this.carModel = carModel;
//		this.carColor = carColor;
//		this.carClas = carClas;
//		this.carPrice = carPrice;
//	}

	public Integer getCarId() {
		return carId;
	}

	public void setCarId(Integer carId) {
		this.carId = carId;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public String getCarClas() {
		return carClas;
	}

	public void setCarClas(String carClas) {
		this.carClas = carClas;
	}

	public String getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(String carPrice) {
		this.carPrice = carPrice;
	}
	

}
