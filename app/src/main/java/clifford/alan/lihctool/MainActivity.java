package clifford.alan.lihctool;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends ActionBarActivity {

    public Customer customer = new Customer();
    static final int REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        customer.threshold=15;
    }

    public void start(View v) {
        // do something when the button is clicked
        // Create intent to open first question activity
        customer.name="The Customer";


        Intent i = new Intent(this, employmentQuestion.class);
        startActivityForResult(i, REQUEST_CODE);
    }

    public void settings(View v) {
        // do something when the button is clicked
        // Create intent to open first question activity

        Intent i = new Intent(this, Settings.class);
        i.putExtra("threshold",customer.threshold);
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
                // Set new threshold if applicable
                if (data.getExtras().containsKey("threshold")) {
                    customer.threshold = data.getExtras().getInt("threshold");
                    //TextView DEBUG = (TextView) findViewById(R.id.welcomeText);
                    //DEBUG.setText(""+data.getExtras().getInt("threshold"));
                } else {
                    //TextView DEBUG = (TextView) findViewById(R.id.welcomeText);
                    //DEBUG.setText(data.getExtras().toString());
                }

                // Pass the coefficient to the relevant customer attribute
                if (data.getExtras().containsKey("returnCoefficient") && data.getExtras().containsKey("question")) {
                    customer.setCoefficient(returnQuestion, returnCoefficient);
                } else {
                }
                // Call the next question
                if (data.getExtras().containsKey("returnCoefficient") && data.getExtras().containsKey("question")) {
                    nextQuestion(returnQuestion);
                } else {
                }
            }
        }
    }

    public void nextQuestion(String previousQuestion) {

        // Create a blank intent and add the coefficient data
        Intent i = new Intent();

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
                i.putExtra("threshold", customer.threshold);
                i.setClass(this, Results.class);
                startActivityForResult(i, REQUEST_CODE);
                break;

            case "results":
                //i.setClass(this,MainActivity.class);
                //startActivityForResult(i, REQUEST_CODE);
                break;

            case "settings":
                //i.setClass(this,MainActivity.class);
                //startActivityForResult(i, REQUEST_CODE);

                break;
        }

    }

}
