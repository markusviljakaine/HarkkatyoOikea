package com.example.harkkatyo;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class AddLutemonActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lutemon_add);
    }
    public void addLutemon(View view) {
        EditText name = findViewById(R.id.editName);
        RadioGroup colors = findViewById(R.id.colors);
        RadioButton color = findViewById(colors.getCheckedRadioButtonId());
        LutemonStorage.getInstance().addLutemon(new Lutemon(name.getText().toString(), color.getText().toString()));
        KotiStorage.getInstance().addLutemon(new Lutemon(name.getText().toString(), color.getText().toString()));
    }
}
