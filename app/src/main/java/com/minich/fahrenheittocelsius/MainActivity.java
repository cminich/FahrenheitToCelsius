// Mr Minich

package com.minich.fahrenheittocelsius;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;            // for debugging
import android.view.View;



public class MainActivity extends AppCompatActivity
{
    EditText etFahrenheit;              // fahrenheit temperature inputted by user
    TextView tvCelsius;                 // celsius temperature displayed output

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFahrenheit = (EditText) findViewById(R.id.etFahrenheit);
        tvCelsius = (TextView) findViewById(R.id.tvCelsius);
        Button btnCompute = (Button) findViewById(R.id.btnCompute);
        Button btnReset = (Button) findViewById(R.id.btnReset);

        // for debugging:
        //tvCelsius = new TextView(this);
        //tvCelsius.setText("Hello World");
        //setContentView(tvCelsius);
        //Toast.makeText(MainActivity.this, "debugging...", Toast.LENGTH_SHORT).show();
        //Toast.makeText(getApplicationContext(), "debugging...", Toast.LENGTH_LONG).show();


        btnCompute.setOnClickListener(new Button.OnClickListener()
        {

            public void onClick(View v)
            {
                calculate();
            }

        });

        btnReset.setOnClickListener(new Button.OnClickListener()
        {
            public void onClick(View v)
            {
                reset();
            }
        });

    }

    // perform computation
    public void calculate()
    {
        String userInput = etFahrenheit.getText().toString();
        int num = Integer.parseInt(userInput);
        TemperatureConverter  fahrenheitTemp = new TemperatureConverter();
        fahrenheitTemp.setMyFahrenheitTemp(num);
        int celsiusTemp = fahrenheitTemp.convertToCel();
        String outputMessage = getString(R.string.output_prompt);
        tvCelsius.setText("" + outputMessage + celsiusTemp);  // cheesy but necessary evil at this stage of development
    }

    // clear input and output components
    public void reset()
    {
        tvCelsius.setText("");
        etFahrenheit.setText("");
    }

}// end of MainActivity class
