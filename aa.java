import java.util.Scanner;

public class aa{
 public static void main(String[] args) {
        
    
    String pa;
    Scanner ler = new Scanner(System.in);
    
    System.out.print("Digite uma palavra com 4 letras: ");
    pa = ler.nextLine();
    //if(args.length != 4) {
        //System.out.println("É permitido somente quatro letras, por favor, reiniciar o programa!");
        //System.exit(0); //fechando o programa.
    //}

    pa = pa.replace("B", "C");
    pa = pa.replace("C", "D");
    pa = pa.replace("D", "F");
    pa = pa.replace("F", "G");
    pa = pa.replace("G", "H");
    pa = pa.replace("H", "J");
    pa = pa.replace("J", "K");
    pa = pa.replace("K", "L");
    pa = pa.replace("L", "N");
    pa = pa.replace("N", "M");
    pa = pa.replace("M", "P");
    pa = pa.replace("P", "Q");
    pa = pa.replace("Q", "R");
    pa = pa.replace("R", "S");
    pa = pa.replace("S", "T");
    pa = pa.replace("T", "V");
    pa = pa.replace("V", "W");  
    pa = pa.replace("W", "Y");
    pa = pa.replace("Y", "Z");  
    pa = pa.replace("Z", "Z");
   

    pa = pa.replace("b", "c");
    pa = pa.replace("c", "d");
    pa = pa.replace("f", "g");
    pa = pa.replace("h", "j");
    pa = pa.replace("j", "k");
    pa = pa.replace("k", "l");
    pa = pa.replace("l", "n");
    pa = pa.replace("n", "m");
    pa = pa.replace("m", "p");
    pa = pa.replace("p", "q");
    pa = pa.replace("q", "r");
    pa = pa.replace("r", "s");
    pa = pa.replace("s", "t");
    pa = pa.replace("t", "v");
    pa = pa.replace("v", "w");
    pa = pa.replace("w", "y");
    pa = pa.replace("y", "z");
    pa = pa.replace("Z", "z");






    System.out.println("A palavra altera ficou : " + pa);

    //pa = pa.replace("i", "o");
    //pa= pa.replace("o", "u");
    //pa = pa.replace("u", "u");

    //System.out.println("A palavra altera ficou : " + pa);




    }
}
