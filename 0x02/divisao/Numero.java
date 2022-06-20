public class Numero {
    public static void dividir(int a, int b){
        int res = 0;
        try{
            res = a / b;
        } catch (ArithmeticException exception){
            System.out.println("Nao eh possivel divir por zero  ");
        } finally {
            System.out.println(a + " / " + b + " = " + res);
        }
    }
}