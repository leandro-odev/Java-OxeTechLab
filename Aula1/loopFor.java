import java.util.Scanner;

public class loopFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float media = 0;
        for (int i = 0; i < 10; i++) {
            float num = input.nextFloat();
            if (i == 0)
            {
                media = num;
            }
            else media = (media + num)/2;
        }
        System.out.println(media);

        input.close();
    }
}
