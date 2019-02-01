package util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class FileOperation {


    public  static boolean readFile(String filename, ArrayList<String> words){

        if(null == filename || null == words){

            System.out.println("filename or words is empty");
            return false;
        }


        Scanner scanner;
        try {

            File file = new File(filename);
            if(file.exists()){

                FileInputStream fstream = new FileInputStream(file);
                scanner = new Scanner(new BufferedInputStream(fstream),"UTF-8");
                scanner.useLocale(Locale.ENGLISH);
            }else {


                System.out.println("file not exist:"+ filename);
                return false;

            }


        }catch (IOException ioe){

            System.out.println("readfile:"+filename+"errno ,exp:"+ioe.toString());
            return false;

        }


        if(scanner.hasNextLine()){
            String contents = scanner.useDelimiter("\\A").next();
            int startChar =firstCharIndex(contents,0);


            for (int i = startChar +1 ;i<contents.length() ;){


                if( !Character.isLetter(contents.charAt(i)) ){
                    String word = contents.substring(startChar,i).toLowerCase();
                    words.add(word);
                    startChar = firstCharIndex(contents,i);
                    i = startChar + 1;

                }else
                    ++i;

            }





        }



        return true;

    }

    private static int firstCharIndex(String s,int start){


        for (int i = start ;i<s.length() ;++i){
            if (Character.isLetter(s.charAt(i)))
                return i;

        }
        return s.length();

    }



}
