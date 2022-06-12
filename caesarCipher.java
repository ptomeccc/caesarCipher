package Szyfrowanie;

public class caesarCipher {
    public static void main(String[] args) {
        encrypt("ABCZ",15);
        System.out.println("");
        decrypt("PQRO",15);

    }

    int mod(int x, int n) {
        return ((x % n) + n) % n;
    }

    public static void encrypt(String text, int k) {
        char[] tAlf = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[] tChar = text.toCharArray();
        for (int i = 0; i < tChar.length; i++) {
            for (int j = 0; j < tAlf.length; j++) {
                if (text.charAt(i) == tAlf[j]) {
                    System.out.print(tAlf[(j + k) % 26]);
                }
            }
        }
    }

    public static void decrypt(String text, int k) {
        char[] tAlf = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[] tChar = text.toCharArray();
        for (int i = 0; i < tChar.length; i++) {
            for (int j = 0; j < tAlf.length; j++) {
                if (text.charAt(i) == tAlf[j]) {
                    if(j-k >= 0){
                        System.out.print(tAlf[(j - k)]);
                    }else{
                        System.out.print(tAlf[(j - k) + 26]);
                    }

                }
            }
        }
    }
}
