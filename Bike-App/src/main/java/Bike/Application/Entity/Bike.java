package Bike.Application.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Bike")
public class Bike {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bike_Id; 
	private String bikeColor;
	private int BikePrice;
	private String bikeModel;
	
	public Bike()
	{
		
	}
	public Long getBike_Id() {
		return bike_Id;
	}
	public void setBike_Id(Long bike_Id) {
		this.bike_Id = bike_Id;
	}
	public String getBikeColor() {
		return bikeColor;
	}
	public void setBikeColor(String bikeColor) {
		this.bikeColor = bikeColor;
	}
	public int getBikePrice() {
		return BikePrice;
	}
	public void setBikePrice(int bikePrice) {
		BikePrice = bikePrice;
	}
	public String getBikeModel() {
		return bikeModel;
	}
	public void setBikeModel(String bikeModel) {
		this.bikeModel = bikeModel;
	}
	public Bike(Long bike_id,String bikeColor, String bikeModel, int bikePrice) {
		this.bike_Id = bike_id;
		this.bikeColor = bikeColor;
		this.BikePrice = bikePrice;
		this.bikeModel = bikeModel;
		
		
	}
	
	
	@Override
	public String toString() {
		return "BikeDto [bike_Id=" + bike_Id + ", bikeColor=" + bikeColor + ", BikePrice=" + BikePrice
				+ ", bikeModel=" + bikeModel + "]";
	}
	
	
		

}
