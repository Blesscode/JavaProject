package currencyConverter;

public class RupeeToDollar {
	double rupee;
	double dollar;
	
	
	RupeeToDollar(double rupee){
		this.rupee=rupee;
		
	}
	
	void toDollar() {
		double dollarValue=83.72;
		this.dollar=rupee/dollarValue;	
	}

	@Override
	public String toString() {
		return "RupeeToDollar [rupee=" + rupee + ", dollarValue=" + dollar + "]";
	}
	
	
	
}
