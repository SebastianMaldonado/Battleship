package battleship;

public class Tablero {
    public void imprimirTab(int matriz[][]) {
        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 7; j++) {
                if (matriz[i][j] == 0) {
                    System.out.println("- ");
                } else if (matriz[i][j] == 1) {
                    System.out.println("+ ");
                } else if (matriz[i][j] == 2) {
                    System.out.println("* ");
                }
            }
        }
    }


}
