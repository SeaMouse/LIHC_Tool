package clifford.alan.lihctool;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;

public class PartnerEmploymentQuestion extends ActionBarActivity {

    public Double returnCoefficient;
    public Coefficients coefficients = new Coefficients();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_partner_employment_question_layout);
    }

    public void employed(View v) {
        // do something when the button is clicked
        returnCoefficient=coefficients.partnerEmploymentStatus_employed;
        finish();
    }

    public void unemployed(View v) {
        // do something when the button is clicked
        returnCoefficient=coefficients.partnerEmploymentStatus_unemployed;
        finish();
    }

    public void inactive(View v) {
        // do something when the button is clicked
        returnCoefficient=coefficients.partnerEmploymentStatus_inactive;
        finish();
    }

    public void retired(View v) {
        // do something when the button is clicked
        returnCoefficient=coefficients.partnerEmploymentStatus_retired;
        finish();
    }

    public void none(View v) {
        // do something when the button is clicked
        returnCoefficient=coefficients.partnerEmploymentStatus_none;
        finish();
    }

    public void finish() {
        Intent data = new Intent();

        data.putExtra("returnCoefficient", returnCoefficient);
        data.putExtra("question", "partnerEmployment");
        setResult(RESULT_OK, data);
        super.finish();
    }

}
