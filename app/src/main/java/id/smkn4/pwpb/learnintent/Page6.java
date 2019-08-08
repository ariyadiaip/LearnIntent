package id.smkn4.pwpb.learnintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Page6 extends AppCompatActivity {

    private Button buttonBacktoHome;
    private Button buttontoWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page6);
        buttonBacktoHome = (Button)findViewById(R.id.btnBackHome);
        buttonBacktoHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahL6 = new Intent(Page6.this, ConstraintLayoutActivity.class);
                startActivity(pindahL6);
            }
        });
        buttontoWeb = (Button)findViewById(R.id.btnWeb);
        buttontoWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahImplicit = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.aipariyadi.blogspot.com"));
                startActivity(pindahImplicit);
            }
        });
    }
}
