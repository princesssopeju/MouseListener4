import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener {
    JLabel label;

    ImageIcon sadImage;
    ImageIcon happyImage;
    ImageIcon confusedImage;
    ImageIcon angryImage ;
    MyFrame(){
        sadImage = new ImageIcon("sad.jpg");
        happyImage = new ImageIcon("happy.jpg");
        confusedImage = new ImageIcon("confused.png");
        angryImage = new ImageIcon("angry.png");

        label = new JLabel();
        label.addMouseListener(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);



        label.setBounds(0,0,100,100);
        label.setBackground(Color.BLUE);
        label.setOpaque(true);


        this.addMouseListener(this);
        label.addMouseListener(this);


        this.add(label);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("You clicked the mouse");
        label.setIcon(angryImage);

    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("You Pressed the mouse");
        label.setIcon(angryImage);

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("You Released the Mouse");
        label.setIcon(confusedImage);

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("You Entered the Component");
        label.setIcon(happyImage);


    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("You exited the Component");
        label.setIcon(sadImage);

    }
}
