package clifford.alan.lihctool;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Results extends ActionBarActivity {

    static Integer THRESHOLD = 15;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results_layout);

        // Get the message from the intent
        Intent i = getIntent();
        String name = i.getExtras().getString("customerName");
        Long result = i.getExtras().getLong("LIHC_status");
        String fuelPoor = " is unlikely to be living in fuel poverty.";

        // Determine if likely fuel poor
        if(result >= THRESHOLD){
            fuelPoor=" is likely to be living in fuel poverty.";
        }

        // Build the results message string
        name += fuelPoor + " The overall probability is estimated at " + result + "%.\n\nThe threshold for a household to be considered fuel poor is "+ THRESHOLD + "%.";

        // Create the text view
        TextView results = (TextView) findViewById(R.id.resultsText);
        results.setText(name);
    }

    public void goHome(View v) {
        // do something when the button is clicked
        finish();
    }

    public void finish() {
        Intent data = new Intent();

        data.putExtra("returnCoefficient", 0.0);
        data.putExtra("question", "results");
        setResult(RESULT_OK, data);
        super.finish();
    }

}
