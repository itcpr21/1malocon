
import java.awt.Component;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class message {
    
    public void message(Component component,String message,String icon){int x=0;
        switch(icon){
            case "information": x=1; break;
            case "warning": x=2; break;
            case "error": x=0;break;
            case "plain": x=-1;break;
            default: x=1;break;
        
    }
    
        JOptionPane.showMessageDialog(component, message,"message",x);
    }
    
}
