package id.smkn4.pwpb.learnintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Page5 extends AppCompatActivity {

    private Button buttontoPage6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page5);
        buttontoPage6 = (Button)findViewById(R.id.btnDaftar);
        buttontoPage6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahL5 = new Intent(Page5.this, Page6.class);
                startActivity(pindahL5);
            }
        });
    }
}
