import java.io.*;
import java.util.Arrays;

public class CipherTest {
    public static void main(String[] args) throws IOException {

        File file = new File("Cipher.txt");
        try {
            BufferedReader bfr = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bfr.readLine()) != null) {
                String lineUperCase = line.toUpperCase();
                String[] words = lineUperCase.split(" ");
                String[] signs = line.split("");
                String[] encrypt = encrypt(signs, 2);
                System.out.println(Arrays.toString(encrypt));
            }
//
//                    if (words[i] + key <= alphabet)
//                        tab[i] += klucz;
//                    else
//                        tab[i] = tab[i] + klucz - 26;
//                else if (tab[i] + klucz >= a)
//                    tab[i] += klucz;
//                else
//                    tab[i] = tab[i] + klucz + 26;

//
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        } catch (
                IOException e) {
            e.printStackTrace();
        }


//        String sentenceOriginal = "Ala ma kota";
//System.out.println(sentenceOriginal);
//String sentenceUpperCase = sentenceOriginal.toUpperCase();
//System.out.println(sentenceUpperCase);


    }

    private static String[] encrypt(String[] signs, int key) {
        String[] alphabet = new String[]{"A", "Ą", "B", "C", "Ć", "D", "E", "Ę", "F", "G", "H", "I", "J", "K", "L", "Ł",
                "M", "N", "O", "Ó", "P", "R", "S", "Ś", "T", "U", "W", "X", "Y", "Z",};
        if (!(key >= -30 && key <= 30)) {
            for (int i = 0; i < alphabet.length; i++)
                for (int j = 0; j < alphabet.length; j++) {
                    if (signs[i].equals(alphabet[j])) {
                        signs[i] = alphabet[j + 2];
                    }
                    return signs;
                }
            return signs;
        }
        return signs;
    }
}
