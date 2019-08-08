package id.smkn4.pwpb.learnintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Page4 extends AppCompatActivity {

    private Button buttontoPage5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4);
        buttontoPage5 = (Button)findViewById(R.id.btnToPage5);
        buttontoPage5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahL4 = new Intent(Page4.this, Page5.class);
                startActivity(pindahL4);
            }
        });
    }
}
