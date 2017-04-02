/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5.construction;
//package com.Maimoona Khalid.csv;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author mkhalid.bese14seecs
 */
public class LAB5Construction {

    /**
     * @param args the command line arguments
     */


    public static void main(String[] args) {

        String MyCSVfile = "C:\\Users\\mkhalid.bese14seecs\\Desktop\\GeoLiteCity-Location.csv";
        BufferedReader br = null;
        String line = "";
        String csvSplitter = ",";

        try {

            br = new BufferedReader(new FileReader(MyCSVfile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] country = line.split(csvSplitter);

                System.out.println("Country [code= " + country[4] + " , name=" + country[5] + "]");

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
