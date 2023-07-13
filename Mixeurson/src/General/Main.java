package General;


import src.General.Keyhandler;

public class Main {
    public static void main(String[] args) {

        Window set = new Window();

        set.init();
        Keyhandler keyinput=new Keyhandler();
        while(1==1){
            if(!keyinput.isEnter()) System.out.println("hello");}



        //set.destroy();

    }
}