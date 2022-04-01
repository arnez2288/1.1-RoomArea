import java.util.*;

public class Variables {
	public static void main(String[] args) {
		boolean keepGoing = true;
		do {
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
		
		sc.nextLine();
		String answ = sc.nextLine();
		if (answ.equalsIgnoreCase("n")) {
			keepGoing = false;
		}
		}while(keepGoing);
			
		
	}

}
