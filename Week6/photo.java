
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.*;
import javax.swing.*;
import java.util.Arrays;

class MyPhoto extends JFrame{
	private JPanel contentPane;
	
    MyPhoto(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setTitle("NUK");
        setBounds(800, 200, 270, 350); 
        
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(new FlowLayout());
        
        String[] str = {"NUK.png","M01.png","H01.png","C01.png"};
        JLabel photo1 = new JLabel();
        JLabel photoName = new JLabel(str[0],Label.LEFT);
        photo1.setIcon(new ImageIcon(str[0]));
        
        contentPane.add(photoName);
        contentPane.add(photo1);
        JButton btn1 = new JButton("上一張");
        btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                 if(photo1.getIcon().toString()==str[0]){
                    JOptionPane.showMessageDialog(null, "已經是第一張了","錯誤", JOptionPane.WARNING_MESSAGE);
                 }else{
                    int i = Arrays.asList(str).indexOf(photo1.getIcon().toString());
                    photo1.setIcon(new ImageIcon(str[i-1]));
                    photoName.setText(str[i-1]);
                 }
            }
        });
        contentPane.add(btn1);
        JButton btn2 = new JButton("下一張");
        btn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(photo1.getIcon().toString()==str[str.length-1]){
                    JOptionPane.showMessageDialog(null, "已經是最後一張了","錯誤", JOptionPane.WARNING_MESSAGE);
                 }else{
                    int i = Arrays.asList(str).indexOf(photo1.getIcon().toString());
                    photo1.setIcon(new ImageIcon(str[i+1]));
                    photoName.setText(str[i+1]);
                 }             
            }
        });
        contentPane.add(btn2);
        


        setVisible(true); 
    }
}

public class photo {
    public static void main(String[] args) throws Exception{
        MyPhoto f1 = new MyPhoto();
    }
}
