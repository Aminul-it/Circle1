package circle;
import java.util.*;
//import java.lang.*;
public class Circle {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Give Radius Value:");
        int a = obj.nextInt();
        With ob = new With(a);
        ob.Area();
       // ob.finalize();
        With obb = new With();
        obb.Area();
        
        
        
    }
    
    
}
