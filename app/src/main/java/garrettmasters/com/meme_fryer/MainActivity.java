package garrettmasters.com.meme_fryer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final int LOAD_IMAGE = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Open FryerActivity
    public void openFryerActivity(View view) {
        Intent openFryerActivity = new Intent(this, FryerActivity.class);
        startActivity(openFryerActivity);
    }

    public void loadImage(View view) {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(Intent.createChooser(intent,
                "Select Picture"), LOAD_IMAGE);
    }
}
