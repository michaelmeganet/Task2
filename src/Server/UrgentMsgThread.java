/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author Robert
 */
class UrgentMsgThread extends Thread {
    private Server _s;
    private Data data;
    private LinkedList<String> _msgs;

    public UrgentMsgThread(Server server) {
        _s = server;
        data = _s.getData();
        _msgs = (LinkedList<String>) Collections.synchronizedList(new LinkedList<String>());
    }
    
    @Override
    synchronized public void run(){
        
    }
    
    public void send(String msg){
        synchronized(_msgs){
        _msgs.add(msg);
    }}
    
    
}
