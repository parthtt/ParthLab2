package parth.thakkar.parthlab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class parthActivity extends AppCompatActivity {

    private ImageView companyLogo;
    private Button enterButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parth);

        companyLogo = findViewById(R.id.companyLogo);
        enterButton = findViewById(R.id.enterButton);
    }
}