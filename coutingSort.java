class countingSort {
    
    
    /*
    Retorna valores ordenados utilizando apenas um 'for', porém ao alocar o vetor deve-se estar atento ao tamanho dos valores
    pois pode criar um vetor que ocupa muita memoria e assim, tornar o algoritmo lento
    */
    public static int[] counting_Sort(int[] v) {

        int[] saida = new int[v.length];
        int[] count;

       
        int max = v[0], i, val;

         if (v.length < 1) {
            max = v[0];
        }


        for (i = 0; i < v.length; i++) {
            
            if (v[i] > max) {
                max = v[i];
            }
        }

        count = new int[max+1];

        for (i = 0; i < v.length; i++) {
            val = v[i];

            count[val]++;
        }

        for (i = 1; i < count.length; i++) {
            count[i] = count[i] + count[i-1];
        }

        for (i = v.length - 1; i >= 0; i--) {
            
            val = v[i];
            count[val]--;
            saida[count[val]] = val;

        }

        return saida;
    }

    public static int getValPos_int(int val, int pos){
        return(int)(val % (int) Math.pow(10, pos+1) / (int) Math.pow(10, pos));
    }

    public static int[] countingSortPos (int [] v, int pos){
        int[] saida = new int [v.length];
        int[] count = new int [10]; // nosso vertor cout vai conter as posições {2, 6, 6, 4, 1, 5}
        int i, val_pos, val; // valor é o 42

        for(i=0; i < v.length; i++){
            val = v[i];
            val_pos = getValPos_int(val, pos);
            count[val_pos]++;
            // em uma linha só: 
            // { count[ getValPos(v[i], pos) ]++ }
        }

        for(i=1; i < count.length; i++){
            count[i] += count[i-1];
        }

        for(i=v.length-1; i>=0; i--){
            val = v[i];
            val_pos = getValPos_int(val , pos);
            count[val_pos]--;
            saida[count[val_pos]] = val;
        }

        return saida;
    }
    
    public static int[] radixSort(int[]v){
        int max, i, n, pos;
        String max_srt;

        if(v.length <=1){
            return v;
        }

        max = v[0];
        for(i =1; i<v.length; i++){
            if(v[i]>max){
                max = v[i];
            }
        }

        max_srt = max + "";
        n = max_srt.length();
        //System.out.println(n);

        for(pos=0; pos<n; pos++){
            v = countingSortPos(v, pos); //se retroalimenta
        }

        return v;

        // o radixSort vai ser muito bom quando os numeros forem pequenos
        // ele possui um for dentro de for
        // depende das casas, com valores de 3 casas vai para 18
        // muito mais rapido que o quickSort com apenas uma casa
        // são sucessivas chamadas a um CoutingSort

    }

    // ---------------------------- EXECUÇÃO ------------------------------------

    public static void main(String[] args) {
        
        /*  EX. COUNTING SORT:
        int[] v = {2,3,5,0,1,4,5,0,0,3,2,5};

        int[] v2 = {25, 12, 15, 07, 02, 27};
        
        int[] resp = counting_Sort(v2);
        

        for (int i = 0; i < resp.length; i++) {
        System.out.println(resp[i]);    
        }
        */

        /*
         
        int[] v = {42, 36, 26, 44, 31, 55};
        int x = 345;
        int p = 15;
        System.out.printf("%d - %d - %d\n", x, p, getValPos_int(x, p));
        
        */

        int[] v = {42, 36, 26, 44, 31, 55};
        //imprimir o normal e imprimir o sorted
        countingSortPos(v, 0);
    

    }
}



