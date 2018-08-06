package com.example.kalpeshsoni.practical4;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1;
    Button b1;
    CheckBox r1,r2;
    TextView t1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = findViewById(R.id.input);
        b1 = findViewById(R.id.convert);
        r1 = findViewById(R.id.c1);
        r2 = findViewById(R.id.c2);
        t1 = findViewById(R.id.textView6);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(e1.getText().length() ==  0)
                {
                    Toast.makeText(getApplicationContext(),"Please enter value:",Toast.LENGTH_SHORT).show();
                    return;
                }

                float input = Float.parseFloat(e1.getText().toString());
                if(r1.isChecked())
                {
                    float celcius;
                    celcius = ((input - 32)* 5/9);
                    t1.setText("Temprature in Celcuis is: "+Float.toString(celcius));

                }
                else
                {
                    float Fahrenhit;
                    Fahrenhit = (input * 9 /5) + 32;
                    t1.setText("Temprature in Fahrenhit is: "+Float.toString(Fahrenhit));

                }
            }
        });
    }
}
