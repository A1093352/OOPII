import java.util.*;

public class treeSet{
    public static void main(String[] args){
        int N = 1, randNum = 0;
        var tSet= new TreeSet<>();
        Random random = new Random();
        System.out.println("電腦從1~100的整數中，亂數取出10個不重複的號碼.....");
        while(N <= 10){
            randNum = random.nextInt(100)+1;
            if(!tSet.contains(randNum)){
                tSet.add(randNum);
                System.out.println("第"+N+"個號碼："+randNum);
                N++;
            }
        }
        System.out.println("物件内元素個數為："+(N-1));
        System.out.println("物件内元素的内容："+tSet);
        System.out.println("第一個元素内容為："+tSet.first());
        System.out.println("最後一個元素内容為："+tSet.last());
        System.out.println("内容介於30~70者："+tSet.subSet(30, 71));


    }

}