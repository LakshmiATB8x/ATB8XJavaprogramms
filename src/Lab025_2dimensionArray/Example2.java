package Lab025_2dimensionArray;

public class Example2 {

    public static void main(String[] args)
    {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};

        for(int i=0; i< matrix.length;i++){// 1=0 ,0<3,i=1

            for(int j=0;j<matrix[i].length;j++)
            {
                System.out.print(matrix[i][j]);
            }
            System.out.println();

        }



    }
}
