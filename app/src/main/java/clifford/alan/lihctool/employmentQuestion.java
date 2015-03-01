package clifford.alan.lihctool;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;


public class employmentQuestion extends ActionBarActivity {

    public Double returnCoefficient;
    public Coefficients coefficients = new Coefficients();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employment_question_layout);
    }

    public void employed(View v) {
        // do something when the button is clicked
        returnCoefficient=coefficients.employmentStatus_employed;
        finish();
    }

    public void unemployed(View v) {
        // do something when the button is clicked
        returnCoefficient=coefficients.employmentStatus_unemployed;
        finish();
    }

    public void inactive(View v) {
        // do something when the button is clicked
        returnCoefficient=coefficients.employmentStatus_inactive;
        finish();
    }

    public void retired(View v) {
        // do something when the button is clicked
        returnCoefficient=coefficients.employmentStatus_retired;
        finish();
    }

    public void finish() {
        Intent data = new Intent();

        data.putExtra("returnCoefficient", returnCoefficient);
        data.putExtra("question", "employment");
        setResult(RESULT_OK, data);
        super.finish();
    }

}
