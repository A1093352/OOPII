import java.awt.FlowLayout;
import java.util.HashMap;
import java.util.List;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class MyJFrame8_3 extends JFrame implements ListSelectionListener {
    private JPanel contentPane;
    private JTextArea jta;
    private JList<String> jli;

    MyJFrame8_3(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setTitle("Taiwanese Mountain!!");
        setBounds(800, 200, 230, 200); 
      
        contentPane = new JPanel();
        contentPane.setLayout(new FlowLayout(FlowLayout.CENTER));
        setContentPane(contentPane);

        JLabel lab1 = new JLabel("找各地名山：");
        add(lab1);
        String[] city = {"台北","宜蘭","桃園","台中","南投","彰化","高雄"};
        
        jli = new JList<>(city);
        JScrollPane jsp1 = new JScrollPane(jli);
        jli.setVisibleRowCount(4);
        add(jsp1);
        jli.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jli.addListSelectionListener(this);
        
        
        jta = new JTextArea("可選取地名...",3,15);
        jta.setLineWrap(true);
        JScrollPane jsp2 = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        add(jsp2);

        setVisible(true);
    
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        String txtShow = "";
        
        var hMap = new HashMap<>();
        hMap.put("台北","七星山");
        hMap.put("宜蘭","鶯子嶺山");
        hMap.put("桃園","大棟山");
        hMap.put("台中","梨山");
        hMap.put("南投","守城大山");
        hMap.put("彰化","八卦山");
        hMap.put("高雄","大崗山");
        List<String> selectedCities = jli.getSelectedValuesList();
        for(String city: selectedCities){
            txtShow += city+" 名山： "+hMap.get(city)+"\n";
        }
         jta.setText(txtShow);
    }
}


public class Mountain{
    public static void main(String[] args) throws Exception{
        MyJFrame8_3 f1 = new MyJFrame8_3();
    }

}
