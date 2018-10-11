/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valasztasok;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diak
 */
public class Tasks {
    
    private List<Election> elections = new ArrayList<>();
  
    public void readFromFile (String fileName){
        try{
        
            BufferedReader in = new BufferedReader(new FileReader(new File(fileName)));
            int line = 0;
            for (String x = in.readLine(); x != null; x = in.readLine()){
                line++;
                System.out.println(x);
                String[] tokens = x.split(" ");
                    Election e = new Election(Integer.parseInt(tokens[0]),Integer.parseInt(tokens[1]),tokens[2],tokens[3],tokens[4]);
                    elections.add(e);
            }
    } catch (IOException e)
        {
            System.out.println("Nem találom a filet!");
        }
    }
}
