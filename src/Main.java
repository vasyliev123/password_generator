import java.util.Objects;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String specialSymbols = "@#$%^&*()<>_+/-="; //SS
        String numbers = "0987654321"; //N
        String chars = "qwertyuioplkjhgfdsazxcvbnm";//CH
        String charsCapitals = "QWERTYUIOPASDFGHJKLZXCVBNM";//CHC
        StringBuilder finalString = new StringBuilder("");
        StringBuilder result = new StringBuilder("");

        int length = Integer.parseInt(args[0]);
        for(String s: args)
        {
            if(Objects.equals(s, "SS")) finalString.append(specialSymbols);
            if(Objects.equals(s, "N")) finalString.append(numbers);
            if(Objects.equals(s, "CH")) finalString.append(chars);
            if(Objects.equals(s, "CH")) finalString.append(charsCapitals);
        }
        for(int i=0;i<length;i++)
        {
            Random random = new Random();
            result.append(finalString.charAt(random.nextInt(finalString.length())));
        }
        System.out.println(result);
    }
}
