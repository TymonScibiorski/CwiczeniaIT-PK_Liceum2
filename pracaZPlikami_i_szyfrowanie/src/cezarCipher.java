public class cezarCipher {
    public static String decodeString(String encodedPassword, int offset) { //this function decodes a provided string using a cezarCipher by the provided offset
        StringBuilder decodedPassword = new StringBuilder(); //the string to return. Uses String builder to save resources

        for (char c : encodedPassword.toCharArray()) { //loops through the provided encoded password, one char at a time. String isn't iterable though, so it had to be converted to an Array
            decodedPassword.append(
                    decodeOneChar(c, offset)
            ); //calls the decodeOneChar function, that does the actual decoding, and appends the result to the decodedPassword StringBuilder
        }
        return String.valueOf(decodedPassword);

    }

    public static char decodeOneChar(char letter, int offset) {
        //if the letter is lowercase, it falls into this if. The code is comparing ASCII values
        if (letter >= 'a' || letter<='z') {
            while (offset > 0) {
                if (letter - 1 < 'a') { //if the previous ascii symbol is smaller than 'a' (not in alphabet no mo'), the letter is set to 'z'
                    letter = 'z';
                } else {
                    letter--;
                }
                offset--;
            }
        }

        if(letter >= 'A' || letter<='Z') {
            while (offset > 0) {
                if (letter - 1 < 'A') {
                    letter = 'Z';
                } else {
                    letter--;
                }
                offset--;
            }
        }

        return letter;

    }
}
