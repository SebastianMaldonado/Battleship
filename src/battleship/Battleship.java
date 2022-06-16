package battleship;
public class Battleship {

    public static void main(String[] args) {
        Jugador jugador1 = new Jugador(1);
        Jugador jugador2 = new Jugador(2);
        jugador1.iniciarB();
        jugador2.iniciarB();
        jugador1.mostrarTab(2);
        System.out.println("");
        System.out.println("");
        jugador2.mostrarTab(2);
    }
    
}
