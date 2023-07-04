/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.inicio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;





/**
 *
 * @author lalo
 */
public class Archivo {
    
    public static void main(String[] args) {
        
        FileReader fr = null;
        File f = new File(System.getProperty("usos.dir")+"perro");
        try {
            fr = new FileReader(f);
        } catch (FileNotFoundException ex) {
           
        }
        BufferedReader bf = new BufferedReader(fr);
        String cad = "";
        try {
            while((cad = bf.readLine()) != null){
                System.out.println(cad);
            }
        } catch (IOException ex) {
            
        }
        
}
