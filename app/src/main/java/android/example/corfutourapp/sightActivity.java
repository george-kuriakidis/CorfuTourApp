package android.example.corfutourapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class sightActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new sightFragment())
                .commit();
    }
}
