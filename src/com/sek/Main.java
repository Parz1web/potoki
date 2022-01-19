package com.sek;

import java.io.*;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) throws IOException {
        //Найти кол-во 2значных
        //com.sek.People name age

        People[] peoples = new People[3];
        peoples[0] = new People("Томас",12);
        peoples[1] = new People("Бегемот", 15);
        peoples[2] = new People("Филипп",17);


        File file = new File("peoples.txt");

        FileWriter fileWriter = new FileWriter(file);



        for (People str: peoples){
            fileWriter.write(str.toString()+"\n");
        }

        fileWriter.flush();
        fileWriter.close();






        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String str;

        People[] peoplesEnd = new People[3];
        int i = 0;
        int sum = 0;

             while((str = bufferedReader.readLine()) != null)
             {
                 String[] mass = str.split(",");

                 peoplesEnd[i] = new People(mass[0], Integer.parseInt(mass[1]));
                 i++;
                 sum += Integer.parseInt(mass[1]);
             }

        System.out.println(sum/ peoplesEnd.length);


    }
}
