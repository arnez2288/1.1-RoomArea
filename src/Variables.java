import java.util.*;

public class Variables {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Grand Circus’ Room Detail Generator!");
		System.out.println("Enter Legnth:");
		Double legnth = sc.nextDouble();
		
		System.out.println("Enter Width:");
		Double width = sc.nextDouble();
		Double area = legnth * width;
		Double per = (legnth + width)*2;
		
		System.out.println("Area: "+ area);
		System.out.println("Perimeter: " + per);
		System.out.println("Continue? (y/n):");
		
		
		String answ = sc.nextLine();
		while (answ.equals("y")) {
			System.out.println("Enter Legnth:");
			 legnth = sc.nextDouble();
			
			System.out.println("Enter Width:");
			width = sc.nextDouble();
			 area = legnth * width;
			 per = (legnth + width)*2;
			
			System.out.println("Area: "+ area);
			System.out.println("Perimeter: " + per);
			System.out.println("Continue? (y/n):");
			System.out.println("Completed!");
		}
		
		
	}

}
