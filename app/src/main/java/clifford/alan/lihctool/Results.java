package clifford.alan.lihctool;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Results extends ActionBarActivity {

    Integer threshold;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results_layout);

        // Get the results data from the intent
        Intent i = getIntent();
        String name = i.getExtras().getString("customerName");
        Long result = i.getExtras().getLong("LIHC_status");
        threshold = i.getExtras().getInt("threshold");

        // string fragment for overall status
        String fuelPoor = " is unlikely to be living in fuel poverty.";

        // Change the message if they are above the threshold
        if(result >= threshold){
            fuelPoor=" is likely to be living in fuel poverty.";
        }

        // Build the results message string
        name += fuelPoor + " The overall probability is estimated at " + result + "%.\n\nThe threshold for a household to be considered fuel poor is "+ threshold + "%.";

        // Create the text view
        TextView results = (TextView) findViewById(R.id.resultsText);
        results.setText(name);
    }

    public void goHome(View v) {
        // do something when the button is clicked
        finish();
    }

    // Return to start screen - the bundled data is not used
    public void finish() {
        Intent data = new Intent();
        data.putExtra("returnCoefficient", 0.0);
        data.putExtra("question", "results");
        setResult(RESULT_OK, data);
        super.finish();
    }

}
