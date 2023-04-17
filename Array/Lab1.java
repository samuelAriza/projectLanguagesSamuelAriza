//Import libraries
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Class Lab1
class Lab1{
  //Static block to load the shared library
  static{
    System.loadLibrary("ArithmeticMean");
  }
  //Declare native method called getArithmeticMean
  private native double getArithmeticMean(int[] arrayNumbers);
  //Main function
  public static void main(String[] args){
    /*
     * Object arraylist containing Integer elements called array.
     * 
     * It is created this way because there is no knowledge 
     * of the array size.
    */
    List<Integer> array = new ArrayList<Integer>();
    /*
     * Variable number initialized to 0 and which will subsequently
     * take each value of each integer in the array
     * of integers read from the file.
    */
    int number = 0;
    /*
     * Create a new File object to which the first element coming from
     * the command line is sent as a parameter.
    */
    File f = new File(args[0]);
    
    /*
     * Scanner object called "input", which is used to
     * read the file from the variable f.
    */
    try (Scanner entrada = new Scanner(f)){
      /*
       * Each line of the file is read using the hasNextLine() method 
       * of the Scanner object.
      */
      while(entrada.hasNextLine()){
      /*
       * The value read is take and assigned to the variable number, 
       * wich is converted to an Integer object using the
       * valueOf() method.
      */
      number = entrada.nextInt();
      //Adding number to the list of integers
      array.add(Integer.valueOf(number));
      }
      //Declare integer array of the same size as the Integer list
      int[] arrayOfNumbers = new int[array.size()];
      /*
       * Loop to add each element of the array list
       * to the arrayOfNumbers array.
      */
      for (int i = 0; i < array.size(); i++){
        arrayOfNumbers[i] = array.get(i);
      }
      /*
       * Create a new instance of the Lab1 class and call the 
       * getArithmeticMean method, with arrayOfNumbers
       * as the parameter
      */
      new Lab1().getArithmeticMean(arrayOfNumbers);
      /*
       * If an FileNotFoundException exception occurs within the try block, 
       * the exceptionis caught and the catch block is executed.
      */
    }catch(FileNotFoundException e){
      //Print error message by console 
      System.out.println(e.toString());
    }
  }
}
