package battleship;

public class Tablero {
    public void imprimirTab(int matriz[][]) {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                if (matriz[i][j] == 0) {
                    System.out.print("- ");
                } else if (matriz[i][j] == 1) {
                    System.out.print("+ ");
                } else if (matriz[i][j] == 2) {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
    }

    public boolean ponerB (int matriz[][], int x, int y, boolean hov, int tam) {
        int i = 0;
        boolean ent = true;
        if (hov) {
            while (ent && tam != i) {
                System.out.println("Entro horizaontal");
                if (y + i < 10) {
                    if (matriz[x][y + i] != 0) {
                        ent = false;
                    }
                    i = i + 1;
                } else {
                    System.out.println("El barco no puede ser colocado en esta posicion por su tamaño y orientacion");
                    ent = false;
                }
            }
            i = 0;
            if (ent) {
                while (i != tam) {
                    matriz[x][y + i] = 1;
                }
                i = i + 1;
            } else {
                System.out.println("No se ha podido poner el barco porque se encuentra ocupada la casilla");
            }
        } else {
            System.out.println("Entro vertical");
            while (ent && tam != i) {
                if (x + i < 10) {
                    if (matriz[x + i][y] != 0) {
                        ent = false;
                    }
                    i = i + 1;
                } else {
                    System.out.println("El barco no puede ser colocado en esta posicion por su tamaño y orientacion");
                    ent = false;
                }
            }
            i = 0;
            if (ent) {
                while (i != tam) {
                    matriz[x + i][y] = 1;
                }
                i = i + 1;
            } else {
                System.out.println("No se ha podido poner el barco porque se encuentra ocupada la casilla");
            }
        }
        return ent;
    }

}
