public class Usuariojoga {
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
