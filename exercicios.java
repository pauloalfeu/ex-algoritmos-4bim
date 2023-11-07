import java.util.HashMap;

class exercicios {

    public static void hashMap (){

        HashMap<String, Integer> palavrasMap = new HashMap<String, Integer>();
        //HashMap < tipo de dado para busca, tipo de dado armazenado>
        // key, value

        String texto = "outro rato roeu a roupa de um outro rato";

        String[] vetorPalavras = texto.split(" "); //para separar as palavras da frase
        int contador =1;
        for(int i=0; i < vetorPalavras.length; i++){
            if (palavrasMap.containsKey(vetorPalavras[i])) {
                palavrasMap.put(vetorPalavras[i], contador + 1);
            } else {
                palavrasMap.put(vetorPalavras[i], contador);
            }
        }

        for(String i : palavrasMap.keySet()){ //
            System.out.println(i + " : " + palavrasMap.get(i)); //imprime a key e o valor dentro dela
        }

    }


    public static void main (String[]args){
        hashMap();
    }
}