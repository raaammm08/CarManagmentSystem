import java.util.Scanner;
import java.util.ArrayList;

public class NoticeList {

public static void main (String[] args){
        Scanner SC = new Scanner(System.in);
        Notice a = new Notice();
        a.setTitle("TimeTable");
        Notice b = new Notice();
        b.setTitle("SportsDay");
        Notice c = new Notice();
        c.setTitle("Exibition");
        ArrayList<Notice> NoticeList = new ArrayList<Notice>();
        NoticeList.add(a);
        NoticeList.add(b);
        NoticeList.add(c);

        int Choice1=1;

        while(Choice1!=5)
        {
                System.out.println(" =======================================");
                System.out.println("|       1. Add a Notice                   |");
                System.out.println("|       2. Edit a Notice                  |");
                System.out.println("|       3. Delete a Notice                |");
                System.out.println("|       4. Display all Notices            |");
                System.out.println("|       5. Exit the program             |");
                System.out.println("|  *Type a number to make a selection*  |");
                System.out.println(" =======================================");
                System.out.println("");
                System.out.print("Selection: ");

                Choice1 = SC.nextInt();

                switch (Choice1) {

                case 1:

                        System.out.println("'Add a Notice' ");
                        System.out.println("Enter the name ");
                        Notice holder = new Notice(SC.next());

                        break;
                case 2:
                        System.out.println("'Edit a Notice's details' selected");
                        System.out.println("Which Notice would you like to edit?");
                        System.out.println("");

                        // I do not understand what you want me to do here

                        break;

                case 3:
                        for(int i=0; i<NoticeList.size(); i++) {
                                System.out.println(i+1+") "+NoticeList.get(i));
                        }
                        System.out.println("Choose a Notice to delete: ");
                        NoticeList.remove(SC.nextInt()-1);
                        break;

                case 4:
                        System.out.println("Display all Notices");
                        for(Notice x:NoticeList)
                                System.out.println(x);
                        break;


                case 5:
                        System.out.println("Goodbye!");
                        System.exit(0);

                        break;

                default:
                        System.out.println("Invalid selection. Try again");

                }
        }
}
}
class Notice {

String Title;


public Notice()
{
        Title="";
}

public Notice(String NoticeTitle)
{
        Title=NoticeTitle;
}

public void setTitle(String NoticeTitle)
{
        Title=NoticeTitle;
}

public String toString(){
        return "Notice Name "+Title;
}
}
