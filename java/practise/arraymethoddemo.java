import java.io.*;
import java.util.*;
class myclasss {

public void printelement(int[] a){
        for (int x : a) {
                System.out.println("the element is:"+a[x]);
        }
}

public int[] returnarray(){
        int[] a=new int[5];
        for ( int i=0; i<5; i++ ) {
                a[i]=i;
        }
        return a;
}

public void passprimitive(int primitiveparameter){
        primitiveparameter=10;
        System.out.println("value inside passprimitive="+primitiveparameter);
}
public void passreference(int[] referenceparameter){
        referenceparameter[1]=5;
        System.out.println("value inside passreference="+referenceparameter[1]);
}

}

public class arraymethoddemo {
public static void main(String[] args) {
        myclasss mc =new myclasss();
        int[] myarray={0,1,2,3,4}; int number=2;
        mc.printelement(myarray);
        int[] myarray2=mc.returnarray();
        System.out.println(Arrays.toString(myarray2));
        System.out.println("number before:"+number);
        mc.passprimitive(number);
        System.out.println("number after="+number);
        System.out.println("\n");
        System.out.println("myArray[1] before = " + myarray[1]);
        mc.passreference(myarray);
        System.out.println("myArray[1] after = " + myarray[1]);

}
}
