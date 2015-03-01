package clifford.alan.lihctool;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;


public class TenureQuestion extends ActionBarActivity {

    public Double returnCoefficient;
    public Coefficients coefficients = new Coefficients();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenure_question_layout);
    }

    public void social(View v) {
        // do something when the button is clicked
        returnCoefficient=coefficients.tenure_social;
        finish();
    }

    public void owner(View v) {
        // do something when the button is clicked
        returnCoefficient=coefficients.tenure_owner;
        finish();
    }

    public void private_rented(View v) {
        // do something when the button is clicked
        returnCoefficient=coefficients.tenure_prs;
        finish();
    }

    public void finish() {
        Intent data = new Intent();

        data.putExtra("returnCoefficient", returnCoefficient);
        data.putExtra("question", "tenure");
        setResult(RESULT_OK, data);
        super.finish();
    }


}
