package Bike.Application.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Bike.Application.Dto.BikeDto;
import Bike.Application.Service.Bike_Service;


@RestController
@RequestMapping("/api/bike")
public class Bike_Controller
{
	
	private Bike_Service bike_Service;
	
	public Bike_Controller(Bike_Service bike_Service) {
		super();
		this.bike_Service = bike_Service;
	}

	@PostMapping
	ResponseEntity<BikeDto> adddetails (@RequestBody BikeDto bikeDto)
	{
		
		return new ResponseEntity<>(bike_Service.updatedetails(bikeDto), HttpStatus.CREATED);
	}

}
