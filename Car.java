public class Car {
    private String color;
	private int horsePower;
	private double engineSize;
	private String make;
	static int count = 0;
	
	public Car() {
		color = "Black";
		horsePower = 250;
		engineSize = 4.0;
		make = "Toyata";
		count++;
	}
	
	public Car(String color, int horsePower, double engineSize, String make) {
		this.color = color;
		this.horsePower = horsePower;
		this.engineSize = engineSize;
		this.make = make;
		count++;
	}
	
	public void setColor(String newColor) {
		this.color = newColor;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setHorsePower(int newHorsePower) {
		this.horsePower = newHorsePower;
	}
	
	public int getHorsePower() {
		return this.horsePower;
	}
	
	public void setEngineSize(double newEngineSize) {
		this.engineSize = newEngineSize;
	}
	
	public double getEngineSize() {
		return this.engineSize;
	}
	
	public void setMake (String newMake) {
		this.make = newMake;
	}
	
	public String getMake() {
		return this.make;
	}
	
	public static int getCount() {
		return count;
	}
	
	public boolean equals(Car car) {
		return (this.color.equals(car.color) && this.horsePower == car.horsePower &&
				this.engineSize == car.engineSize && this.make.equals(car.make));
		 	
	}
	
	public String toString() {
		return "Color: " + this.color + 
			   "\nHorse Power: " + this.horsePower + 
			   "\nEngine Size: " + this.engineSize +
			   "\nMake: " + this.make;
	}
	
}