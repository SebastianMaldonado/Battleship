package battleship;

import javax.swing.JOptionPane;

public class Jugador {

    Tablero tab = new Tablero();

    int matrizB[][] = new int[10][10];
    int matrizJ[][] = new int[10][10];
    int barcos;
    int jug;

    public Jugador (int jug) {
        for (int i = 0; i != 10; i++) {
            for (int j = 0; j != 10; j++) {
                this.matrizB[i][j] = 0;
                this.matrizJ[i][j] = 0;
            }
        }
        this.barcos = 17;
        this.jug = jug;
    }

    public void atacar(int x) {
        if (x == 1) {
            System.out.println("Haz encontrado un barco y le has dado con tu misil");
        } else {
            System.out.println("Intenta de nuevo que ahi no hay nada");
        }
    }

    public int acabar () {
        if (this.barcos == 0) {
            System.out.println("El jugador ha perdido todos sus barcos");
            return 0;
        } else {
            return 1;
        }
    }

    public void iniciarB () {
        System.out.println("Nota: Las posiciones de X y Y van de 0 a 9");
        int z = 2;
        boolean hov, val = true;
        Object [] posicion = {"", "Horizontal", "Vertical"};
        while (z != 6) {
            do {
                JOptionPane.showMessageDialog(null, "Digite la posicion del barco de tamaño " + z);
                int x = Integer.parseInt(JOptionPane.showInputDialog("Posicion en x: "));
                int y = Integer.parseInt(JOptionPane.showInputDialog("Posicion en y: "));
                Object temp = JOptionPane.showInputDialog(null,"Selecciona una orientacion", "Elegir",JOptionPane.QUESTION_MESSAGE,null,posicion, posicion[0]);
                if (temp.toString().equals("Horizontal")) {
                    hov = true;
                } else {
                    hov = false;
                }
                System.out.println("Entro");
                val = tab.ponerB(this.matrizB, x, y, hov, z);
                z ++;
            } while (val);
        }
    }
    
    public void mostrarTab(int tabs) {
        if (tabs == 0) {
            tab.imprimirTab(this.matrizJ);
        } else {
            tab.imprimirTab(this.matrizB);
        }
    }
}
