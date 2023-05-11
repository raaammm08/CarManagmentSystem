import java.util.*;
public class inputs {
public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("enter a integer");
        int myinteger =input.nextInt();
        System.out.printf("u entered %d.%n%n",myinteger);
        System.out.print("enter a double");
        double mydouble=input.nextDouble();
        System.out.printf("u entered %f.%n%n",mydouble);
        System.out.print("enter a string");
        input.nextLine();
        String mystring=input.nextLine();
        System.out.printf("You entered \"%s\".%n%n", mystring);
        input.close();
}
}
