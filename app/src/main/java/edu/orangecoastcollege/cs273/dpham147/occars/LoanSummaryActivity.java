package edu.orangecoastcollege.cs273.dpham147.occars;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoanSummaryActivity extends Activity {

    private TextView monthlyPaymentTextView;
    private TextView loanSummaryTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan_summary);

        monthlyPaymentTextView = (TextView) findViewById(R.id.montlyPaymentTextView);
        loanSummaryTextView = (TextView) findViewById(R.id.loanSummaryTextView);

        Intent intentFromPurchaseActivity = getIntent();
        String monthlyPaymentText = intentFromPurchaseActivity.getStringExtra("MonthlyPayment");
        monthlyPaymentTextView.setText(monthlyPaymentText);
        String loanSummaryText = intentFromPurchaseActivity.getStringExtra("LoanSummary");
        loanSummaryTextView.setText(loanSummaryText);
    }

    public void returnToDataEntry(View view){
        this.finish();
    }
}
