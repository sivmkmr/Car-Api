package com.car.cardetailsmodel;

//@Getter
//@Setter
public class CarDetailsModel {
	
//	@Getter @Setter private String carName;
//	@Getter @Setter private String carModel;
//	@Getter @Setter private String carColor;
//	@Getter @Setter private String carClas;
//	@Getter @Setter private String carPrice;
//	@Getter @Setter private String carAssistanceName;
//	@Getter @Setter private String carAssistanceCode;

	private String carName;
	private String carModel;
	private String carColor;
	private String carClas;
	private String carPrice;
	private String carAssistanceName;
	private String carAssistanceCode;

//	public CarDetailsModel(Integer carId, String carName, String carModel, String carColor, String carClas,
//			String carPrice) {
//		super(carId, carName, carModel, carColor, carClas, carPrice);
//		// TODO Auto-generated constructor stub
//	}

//	

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

	public String getCarAssistanceName() {
		return carAssistanceName;
	}

	public void setCarAssistanceName(String carAssistanceName) {
		this.carAssistanceName = carAssistanceName;
	}

	public String getCarAssistanceCode() {
		return carAssistanceCode;
	}

	public void setCarAssistanceCode(String carAssistanceCode) {
		this.carAssistanceCode = carAssistanceCode;
	}

}
