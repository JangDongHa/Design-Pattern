package etc.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverExample {
    JFrame jFrame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }
    
    public void go() {
        jFrame = new JFrame();
        
        JButton jButton = new JButton("할까 말까");
        jButton.addActionListener(e -> System.out.println("하지마 아마 후회할 걸?")); // register
        jButton.addActionListener(e -> System.out.println("그냥 저질러버렷"));

    }
    
    class AngelListener implements ActionListener{ // observer 1
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("하지마 아마 후회할 걸?");
        }
    }
    
    class DevilListener implements ActionListener{ // observer 2

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("그냥 저질러버렷");
        }
    }
}
