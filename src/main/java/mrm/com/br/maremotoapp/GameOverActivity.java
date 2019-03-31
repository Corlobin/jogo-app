package mrm.com.br.maremotoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class GameOverActivity extends AppCompatActivity {

    private Button startGameAgain;
    private TextView score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);
        startGameAgain = findViewById(R.id.btPlayAgain);
        score = findViewById(R.id.score);
        String total = getIntent().getExtras().get("score").toString();
        score.setText("Score: " + total);

        startGameAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(GameOverActivity.this, MainActivity.class);
                startActivity(mainIntent);
            }
        });
    }
}
