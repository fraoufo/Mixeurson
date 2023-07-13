package src.General;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class Keyhandler {
    private boolean toucheZ=false;
    private boolean toucheS=false;
    private boolean toucheQ=false;
    private boolean toucheD=false;
    private boolean touche1=false;
    private boolean touche2=false;
    private boolean touche3=false;
    private boolean espace=false;
    private boolean enter=false;

     public Keyhandler(){
        this.enter=enter;
        this.touche1=touche1;
        this.touche2=touche2;
        this.touche3=touche3;
        this.toucheQ=toucheQ;
        this.toucheS=toucheS;
        this.toucheZ=toucheZ;
        this.toucheD=toucheD;
        this.espace=espace;

    }
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }


    public void keyPressed(KeyEvent e) {
        int  code =e.getKeyCode(); // retourne le keyCode associ� � la touche pressee
        if(code==KeyEvent.VK_Z) {
            toucheZ=true;
        }
        if(code==KeyEvent.VK_S) {
            toucheS=true;
        }
        if(code==KeyEvent.VK_Q) {
            toucheQ=true;
        }
        if(code==KeyEvent.VK_D) {
            toucheD=true;
        }
        if(code==KeyEvent.VK_1){
            touche1=true;
        }
        if(code==KeyEvent.VK_2){
            touche2=true;
        }
        if(code==KeyEvent.VK_3){
            touche3=true;
        }
        if(code==KeyEvent.VK_SPACE){
            espace=true;
        }
        if(code==KeyEvent.VK_ENTER){
            enter=true;
        }
    }


    public void keyReleased(KeyEvent e) {
        int code=e.getKeyCode();

        if(code==KeyEvent.VK_Z) {
            toucheZ=false;
        }
        if(code==KeyEvent.VK_S) {
            toucheS=false;
        }
        if(code==KeyEvent.VK_Q) {
            toucheQ=false;
        }
        if(code==KeyEvent.VK_D) {
            toucheD=false;
        }
        if(code==KeyEvent.VK_1) {
            touche1=false;
        }
        if(code==KeyEvent.VK_2) {
            touche2=false;
        }if(code==KeyEvent.VK_3) {
            touche3=false;
        }
        if(code==KeyEvent.VK_SPACE){
            espace=false;
        }
        if(code==KeyEvent.VK_ENTER){
            enter=false;
        }
    }

    public void setToucheZ(boolean toucheZ) {
        this.toucheZ = toucheZ;
    }

    public void setToucheS(boolean toucheS) {
        this.toucheS = toucheS;
    }

    public void setToucheQ(boolean toucheQ) {
        this.toucheQ = toucheQ;
    }

    public void setToucheD(boolean toucheD) {
        this.toucheD = toucheD;
    }

    public void setTouche1(boolean touche1) {
        this.touche1 = touche1;
    }

    public void setTouche2(boolean touche2) {
        this.touche2 = touche2;
    }

    public void setTouche3(boolean touche3) {
        this.touche3 = touche3;
    }

    public void setEspace(boolean espace) {
        this.espace = espace;
    }

    public void setEnter(boolean enter) {
        this.enter = enter;
    }

    public boolean isToucheZ() {
        return toucheZ;
    }

    public boolean isToucheS() {
        return toucheS;
    }

    public boolean isToucheQ() {
        return toucheQ;
    }

    public boolean isToucheD() {
        return toucheD;
    }

    public boolean isTouche1() {
        return touche1;
    }

    public boolean isTouche2() {
        return touche2;
    }

    public boolean isTouche3() {
        return touche3;
    }

    public boolean isEspace() {
        return espace;
    }

    public  Boolean isEnter() {
        return enter;
    }
}

