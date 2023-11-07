import java.util.Stack;

class Posfixa {
    public static void printSplit(){
        int i;
        String entrada = "5 4 *";

        String[] tokens = entrada.split(" ");

        for(i=0; i<tokens.length; i++){
            System.out.println(tokens[i]);

        }
    }

    public static void prilhaCalculadora(){

        //System.out.println.Integer.parseInt(valor+20);
        Stack<Integer> pilha = new Stack<Integer>();
        int i, op1, op2, res;

        String expressao = "5 3 + 2 4 * + 6 7 * 1 - +";
        String[] tokens = expressao.split(" ");

        for(i=0; i<tokens.length; i++){

            switch(tokens[i]){
                case "+":
                    if(pilha.empty()){System.out.println("Expressão inválida!"); System.exit(1);};
                    op2 = pilha.pop();
                    if(pilha.empty()){System.out.println("Expressão inválida!"); System.exit(1);};
                    op1 = pilha.pop();
                    res = pilha.push(op1 + op2);
                    break;

                case "-":
                    if(pilha.empty()){System.out.println("Expressão inválida!"); System.exit(1);};
                    op2 = pilha.pop();
                    if(pilha.empty()){System.out.println("Expressão inválida!"); System.exit(1);};
                    op1 = pilha.pop();
                    res = pilha.push(op1 - op2);
                    break;
                
                case "*":
                    if(pilha.empty()){System.out.println("Expressão inválida!"); System.exit(1);};
                    op2 = pilha.pop();
                    if(pilha.empty()){System.out.println("Expressão inválida!"); System.exit(1);};
                    op1 = pilha.pop();
                    res = pilha.push(op1 * op2);
                    break;
                
                default:
                pilha.push(Integer.parseInt(tokens[i]));
                    
            }
        }

        if(!pilha.empty()){
            if(pilha.empty()){System.out.println("Expressão inválida!"); System.exit(1);};
            res = pilha.pop();
            System.out.println();
            System.out.println(expressao + " == " + res);
            System.out.println();
            
        } else {
            System.out.println();
            System.out.println("expressão inválida!");
            System.out.println();
        }
            


    }

    public static void main (String[]args){
        prilhaCalculadora();
    }
}