/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Robert
 */
public class CmdThread extends Thread {
    private Server _s;
    private boolean q = false;
    
    public CmdThread(Server s){
        _s = s;
    }
    
    @Override
    synchronized public void run() {
        InputStreamReader in = new InputStreamReader(System.in);
        int c;
        while(!q){
            try{
            c = in.read();}
            catch (IOException e){ continue;}
            if(c == (int)'q'){
                q = true;
                _s.setQuit("q");
            }
            if(c == (int)'f'){
                q = true;
                _s.setQuit("f");
            }
        } 
    }
    
}