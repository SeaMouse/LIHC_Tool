package clifford.alan.lihctool;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;


public class Settings extends ActionBarActivity {

    Integer threshold;
    SeekBar mSeekBar;
    TextView thresholdText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_layout);

        Intent i = getIntent();
        threshold = i.getExtras().getInt("threshold");

        thresholdText =(TextView) findViewById(R.id.threshold);
        thresholdText.setText(""+threshold);

        mSeekBar =(SeekBar) findViewById(R.id.seekBar);
        mSeekBar.setProgress(threshold);
        mSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                threshold = progress;
                thresholdText.setText(""+threshold);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

    public void back(View v) {
        // do something when the button is clicked
        finish();
    }

    public void finish() {
        Intent data = new Intent();
        //data.putExtra("returnCoefficient", 0.0);
        //data.putExtra("question", "settings");
        data.putExtra("threshold", threshold);
        setResult(RESULT_OK, data);
        super.finish();
    }
}
