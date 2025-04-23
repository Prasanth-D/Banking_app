package Bike.Application.Dto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BikeDto {
	private Long bike_Id; 
	private String bikeColor;
	private int BikePrice;
	private String bikeModel;
	
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
	public BikeDto(Long bike_Id,String bikeColor, String bikeModel, int bikePrice) {
		super();
		this.bike_Id = bike_Id;
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
