package sg.edu.rp.c346.simpleclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton tbtn;
    ToggleButton tbtn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simpleclick);

        tvDisplay = (TextView)findViewById(R.id. textViewDisplay);
        btnDisplay =(Button)findViewById(R.id.buttonDisplay);
        etInput = (EditText)findViewById(R.id.editTextInput);
        tbtn =(ToggleButton) findViewById(R.id.toggleButton);
        tbtn1 =(ToggleButton) findViewById(R.id. toggleButton2);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                String input = etInput.getText().toString();
                tvDisplay.setText(input);
            }
        });

        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add your Code for the action
                if(tbtn.isChecked()){
                    etInput.setEnabled(true);
                }
                else {
                    etInput.setEnabled(false);
                }

            }
        });
        tbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add your Code for the action
                if(tbtn1.isChecked()){
                    Toast toast = new Toast(getApplicationContext());
                    toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                    toast.setDuration(Toast.LENGTH_LONG);
                    toast.show();

                }
                else {
                    etInput.setEnabled(false);
                }

            }
        });
    }
}
