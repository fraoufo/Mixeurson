package General;


import javax.swing.*;
import java.awt.*;

public class Window {
    private JFrame window=new JFrame();
    private Dimension screenSize;
    private final int xpostionwindow=0;
    private final int ypostionwindow=0;


    public void init(){
        this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.window.setResizable(true);
        this.window.setTitle("DJMixing");
        this.window.setLocation( xpostionwindow,ypostionwindow);
        this.window.setBackground(Color.red);
        screenReajustement();
        //couleur du fond
        this.window.setVisible(true);

    }
    public void screenReajustement(){
         Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
        this.window.setSize(screenSize.width, screenSize.height);


    }

    public void setWindow(JFrame window) {
        this.window = window;
    }
    public  JFrame getWindow(){
        return window;
    }

    public void destroy() {
        getWindow().dispose();
    }

}
