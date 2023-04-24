import java.util.*;
public class Main2 {
    public static void main(String[] args)
   /* {
        String st=new String("HEllo Java");
        String st1="Hello Java";
        String st2="Hello Java";

        System.out.println(st.equals(st1));
        System.out.println(st1.equals(st1));
        System.out.println(st2.equals(st));

        System.out.println(st.contains("Java"));
        String email="abcd@gmail.com";
        System.out.println(email.contains("@"));

        // how to read indiviual string

        System.out.println(email.length());
        System.out.println(email.substring(2));
        System.out.println(email.substring(2,6));
        System.out.println(email.indexOf('@'));


        char grade;
        Scanner sc= new Scanner(System.in);
        grade=sc.next().charAt(3);
        System.out.println(grade);
    }*/

    /*//for_each loops
    {
      char[]arr ={'a','b','c','d','e'};
      int[] marks={10,39,432,533,32,442};

      for (char z:arr) {
          System.out.println(arr);
      }
        for (int num:marks){
            System.out.println(num);
        }
     */
     // Email password(8_char,'small/capital');

    {
            System.out.print("Please Enter Your Email To Validate: ");
            Scanner input = new Scanner (System.in);
            String email  = input.nextLine();
            for (int i = 0 ;  i < email.length(); i ++) {
                if (email.indexOf("@") >= 1 ) {
                    if (email.indexOf(".") >= email.indexOf("@")+2)
                        if ((email.indexOf("@")+email.indexOf(".") - email.length()) >= 1 )
                            System.out.print("Email Passed" + (email.length() - (email.indexOf("@")+email.indexOf("."))));
                }
            }
            System.out.print("\n String legnth: "+ (email.length()) +
                    "\n Index of @: " + email.indexOf("@") +
                    "\n Index of dot: " + email.indexOf("."));
        }





    }
//}
