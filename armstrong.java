import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter any number : ");
        int num = input.nextInt();
        int sum=0,r;
        int temp;
        temp=num;
        while(temp!=0){
            r=temp%10;
            sum=sum+r*r*r;
            temp=temp/10;
        }
        if(sum==num){
            System.out.println("you entered an armstrong number XD");
        }
        else{
            System.out.println("yoo bro !! you entered a normal number XD");
        }
        }
    
}
