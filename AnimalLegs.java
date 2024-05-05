1. An Zoo consists of two types of animals with different number of legs. The zoo management wants 
    to find out how many type of animals are their with each category.
    • N represents the total number of animals
    • L represents the total number of Legs
Find out the number of animals of each category
Constraints:
There are only two type of animals two legs and four legs animals
N and L should be greater than zero
L>=2, L%2=0, N<L
Input Format:
1) The first line of input contains the value N represents the sum of both types of animals.
II) The second line of input contains value L represents total number of Legs
Output Format:
Print the number of animals of each category (two legs & four legs) 
If input is not Valid print Invalid input
Sample Input1:
N=200
L=540
Sample Output1:
TL=130
FL=70

solution:
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
