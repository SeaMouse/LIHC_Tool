package clifford.alan.lihctool;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;


public class PaymentMethodQuestion extends ActionBarActivity {

    public Double returnCoefficient;
    public Coefficients coefficients = new Coefficients();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_method_question_layout);
    }

    public void directDebit(View v) {
        // do something when the button is clicked
        returnCoefficient=coefficients.paymentMethod_direct_debit;
        finish();
    }

    public void prePayment(View v) {
        // do something when the button is clicked
        returnCoefficient=coefficients.paymentMethod_pre_payment;
        finish();
    }

    public void standardCredit(View v) {
        // do something when the button is clicked
        returnCoefficient=coefficients.paymentMethod_standard_credit;
        finish();
    }

    public void finish() {
        Intent data = new Intent();

        data.putExtra("returnCoefficient", returnCoefficient);
        data.putExtra("question", "paymentMethod");
        setResult(RESULT_OK, data);
        super.finish();
    }

}
