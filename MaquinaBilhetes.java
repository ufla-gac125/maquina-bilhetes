/**
 * MaquinaBilhetes modela uma máquina de bilhetes ingênua que
 * emite bilhetes de preço fixo.
 * O preço de um bilhete é definido através do construtor.
 * É uma máquina ingênua porque ela confia que os clientes
 * colocarão a quantidade de dinheiro suficiente antes de tentar
 * emitir um bilhete.
 * Ela também assume que os clientes colocarão quantidades
 * razoáveis.
 * 
 * Traduzido por Julio César Alves - 2023-08-31
 *
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class MaquinaBilhetes{
    // O preço de um bilhete desta máquina.
    private int preco;
    // A quantidade de dinheiro que o usuário colocou até o momento.
    private int saldo;
    // A quantidade total de dinheiro coletado pela máquina.
    private int total;

    /**
     * Cria uma máquina que emite bilhetes de um dado preço.
     * Note que o preço deve ser maior que zero, e não tem
     * nenhuma verificação para garantir isso.
     */
    public MaquinaBilhetes(int custoBilhete){
        preco = custoBilhete;
        saldo = 0;
        total = 0;
    }

    /**
     * Retorna o preço do bilhete.
     */
    public int obterPreco(){
        return preco;
    }

    /**
     * Retorna a quantidade de dinheiro já inserida para o
     * próximo bilhete.
     */
    public int obterSaldo(){
        return saldo;
    }

    /**
     * Recebe uma quantidade de dinheiro de um cliente.
     */
    public void inserirDinheiro(int quantidade){
        saldo = saldo + quantidade;
    }

    /**
     * Imprime um bilhete.
     * Atualiza o total coletado e reduz o saldo para zero.
     */
    public void imprimirBilhete(){
        // Simula a impressão de um bilhete
        System.out.println("##################");
        System.out.println("# Bilhetes & Cia ");
        System.out.println("# Bilhete");
        System.out.println("# " + preco + " centavos.");
        System.out.println("##################");
        System.out.println();
        // Atualiza o total coletado com o saldo
        total = total + saldo;
        // Zera o saldo
        saldo = 0;
    }
}
