import javax.swing.JOptionPane;

public class CarDriver {
	public static void main(String[] args) {
		Car myCar = new Car();
		Car hisCar = new Car("Black",400,3.5,"Honda");
		Car herCar = new Car("Pink",300,2.5,"Volks");
		Car userCar = new Car();
		userCar.setColor(JOptionPane.showInputDialog("Set color: "));
		userCar.setHorsePower(Integer.parseInt(JOptionPane.showInputDialog("Set horse power: ")));
		userCar.setEngineSize(Double.parseDouble(JOptionPane.showInputDialog("Set horse power: ")));
		userCar.setMake(JOptionPane.showInputDialog("Set make: "));
		
		JOptionPane.showMessageDialog(null,userCar.toString());
		System.out.println("Number of cars: " + Car.count);
		System.out.println("userCar equal to myCar ? " + userCar.equals(myCar));
		System.out.println("userCar equal to hisCar ? " + userCar.equals(hisCar));
		System.out.println("userCar equal to herCar ? " + userCar.equals(herCar));
	}
}