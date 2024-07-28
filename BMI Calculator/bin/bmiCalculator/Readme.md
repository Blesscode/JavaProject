# How to Round Double and Float up to Two Decimal Places in Java

### Using String.format() Method ("%.2f")
   - use in sopln since number to string conversion can come if you use in assigning a string to foat/double value
   
```
   public class TwoDecimalPlace2  
{  
public static void main(String args[])   
{  
//defining a number of type double   
double num = 10.98765432167;  
System.out.println("Double Number: " + num);  
//use either of the following two statements for two decimal places both gives the same result  
System.out.println("Double Number: " + String.format("%.2f", num));  
System.out.format("Double Number: %.2f", num);  
}  
}  
```

### Using BigDecimal

```
import java.math.BigDecimal;  
import java.math.RoundingMode;  
public class TwoDecimalPlace3   
{  
public static void main(String args[])   
{  
//defining a number of type double   
double num = 12.4565652239;  
System.out.println("Double Number: " + num);  
BigDecimal bd = new BigDecimal(num).setScale(2, RoundingMode.HALF_UP);  
double newNum = bd.doubleValue();  
System.out.println("Up to two decimal places: " + newNum);  
}  
}  
```

if float then: 
```
 BigDecimal bd = new BigDecimal(Float.toString(value));
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.floatValue();
```
