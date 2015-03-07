package clifford.alan.lihctool;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends ActionBarActivity {

    public Customer customer = new Customer();
    static final int REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void start(View v) {
        // do something when the button is clicked
        // Create intent to open first question activity
        customer.name="The Customer";

        Intent i = new Intent(this, employmentQuestion.class);
        startActivityForResult(i, REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // Check which request we're responding to
        if (requestCode == REQUEST_CODE) {
            // Make sure the request was successful
            if (resultCode == RESULT_OK) {
                // Extract the coefficient and the question we have returned from
                String returnQuestion = data.getExtras().getString("question");
                Double returnCoefficient = data.getExtras().getDouble("returnCoefficient");
                // Pass the coefficient to the relevant customer attribute
                customer.setCoefficient(returnQuestion, returnCoefficient);
                // Call the next question
                nextQuestion(returnQuestion);
            }
        }
    }

    public void nextQuestion(String previousQuestion) {

        // Create a blank intent and add the coefficient data
        Intent i = new Intent();

        Integer test =20;

        // Complete the intent and call the next question
        switch (previousQuestion){
            case "employment":
                i.setClass(this, PartnerEmploymentQuestion.class);
                startActivityForResult(i, REQUEST_CODE);
                break;

            case "partnerEmployment":
                i.setClass(this, BenefitsQuestion.class);
                startActivityForResult(i, REQUEST_CODE);
                break;

            case "meansTestedBenefit":
                i.setClass(this, DisabilityQuestion.class);
                startActivityForResult(i, REQUEST_CODE);
                break;

            case "disability":
                i.setClass(this, PaymentMethodQuestion.class);
                startActivityForResult(i, REQUEST_CODE);
                break;

            case "paymentMethod":
                i.setClass(this, PropertyTypeQuestion.class);
                startActivityForResult(i, REQUEST_CODE);
                break;

            case "propertyType":
                i.setClass(this, Pre1964Question.class);
                startActivityForResult(i, REQUEST_CODE);
                break;

            case "pre1964":
                i.setClass(this, NumberOfBedroomsQuestion.class);
                startActivityForResult(i, REQUEST_CODE);
                break;

            case "bedrooms":
                i.setClass(this, TenureQuestion.class);
                startActivityForResult(i, REQUEST_CODE);
                break;

            case "tenure":
                i.setClass(this, MainFuelQuestion.class);
                startActivityForResult(i, REQUEST_CODE);
                break;

            case "fuel":
                i.setClass(this,HotWaterQuestion.class);
                startActivityForResult(i, REQUEST_CODE);
                break;

            case "hotWater":
                customer.sumCoefficients();
                i.putExtra("customerName", customer.name);
                i.putExtra("LIHC_status", customer.probability);
                i.setClass(this, Results.class);
                startActivityForResult(i, REQUEST_CODE);
                break;

            case "results":
                i.setClass(this,MainActivity.class);
                startActivityForResult(i, REQUEST_CODE);
                break;
        }

    }

}
