/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runtime;

import java.io.IOException;
import static java.lang.System.gc;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jsf3
 */
public class JSF31_W03_OS_Runtime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              // print when the program starts
              System.out.println("program starting...");
                    // get the current runtime assosiated with this process
                    Runtime run = Runtime.getRuntime();
                          // print the current free memory for this runtime
                    System.out.println("Available processors: "+run.availableProcessors());
                    System.out.println("Available memory: "+run.totalMemory());
                    System.out.println("Max  memory: "+run.maxMemory());
                    System.out.println("Free memory: " + run.freeMemory());
                    long usedMemory = run.totalMemory()-run.freeMemory();
                    System.out.println("Used memory: "+ usedMemory);
                    String s;
                    
                    for (int i=0;i<100000;i++)
                    {
                        s="Hello"+i;
                    }
                     usedMemory = run.totalMemory()-run.freeMemory();
                    System.out.println("Used memory: "+ usedMemory);
                    gc();
                    usedMemory = run.totalMemory()-run.freeMemory();
                    System.out.println("Used memory: "+ usedMemory);
                    
                    System.out.print("Starting process ...");
        try {
            run.exec("/home/jsf3/test");
        } catch (IOException ex) {
            Logger.getLogger(JSF31_W03_OS_Runtime.class.getName()).log(Level.SEVERE, null, ex);
        }
                    
    }
    
}
