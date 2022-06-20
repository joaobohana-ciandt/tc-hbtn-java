public class Caractere {
    public static boolean EhMaiusculo(char c){
        int charToNum = c;
        if(charToNum >= 65 && charToNum <= 90){
            return true;
        }

        return false;
    }
}
