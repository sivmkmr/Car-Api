package com.car.carrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.car.cardetails.CarDetails;

public interface CarRepository extends JpaRepository<CarDetails, Integer>{

}
