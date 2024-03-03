import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main{

    public static void main(String[]args) {

        String fileName = "C:\\Users\\fortune\\IdeaProjects\\project10\\src\\TextFile";

        try {

            checkFilePopulated(fileName);
            System.out.println("Successfully read.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found:" + e.getMessage());
        } catch (EmptyFileException e) {
            System.out.println("Empty file exception: " + e.getMessage());
        }
    }
                public static void checkFilePopulated(String fileName) throws FileNotFoundException,EmptyFileException {

                    File file = new File(fileName);
                    Scanner scanner = new Scanner(file);

                    if (!scanner.hasNextLine()){

                        throw new EmptyFileException("File is empty.");
                    }

                    scanner.close();


                }

                static class EmptyFileException extends Exception{

        public EmptyFileException(String message){super(message);}
                }

        }









