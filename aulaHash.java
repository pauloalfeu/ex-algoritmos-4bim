import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

class aulaHash {

    public static void hashMap (){

        HashMap<String, String> capitais = new HashMap<String, String>();
        //HashMap < tipo de dado para busca, tipo de dado armazenado>
        // key, value

        capitais.put("Parana", "Curitiba");
        capitais.put("Santa Catarina", "Florianopolis");
        capitais.put("Rio Grande do Sul", "Porto Alegre");
        capitais.put("Rio de Janeiro", "Rio de Janeiro");
        capitais.put("Amazonas", "Manaus");
        capitais.put("Amapa", "Macapa");
        capitais.put("Goias", "Goiania");

        //System.out.println(capitais.get("Santa Catarina"));

        for(String i : capitais.keySet()){ //
            System.out.println(i + " : " + capitais.get(i)); //imprime a key e o valor dentro dela
        }

    }

    //31-10-23
    // Armazenando apenas chaves

    public static void conjunto(){
        /*Quantas cidades diferentes ele passou
        Roteiro = Cascavel > Toledo > GRamado > Jaragua do Sul > Joinville > 
        Campo Grande > Joinville > Cascavel > Joinville > Guarulhos
        */

        LinkedList<String> roteiro = new LinkedList<String>();
        LinkedList<String> cidades = new LinkedList<String>();
        boolean jah_existe;

        roteiro.add("Cascavel");
        roteiro.add("Toledo");
        roteiro.add("Gramado");
        roteiro.add("Jaragua do Sul");
        roteiro.add("Joinville");
        roteiro.add("Campo Grande");
        roteiro.add("Joinville");
        roteiro.add("Cascavel");
        roteiro.add("Joinville");
        roteiro.add("Guarulhhos");

        for(String i : roteiro){ //percorre o roteiro
            jah_existe = false;
            for(String j : cidades){
                if(i.equals(j)){
                    jah_existe = true;
                    break;
                }

            }
            if(jah_existe == false){
                cidades.add(i);
            }
        }

        System.out.printf("Foram visitadas %d cidades distintas.\n", cidades.size());

    }


    public static void hashKeys(){

        LinkedList<String> roteiro = new LinkedList<String>();
        HashSet<String> cidades = new HashSet<String>();
        boolean jah_existe;

        roteiro.add("Cascavel");
        roteiro.add("Toledo");
        roteiro.add("Gramado");
        roteiro.add("Jaragua do Sul");
        roteiro.add("Joinville");
        roteiro.add("Campo Grande");
        roteiro.add("Joinville");
        roteiro.add("Cascavel");
        roteiro.add("Joinville");
        roteiro.add("Guarulhhos");

        for(String i : roteiro){ // set = conjunto  "um conjunto não pode ter elementos repetidos"
            cidades.add(i);
        }

        System.out.printf("Foram visitadas %d cidades distintas.\n", cidades.size());

    }


    public static int[] elementos_unicos_int(int[] valores){
        //uma função como entrada um vetor de inteiros e saida tem q ser um vetor de inteiros só que sem o valores repetidos
        HashSet<Integer> unique = new HashSet<Integer>();

        for(int i : valores){
            unique.add(i);
        }

        int[] unicos = new int[unique.size()];

        int i=0;
        //declarar um contador int fora e um Integer dentro
        for(Integer u : unique){
            unicos[i] = u;
            i++;
        }

        return unicos;
    }

    public static void printer(int[] valores){
        for(int i=0; i<valores.length; i++){
            System.out.println(valores[i]);
        }
    }

    public static void main (String[]args){
        //hashMap();
        // Hash MAp == Tabelas de dispersão
        //conjunto();
        int [] valores = {10, 9, 9, 7, 9, 10, 7, 8};
        elementos_unicos_int(valores);
        printer(elementos_unicos_int(valores));
    }
}