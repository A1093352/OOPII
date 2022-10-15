package OOPII;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class MyJFrame extends JFrame{
	private JTextField input;
	private JPanel contentPane;
	
	
	MyJFrame(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setTitle("計算機");
		setBounds(800, 200, 300, 450);
		setVisible(true);
		
		contentPane = new JPanel(new GridLayout(5,3,5,5));
        input = new JTextField(30);
        input.setBorder(BorderFactory.createEmptyBorder(9, 9, 9, 9));
        contentPane.add(input);
        
        String[] str = {"7","8","9","4","5","6","1","2","3","+","0","-","x","=","/"};
        JButton[] btn = new JButton[str.length];
        for(int i = 0 ; i < str.length ; i++) {
        	btn[i] = new JButton(str[i]);
//        	btn[i].addActionListener(new ActionListener(){
//        		public void actionPerformed(ActionEvent e) {
//        			JOptionPane.showMessageDialog(null, btn[i].getText());
//            	}
//        	});
        	contentPane.add(btn[i]);
        }
              
        getContentPane().add(input, BorderLayout.NORTH);
        getContentPane().add(contentPane, BorderLayout.CENTER);

        
	}
}

	
public class Caluculator {
	public static void main(String[] args) throws Exception{
		MyJFrame f1 = new MyJFrame();

	}

}
