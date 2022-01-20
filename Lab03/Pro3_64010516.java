import java.util.Scanner;
import java.util.ArrayList;

class Pro3_64010516 {
    public static ArrayList<Integer> findRow(int[][] matrix,int target) {
        ArrayList<Integer> list = new ArrayList<>();
        boolean isSame;
        for(int i=0;i<matrix.length;i++) {
            isSame = true;
            for(int j=0;j<matrix[i].length;j++) {
                if(matrix[i][j] != target) {
                    isSame = false;
                }   
            }
            if(isSame) {
                list.add(i);
            }
        }
        return list;
    }
    public static ArrayList<Integer> findColumn(int[][] matrix,int target) {
        ArrayList<Integer> list = new ArrayList<>();
        boolean isSame;
        for(int i=0;i<matrix.length;i++) {
            isSame = true;
            for(int j=0;j<matrix[i].length;j++) {
                if(matrix[j][i] != target) {
                    isSame = false;
                }   
            }
            if(isSame) {
                list.add(i);
            }
        }
        return list;
    }
    public static boolean findSubDiagonal(int[][] matrix,int target) {
        boolean isSame = true;
        for(int i=0,j=0;i+1<matrix.length && j<matrix.length;i++,j++) {
            if(matrix[i+1][j] != target) {
                isSame = false;
            }
        }
        return isSame;
    }
    public static boolean findSuperDiagonal(int[][] matrix,int target) {
        boolean isSame = true;
        for(int i=0,j=0;i<matrix.length && j+1<matrix.length;i++,j++) {
            if(matrix[i][j+1] != target) {
                isSame = false;
            }
        }
        return isSame;
    }
    public static boolean findDiagonal(int[][] matrix,int target) {
        boolean isSame = true;
        for(int i=0,j=0;i<matrix.length && j<matrix.length;i++,j++) {
            if(matrix[i][j] != target) {
                isSame = false;
            }
        }
        return isSame;
    }
    public static int[][] printMatrix(int[][] matrix) {
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[i].length;j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        return matrix;
    }
    public static int[][] randomMatrix(int[][] matrix) {
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[i].length;j++) {
                matrix[i][j] = (int)(Math.random()*2);
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size for the matrix: ");
        int num = 1;
        try {
            num = scanner.nextInt();
            scanner.close();
            if(num <= 1){
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Invalid Input: Input must be more than 1.");
            System.exit(0);
        }
        int[][] matrix = new int[num][num];
        randomMatrix(matrix);
        //Print Matrix
        printMatrix(matrix);
        //Find Row
        if(findRow(matrix, 0).size() != 0 || findRow(matrix, 1).size() != 0) {
            if(findRow(matrix, 0).size() != 0) {
                System.out.print("All 0s in row ");
                for(int i=0;i<findRow(matrix, 0).size();i++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }

            if(findRow(matrix, 1).size() != 0) {
                System.out.print("All 1s in row ");
                for(int i=0;i<findRow(matrix, 1).size();i++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("No same numbers on a row");
        }
        //Find Column
        if(findColumn(matrix, 0).size() != 0 || findColumn(matrix, 1).size() != 0) {
            if(findColumn(matrix, 0).size() != 0) {
                System.out.print("All 0s in column ");
                for(int i=0;i<findColumn(matrix, 0).size();i++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }

            if(findColumn(matrix, 1).size() != 0) {
                System.out.print("All 1s in column ");
                for(int i=0;i<findColumn(matrix, 1).size();i++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("No same numbers on a column");
        }
        //Find superdiagonal
        if(findSuperDiagonal(matrix, 0) || findSuperDiagonal(matrix, 1)) {
            if(findSuperDiagonal(matrix, 0)) {
                System.out.println("All 0s in superdiagonal");
            }

            if(findSuperDiagonal(matrix, 1)) {
                System.out.println("All 1s in superdiagonal");
            }
        } else {
            System.out.println("No same numbers on a superdiagonal");
        }
        //Find diagonal
        if(findDiagonal(matrix, 0) || findDiagonal(matrix, 1)) {
            if(findDiagonal(matrix, 0)) {
                System.out.println("All 0s in diagonal");
            }

            if(findDiagonal(matrix, 1)) {
                System.out.println("All 1s in diagonal");
            }
        } else {
            System.out.println("No same numbers on a diagonal");
        }
        //Find subdiagonal
        if(findSubDiagonal(matrix, 0) || findSubDiagonal(matrix, 1)) {
            if(findSubDiagonal(matrix, 0)) {
                System.out.println("All 0s in subdiagonal");
            }

            if(findSubDiagonal(matrix, 1)) {
                System.out.println("All 1s in subdiagonal");
            }
        } else {
            System.out.println("No same numbers on a subdiagonal");
        }
    }
}