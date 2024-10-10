import java.util.Scanner;

public class Jogar {


    private int[][] matriz;
    private Conversor conversor;
    private Scanner scanner;

    public Jogar() {
        matriz = new int[3][3];
        conversor = new Conversor();
        scanner = new Scanner(System.in);
        inicializarTabuleiro();
    }



}
