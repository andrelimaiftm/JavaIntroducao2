import javax.swing.JOptionPane;


public class App {
    public static void main(String[] args) throws Exception {
        //Operados Matemáticos
        // + = soma
        // - = subtração
        // * = multiplicação
        // / = divisão
        // % = modulo (resto de uma divisão)
        // ++ incremento
        // -- decremento

        int resultado = 0;
        double resultado2 = 0.0d;
        String numero = " ";
        int x = 3;
        int y = 4;
        float w = 3.5f;
        float z = 10.0f;
        double a = 14.5d;
        double b = 20.0d;

        //operação de soma
        //resultado = 3 + 4;
        //resultado = x + y; 
        
        /*numero = JOptionPane.showInputDialog(null, "Digite um numero:");
        w = Float.parseFloat(numero);

        numero = JOptionPane.showInputDialog(null, "Digite um numero:");
        z = Float.parseFloat(numero);

        float resultado = w + z;

        JOptionPane.showMessageDialog(null,resultado,"Operação de Soma",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, resultado);*/

        /*numero = JOptionPane.showInputDialog(null, "Digite um numero:");
        a = Double.parseDouble(numero);

        numero = JOptionPane.showInputDialog(null, "Digite um numero:");
        b = Double.parseDouble(numero);

        double result =  a + b;
        JOptionPane.showMessageDialog(null, result);*/

        // subtração
        //resultado = y - x;
        //JOptionPane.showMessageDialog(null, resultado);
        
        //multiplicação
        //resultado = x*y;
        //JOptionPane.showMessageDialog(null, resultado);
        
        //Casting =  conversação de tipos, Ex: Int -> float, float -> double
        //Casting automatic (Widening Casting)
        //byte -> short -> char -> int -> long -> float -> double

        //Narrowing Casting -> converter tipos de dados maiores em tipo de dados menores
        //double -> float -> long -> int -> char -> short -> byte
        //float result = (float) resultado2;

        //divisão        
        //resultado2 = (float) x/y;
        //JOptionPane.showMessageDialog(null, resultado2);

        //Modulo (%)
        //resultado = x % y;
        //resultado = 15 % 4;
        //JOptionPane.showMessageDialog(null, resultado);

        //incremento(++)
        int contador = 1;
        /*JOptionPane.showMessageDialog(null, contador);
        //contador = contador + 1;
        contador++;
        JOptionPane.showMessageDialog(null, contador);
        //contador = contador + 1;
        contador++;
        JOptionPane.showMessageDialog(null, contador);*/

        /*contador = 2;
        JOptionPane.showMessageDialog(null, contador);       
        //contador = contador -1;
        contador--;
        JOptionPane.showMessageDialog(null, contador);
        //contador = contador -1;
        contador--;
        JOptionPane.showMessageDialog(null, contador);*/

        
        //JOptionPane.showMessageDialog(null, contador++);
        //System.out.println(contador);

        //JOptionPane.showMessageDialog(null, ++contador);
        //System.out.println(contador);

        //System.out.println(contador);
        //contador+=2;
       // contador*=2; 
        //System.out.println(contador);
        //contador+=2;
        //contador*=2;
        //System.out.println(contador);
        
        //biblioteca Math        
        //abs -> retorna o valor absoluto -4.7 -> 4.7
        //resultado2 = Math.abs(-4.7);
        //System.out.println(resultado2);        
        //sqrt -> retorno o resultado da raiz quadrada do numero informado
        //System.out.println(Math.sqrt(100));
        
        //PI -> valor de PI pré-definido
        //System.out.println(Math.PI);
        //pow -> exponenciação
        //System.out.println(Math.pow(2, 3));
        //max -> maximo de 2 numeros
        //System.out.println(Math.max(3, 2));
        
        //resultado2 = 2 + 3 * 5 - 4 / 2 + 7;
        //2 + 15 - 2 + 7
        //17 - 2 + 7
        // 15 + 7
         // 22

         //resultado2 = 2 + 3 * x -4 / y + 7;

         //resultado2 = (float)(2+3)*(5-4)/2+7;
        // 5 * 1/2+7
        //System.out.println(resultado2);

        //resultado2 = (2 + 3) * ((5 - 4 / 2) + 7);
        // (2+3)*((5-2)+7)
        // (2+3)*(3+7)
        // (5)*(10)
        //  50
        //System.out.println(resultado2);

        //Operadores de comparação
        // == igual a
        // != diferente de
        // > maior que
        // < menor que
        // <= menor igual
        // >= maior igual
        boolean comparacao = true;
        //operador de igualdade
        /*comparacao = 2 == 3;
        System.out.println(comparacao);
        comparacao = 2 == 2;
        System.out.println(comparacao);

        //operação de diferença
        comparacao = 2 != 3;
        System.out.println(comparacao);
        comparacao = 2 != 2;
        System.out.println(comparacao);*/

        //operação de menor que ou menor igual
        /*comparacao = 2 < 3;
        System.out.println(comparacao);
        comparacao = 2 <= 3;
        System.out.println(comparacao);
        comparacao = 3 <= 3;
        System.out.println(comparacao);
        comparacao = 4 <= 3;
        System.out.println(comparacao);*/

        //operação de maior que ou maior igual
        /*comparacao = 4 > 3;
        System.out.println(comparacao);
        comparacao = 3 >= 3;
        System.out.println(comparacao);
        comparacao = 2 >= 3;
        System.out.println(comparacao);*/

        //Operadores Logicos (E ou AND, OU OR, ! ou not)
        //(E -> &&)
        // A    | B         | A && B 
        // true | true      |  true
        // true | false     |  false
        // false| true      |  false
        //false | false     |  false
                    //true && true
        //comparacao = 2 != 3 && 2 <= 3;
        //System.out.println(comparacao);
                    //false && true          
        //comparacao = 2 == 3 && 2 <= 3;
        //System.out.println(comparacao);
        //(OU -> ||)
        // A    | B         | A || B 
        // true | true      |  true
        // true | false     |  true
        // false| true      |  true
        //false | false     |  false
        
                    //true  || true
        //comparacao = 2 != 3 || 2 <= 3;
        //System.out.println(comparacao);
                    //false || true
        //comparacao = 2 == 3 || 2 <= 3;
        //System.out.println(comparacao);
                    //false || false
        //comparacao = 2 == 3 || 2 >= 3;
        //System.out.println(comparacao);

        //(Not -. !)
        // A    | !A
        // true | false
        //false | true
                   //!( false || false) 
                   //!(false)
                   // true
        //comparacao = !(2 == 3 || 2 >= 3);
        //System.out.println(comparacao);     
    }
}
