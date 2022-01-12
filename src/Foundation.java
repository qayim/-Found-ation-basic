import java.text.DecimalFormat;
import java.util.Scanner;

public class Foundation {

	public static void main(String[] args) {
		DecimalFormat df2 = new DecimalFormat("#.##");
		
		String skintone = " ";
		String familycolor = " ";
		String makeupsetdisp = " ";
		
		int makeupset = 0;
		int setquantity = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Skintone available: Pale, Medium, Dark");
		System.out.print("Pick skintone: ");
		skintone = sc.nextLine();
		
		
		System.out.println("\nMakeup family color available: Pastel, Dark, Shiny");
		System.out.print("Pick family color: ");
		familycolor = sc.nextLine();
		
		System.out.println("\nMAKEUP SET SUITABLE FOR YOU");
		System.out.println(determineMakeup(skintone, familycolor));
		
		System.out.println("\nMAKEUP SET AVAILABLE: "
				+ "\nSet 1: Mac "
				+ "\nSet 2: Maybelline "
				+ "\nSet 3: Rimmel "
				+ "\nSet 4: Channel "
				+ "\nSet 5: Revlon "
				+ "\nSet 6: Etude"
				+ "\nSet 7: Rimmel "
				+ "\nSet 8: Revlon "
				+ "\nSet 9: Maybelline");
		
		System.out.println("\nMAKEUP PRICE CALCULATOR");
		
		System.out.println("Example: 1");
		System.out.print("Enter make up set: ");
		makeupset = Integer.parseInt(sc.next());
		
		
		
		System.out.println("\nMUST BE UNDER 20 SETS");
		System.out.print("Enter quantity of makeup set: ");
		setquantity = Integer.parseInt(sc.next());
		
		if(calculateProductPrice(makeupset, setquantity)<0) {
			System.out.println("Invalid input");
		} else {
			System.out.println("\nPrice:");
			System.out.print("RM "+df2.format(calculateProductPrice(makeupset, setquantity)));
		}
		
	}
	
	public static String determineMakeup(String skintone, String familycolor) {
		String makeupsetdetails = " ";
		
		if(skintone.equalsIgnoreCase("Pale") && familycolor.equalsIgnoreCase("Pastel")) {
			makeupsetdetails = "Set 1 \nBrand: Mac \nFoundation: Soft line \nLipstick: Soft pink";
		} else if(skintone.equalsIgnoreCase("Pale") && familycolor.equalsIgnoreCase("Dark")) {
			makeupsetdetails = "Set 2 \nBrand: Maybelline \nFoundation: Bold line \nLipstick: Dark pink";
		} else if(skintone.equalsIgnoreCase("Pale") && familycolor.equalsIgnoreCase("Shiny")) {
			makeupsetdetails = "Set 3 \nBrand: Rimmel \nFoundation: Glam line \nLipstick: Shiny pink";
		} else if(skintone.equalsIgnoreCase("Medium") && familycolor.equalsIgnoreCase("Pastel")) {
			makeupsetdetails = "Set 4 \nBrand: Channel \nFoundation: Soft-soft line \nLipstick: Soft violet";
		} else if(skintone.equalsIgnoreCase("Medium") && familycolor.equalsIgnoreCase("Dark")) {
			makeupsetdetails = "Set 5 \nBrand: Revlon \nFoundation: Bold-bold line \nLipstick: Dark violet";
		} else if(skintone.equalsIgnoreCase("Medium") && familycolor.equalsIgnoreCase("Shiny")) {
			makeupsetdetails = "Set 6 \nBrand: Etude \nFoundation: Glam-glam line \nLipstick: Shiny violet";
		} else if(skintone.equalsIgnoreCase("Dark") && familycolor.equalsIgnoreCase("Pastel")) {
			makeupsetdetails = "Set 7 \nBrand: Rimmel \nFoundation: Lollipop line \nLipstick: Soft red";
		} else if(skintone.equalsIgnoreCase("Dark") && familycolor.equalsIgnoreCase("Dark")) {
			makeupsetdetails = "Set 8 \nBrand: Revlon \nFoundation: Blackcurrant line \nLipstick: Dark red";
		} else if(skintone.equalsIgnoreCase("Dark") && familycolor.equalsIgnoreCase("Shiny")) {
			makeupsetdetails = "Set 9 \nBrand: Maybelline \nFoundation: Gold line \nLipstick: Shiny red";
		} else {
			makeupsetdetails ="Invalid input";
		}
		return makeupsetdetails;
	}
	
	public static double calculateProductPrice(int makeupset, int setquantity) {
		double price = 0;
		double total = 0;
		
		if(makeupset == 1 && setquantity>0 && setquantity<21) {
			price = 12.5;
		} else if(makeupset == 2 && setquantity>0 &&  setquantity<21) {
			price = 23.4;
		} else if(makeupset == 3 && setquantity>0 &&  setquantity<21) {
			price = 57.2;
		} else if(makeupset == 4 && setquantity>0 &&  setquantity<21) {
			price = 700.8;
		} else if(makeupset == 5 && setquantity>0 &&  setquantity<21) {
			price = 45.8;
		} else if(makeupset == 6 && setquantity>0 &&  setquantity<21) {
			price = 77.7;
		} else if(makeupset == 7 && setquantity>0 &&  setquantity<21) {
			price = 83.4;
		} else if(makeupset == 8 && setquantity>0 &&  setquantity<21) {
			price = 62.2;
		} else if(makeupset == 9 && setquantity>0 &&  setquantity<21) {
			price = 96.1;
		} else {
			price = 0;
		}
		
		total = Math.abs(price*setquantity);
		
		return total;
	}
}
