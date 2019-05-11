package jude.forcadas.com.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class easy extends AppCompatActivity {

    Button Back, Submit;
    RadioButton C1, C2, C3, W1, W2, W3, W4, W5, W6;
    TextView S1, S2, S3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy);

        Submit = findViewById(R.id.easy_submit);
        Back = findViewById(R.id.medium_back);

        C1 = findViewById(R.id.easy_c1);
        C2 = findViewById(R.id.mc2);
        C3 = findViewById(R.id.mw5);
        W1 = findViewById(R.id.mc1);
        W2 = findViewById(R.id.mw1);
        W3 = findViewById(R.id.mw3);
        W4 = findViewById(R.id.easy_w4);
        W5 = findViewById(R.id.mw6);
        W6 = findViewById(R.id.easy_w6);

        S1 = findViewById(R.id.Status1);
        S2 = findViewById(R.id.Status2);
        S3 = findViewById(R.id.Status3);
    }

    public void Submit(View view){
        if  (C1.isChecked()){
            S1.setText("Correct");
        }else S1.setText("Incorrect");
        if (C2.isChecked()){
            S2.setText("Correct");
        }else S2.setText("Incorrect");
        if (C3.isChecked()){
            S3.setText("Correct");
        }else S3.setText("Incorrect");
    }

    public void Back(View view){
        Intent Shift;

        if(Back.getId() == R.id.medium_back){
            Shift = new Intent(this, MainActivity.class);
            startActivity(Shift);
        }
    }

    public void C1(View view){
        W1.setChecked(false);
        W2.setChecked(false);
    }

    public void W1(View view){
        C1.setChecked(false);
        W2.setChecked(false);
    }

    public void W2(View view){
        C1.setChecked(false);
        W1.setChecked(false);
    }

    public void C2(View view){
        W3.setChecked(false);
        W4.setChecked(false);
    }

    public void W3(View view){
        C2.setChecked(false);
        W4.setChecked(false);
    }

    public void W4(View view){
        C2.setChecked(false);
        W3.setChecked(false);
    }

    public void C3(View view){
        W5.setChecked(false);
        W6.setChecked(false);
    }

    public void W5(View view){
        C3.setChecked(false);
        W6.setChecked(false);
    }

    public void W6(View view){
        C3.setChecked(false);
        W5.setChecked(false);
    }
}
