package com;

import java.io.*;

/**
 * @author d.matveenko
 */
public class TextFileToTextFile {

    public static void main(String[] args) {
        File file = new File("D:/data.txt");
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        StringBuilder builder = new StringBuilder();

        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            FileWriter writer = new FileWriter("D:/writeafil.txt");
            bufferedWriter = new BufferedWriter(writer);
            String str = null;
            while ((str = bufferedReader.readLine()) != null) {
                builder.append(str).reverse();
                String completedString = builder.toString();
                bufferedWriter.write(completedString);
                builder = new StringBuilder();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //String completedString = builder.toString();
        //System.out.println(completedString);
    }
}
