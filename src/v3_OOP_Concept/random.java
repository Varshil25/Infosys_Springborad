package v3_OOP_Concept;

public class random {
           public static void main(String[] args) {
            if (args.length > 0) {
                int x = Integer.parseInt(args[0]);
                int y = x;
                x--;
                x++;
                System.out.println((x == y));
            } else {
                System.out.println("No command line arguments provided.");
            }
        }
    }


