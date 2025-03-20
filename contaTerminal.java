import java.util.Scanner;

public class contaTerminal{
    public static void main(String[] args) throws Exception{
        double saldo = 340.26;
        Scanner teclado = new Scanner(System.in);
        System.out.println("----------------------------------OLÁ CARO USUÁRIO SEJA BEM VINDO À VERIFICAÇÃO DE SALDO-----------------------------------------");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Digite sua agência por gentileza (Com o tracinho):");
        String agencia = teclado.next();
        System.out.println("Digite seu número da conta:");
        String numeroconta = teclado.next();
        System.out.println("Digite seu Nome");
        String nome = teclado.next();
        System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numeroconta+" e seu saldo "+saldo+" já está disponível para saque");
    }
}