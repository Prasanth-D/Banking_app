package Bike.Application.Mapper;

import Bike.Application.Dto.BikeDto;
import Bike.Application.Entity.Bike;

public class Bike_Mapper
{
	
	public static Bike mapToBike(BikeDto bikedto)
	{
		Bike bike = new Bike(bikedto.getBike_Id()
				,bikedto.getBikeColor(),bikedto.getBikeModel(),bikedto.getBikePrice());
	
		return bike;
	}
	
	public static BikeDto mapToBikeDto(Bike bike)
	{
		BikeDto bikeDto = new BikeDto(bike.getBike_Id()
				,bike.getBikeColor(),bike.getBikeModel(),bike.getBikePrice());
	
		return bikeDto;
	}

}
