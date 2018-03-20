package engine;

import java.lang.Math.*;

public class CreditCalculation {
	// kwota kredytu - loanAmount
	// oprocentowanie - interest
	// op³ata sta³a - fixedFee
	// ioœæ rat - installmentsCount
	private double loanAmount, interest, fixedFee; 
	private int installmentsCount; 
	
	public CreditCalculation (String loanAmount, String installmentsCount, String interest, String fixedFee) {
		this.loanAmount = Double.parseDouble(loanAmount);
		this.installmentsCount = Integer.parseInt(installmentsCount);
		this.interest = Double.parseDouble(interest);
		this.fixedFee = Double.parseDouble(fixedFee);
	}
	
	// Oblicz kwote raty stalej
	public double fixedInstallment () {
		double factor = 1+interest/100/12;
		double factorToInstallmentNbr = Math.pow(factor, installmentsCount);
		return Math.round((loanAmount+fixedFee) * (factorToInstallmentNbr) * (factor -1) / (factorToInstallmentNbr - 1));
	}
	
	// oblicz kwote raty malejacej
	public double decreasingInstallment (int installmentNbr) {
		return Math.round((loanAmount + fixedFee)/installmentsCount*(1 + (installmentsCount - installmentNbr +1)*interest/100/12));
	}
	
}
