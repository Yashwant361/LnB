package w3Schools;

class R_ectangle {
    // method to calculate area of rectangle
    int area(int length , int breadth){
        return length * breadth;
    }

    // method to calculate perimeter of rectangle
    int peri(int length , int breadth){
        return 2 * (length + breadth);
    }

    // inner class Square that extends Rectangle
    class Square extends R_ectangle {
        // method to calculate area of square
        int area(int side){
            return side * side;
        }

        // method to calculate perimeter of square
        int peri(int side){
            return 4 * side;
        }
    }
}

public class Rectangle {
    public static void main(String[] args) {
        R_ectangle r = new R_ectangle();
        int length = 4;
        int breadth = 5;

        // printing area and perimeter of rectangle
        System.out.println("Area of rectangle: " + r.area(length, breadth));
        System.out.println("Perimeter of rectangle: " + r.peri(length, breadth));

        R_ectangle.Square s = r.new Square();
        int side = 6;

        // printing area and perimeter of square
        System.out.println("Area of square: " + s.area(side));
        System.out.println("Perimeter of square: " + s.peri(side));

    }
}
