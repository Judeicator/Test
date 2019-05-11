package jude.forcadas.com.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button EasyButton, MediumButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EasyButton = findViewById(R.id.button_easy);
        MediumButton = findViewById(R.id.button_medium);
    }

    public void Easy(View view){
        Intent Shift;

        if(EasyButton.getId() == R.id.button_easy){
            Shift = new Intent(this, easy.class);
            startActivity(Shift);
        }
    }

    public void Medium(View view){
        Intent Shift;

        if(MediumButton.getId() == R.id.button_medium){
            Shift = new Intent(this, medium.class);
            startActivity(Shift);
        }
    }
}
