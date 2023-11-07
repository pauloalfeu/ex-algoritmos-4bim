public class ordenacoes {

    public static int[] bubbleSort(int vetor[]){

        int i, j;

        for(i=0; i < (vetor.length - 1); i++){
            for(j=0; j < (vetor.length - 1 - i); j++){
                if(vetor[j] > vetor[j+1]){
                    troca(vetor, j, j+1);                  // big O = O(n²) -- n = vetor.length
                }
            }
        }

        return vetor;
    }

    public static void troca(int vetor[], int pos_a, int pos_b){

        int aux = vetor[pos_b];
        vetor[pos_b] = vetor[pos_a];
        vetor[pos_a] = aux;

    }

    public static void insertionSort(int vetor[]){
        int j;
        if(vetor.length > 1){
            for(int i=1; i < vetor.length; i++){
                j = i;
                while (vetor[j] < vetor[j-1] && j > 0) {
                    troca(vetor, j, j-1);
                    j--;
                }
            }
        }

    }
    

    public static void main (String[]args){
        int vetor[] = {94, 27, 32, 46, 8, 0};
        int valores[] = bubbleSort(vetor);
        // prova::: pilha, buscas tabelas de dispersao e conjuntos;

        for(int i=0; i < valores.length; i++){
            System.out.println(valores[i]);

        }
    }
}
