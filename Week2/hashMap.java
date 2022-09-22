import java.util.*;

public class hashMap {
    public static void main(String[] args){
        var hMap = new HashMap<>();
        hMap.put(1,"January");
        hMap.put(2,"Febuary");
        hMap.put(3,"March");
        hMap.put(4,"April");
        hMap.put(5,"May");
        hMap.put(6,"June");
        hMap.put(7,"July");
        hMap.put(8,"August");
        hMap.put(9,"September");
        hMap.put(10,"October");
        hMap.put(11,"November");
        hMap.put(12,"December");
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("請輸入1~12：");
            int month = sc.nextInt();
            if(month < 1 || month > 12){
                System.out.println("範圍錯誤！");
            }else{
                System.out.println("第"+month+"月的英文單字為："+hMap.get(month));
            }
        }catch(Exception e){
            System.err.println("請輸入整數！");
        }
    }
}
