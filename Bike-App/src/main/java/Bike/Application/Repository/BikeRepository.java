package Bike.Application.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Bike.Application.Dto.BikeDto;
import Bike.Application.Entity.Bike;

public interface BikeRepository extends JpaRepository<Bike, Long>{


}
