import javax.swing.*;

public class home {
    public static void main(String[] args){
        SwingUtilities.invokeLater( new Runnable(){
            public void run(){
                JFrame frame = new JFrame("IIIT KALYANI");
                frame.setSize(800,600);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}

