public class LabRabKlassy2IvanovDV {
    public static void main (String[] args) {
        double[][] matrix = new double[2][2];

        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[1][0] = 3;
        matrix[1][1] = 4.55;

        double[][] matrix2 = new double[2][2];
        matrix2[0][0] = 5.1;
        matrix2[0][1] = 6;
        matrix2[1][0] = 7;
        matrix2[1][1] = 8;

        double[][] matrix3 = new double[2][2];
        int z = 34;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
            for (int i = 0; i < matrix3.length; i++) {
                for (int j = 0; j < matrix3[i].length; j++) {
                    matrix3[i][j] = matrix[i][j] + matrix2[i][j];
                    System.out.print(" " + matrix3[i][j]);
                }
                System.out.println();
            }
System.out.println("Multiplier Z");
        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix3[i].length; j++) {
                matrix3[i][j] = matrix[i][j] + matrix2[i][j];
                System.out.print(" " + matrix3[i][j] * z);
            }
            System.out.println();
        }
}
}