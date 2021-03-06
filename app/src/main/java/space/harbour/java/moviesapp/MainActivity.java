package space.harbour.java.moviesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.net.MalformedURLException;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    String s1[];
    String s2[];
    String s3[];
    String s4[];
    int images[] = {R.drawable.pulfiction, R.drawable.titanic,R.drawable.fightclub,
            R.drawable.inglorious,R.drawable.gonewiththewind, R.drawable.notanothernteenmovie, R.drawable.americanpie};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);

//        s1 = getResources().getStringArray(R.array.programming_languages);
//        s2 = getResources().getStringArray(R.array.description);

//        try {
//            myAsyncTask = new MyAsyncTask("https://api.npoint.io/f500fe055fb5e9469bc7",
//            recyclerView).execute();

//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }

        s1 = getResources().getStringArray(R.array.movies);
        s2 = getResources().getStringArray(R.array.description);
        s3 = getResources().getStringArray(R.array.year);
        s4 = getResources().getStringArray(R.array.duration);

        AdapterActivity myAdapter = new AdapterActivity(this, s1, s2, s3, s4, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

//    public void wakeUp(View view) {
//        TextView textUp = findViewById(R.id.textView3);
//        textUp.setText("Ahmed is awake");
//        ((ImageView)findViewById(R.id.imageView3)).setImageResource(R.drawable.pulfiction);
//
//        String message = "Hello toast!";
//        Toast toast = Toast.makeText(this,
//                message, Toast.LENGTH_LONG);
//        toast.show();
//
//    }
    public void showMovieDetails(View view) {
        Intent intent = new Intent(this, MovieActivity.class);
        startActivity(intent);
    }

}