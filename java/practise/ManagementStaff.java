class staff {
private String name;
private final int rate=100;
private int hoursworked;

public staff(String sname)
{
        name=sname;
        System.out.println("name of the staffmember:"+name);
}

public staff(String fname,String lname)
{
        name=fname+" "+lname;
        System.out.println("name of the staff:"+name);
}

public void setHoursWorked(int hours)
{
        if (hours>0)
                hoursworked = hours;
        else
        {
                System.out.println("Error: HoursWorked Cannot be Smaller than Zero");
                System.out.println("Error: HoursWorked is not updated");
        }
}

public int getHoursWorked()
{
        return hoursworked;
}

public void printmessage(){
        System.out.println("calculating pay");
}

public int calculatepay(){
        int pay;
        printmessage();
        pay=rate*hoursworked;
        if (hoursworked>0) {
                return pay;
        }
        else return -1;
}

public int calculatepay(int bonus, int allowance){
        printmessage();
        if(hoursworked>0)
                return hoursworked*rate+bonus+allowance;
        else return 0;
}

}
public class ManagementStaff {
public static void main(String[] args) {
        staff sf = new staff("Tushar", "Sharma");
        sf.setHoursWorked(160);
        int pay = sf.calculatepay();
        System.out.println("Pay = " + pay);
        System.out.println("updating tushar sharma record ");
        sf.setHoursWorked(-10);
        System.out.println("hours worked:"+sf.getHoursWorked());
        pay=sf.calculatepay();
        System.out.println("pay is:"+pay);
}
}
