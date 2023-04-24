package Assignment.ClassAndObj;

public class Matrix {
    private int rows;// number of rows
    private int coloums;// number of coloums
    private int[][] elements;// elements of the matrix as a 2D array

    // constructor to initialize the number of rows and columns of a new matrix
    public Matrix(int rows, int coloums) {
        this.rows = rows;
        this.coloums = coloums;
        this.elements = new int[rows][coloums];

    }

    //Method to get the number of rows of the matrix
    public int getRows() {
        return rows;
    }

    //Method to get the number of coloums of the matrix
    public int getColoums() {
        return coloums;
    }

    //Method to set the element at position (i,j) of the matrix
    public void setElement(int i, int j, int value) {
        elements[i][j] = value;
    }

    //Method to add two matrices
    public Matrix add(Matrix other) {
        // check if the matrices have the same dimensions
        if (rows != other.rows || coloums != other.coloums) {
            System.out.println("Matrices cannot be added");
            return null;
        }

        // create a new matrix to store the result
        Matrix result = new Matrix(rows, coloums);

        // iterate through the elements of both matrices and add them
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j < coloums; j++) {
                result.setElement(i, j, elements[i][j] + other.elements[i][j]);
            }
        }
        return result;
    }

    // method to multiply two matrices

    public Matrix multiply(Matrix other) {
        // check if the matrices are compatible for multiplication
        if (coloums != other.rows) {
            System.out.println("Matrics cannot be Multiplied");
            return null;
        }
        // create a new matrix to store the result
        Matrix result = new Matrix(rows, other.coloums);

        // iterate through the elements of both matrices and calculate the dot product
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j < other.coloums; j++) {
                int sum = 0;
                for (int k = 0; k < coloums; k++) {
                    sum += elements[i][k] * other.elements[k][j];
                }
                result.setElement(i, j, sum);
            }
        }
        return result;
    }
}
