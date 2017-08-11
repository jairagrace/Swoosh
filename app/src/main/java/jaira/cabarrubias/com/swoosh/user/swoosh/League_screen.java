package jaira.cabarrubias.com.swoosh.user.swoosh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class League_screen extends AppCompatActivity {
    private Button mBtnext;
    private Button mBtnmens;
    private Button mBtnwomens;
    private Button mBtncoed;
    private String LeagueText;
    private TextView tvIam, tvLeague;
    public static final int REQUEST_CODE = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_league_screen);
        findViewById();
        mBtnext.setEnabled(false);
    }

    public void btnMen(View view) {
        setLeagueText(getResources().getString(R.string.mens));
        mBtnext.setEnabled(true);
    }

    public void btnWomen(View view) {
        setLeagueText(getResources().getString(R.string.womens));
        mBtnext.setEnabled(true);
    }

    public void btnCoEd(View view) {
        setLeagueText(getResources().getString(R.string.coed));
        mBtnext.setEnabled(true);
    }


    public void btnNext(View view) {
        Intent intent = new Intent(getApplicationContext(), Skill_screen.class);
        startActivityForResult(intent, REQUEST_CODE);
    }

    private void findViewById() {
        mBtnext = (Button) findViewById(R.id.btnnext);
        mBtnmens = (Button) findViewById(R.id.btnmens);
        mBtnwomens = (Button) findViewById(R.id.btnwomens);
        mBtncoed = (Button) findViewById(R.id.btncoed);
        tvIam = (TextView) findViewById(R.id.iam);
        tvLeague = (TextView) findViewById(R.id.iamabegginer);
    }

    public String getLeagueText() {
        return LeagueText;
    }

    public void setLeagueText(String leagueText) {
        LeagueText = leagueText;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            if (requestCode == REQUEST_CODE) {
                String reply = data.getStringExtra("Leaguestat");
                if (this.getLeagueText().equalsIgnoreCase("Mens")) {
                    tvIam.setVisibility(View.VISIBLE);
                    tvLeague.setVisibility(View.VISIBLE);
                    tvLeague.setText(reply);
                    mBtnwomens.setEnabled(false);
                    mBtncoed.setEnabled(false);
                    mBtnext.setVisibility(View.INVISIBLE);

                } else if (this.getLeagueText().equalsIgnoreCase("Womens")) {
                    tvIam.setVisibility(View.VISIBLE);
                    tvLeague.setVisibility(View.VISIBLE);
                    tvLeague.setText(reply);
                    mBtnmens.setEnabled(false);
                    mBtncoed.setEnabled(false);
                    mBtnext.setVisibility(View.INVISIBLE);

                } else if (this.getLeagueText().equalsIgnoreCase("Co-Ed")) {
                    tvIam.setVisibility(View.VISIBLE);
                    tvLeague.setVisibility(View.VISIBLE);
                    tvLeague.setText(reply);
                    mBtnmens.setEnabled(false);
                    mBtnwomens.setEnabled(false);
                    mBtnext.setVisibility(View.INVISIBLE);

                }
            }
        }
    }
}
