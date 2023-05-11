// import java.*;
// import java.util.*;
// public class try_cath_finally {
// public static void main(String[] args) {
//         int num,deno;
//         Scanner input = new Scanner(System.in);
//         try {
//                 System.out.print("enter the numerator:");
//                 num=input.nextInt();
//                 System.out.print("enter the denominator");
//                 deno=input.nextInt();
//                 System.out.println("the result is:"+num/deno);
//
//         } catch(Exception e) {
//                 System.out.println(e.getMessage());
//         }
//         finally {
//                 System.out.println("-----end of error handling example");
//         }
//         input.close();
// }
// }


import java.util.*;
public class try_catch_finally_throw {
public static void main(String[] args) {
        int choice=0;
        Scanner input=new Scanner(System.in);
        int[] numbers={0,1,2,3,4,5,6,7,8,9};
        System.out.print("enter the index of array:");
        try {
                choice=input.nextInt();
                if(choice==0)
                {throw new ArrayIndexOutOfBoundsException();}
                System.out.printf("numbers[%d]=%d%n",choice,numbers[choice]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
                System.out.println("Error: Index is invalid.");
        }
        catch (InputMismatchException e)
        {
                System.out.println("Error: You did not enter an integer.");
        }
        catch(Exception e) {
                System.out.println(e.getMessage());
        }
        input.close();
}
}
