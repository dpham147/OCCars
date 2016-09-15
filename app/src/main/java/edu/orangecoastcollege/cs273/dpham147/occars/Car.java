package edu.orangecoastcollege.cs273.dpham147.occars;

/**
 * Created by Kyubey on 2016-09-15.
 */
public class Car {
    public double mDownPayment;
    public double mLoanTerm;
    public double mPrice;
    public static double TAX_RATE = 10.0;

    public Car() {
        mDownPayment = 0.0;
        mLoanTerm = 0.0;
        mPrice = 0.0;
    }

    public double calculateBorrowedAmount(){
        return ((mPrice - mDownPayment) + calculateTaxAmount());
    }

    public double calculateInterestAmount(){
        double interest;
        if (getmLoanTerm() == 5)
            interest = calculateBorrowedAmount() * 4.19;
        else if (getmLoanTerm() == 4)
            interest = calculateBorrowedAmount() * 4.16;
        else
            interest = calculateBorrowedAmount() * 4.62;
        return interest;
    }

    public double calculateMonthlyPayment(){
        double payment;
        if (getmLoanTerm() == 5)
            payment = calculateInterestAmount() / 60;
        else if (getmLoanTerm() == 4)
            payment = calculateInterestAmount() / 48;
        else
            payment = calculateInterestAmount() / 36;
        return payment;
    }

    public double calculateTaxAmount(){
        return ((mPrice - mDownPayment) * TAX_RATE);
    }

    public double calculateTotalCost(){
        return (mPrice + calculateTaxAmount());
    }

    public double getmDownPayment() {
        return mDownPayment;
    }

    public void setmDownPayment(double mDownPayment) {
        this.mDownPayment = mDownPayment;
    }

    public double getmLoanTerm() {
        return mLoanTerm;
    }

    public void setmLoanTerm(double mLoanTerm) {
        this.mLoanTerm = mLoanTerm;
    }

    public double getmPrice() {
        return mPrice;
    }

    public void setmPrice(double mPrice) {
        this.mPrice = mPrice;
    }
}
