package bmiCalculator;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter weight in Kg");
		float weight=sc.nextFloat();
		System.out.println("Enter height in m");
		float height=sc.nextFloat();
		BMI bmi=new BMI(height,weight);
		bmi.calcBMI();
		System.out.println(bmi.toString());
		sc.close();
	}

}
