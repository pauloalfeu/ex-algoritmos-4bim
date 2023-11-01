
    import java.util.HashSet;
    class repetidos {

    /*
    N = 1000
    Np = 23
    0 - 364

    np vezes
    datas = 2, 127, 233, 350, 0

    repetidos = 0

    n --- 100%
    rep --- X

        X = (100 * repetidos) / n
    */

   public static int randomInt(int min, int max){
    return (int) ((Math.random()) * (max-min) + min);
   }

   public static void aniverRepetidos(){
    int np = 23; //numero de pessoas
    int n = 100000; // numeros de execuções
    int i, j;
    int repetidos =0;
    float prob;

    HashSet<Integer> datas = new HashSet<Integer>();

    for(i=0; i<n; i++){
        for(j=0; j<np; j++){
            datas.add(randomInt(0, 364));
        }
        if(datas.size()<np){
            repetidos++;
        }

        datas.clear();
    }

    prob = (100 * repetidos)/n;

    System.out.printf("%s.2f\n", prob);
    

   }

   public static void main (String[]args){
    aniverRepetidos();
   }
}