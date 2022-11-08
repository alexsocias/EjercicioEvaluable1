public class MatrizArrayEvaluable {
    public static void main(String[] args) {
        final int FILAS = 5;
        final int COLUMNAS = 5;
        int[][] matrizA = new int[FILAS][COLUMNAS];
        int[][] matrizB = new int[FILAS][COLUMNAS];
        int[][] matrizC = new int[FILAS][COLUMNAS];
        System.out.println("generar 2 matrices de 25 números y su suma");
        NumAleatorioA(matrizA,FILAS,COLUMNAS,0,9);
        NumAleatorioB(matrizB,FILAS,COLUMNAS,0,9);
        SumaMatrices(matrizA,matrizB,matrizC);
        dibujarMatrizC(matrizC);

    }

    public static void NumAleatorioA(int[][] lista, int fil, int col, int a, int b) {
        System.out.println("PRIMERA");
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista.length; j++) {
                lista[i][j] = (int) (Math.random() * (a-b)+9);
                System.out.print(lista[i][j] + "\t");
            }
            System.out.println("");
        }

    }

    public static void NumAleatorioB(int[][] lista2, int fil, int col, int a, int b) {
        System.out.println("SEGUNDA");
        for (int i = 0; i < lista2.length; i++) {
            for (int j = 0; j < lista2.length; j++) {
                lista2[i][j] = (int) (Math.random() * (a-b)+9);
                System.out.print(lista2[i][j] + "\t");
            }
            System.out.println("");
        }
    }
    public static void SumaMatrices (int[][]ma1, int[][]ma2, int ma3[][]) {
        for (int i=0;i< ma1.length; i++){
            int suma=0;
            System.out.println("\t");
            for (int j=0; j<ma2[i].length;j++){
                suma=ma1[i][j]+ma2[i][j];
                ma3[i][j]=suma;
            }
        }
    }
    public static void dibujarMatrizC(int[][]ma3){
        for (int i=0; i< ma3.length;i++){
            for (int j=0;j< ma3[i].length;j++){
                System.out.printf("%d  ",ma3[i][j]);
            }
            System.out.println();
        }
    }
}
