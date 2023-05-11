class myclass {
public String message="helloworld";
public void displaymessage(){
        System.out.println("message:"+message);
}
public static String greetings="good morning";
public static void displaygreetinngs()
{
        System.out.println("greetings:"+greetings);
}

}
public class staticdemo {
public static void main(String[] args) {
        myclass mc=new myclass();
        System.out.println(mc.message);
        mc.displaymessage();
        System.out.println(myclass.greetings);
        myclass.displaygreetinngs();
}

}
