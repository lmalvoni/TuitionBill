package MainPackage;
import java.util.Scanner;
import org.apache.poi.ss.formula.functions.FinanceLib;

public class FutureTuition {
	private double term;
	private double Tuition;
	private double loanRate;
	private double APR;
	private double yrsPaid;

	public static void main(String[] args){	
		System.out.println("Input Loan Interest Rate:");
		Scanner keyboard = new Scanner(System.in);

		double loanRate = keyboard.nextDouble();
		System.out.println("Input Number of Total Terms:");
		double term = keyboard.nextDouble();
		System.out.println("Input Total Tuition Cost:");
		double Tuition = keyboard.nextDouble();
		System.out.println("Input fixed APR:");
		double APR = keyboard.nextDouble();
		double PV = FinanceLib.pv(loanRate, term,  Tuition-APR,  0,  false);
		System.out.println("PV = " + Double.toString(PV));
		double PMT = FinanceLib.pmt(Tuition, term,  0, PV,  false);
		System.out.println("PMT = " + Double.toString(PMT));

	}
	double tuition = 12520; 
	int year = 0; {
		while (tuition < 20000){
			year ++;
		}
	}
}