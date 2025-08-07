import java.util.Arrays;
import java.lang.StringBuilder;

public class Main {

    public static void main(String[] args) {

        //Variables to validate palindrome in a String[]
        String[] NormalWords = {"Mercedes", "Ferrari","Rolls Royce","Ferrari","Mercedes"};
        String[] ReverseWords =Arrays.copyOf(NormalWords,NormalWords.length);
        boolean isEqual;
        String result;

        // Indice inicia en 0
        for (int i=0; i<NormalWords.length/2; i++) {
            // Es division entera entonces nunca da decimal, en este caso dará un numero menor una unit que le centro
            // El centro nunca lo cuenta ya que siempre se encuentra en el mimso lugar
            int j = NormalWords.length -1 -i;
            // Se obtiene el limite  del array
            //Se resta 1 para manejar el indice
            //Se resta -i para agarrar el valor contrario

            String a = NormalWords[i];
            String b = NormalWords[j];

            NormalWords[i] = b;
            NormalWords[j] = a;

        }

        isEqual = Arrays.equals(NormalWords,ReverseWords);
        result = isEqual ? "It's a palindrome" : "it's not a palindrome";
        System.out.println(result);

    }
}
