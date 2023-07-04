/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.ejemplos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.file.FileSystemNotFoundException;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lalo
 */
public class TablaDispersionArchivo {

    public static void main(String[] args) {
        File f = new File(System.getProperty("user.dir") + "/Quijote.txt");
        Set<String> palabras = new HashSet<String>();
        try {
            InputStreamReader in = new InputStreamReader(new FileInputStream(f), "UTF-8");
            BufferedReader buf=new BufferedReader(in);
            String cadena= "";
            while((cadena=buf.readLine())!=null){
                String [] palabra=cadena.split(" ");
                for (int i = 0; i < palabra.length; i++) {
                    palabras.add(palabra[i]);
                }
            }
            System.out.println("total de palabras " + palabras.size());
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            Logger.getLogger(TablaDispersionArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
