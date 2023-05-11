import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Inventory {

private ArrayList<Vehicle> purchases = new ArrayList<Vehicle>();
/**
 *
 *  b is the starting balance
 *  p is the list of vehicles purchased
 */
public Inventory (ArrayList<Vehicle> p) {
								this.purchases = p;
}

public Inventory() {

}
/**
 * We print the content of the list of purchases
 */
@Override
public String toString() {
								String str = "";
								for (int i = 0; i < this.purchases.size(); i++) {
																str = str + purchases.get(i).toString() + "\n";
								}
								return str;

}
/**
 *
 * @throws Exception to handle errors
 * 1- we handle incorrect types
 * 2- Avoid the user to use more money than what he has
 * 3- restrict the inputs to the choice available
 * 4- we allow the user to leave the application
 *
 * It is the core of the program
 * Each case is coded here either the general cases
 * or the cases specific to the purchase or sale of
 * some items.
 */
public void getInput() throws Exception {

								Scanner sc = new Scanner(System.in);
								// ok is an interrupter, when it is false all the loop off
								Boolean ok = true;
								int nu = 0;
								while (ok) {
																do {
																								/*
																								 * This is the first "page" of the program We present the options available as
																								 * well as the amount the user has with him.
																								 *
																								 * 1-is to view the store 2-is to buy a vehicle 3-is to rent a vehicle 4-is to
																								 * print the record of purchases 5-is to exit from the application!
																								 *
																								 */
																								String str = "Choose an option:  \n" + "\t1. View vehicle\n" + "\t2. Buy vehicle\n"
																																					+ "\t3. Rent vehicle\n" + "\t4. Print inventory\n" + "\t5. Exit\n";
																								System.out.println(str);

																								/*
																								 * This portion of code is very important It will allow us to check the inputs
																								 * of the user and reject those that are not good
																								 */
																								try {
																																nu = sc.nextInt();
																																if (nu > 5 || nu < 1) {
																																								System.out.println("We only process integers 1 , 2 , 3 or 4");
																																								throw new Exception("Enter 1 , 2 , 3 or 4");
																																}
																								} catch (InputMismatchException e) {
																																System.out.println("only integers are allowed here");
																																sc.next();
																																continue;
																								} catch (Exception e) {
																																System.out.println("Enter 1 , 2 , 3 , 4 or 5!");
																																sc.nextLine();
																																continue;
																								} catch (Throwable ex) {
																																System.out.println("enter a correct value");
																																sc.nextLine();
																								}

																								if (nu == 1) {

																																/*
																																 * Case 1: !!View the Vehicles!! We just print all the categories of cars
																																 * available Showing all the cars available
																																 */

																																System.out.println("Display The Category: ");
																																System.out.println("Do you want to View a:\n" + "\t1.SUV\n" + "\t2.Sedan\n" + "\t3.HatchBack\n");

																																int ch = 0;

																																/*
																																 * Check if the value is either 1 , 2 or 3!!
																																 */

																																do {
																																								try {
																																																ch = sc.nextInt();
																																																if (ch > 3 || ch < 1) {
																																																								System.out.println("Number too big or too low!");
																																																								throw new Exception("Enter 1 , 2 or 3");
																																																}
																																																if (ch == 3 || ch == 2 || ch == 1) {
																																																								break;
																																																}
																																								} catch (InputMismatchException e) {
																																																System.out.println("only integers are allowed here");
																																																sc.next();
																																								} catch (Exception e) {
																																																System.out.println("Enter 1 , 2 or 3");
																																																sc.nextLine();
																																								} catch (Throwable ex) {
																																																System.out.println("enter a correct value");
																																																sc.nextLine();
																																								}

																																} while (ok);

																																/*
																																 * The view of a SUV!!!!
																																 */

																																if (ch == 1) {
																																								/*
																																								 * Since everything is ok we had the SUV to the list of purchases
																																								 */
																																								SUV suv = new SUV();
																																								suv.readSUV();
																																								// purchases.add(SUV);
																																								// System.out.println("New purchase acquired.");

																																}

																																/*
																																 * The purchase of a Sedan!!!
																																 */
																																else if (ch == 2) {
																																								/*
																																								 * Since everything is ok we had the Sedan to the list of purchases
																																								 */
																																								Sedan sedan = new Sedan();
																																								sedan.readSedan();
																																								// purchases.add(Sedan);
																																								// System.out.println("New purchase acquired.");

																																}

																																/*
																																 * The purchase of a HatchBack!!!
																																 */
																																else {

																																								/*
																																								 * Since everything is ok we had the HatchBack to the list of purchases
																																								 */
																																								HatchBack hatchback = new HatchBack();
																																								hatchback.readHatchBack();
																																								// purchases.add(HatchBack);
																																								// System.out.println("New purchase acquired.");

																																}

																								} else if (nu == 2) {

																																/*
																																 * Case 2: !!buy a vehicle!! Well here we want to buy either a Sedan , a SUV or
																																 * a HatchBack
																																 */
																																System.out.println("Do you want to buy a:\n" + "\t1.SUV\n" + "\t2.Sedan\n" + "\t3.HatchBack\n");

																																int ch = 0;

																																/*
																																 * Check if the value is either 1 , 2 or 3!!
																																 */

																																do {
																																								try {
																																																ch = sc.nextInt();
																																																if (ch > 3 || ch < 1) {
																																																								System.out.println("Number too big or too low!");
																																																								throw new Exception("Enter 1 , 2 or 3");
																																																}
																																																if (ch == 3 || ch == 2 || ch == 1) {
																																																								break;
																																																}
																																								} catch (InputMismatchException e) {
																																																System.out.println("only integers are allowed here");
																																																sc.next();
																																								} catch (Exception e) {
																																																System.out.println("Enter 1 , 2 or 3");
																																																sc.nextLine();
																																								} catch (Throwable ex) {
																																																System.out.println("enter a correct value");
																																																sc.nextLine();
																																								}

																																} while (ok);

																																/*
																																 * The purchase of a SUV!!!!
																																 */

																																if (ch == 1) {
																																								/*
																																								 * Since everything is ok we had the SUV to the list of purchases
																																								 */
																																								SUV suv = new SUV();
																																								suv.readSUV();
																																								// purchases.add(SUV);
																																								// System.out.println("New purchase acquired.");

																																}

																																/*
																																 * The purchase of a Sedan!!!
																																 */
																																else if (ch == 2) {
																																								/*
																																								 * Since everything is ok we had the Sedan to the list of purchases
																																								 */
																																								Sedan sedan = new Sedan();
																																								sedan.readSedan();
																																								// purchases.add(Sedan);
																																								// System.out.println("New purchase acquired.");

																																}

																																/*
																																 * The purchase of a HatchBack!!!
																																 */
																																else {

																																								/*
																																								 * Since everything is ok we had the HatchBack to the list of purchases
																																								 */
																																								HatchBack hatchback = new HatchBack();
																																								hatchback.readHatchBack();
																																								// purchases.add(HatchBack);
																																								// System.out.println("New purchase acquired.");

																																}
																								}

																								else if (nu == 3) {

																																/*
																																 * Case 3: !!Rent a vehicle!! Well here we want to buy either a Sedan , a SUV or
																																 * a HatchBack
																																 */
																																System.out.println("Do you want to Rent a:\n" + "\t1.SUV\n" + "\t2.Sedan\n" + "\t3.HatchBack\n");

																																int ch = 0;

																																/*
																																 * Check if the value is either 1 , 2 or 3!!
																																 */

																																do {
																																								try {
																																																ch = sc.nextInt();
																																																if (ch > 3 || ch < 1) {
																																																								System.out.println("Number too big or too low!");
																																																								throw new Exception("Enter 1 , 2 or 3");
																																																}
																																																if (ch == 3 || ch == 2 || ch == 1) {
																																																								break;
																																																}
																																								} catch (InputMismatchException e) {
																																																System.out.println("only integers are allowed here");
																																																sc.next();
																																								} catch (Exception e) {
																																																System.out.println("Enter 1 , 2 or 3");
																																																sc.nextLine();
																																								} catch (Throwable ex) {
																																																System.out.println("enter a correct value");
																																																sc.nextLine();
																																								}

																																} while (ok);

																																/*
																																 * The purchase of a SUV!!!!
																																 */

																																if (ch == 1) {
																																								/*
																																								 * Since everything is ok we had the SUV to the list of purchases
																																								 */
																																								SUV_rent suv = new SUV_rent();
																																								// suv.readSUV();
																																								System.out.println("Enter car you want  to purshase");


																																								// purchases.add(SUV);
																																								// System.out.println("New purchase acquired.");

																																}

																																/*
																																 * The purchase of a Sedan!!!
																																 */
																																else if (ch == 2) {
																																								/*
																																								 * Since everything is ok we had the Sedan to the list of purchases
																																								 */
																																								Sedan_rent sedan = new Sedan_rent();
																																								// sedan.readSedan();
																																								// purchases.add(Sedan);
																																								// System.out.println("New purchase acquired.");

																																}

																																/*
																																 * The purchase of a HatchBack!!!
																																 */
																																else {

																																								/*
																																								 * Since everything is ok we had the HatchBack to the list of purchases
																																								 */
																																								HatchBack_rent hatchback = new HatchBack_rent();
																																								// hatchback.readHatchBack();
																																								// purchases.add(HatchBack);
																																								// System.out.println("New purchase acquired.");

																																}

																								}
																								if(nu ==4) {

																																/*
																																 * Case 4: !!Print the inventory!!
																																 * We just print the list of purchases
																																 * THis is a kind of history of purchases
																																 */

																																System.out.println("Current inventory: ");
																																if(this.purchases.isEmpty()) {
																																								System.out.println("\tEmpty...\n");
																																}else {
																																								System.out.println(this.toString());
																																}
																								}
																								else if(nu == 5) {
																																System.out.println("\nExiting...");
																																ok = false;
																								}
																} while(ok);
																sc.close();
								}
}
public static void main(String[] args) {


								Inventory i = new Inventory();
								System.out.println(i.toString());
								try {
																i.getInput();
								} catch (Exception e) {
																System.out.println(e.getMessage());
								}
//																																System.out.print("\033[H\033[2J");



}
}
