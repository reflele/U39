import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

public class Task1 {

    public static void main(String[] args) {

//        System.out.println("asd");
//        Date now = new Date();
//        System.out.println(now);
//        String tekst = new String("Der var engang en Mand, han bOede i en spand.");
//
//
//        System.out.println(tekst.toLowerCase());
//
//        int[] numbers = new int[10];
//        numbers[0] = 5;
//        numbers[1] = 10;
//
//        System.out.println(Arrays.toString(numbers));

        int[] sortThese = {8, 9, 1, 5, 11, 13, 7, 4, 6, 3, 12, 10, 2};

        System.out.println(sortThese[0]);
        System.out.println(sortThese[1]);
//        Arrays.sort(sortThese);

        //      while ((sortThese[0] != 1) || (sortThese[12] != 13)) {
        for (int i = 0; i < sortThese.length-1; i++) {
            if (sortThese[i] > sortThese[i + 1]) ;
            {

                int tempValue1 = sortThese[i];
                int tempValue2 = sortThese[i + 1];

                sortThese[i] = tempValue2;
                sortThese[i + 1] = tempValue1;
            }


            System.out.println(Arrays.toString(sortThese));
        }

//            System.out.println(sortThese.length);



        //       }

    }

}




