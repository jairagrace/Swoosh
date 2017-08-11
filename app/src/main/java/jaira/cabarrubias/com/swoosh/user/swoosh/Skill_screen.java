package jaira.cabarrubias.com.swoosh.user.swoosh;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Skill_screen extends AppCompatActivity {
    private Button mBtnfinish;
    private Button mBtnbegin;
    private Button mBtnballer;
    private String reply;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skill_screen);

        mBtnbegin = (Button) findViewById(R.id.btnbeginner);
        mBtnballer = (Button) findViewById(R.id.btnballer);
        mBtnfinish = (Button) findViewById(R.id.btnfinish);

       mBtnfinish.setEnabled(false);

        mBtnbegin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBtnfinish.setEnabled(true);
                setReply(getResources().getString(R.string.beginner));
            }
        });

        mBtnballer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBtnfinish.setEnabled(true);
                setReply(getResources().getString(R.string.baller));
            }
        });

    }

    public void btnFinish(View view) {
        Intent intent = new Intent();
        intent.putExtra("Leaguestat",this.getReply());
        setResult(Activity.RESULT_OK,intent);
        finish();
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }
}

