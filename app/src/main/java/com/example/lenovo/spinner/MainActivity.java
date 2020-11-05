package com.example.lenovo.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    Button button;
    TextView textView;
    String[] country;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        country=getResources().getStringArray(R.array.country_name);
        spinner=findViewById(R.id.sp);
        button=findViewById(R.id. btn);
        textView=findViewById(R.id.show);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.sample,R.id.tv,country);
        spinner.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value=spinner.getSelectedItem().toString();
                textView.setText(value);
            }
        });


    }
}
