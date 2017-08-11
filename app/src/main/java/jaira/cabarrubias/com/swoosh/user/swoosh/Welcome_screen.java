package jaira.cabarrubias.com.swoosh.user.swoosh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Welcome_screen extends AppCompatActivity {
    private Button mBtnGetStarted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);


        mBtnGetStarted = (Button) findViewById(R.id.btngetstarted);
        mBtnGetStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Welcome_screen.this,League_screen.class);
                startActivity(intent);

            }

        });

    }



    }

