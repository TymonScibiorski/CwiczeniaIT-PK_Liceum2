public class Main {
    public static void main(String[] args) {

        System.out.println(cezarCipher("izuf", 5));

    }

    public static String cezarCipher(String encodedPassword, int offset) {
        StringBuilder decodedPassword = new StringBuilder();

        for (char c : encodedPassword.toCharArray()) {
            decodedPassword.append(decodeOneLetter(c, offset));
        }
        return String.valueOf(decodedPassword);

    }

    public static char decodeOneLetter(char letter, int offset) {
        int l = offset;

        if (letter >= 'a' || letter<='z') {
            while (l > 0) {
                if (letter - 1 < 'a') {
                    letter = 'z';
                } else {
                    letter--;
                }
                l--;
            }
        }
        if(letter >= 'A' || letter<='Z') {
            while (l > 0) {
                if (letter - 1 < 'A') {
                    letter = 'Z';
                } else {
                    letter--;
                }
                l--;
            }
        }

        return letter;

        }
    }
