import java.util.*;
class Niven
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int j=n;
        int sum=0;
        while(n>0)
        {
            int r=n%10;
            sum=sum+r;
            n=n/10;
        }
        if(j%sum==0)
        System.out.println("Niven Number");
        else
        System.out.println("Not a Niven Number");
    }
}

        