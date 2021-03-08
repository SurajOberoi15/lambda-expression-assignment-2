import java.util.Scanner;
import java.util.function.*;

public class nextEven {

    public static void main(String[] args) {
        Function<Long,Long> f1 = i ->{
            
            if(i%2==0){
                return i+2;
            }
            else{
                return i+1;
            }
        };

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a long value");
        long value = sc.nextLong();
        long nextInt = f1.apply(value);
        System.out.println("Next Even value is : " + nextInt);
        sc.close();
    }
    
}
