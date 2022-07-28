package com.checkbox.check;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //declaration of global variable
    Button button;
    TextView textView;
    CheckBox red, green, blue, purple;
LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialization of variables
        button = findViewById(R.id.ok_btn);
        textView = findViewById(R.id.show_selected);
        red = findViewById(R.id.colorRed);
        green = findViewById(R.id.colorGreen);
        blue = findViewById(R.id.colorBlue);
        purple = findViewById(R.id.colorPurple);

        //setting action

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StringBuilder stringBuilder = new StringBuilder();

                if (red.isChecked()) {
                    String text = red.getText().toString();
                    stringBuilder.append( text+" is selected\n");

                }
                if (green.isChecked()) {
                    String text = green.getText().toString();
                    stringBuilder.append(text + " is selected\n");
                }
                if (blue.isChecked()) {
                    String text = blue.getText().toString();
                    stringBuilder.append(text + " is selected\n");
                }
                if (purple.isChecked()) {
                    String text = purple.getText().toString();
                    stringBuilder.append(text + " is selected\n");
                }if (!red.isChecked()&&!green.isChecked()&&!blue.isChecked()&&!purple.isChecked()){
                    String text="Please select an item.";
                    stringBuilder.append(text+" Then try to check ");


                }


                textView.setText(stringBuilder);
                
            }
        });

    }
}