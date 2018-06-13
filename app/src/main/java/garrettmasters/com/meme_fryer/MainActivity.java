package garrettmasters.com.meme_fryer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final int LOAD_IMAGE = 0;

    private Button openFryerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openFryerButton = (Button) findViewById(R.id.cvButtonMain);
        openFryerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFryerActivity();
            }
        });
    }

    public void openFryerActivity() {
        Intent intent = new Intent(this, FryerActivity.class);
        startActivity(intent);
    }

    public void loadImage(View view) {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(Intent.createChooser(intent,
                "Select Picture"), LOAD_IMAGE);
    }
}
