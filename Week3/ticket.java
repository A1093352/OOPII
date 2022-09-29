import java.util.*;

class ticketClass implements Runnable{
	
	static int tickets = 10000;
	int pTickets;
	Thread t;
	
	ticketClass(String machine){
		pTickets = 0;
		t = new Thread(this, machine);
		t.start();
	}
	
	public void run() {
        Random rand = new Random();
        int randNum = rand.nextInt(4)+1;
	for(int i = 1 ; i <= randNum ; i++){
            while(sellTickets()) {
                pTickets++;
            }
        }
	System.out.println(t.getName()+"買到"+pTickets+"張高鐵票"); 
	}
	
	private synchronized static boolean sellTickets(){
		if(tickets > 0) {
			tickets--;
			return true;
		}else
			return false;
	}
	
	
}

public class ticket {

	public static void main(String[] args) {
		ticketClass mA = new ticketClass("機器A");
		ticketClass mB = new ticketClass("機器B");
		ticketClass mC = new ticketClass("機器C");
		ticketClass mD = new ticketClass("機器D");
	}

}
