package javaapplication1;

import java.io.*;
import java.util.*;

/**
 *
 * @author paulogp
 */
public class JavaApplication1 {

    public static void func_file() {
        File the_file = new File("test.txt");

        if (the_file.exists()) {
            System.err.println("file already exists");
            //System.exit(0);
        } else {
            // create file
            try {
                PrintWriter the_output = new PrintWriter(the_file);

                the_output.println("John T Smith");
                the_output.println("Peter Pan");

                the_output.close();
            } catch (Exception e) {
                System.err.println(e);
            }
        }

        // read data from a file
        try {
            Scanner the_input = new Scanner(the_file);

            String the_line = null;

            while (the_input.hasNext()) {
                the_line = the_input.nextLine();
                System.out.println(the_line);
            }

            the_input.close();
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }

    public static void main(String[] args) {
        func_file();
    }
}