package clifford.alan.lihctool;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;


public class MainFuelQuestion extends ActionBarActivity {

    public Double returnCoefficient;
    public Coefficients coefficients = new Coefficients();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_fuel_question_layout);
    }

    public void gas(View v) {
        // do something when the button is clicked
        returnCoefficient=coefficients.mainFuel_gas;
        finish();
    }

    public void electricity(View v) {
        // do something when the button is clicked
        returnCoefficient=coefficients.mainFuel_electricity;
        finish();
    }

    public void other(View v) {
        // do something when the button is clicked
        returnCoefficient=coefficients.mainFuel_other;
        finish();
    }

    public void finish() {
        Intent data = new Intent();

        data.putExtra("returnCoefficient", returnCoefficient);
        data.putExtra("question", "fuel");
        setResult(RESULT_OK, data);
        super.finish();
    }

}
