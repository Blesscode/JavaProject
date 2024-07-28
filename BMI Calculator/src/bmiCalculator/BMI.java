package bmiCalculator;
import static java.lang.Math.*;


public class BMI {
 private float height;
 private float weight;
 private float bmi;
 private String category;
 public BMI(float height, float weight) {
	this.height = height;
	this.weight = weight;
 }
 
 void calcBMI() {
	 bmi=(float)(weight/pow(height,2));
	 if (bmi < 18.5) {
         category= "underweight";
     } else if (bmi >= 18.5 && bmi < 24.9) {
    	 category= "normal weight";
     } else if (bmi >= 25 && bmi < 29.9) {
    	  category= "overweight";
     } else {
    	 category= "obese";
     }
	    
 }
 
 

@Override
public String toString() {
	return "BMI [height=" + height + ", weight=" + weight + ", BMI=" + String.format("%.2f", bmi)+", category=" + category+ "]";
}

 
 
}
