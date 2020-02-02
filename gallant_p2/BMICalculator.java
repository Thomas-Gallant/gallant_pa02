package gallant_p2;

import java.text.DecimalFormat;
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
	
	//reads in the height and weight of the user
	public void readUserData() {
		
		System.out.println("Welcome to the BMI calculator!");
		readUnitType();
		readMeasurementData();
	}
	
	//ask the user if they want to use imperial or metric
	private void readUnitType() {
		
		System.out.println("Would you like to use metric or imperial?");
		unitType = in.next();
	}
	
	//loops through question until imperial or metric is entered as a answer
	private void readMeasurementData() {
		
		
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
	
	// reads in the metric data if that option is chosen
	private void readMetricData() {
		
		System.out.println("What is your weight in kilograms?");
		setWeight();
		System.out.println("What is your height in meters?");
		setHeight();
	}
	
	// reads in the imperial data if that option is chosen
	private void readImperialData() {
		System.out.println("What is your weight in Pounds?");
		setWeight();
		System.out.println("What is your height in Inches?");
		setHeight();
	}
	
	//calculates the BMI depending upon imperial or metric units
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
	
	// provide BMI category depending upon BMI calculated
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
	
	// Prints the calculated BMI and BMI category
	public void displayBmi() {
		System.out.println("Your bmi is " + df.format(Bmi) +  " and your bmi category is " +  bmiCategory);
	}
	
	public double getWeight() {
		return weight;
	}
	
	// sets weight and ends program if weight is a negative number
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
	
	// sets height and ends program if height is a negative number
	private void setHeight() {
		
		double inputHeight = in.nextDouble();
		in.close();
		
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
