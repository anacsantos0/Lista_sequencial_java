public class lista_seq {

    public static class listaSeq_01 {
        private static int dados[];
        private static int tamAtual;
        protected static int tamMax;

        public listaSeq_01() {
            tamMax = 100;
            tamAtual = 0;
            dados = new int [tamMax];
        }

        public static boolean vazia() {
            if (tamAtual == 0)
                return true;
            else
                return false;
        }

        public static boolean cheia() {
            if (tamAtual == tamMax)
                return true;
            else
                return false;
        }

        public static int tamanho() {
            return tamAtual;
        }

        public static int elemento(int i){
            int dado;
            if ((i > tamAtual ) || (i < 0))
                return -1;
            dado = dados[i];
            return dado;

        }

        /*Recebe a posição de um dado e um valor de dado. Faz a substituição do antigo
         dado em determinada posição pelo novo valor de dado recebido*/
        public static int trocaValor(int pos, int dado) {

            for (int i = pos - 1; i < tamAtual; i++) {
                if (dados[i] == dados[pos - 1]) {
                    dados[i] = dado;
                }

                return (dados[i]);
            }

            return -1;
        }

    /* Insere um elemento em uma determinada posição.
    Devolve true caso a inserção ocorrer e false caso contrário*/

        public static boolean insere(int pos, int dado) {

            if (cheia() || (pos > tamAtual + 1) || (pos < 1)) {
                return false;

            } else {
                for (int i = tamAtual; i >= pos; i --){
                    dados[i] = dados[i - 1];
                }
                dados[pos-1] = dado;
                tamAtual++;
                return true;
            }
        }

        /* Retorna o tamanho atual da lista*/

        public static int getTamAtual() {
            return tamAtual;
        }

        /* Remove um elemento de determindada posição, retorna valor do elemento removido
        e retorna -1 caso ocorra uma falha */
        public static int remove(int pos){
            int dado;
            if ((pos > tamAtual) || (pos < 1 ))
                return -1;

            dado = dados[pos-1];
            for (int i = pos - 1  ; i < tamAtual - 1; i++){
                dados[i] = dados[i+1];
            }
            tamAtual--;
            return dado;
        }

        /* Imprime a lista, mostrando a podição do dado e o dado*/
        public static void show(){
            int i;

            for( i = 0 ; i < tamAtual; i ++){
                System.out.println("POSIÇÃO: " + (i+1) + "    =    " + elemento(i));
            }

        }
    }
}
