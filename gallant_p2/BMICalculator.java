package gallant_p2;

import java.text.DecimalFormat;
import java.math.RoundingMode;
import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		BMICalculator app = new BMICalculator();
		app.readUserData();
		app.calculateBmi();
		app.displayBmi();
	}
	
	private static Scanner in = new Scanner(System.in);
	
	private static DecimalFormat df = new DecimalFormat("#.#");
	
	private double weight;
	private double height;
	public String unitType;
	public double Bmi;
	public String bmiCategory;
	
	public void readUserData() {
		// makes use of both readUnitType and readMeasuementData methods
		System.out.println("Welcome to the BMI calculator!");
		readUnitType();
		readMeasurementData();
	}
	
	private void readUnitType() {
		
		System.out.println("Would you like to use metric or imperial?");
		unitType = in.next();
	}
	
	private void readMeasurementData() {
		
		//calls either readMetricData or readImperialData method
		String metric = "metric";
		String imperial = "imperial";
		
		while (true){
			if (unitType.equals(metric)) {
				readMetricData();
				break;
			}
		
			else if (unitType.equals(imperial)) {
				readImperialData();
				break;
			}
			else 
				readUnitType();
		}
	}
	
	private void readMetricData() {
		
		System.out.println("What is your weight in kilograms?");
		setWeight();
		System.out.println("What is your height in meters?");
		setHeight();
	}
	
	private void readImperialData() {
		System.out.println("What is your weight in Pounds?");
		setWeight();
		System.out.println("What is your height in Inches?");
		setHeight();
	}
	
	public void calculateBmi() {
		double height = getHeight();
		double weight = getWeight();
		
		String metric = "metric";
		String imperial = "imperial";
		
		if (unitType.equals(metric)) {
			Bmi = (weight/(height*height));
		}
		
		if (unitType.equals(imperial)) {
			Bmi = ((703*weight)/(height*height));
		}
		
		calculateBmiCategory();
	}
	
	private void calculateBmiCategory() {
		
		if (Bmi <= 18.5) {
			bmiCategory = "underweight";
		}
		
		if (Bmi >= 18.5 && Bmi <= 24.9) {
			bmiCategory = "normal weight";
		}
		
		if (Bmi >= 25 && Bmi <= 29.9) {
			bmiCategory = "overweight";
		}
		
		if (Bmi >= 30) {
			bmiCategory = "Obesity";
		}
	}
	
	public void displayBmi() {
		System.out.println("Your bmi is " + df.format(Bmi) +  " and your bmi category is " +  bmiCategory);
	}
	
	public double getWeight() {
		return weight;
	}
	
	private void setWeight() {

		double inputWeight = in.nextDouble();
		
		if (inputWeight >= 0) {
			this.weight = inputWeight;
		}
		else
			System.exit(0);
	}
	
	public double getHeight() {
		return height;
	}
	
	private void setHeight() {
		
		double inputHeight = in.nextDouble();
		
		if (inputHeight >= 0) {
			this.height = inputHeight;
		}
		else
			System.exit(0);
	}
	
	public double getBmi() {
		return Bmi;
	}
	
	public String getBmiCategory() {
		return bmiCategory;
	}
}
