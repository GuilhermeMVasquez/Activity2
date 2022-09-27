import java.util.*;
import java.lang.Math;
import java.util.concurrent.*;

public class activity2
{
    public static void main(String[]args)
        throws InterruptedException {
        while(true){
            Scanner Keyboard = new Scanner(System.in);
            System.out.println('\f'+"Insert the values for x, y, and z, one at a time respectively");
            double x = Keyboard.nextDouble();
            double y = Keyboard.nextDouble();
            double z = Keyboard.nextDouble();
            if((x==y)&&(y==z)){
                System.out.println("All numbers entered are equal");
            }
            else{
                double h = Biggerthan(x,y);
                double g = Biggerthan(h,z);
                System.out.println("The biggest number entered is "+g);
            }
            TimeUnit.MILLISECONDS.sleep(500);
            System.out.println('\t'+"Enter '1' if you wish to check another 3 number combination"+'\n'+'\t'+"Enter '0' to stop running the program");
            int on = Keyboard.nextInt();
            if(on == 0){
                Keyboard.close();
                System.exit(0);
            }
        }
    }
    
    public static double Biggerthan(double a, double b){
        return(((a+b)+Math.abs(a-b))/2);
    }
}
