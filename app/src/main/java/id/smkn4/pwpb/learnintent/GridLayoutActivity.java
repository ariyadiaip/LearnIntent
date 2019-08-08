package id.smkn4.pwpb.learnintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GridLayoutActivity extends AppCompatActivity {

    private Button link3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout);
        link3 = (Button)findViewById(R.id.buttonNext);
        link3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahL2 = new Intent(GridLayoutActivity.this, MainActivity.class);
                startActivity(pindahL2);
            }
        });
    }
}
