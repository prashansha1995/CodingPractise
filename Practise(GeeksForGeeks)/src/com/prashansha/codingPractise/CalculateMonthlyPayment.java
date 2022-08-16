package com.prashansha.codingPractise;

import java.text.DecimalFormat;

public class CalculateMonthlyPayment {

	public static void main(String[] args) {
		
		CalculateMonthlyPayment cf=new CalculateMonthlyPayment();
		cf.add(3);
		
		
//      double monthlyPaymentHp = 700;
//      double shadowLimit = 700;
//      int term = 48;
//      double apr = 0.034; // call existing formula getApr() with totalDeposit = 0 and loanAmount = shadowLimit * term
//      double aprFP = 0.044;
//      System.out.println("shadowLimit: " + shadowLimit);
//      System.out.println("term: " + term);
//      System.out.println("apr: " + apr);
//      System.out.println("aprFP: " + aprFP);
//      double monthlyInterestRate =  getMonthlyInterestRate(apr);
//      double monthlyInterestRateFP =  getMonthlyInterestRate(aprFP);
//
//      String ufeHp = getUFEHp(monthlyInterestRate, shadowLimit, term);
//      System.out.println("ufeHp: " + ufeHp);
//      double depreciationFactor=0.223;
//      double residualValueFP=getResidualValueFP( depreciationFactor,shadowLimit,term);
//      String ufeFp = getUFEFp(residualValueFP,monthlyInterestRateFP, shadowLimit, term);
//      System.out.println("ufeFp: " + ufeFp);
  }
	
//	public void add (double d) {
//		System.out.println("double "+d);
//	}

//	public void add(int a)
//	{
//		System.out.println("int"+a);
//	}
	
//	public void add(Integer a)
//	{
//		System.out.println("Integer "+a);
//	}
//    public void add (float  d) {
//		System.out.println("float "+d);
//
//	}
    
    public void add (Object d)
    {
		System.out.println("Object "+d);
	
    }

  private static double getResidualValueFP(double depreciationFactor, double priceOfCar, int term) {
		double monthlyDepreciation = Math.pow(1 - depreciationFactor, 1 / 12f) - 1;
	      System.out.println("monthlyDepreciation" + monthlyDepreciation);
	      double residualValueFP =priceOfCar * Math.pow(1 + monthlyDepreciation, term);
	      System.out.println("residualValueFP" + residualValueFP);
	      return residualValueFP;


		
	}

private static String getUFEFp(double residualValueFP,double monthlyInterestRateFP, double shadowLimit, int term) {
	int fee=10;
	int  paymentNumber = term - 1;
	double totalAmountFP =
		    (shadowLimit -
		      (residualValueFP + fee) / Math.pow(1 + monthlyInterestRateFP, term)) /
		    ((Math.pow(1 + monthlyInterestRateFP, paymentNumber) - 1) /
		      (Math.pow(1 + monthlyInterestRateFP, paymentNumber) * monthlyInterestRateFP));
    System.out.println("totalAmountFP: " + totalAmountFP);
    double ufeLoanAmt = totalAmountFP * 0.9;
    System.out.println("ufeLoanAmtFP: " + ufeLoanAmt);
    // apply all capping here
    DecimalFormat df = new DecimalFormat("#.##");
    return df.format(ufeLoanAmt);

	}

private static double getMonthlyInterestRate(double apr) {
//      apr = 0.034;
//      double monthlyTerm  = 1/12f;
      double monthlyInterestRate  = Math.pow(1 + apr, 1/12f) - 1;
//    monthlyInterestRate =  (1 + apr) ^ 1/12f - 1
      System.out.println("monthlyInterestRate: " + monthlyInterestRate);
      return  monthlyInterestRate;
  }

  private static String getUFEHp(double monthlyInterestRate, double shadowLimit, int term){
      double totalLoanAmount = shadowLimit * (Math.pow(1 + monthlyInterestRate, term) - 1) / (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, term));
//    totalLoanAmount = shadowLimit * (((1 + monthlyInterestRate) ^ term) -1) / (monthlyInterestRate * ((1 + monthlyInterestRate) ^ term))
      System.out.println("totalLoanAmount: " + totalLoanAmount);
//      double ufeLoanAmt = 700 * 0.9 * [ (1 + 0.13)^60 - 1] / (0.13 * 1530.05)
      double ufeLoanAmt = totalLoanAmount * 0.9;
      System.out.println("ufeLoanAmt: " + ufeLoanAmt);
      // apply all capping here
      DecimalFormat df = new DecimalFormat("#.##");
      return df.format(ufeLoanAmt);
  }

}
