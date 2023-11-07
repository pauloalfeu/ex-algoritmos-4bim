public class busca {

    public static Boolean buscaLinear (int[] vetor, int x){
        int i;
        for(i=0; i<vetor.length; i++){
            if(vetor[i] == x){
                return true;
            }
        }

        return false;
    }

    // para busca binária funcionar, o vetor deve estar ordenado
    public static Boolean buscaBinaria (int[] vetor, int x){

        int i, inicio = 0, fim = vetor.length-1, meio;

        while(inicio <= fim){
            meio = inicio + (fim - inicio) / 2;
            if(vetor[meio] == x){return true;}
            if( x > vetor[meio]){
                inicio = meio + 1;
            } else {
                fim = meio -1;
            }
        }


        return false;
    }

    public static Boolean buscaBinariaRecursivaInterna (int[] vetor, int x, int inicio, int fim){

        if(inicio > fim){
            return false;
        }

        int meio = inicio + (fim-inicio) / 2;

        if (vetor[meio] == x){
            return true;
        };

        if (x > vetor[meio]){ 
            return buscaBinariaRecursivaInterna(vetor, x, meio + 1, fim);
        }

        return buscaBinariaRecursivaInterna(vetor, x, inicio, meio -1);
    }

    public static Boolean buscaBinariaRecursiva (int[] vetor, int x){

        return buscaBinariaRecursivaInterna(vetor, x, 0, vetor.length -1);
        // Wrapper function
    }

    public static void main (String[]args){

        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int x = 4;
        Boolean busca;
        busca = buscaBinariaRecursiva(vetor, x);
        System.out.println(busca);
        busca = buscaLinear(vetor, x);
        System.out.println(busca);
    }
}
