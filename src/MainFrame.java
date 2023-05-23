/*
* File: MainFrame.java
* Author: Sztana Balázs, SZOFT I-2-E
* Copyright: 2023, Sztana Balázs
* Date: 2023-05-23
*
*/
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
    InputPanel aSide;
    InputPanel bSide;
    InputPanel cSide;
    JPanel buttonPanel;
    JButton calcButton;
    InputPanel terfogat;
    
    public MainFrame() {
        this.initComponent();
        this.addComponent();
        this.handleEvent();
        this.setFrame();
    }
    private void initComponent() {
        this.aSide = new InputPanel("A oldal");
        this.bSide = new InputPanel("B oldal");
        this.cSide = new InputPanel("C oldal");
        this.buttonPanel = new JPanel();
        this.calcButton = new JButton("Számít");
        this.terfogat = new InputPanel("Térfogat");
    }
    private void addComponent() {
        this.add(this.aSide);
        this.add(this.bSide);
        this.add(this.cSide);
        this.add(this.buttonPanel);
        this.add(this.terfogat);
        this.buttonPanel.add(this.calcButton);
    }
    private void handleEvent() {
        this.calcButton.addActionListener( e -> {
            startCalc();
        });
    }
    private void startCalc() {
        String aSideStr = this.aSide.getValue();
        if(!this.checkInput(aSideStr)) {
            JOptionPane.showMessageDialog(this, "Csak számjegy");
            return;
        }
        double aSide = Double.parseDouble(aSideStr);
        String bSideStr = this.bSide.getValue();
        if(!this.checkInput(bSideStr)) {
            JOptionPane.showMessageDialog(this, "Csak számjegy");
            return;
        }        
        double bSide = Double.parseDouble(bSideStr);
        String cSideStr = this.cSide.getValue();
        if(!this.checkInput(cSideStr)) {
            JOptionPane.showMessageDialog(this, "Csak számjegy");
            return;
        }        
        double cSide = Double.parseDouble(cSideStr);
        Double terfogat = this.calcTerfogat(aSide, bSide, cSide);
        this.terfogat.setValue(terfogat.toString());
    }

    public double calcTerfogat(double aSide, double bSide, double cSide) {
        return aSide * bSide * cSide;
    }

    public boolean checkInput(String input) {
        boolean ok = false;
        if(input.matches("[0-9.]+")) {
            ok = true;
        }
        return ok;
    }

    private void setFrame() {
        this.setLayout(new BoxLayout(
            this.getContentPane(), BoxLayout.PAGE_AXIS)
        );
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // this.setSize(300, 200);
        this.pack();
        this.setVisible(true);
    }
    
}
