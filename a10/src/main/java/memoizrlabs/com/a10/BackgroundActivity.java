package memoizrlabs.com.a10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BackgroundActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_background);
        System.out.println("hello");
    }
}
