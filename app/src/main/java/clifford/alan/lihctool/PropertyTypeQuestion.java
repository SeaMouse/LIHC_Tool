package clifford.alan.lihctool;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;


public class PropertyTypeQuestion extends ActionBarActivity {

    public Double returnCoefficient;
    public Coefficients coefficients = new Coefficients();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property_type_question_layout);
    }

    public void flat(View v) {
        // do something when the button is clicked
        returnCoefficient=coefficients.propertyType_flat;
        finish();
    }

    public void terrace(View v) {
        // do something when the button is clicked
        returnCoefficient=coefficients.propertyType_terrace;
        finish();
    }

    public void semi_detached(View v) {
        // do something when the button is clicked
        returnCoefficient=coefficients.propertyType_semi;
        finish();
    }

    public void detached(View v) {
        // do something when the button is clicked
        returnCoefficient=coefficients.propertyType_detached;
        finish();
    }

    public void bungalow(View v) {
        // do something when the button is clicked
        returnCoefficient=coefficients.propertyType_bungalow;
        finish();
    }

    public void finish() {
        Intent data = new Intent();

        data.putExtra("returnCoefficient", returnCoefficient);
        data.putExtra("question", "propertyType");
        setResult(RESULT_OK, data);
        super.finish();
    }

}
