package Assignment.Arrays;

//5. Write a Java program to test if an array contains a specific value
public class Array5 {
    public static boolean contains( int[]arr , int item)
    {
        for (int i:arr)
        {
            if (item == i){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] num={1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2265, 1457, 2456};
        System.out.println(contains(num,2013));
        System.out.println(contains(num,2019));
    }
}
