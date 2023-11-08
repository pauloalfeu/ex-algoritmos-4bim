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
                while (j > 0 && vetor[j] < vetor[j-1]) {
                    troca(vetor, j, j-1);
                    j--;
                }
            }
        }

    }

    public static void printVetor(int vetor[]){
        for(int i=0; i < vetor.length; i++){
            System.out.println(vetor[i]);

        }
    }

    /* 
    
    *selectionSort

    i = 0
    menor_valor = 66, 25, 13, 1, 0
    pos = 0, 1, 3, 4, 5

    passa o valor que estava na primeira posição para a posição do menor valor encontrado & 
    substitui o valor que estava na menor posição para menor valor que estava guardado

    */

    public static void selectionSort(int[] valores){

        int i, j, menor_valor, menor_pos;

        for(i = 0; i < valores.length -1; i++){
            menor_pos = i;
            menor_valor = valores[i];
            for(j= i+1; j < valores.length; j++){
                if(valores[j] < menor_valor){
                    menor_valor = valores[j];
                    menor_pos = j;
                }
            }
            troca(valores, i, menor_pos);
        }

    }

    /*
     * Alocar vetores --> fazer uma cópia
        entrada agora com dois vetores = valoresA e valoresB
        já estão ordenamos e a saída deve ser um novo vetor que junta e faz a ordenação dos valores
        

        val_A = {15, 19, 28}
        val_B= {14, 16, 30, 35}

        saída = {14, 15, 16, 19, 28, 30, 35}
        // vetores podem ser de tamn diferente & saída pode ser uma nula
     */

     public static int[] mergeSort (int[] vetorA, int[] vetorB){

        if(vetorA.length == 0){
            return vetorB;
        }

        if(vetorB.length == 0){
            return vetorA;
        }

        int[] val_A = vetorA;
        int[] val_B = vetorB;
        int[] res = new int[val_A.length + val_B.length];

        int i=0, j=0, k, menor_valor;

        for(k=0; k<res.length; k++){
                if(i < val_A.length && j<val_B.length){ //para não tentar acessar uma posição que não existe
                    if(val_A[i] < val_B[j]){
                        res[k] = val_A[i];
                        i++;
                    } else {
                        res[k] = val_B[j];
                        j++;
                    }}else {
                        if(i >= val_A.length){ res[k] = val_B[j]; j++;} else{
                            res[k] = val_A[i]; i++;
                        }
                    }
        

                }

        return res;
     }

     /*
      * Split Sort
      */

    

    public static void main (String[]args){
        //int vetor[] = {94, 27, 32, 46, 8, 0};
        //int vetor[] = {66, 25, 77, 13, 1, 0};
        int vetorA[] = {15, 19, 28};
        int vetorB[] = {14, 16, 30, 35};

        /*Bubble Sort
        int valores[] = bubbleSort(vetor);
        prova::: pilha, buscas tabelas de dispersao e conjuntos;
        */

        /*
         Insertion Sort
         insertionSort(vetor);

         */
        
        // selectionSort(vetor);
        int vetorC[] = mergeSort(vetorA, vetorB);

        printVetor(vetorC);
    }
}
