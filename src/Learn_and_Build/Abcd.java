package Learn_and_Build;

import java.util.Scanner;

class Abcd
{
    public static void main(String args[])
    {
       /* String str, rev = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        str = sc.nextLine();

        int length = str.length();

        for ( int i = length - 1; i >= 0; i-- )
            rev = rev + str.charAt(i);

        if (str.equals(rev))
            System.out.println(str+" is a palindrome");
        else
            System.out.println(str+" is not a palindrome");
       */

        /*String st="ABCDEF";
        char[ ] arr=st.toCharArray();*/


               /*String str = "dhhcbsjcbsjc";
                   //String str ="";
                if(str.length()>0) {
                    // print length size
                    System.out.println("String  length is: "+str.length());
                }

                if(str.length()==0) {
                    System.out.println("String is empty : "+str.length());
                }
                */


       // programe of string occurance
        /* {

            String input = "pineapple";
            char search = 'a';             // Character to search is 'a'.

            int count=0;
            for(int i=0; i<input.length(); i++)
            {
                if(input.charAt(i) == search)
                    count++;
            }

            System.out.println("The Character '"+search+"' appears "+count+" times.");
        }
*/
        //program to reverse a string
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String to reverse");
        String a = sc.nextLine();

        String rev=""; //empty string for concatanation of "s.length-1"

        char s[]=a.toCharArray(); //converting to char Array

        for (int i=s.length-1;i>=0;i--)
        {
            rev=rev+s[i];
        }
        System.out.println(rev);
    }
}

