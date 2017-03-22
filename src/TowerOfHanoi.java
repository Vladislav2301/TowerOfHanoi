import java.io.BufferedReader;
import java.io.InputStreamReader;

// Program to find solution for Tower of Hanoi
public class TowerOfHanoi {

    public static void main(String args[]) throws Exception {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int x;
        System.out.print("No. of disks? ");
        x = Integer.parseInt(in.readLine());
        hanoi(x);
    }

    private static void hanoi(int n) {
        moveTower(n, 'A', 'B', 'C');
    }

    private static void moveTower(int ht, char f, char t, char i) {
        if (ht > 0){
            moveTower(ht-1, f, i, t);
            moveRing(ht, f, t);
            moveTower(ht-1, i, t, f);
        }
    }

    private static void moveRing(int d, char f, char t) {
        System.out.println("move ring" + d + " from " + f + " to " + t);
    }
}
