import java.util.Scanner;

public class Main extends lista_seq {

    public static void main(String[] args) {

        // Inicialização de variáveis
        Scanner sc = new Scanner(System.in);
        int op, dado, pos;

        //Criação da lista
        listaSeq_01 array = new listaSeq_01();
        System.out.println("Uma nova lista foi criada.");

        do {
            //Menu de opções para o usuário
            System.out.println("\n\n-------------- MENU -------------");
            System.out.println("--- Escolha uma opção:");
            System.out.println("1 - Mostrar o estado da lista");
            System.out.println("2 - Mostrar o tamanho da lista");
            System.out.println("3 - Modificar elementos da lista");
            System.out.println("4 - Imprimir lista");
            System.out.println("5 - Sair");

            op = sc.nextInt();

            switch (op){

                //verificar o estado da lista -- cheia/vazia/incompleta
                case 1: {
                    if(array.cheia() == true){
                        System.out.println("A lista está cheia ");

                    }else if(array.vazia()){
                        System.out.println("A lista está vazia ");

                    }else {
                        System.out.println(" A lista está incompleta");
                    }
                    break;

                }
                //verificar o tamanho da lista
                case 2:{
                    System.out.println("Tamanho atual da lista: " +  array.tamanho() + " elementos");
                    break;

                }

                case 3:{
                    //Menu de modificação de elementos
                    int op2;
                    System.out.println("---- Modificando elementos ----");
                    System.out.println("Escolha uma opção:");
                    System.out.println("1 - Modificar o valor de um elemento");
                    System.out.println("2 - Inserir um elemento");
                    System.out.println("3 - Remover um elemento");

                    op2 = sc.nextInt();
                    //modificar elemento existente
                    if(op2 == 1){
                        System.out.println("Insira novo valor do elemento: ");
                        dado = sc.nextInt();
                        System.out.println("Insira a posição do novo elemento: ");
                        pos = sc.nextInt();
                        array.trocaValor(pos, dado);

                    //inserir novo elemento
                    }else if(op2 == 2){
                        System.out.println("Insira valor do elemento: ");
                        dado = sc.nextInt();
                        System.out.println("Insira a posição do novo elemento: ");
                        pos = sc.nextInt();
                        array.insere(pos, dado);

                    //remover um elemento
                    }else if(op2 == 3){
                        System.out.println("Insira a posição do elemento que deseja remover");
                        pos = sc.nextInt();
                        System.out.println("Deseja remover o elemento " + array.elemento(pos) + "da posição " + pos + "? \n1 - SIM\n2 - NÃO");
                        int aux = sc.nextInt();
                        if (aux == 1){
                            array.remove(pos);

                        }else{
                            System.out.println("Operação de remoção cancelada");
                        }

                    }else {
                        System.out.println("//OPÇÃO INVÁLIDA//");
                    }
                    break;

                }
                //mostrar a lista
                case 4:{
                    array.show();
                    break;
                }
                case 5:{
                    System.out.println("Saindo");
                    break;
                }

                default:{
                    System.out.println("// OPÇÃO INVÁLIDA //\nTente novamente");
                    break;
                }
            }
        }while (op != 5);
    }
}
