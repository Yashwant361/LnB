import java. util.*;
public class Practice {
    public static void main(String[] args) {
      /*  int a,b,c,d,e;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the five inputs");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        d=in.nextInt();
        e=in.nextInt();
        int avg=(a+b+c+d+e)/5;
        System.out.println("Total avg is:"+avg);*/

// Question 2 :without recursion
      /*  int n,fact=1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the inputs");
        n=in.nextInt();
        for (int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of "+n+":"+fact);*/

 //Question 3 :

    /*    int num=123,rev=0;
        while (num!=0)
        {
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
      }
        System.out.println("reverse num is "+rev);

     */
   //Question 4:prime or not
     /*   int  sum= 0;
        int flag=0; // flag is indicater
        int num ;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the  inputs");
         num =in.nextInt();
        for(int i=2;i<=num;i++)
        {
            if(num%i==0)
            {
               flag=1;
                System.out.println("not prime");
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("prime");
        } */
  //Question 7:fibonaaci series

       /* int n1=0,n2=1,n3,i,count=10;
        System.out.print(n1+" "+n2);

        for(i=2;i<count;++i)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }*/

    }
}
/*import java.util.*;
public class Main{
    public static void Main(String [] args){
    new Prime();
    }
    class Prime
    {
        int num;
        Prime()
        {
            System.Out.System.out.print("im constructer");
             System.Out.System.out.print("plz enter num");
            Scanner sc=new Scanner(System.in);
            num=sc.nextInt();
            if(num%2==0)
            {
                 System.Out.System.out.print("even");
            }
            else{
                System.Out.System.out.print("odd");
            }
        }
    }
}*/
