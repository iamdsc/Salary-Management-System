import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.print.*;
 
public class PrintUIWindow implements Printable, ActionListener {
 
    JFrame frameToPrint;
 
    public int print(Graphics g, PageFormat pf, int page) throws
                                                        PrinterException {
 
        if (page > 0) { 
            return NO_SUCH_PAGE;
        }
 
        Graphics2D g2d = (Graphics2D)g;
        g2d.translate(pf.getImageableX(), pf.getImageableY());
 
       
        frameToPrint.printAll(g);
 
        return PAGE_EXISTS;
    }
 
    public void actionPerformed(ActionEvent e) {
         PrinterJob job = PrinterJob.getPrinterJob();
         job.setPrintable(this);
         boolean ok = job.printDialog();
         if (ok) {
             try {
                  job.print();
             } catch (PrinterException ex) {

             }
         }
    }
 
    public PrintUIWindow(JFrame f) {
        frameToPrint = f;
    }
 
    public static void main(String args[]) {
        UIManager.put("swing.boldMetal", Boolean.FALSE);
        JFrame f = new JFrame("Print UI Example");
        f.addWindowListener(new WindowAdapter() {
           public void windowClosing(WindowEvent e) {System.exit(0);}
        });
        JTextArea text = new JTextArea(50, 20);
        JScrollPane pane = new JScrollPane(text);
        pane.setPreferredSize(new Dimension(250,200));
        f.add("Center", pane);
        JButton printButton = new JButton("Print This Window");
        printButton.addActionListener(new PrintUIWindow(f));
        f.add("South", printButton);
        f.pack();
        f.setVisible(true);
    }
}