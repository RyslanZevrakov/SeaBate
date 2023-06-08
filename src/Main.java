import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            List<Integer> stroke = new ArrayList<>();

            for (int k = 0; k < 10; k++) {
                int randomNumber = (int) (Math.random() * 2);

                stroke.add(randomNumber);
            }
            arr.add(stroke);
        }

        for (List<Integer> stroke : arr) {
            System.out.println(stroke);
        }
    }
    }