package com.sek;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        //Найти кол-во 2значных

        File file = new File("test.txt");

        if(file.exists())
        {
            System.out.println("exist");}
        else
        {
            System.out.println("not");
        }


        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String str;
        int sum = 0;

        while((str = bufferedReader.readLine()) != null)
        {
            if(str.length() == 2){
                sum++;
            }
            else{
                continue;
            }
        }

        System.out.println(sum);
    }
}
