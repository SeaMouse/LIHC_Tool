package clifford.alan.lihctool;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;


public class NumberOfBedroomsQuestion extends ActionBarActivity {

    public Double returnCoefficient;
    public Coefficients coefficients = new Coefficients();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_of_bedrooms_question_layout);
    }

    public void one(View v) {
        // do something when the button is clicked
        returnCoefficient=coefficients.bedrooms_one;
        finish();
    }

    public void two(View v) {
        // do something when the button is clicked
        returnCoefficient=coefficients.bedrooms_two;
        finish();
    }

    public void three(View v) {
        // do something when the button is clicked
        returnCoefficient=coefficients.bedrooms_three;
        finish();
    }

    public void four(View v) {
        // do something when the button is clicked
        returnCoefficient=coefficients.bedrooms_four;
        finish();
    }

    public void five(View v) {
        // do something when the button is clicked
        returnCoefficient=coefficients.bedrooms_five;
        finish();
    }

    public void finish() {
        Intent data = new Intent();

        data.putExtra("returnCoefficient", returnCoefficient);
        data.putExtra("question", "bedrooms");
        setResult(RESULT_OK, data);
        super.finish();
    }

}
