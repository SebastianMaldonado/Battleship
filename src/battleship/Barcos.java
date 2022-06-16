package battleship;

public class Barcos {

    barco head;
    barco tail;

    class barco {

        int[][] pos;
        int tam;
        boolean hundido;
        barco next;
        barco prev;

        public barco(int x, int y, int tam, boolean hov) {
            this.pos = new int [tam][3];
            this.tam = tam;
            this.hundido = false;
            for (int i = 0; i < tam; i++) {
                if (hov) {
                    this.pos[i][0] = x + i;
                    this.pos[i][1] = y;
                    this.pos[i][2] = 0;
                } else {
                    this.pos[i][0] = x;
                    this.pos[i][1] = y + i;
                    this.pos[i][2] = 0;
                }
            }
            this.next = null;
            this.prev = null;
        }
    }
    
    public void addBarcos(int x, int y, int tam, boolean hov) {
        barco temp = new barco(x, y, tam, hov);
        if (this.head == null) {
            this.head = temp;
            //this.head.next = tail;
            //this.head.prev = tail;
            this.tail = temp;
            //this.tail.next = head;
            //this.tail.prev = head;
        } else {
            this.tail.next = temp;
            this.tail.prev = head;
            this.tail = temp;
            this.head.prev = tail;
        }
    }
}
