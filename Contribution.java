package day4_arithmetic_operator;

public class Contribution {
	
	public static void main(String[] args) {

		
		/*this program calculates amount of pay that will be contributed to a retirement
		 * plan if 5%, 8% or 10% of monthly pay is withheld
		 * */
	
		int wage=2000;
		double plan1=wage*0.05, plan2=wage*0.08, plan3=wage*0.1;
		
		System.out.println( " if you contribute %5 you will save $" + plan1 );
		System.out.println( " if you contribute %8 you will save $" + plan2 );
		System.out.println( " if you contribute %10 you will save $" + plan3 );


        double celcius, fahrenheit;
        celcius=70.2;
        
        fahrenheit= 9 * celcius /5 +32 ;
        
        
        System.out.println(celcius + " celcius is equal to " + fahrenheit + " fahrenheit");
        		
        double mile, kilometer;
        
        mile= 72.5;
        kilometer= mile*1.609344;
        
        System.out.println(mile + " Equal to " + kilometer + " km");
    
        
        double radius=10, perimeter, area;
        
       
        perimeter= 2 * radius * 3.14;
	
        area= radius* radius*3.14;
	
        
	System.out.println( "Perimeter is " + perimeter + ", area is " + area );
	
	double a,b,c, average;
	
	a=5; b=10; c=15;
	
	average=(a+b+c)/3;
	
			System.out.println("the average is " + average);
		
	}
}

