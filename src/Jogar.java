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
    private void inicializarTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = 0;
            }
        }
    }
    //chamar tabuleiro
    public void usuarioJoga() {
        while (true) {
            //chamar tabuleiro aqui pra mostrar opções dispo
            System.out.println("Escolha a linha e a coluna que deseja jogar ");
            int linha = scanner.nextInt();
            int coluna = scanner.nextInt();

            if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3) {
                if (matriz[linha][coluna] == 0) {
                    matriz[linha][coluna] = 1;
                    break;
                } else {
                    System.out.println("Essa posição já está em uso. Jogue novamente.");
                }
            } else {
                System.out.println("Posição inválida. Tente novamente.");
            }
        }
    }

}
