import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCases  = sc.nextInt();

        for(int c = 0 ; c<testCases; c++) {
            int arraySize = sc.nextInt();
            int[] messages = new int[arraySize];
            int totalSum =0;
            boolean  continuous = false;
            
            for (int t = 0; t < arraySize; t++)
                messages[t] = sc.nextInt();

            for (int i = 0; i < messages.length; i++) {
                int j = i + 1;
                if (j < messages.length) {
                    if (!continuous && (messages[i] != messages[j])) {
                        totalSum = totalSum + 2;
                        continuous = true;
                    } else if (continuous && messages[i] != messages[j]) {
                        totalSum = totalSum + 1;
                    }
                    if (messages[i] == messages[j])
                        continuous = false;
                } else
                    break;
            }

            System.out.println(totalSum);
        }
    }

}
