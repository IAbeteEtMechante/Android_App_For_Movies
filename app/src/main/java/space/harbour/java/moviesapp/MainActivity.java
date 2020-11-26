package space.harbour.java.moviesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void wakeUp(View view) {
        TextView textUp = findViewById(R.id.textView3);
        textUp.setText("Ahmed is awake");
        ((ImageView)findViewById(R.id.imageView3)).setImageResource(R.drawable.pulfiction);
    }
}