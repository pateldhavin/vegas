import java.util.Scanner;
public class AuntVickie {
	public static void main (String[] args) {
		int numQuarters = quarterInput();
		int fmachQuar = 25;
		int smachQuar = 75;
		int tmachQuar = 5;
		int counterForF = 0; 
		int counterForS = 0;
		int counterForT = 0;
		int counter = 0;
		
		while(numQuarters > 0) {
		counter++;
		counterForF++;
		numQuarters--;
		numQuarters = forFirstPlay(numQuarters, counterForF, fmachQuar);
		
		counter++;
		counterForS++;
		numQuarters--;
		numQuarters = forSecondPlay(numQuarters, counterForS, smachQuar);
		
		counter++;
		counterForT++;
		numQuarters--;
		numQuarters = forThirdPlay(numQuarters, counterForT, tmachQuar);
		
			
		}
		System.out.println("Number of times played = "+ counter);
	 }
	

  public static int forFirstPlay(int numQuarters, int counter, int fmachQuar) {
	  int numQ = numQuarters;
	  double amount;
	  if(counter%35 == 0) {
		  System.out.println("Chance = " +counter);
		  numQ = numQuarters + fmachQuar;
		  amount = numQ * 0.25;
		  System.out.println("Number of Machine = 1 \n Amount won = " +fmachQuar * 0.25 + " Number of quarters remaining= " + numQ + " Total money left= $" + amount);
		  
	  }
	 return numQ; 
  }


  public static int forSecondPlay(int numQuarters, int counter, int smachQuar) {
	  int numQ = numQuarters;
	  double amount;
	  if(counter%100 == 0) {
		  System.out.println("Chance=" + counter);
		  numQ = numQuarters + smachQuar;
		  amount = numQ * 0.25;
		  System.out.println("Number of Machine = 2 \n Amount won = " + smachQuar * 0.25 + " Number of quarters remaining= " + numQ + " Total money left = $" + amount);
	  }
	  return numQ;
  }
  
  public static int forThirdPlay(int numQuarters, int counter, int tmachQuar) {
int numQ=numQuarters;
double amount; 
if(counter % 8 == 0) {
	System.out.println("Chance ="+ counter);
	numQ = numQuarters + tmachQuar;
	amount = numQ * 0.25;
	System.out.println("Number of Machine = 3 \n Amount won = " + tmachQuar * 0.25 + " Number of quarters remaining= " + numQ + " Total money left= $" +amount);
}
return numQ;
  }
  public static int quarterInput() {
	  Scanner scanner = new Scanner(System.in);
	  int numQuarters;
	  System.out.println("Enter the number of quarters in Vickie's jar");
	  numQuarters = scanner.nextInt();
	  return numQuarters;
  }

}	  
	
  
  







