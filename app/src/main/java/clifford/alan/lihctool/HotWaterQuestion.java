package clifford.alan.lihctool;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;


public class HotWaterQuestion extends ActionBarActivity {

    public Double returnCoefficient;
    public Coefficients coefficients = new Coefficients();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hot_water_question_layout);
    }


    public void no(View v) {
        // do something when the button is clicked
        returnCoefficient=coefficients.hotWater_no;
        finish();
    }

    public void yes(View v) {
        // do something when the button is clicked
        returnCoefficient=coefficients.hotWater_yes;
        finish();
    }

    public void finish() {
        Intent data = new Intent();

        data.putExtra("returnCoefficient", returnCoefficient);
        data.putExtra("question", "hotWater");
        setResult(RESULT_OK, data);
        super.finish();
    }
}
