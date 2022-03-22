public class Quadrilatero {
    //Quadrado
    public static void area(double lado) {
        System.out.println("A área do quadrado é " + lado * lado + "\n");
    }

    //Retângulo
    public static void area(double lado1, double lado2) {
        System.out.println("A área do retângulo é " + lado1 * lado2 + "\n");
    }

    //Trapézio
    public static void area(double baseMaior, double baseMenor, double altura) {
        System.out.println("A área do trapézio é " + ((baseMaior + baseMenor) * altura / 2 +"\n"));
    }

    //Losango
    public static void area(float diagonal1, float diagonal2){
        System.out.println("A área do losango é " +(diagonal1*diagonal2)/2);
    }
}
