package Learn_and_Build;

import java.io.*;
import java.util.Scanner;

public class FileH {

    static void create(){
        File obj = new File("tester.txt");
        try
        {
            if (obj.createNewFile()) {

                System.out.println("File created");
            }
            else System.out.println("Already exists");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    static void write_file(){
        try {
            FileWriter fw = new FileWriter("tester.txt", true);
            fw.write("\nthis is forth line\n");
            fw.write("this is fifth line");
            fw.close();

            System.out.println("successfully update data");
        }
        catch (Exception e){
            System.out.println(e);
        }

    }

    static void read(){
        try {
            File fr= new File("tester.txt");
            Scanner sc = new Scanner(fr);

            while(sc.hasNextLine())
            {  String file_data = sc.nextLine();
                System.out.println(file_data);
            }
            sc.close();
        }
        catch (Exception e){

        }

    }

    static void delete(){}


    public static  void main(String[] args)
    {
        create();
        write_file();
        read();

    }

}

/*
* file class to read and create
* FileWriter class to write data
 */
