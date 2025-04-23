package Bike.Application.Service.Impl;

import java.security.PublicKey;

import org.springframework.stereotype.Service;

import Bike.Application.Dto.BikeDto;
import Bike.Application.Entity.Bike;
import Bike.Application.Mapper.Bike_Mapper;
import Bike.Application.Repository.BikeRepository;
import Bike.Application.Service.Bike_Service;
@Service
public class Bike_Impl implements Bike_Service {

	BikeRepository bikeRepository;
	public Bike_Impl(BikeRepository bikeRepository) {
		super();
		this.bikeRepository = bikeRepository;
	}
	@Override
	public BikeDto updatedetails(BikeDto bikedto) {
		Bike bike = Bike_Mapper.mapToBike(bikedto);
		Bike bike_details=bikeRepository.save(bike);
		
		return Bike_Mapper.mapToBikeDto(bike_details);
		
	}
	

}
