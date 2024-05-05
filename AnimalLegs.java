import java.util.*;

public class AnimalLegs{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int l=sc.nextInt();
        int m=sc.nextInt();
        int x,y;
        y=(int)(m-2*l)/2;
        x=l-y;
        System.out.println(x);
        System.out.println(y);        
        }
    }
