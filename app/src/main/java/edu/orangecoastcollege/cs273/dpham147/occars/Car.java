package edu.orangecoastcollege.cs273.dpham147.occars;

/**
 * Created by Kyubey on 2016-09-15.
 */
public class Car {
    public double mDownPayment;
    public double mLoanTerm;
    public double mPrice;
    public static double TAX_RATE;

    public Car() {
        mDownPayment = 0.0;
        mLoanTerm = 0.0;
        mPrice = 0.0;
    }

    public void calculateBorrowedAmount(){

    }

    public void calculateInterestAmount(){

    }

    public void calculateMonthlyPament(){

    }

    public void calculateTaxAmount(){

    }

    public void calculateTotalCost(){

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
