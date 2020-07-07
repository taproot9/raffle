import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Raffle {
    public static void main(String[] args) {
        Scanner scan;
        try {
            /**
             * Change the path of your file
             */
            BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Ryan\\IdeaProjects\\raffle\\src\\participants.txt"));
            ArrayList<String> name = new ArrayList<>();
            String line;
            while ((line = in.readLine()) != null) {
                name.add(line);
            }
            in.close();

            /**
             * Original List
             */
            System.out.println("Original List : \n" + name + "\n");


            /**
             * Random Style
             * Random return int
             */

            /**
             * Random
             */
//            Random r = new Random();
//            System.out.println("Random: \n" + name.get(r.nextInt(name.size())));

            /**
             * Math.random
             */
            System.out.println("Random: \n" + name.get((int) (Math.random() * name.size())));

            while (true) {
                System.out.print("q to quit / [enter] to continue: ");
                scan = new Scanner(System.in);
                String choose = scan.nextLine();
                if (choose.equals("q")) {
                    break;
                }

//                Random r1 = new Random();
//                System.out.println("Random: \n" + name.get(r1.nextInt(name.size())));

                /**
                 * Math.random
                 */
                System.out.println("Random: \n" + name.get((int) (Math.random() * name.size())));
            }

//            /**
//             * Shuffle Style
//             */
//            Collections.shuffle(name);
//            System.out.println("\nShuffled List : \n" + name);
//            /**
//             * Get the first item of the list
//             */
//            System.out.println("Shuffle: " + name.get(0));


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
