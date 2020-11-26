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
    int images[] = {R.drawable.c_plus_plus, R.drawable.c_sharp,R.drawable.c_plus_plus,
            R.drawable.c_sharp,R.drawable.c_plus_plus, R.drawable.c_sharp, R.drawable.c_sharp};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);

//        s1 = getResources().getStringArray(R.array.programming_languages);
//        s2 = getResources().getStringArray(R.array.description);

//        try {
//            new MyAsyncTask("https://api.npoint.io/f500fe055fb5e9469bc7", recyclerView).execute();
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }

        s1 = getResources().getStringArray(R.array.programming_languages);
        s2 = getResources().getStringArray(R.array.description);

        AdapterActivity myAdapter = new AdapterActivity(this, s1, s2, images);
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