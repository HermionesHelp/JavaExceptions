package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        // try catch block -> close was placed inside the try block instead of using a finally
//        try {
//            Scanner input;
//            File file = new File("myfile.txt");
//            input = new Scanner(file);
//
//            while (input.hasNextLine()) {
//                String line = input.nextLine();
//                System.out.println(line);
//            }
//            input.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

        // try catch with finally
//        Scanner scanner = null;
//        try{
//            scanner = new Scanner(new File("newFile.txt"));
//            while(scanner.hasNext()){
//                System.out.println(scanner.nextLine());
//            }
//        }catch (FileNotFoundException e){
//            e.printStackTrace();
//        }finally {
//            if(scanner != null){
//                scanner.close();
//            }
//        }

        // try with resources
//        try (Scanner input = new Scanner(new File("test.txt"))){
//            while (input.hasNextLine()) {
//                String line = input.nextLine();
//                System.out.println(line);
//            }
//        }catch (FileNotFoundException e){
//            e.printStackTrace();
//        }

        // Throws declaration from another class
//        try {
//            System.out.println(MyFileUtils.subtract10FromLargerNumber(9));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }
}
