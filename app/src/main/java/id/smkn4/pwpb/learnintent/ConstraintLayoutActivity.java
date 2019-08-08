package id.smkn4.pwpb.learnintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ConstraintLayoutActivity extends AppCompatActivity {

    private Button buttonLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint_layout);
        buttonLogin = (Button)findViewById(R.id.tombolLogin);
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahL1 = new Intent(ConstraintLayoutActivity.this, GridLayoutActivity.class);
                startActivity(pindahL1);
            }
        });
    }
}
