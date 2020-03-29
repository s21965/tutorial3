
public class Airplane {

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	String brand;

	public int getSeats() { if(seats>2000)
		System.out.println("Seats should be 2000");
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	int seats;

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	private int power;

	public int getProductionYear() {
		return productionYear;
	}

	public void setProductionYear(int productionYear) {
		this.productionYear = productionYear;
	}

	private int productionYear;
		
		public Airplane(String brand, int seats, int power, int productionYear) {
			
			this.brand = brand;
			this.seats = seats; 
			this.power = power;
			this.productionYear = productionYear;
			
			}
		

}
