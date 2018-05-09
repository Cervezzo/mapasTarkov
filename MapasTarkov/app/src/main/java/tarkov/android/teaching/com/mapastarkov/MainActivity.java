package tarkov.android.teaching.com.mapastarkov;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {




    public void factory(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("nombre", "factory");
        startActivity(intent);
    }

    public void custom(View view){
        Intent intent = new Intent(this, SecondActivity.class );
        intent.putExtra("nombre", "custom");
        startActivity(intent);
    }

    public void woods(View view){
        Intent intent = new Intent(this, SecondActivity.class );
        intent.putExtra("nombre", "woods");
        startActivity(intent);
    }

    public void shoreline(View view){
        Intent intent = new Intent(this, SecondActivity.class );
        intent.putExtra("nombre", "shoreline");
        startActivity(intent);
    }

    public void interchange(View view){
        Intent intent = new Intent(this, SecondActivity.class );
        intent.putExtra("nombre", "interchange");
        startActivity(intent);
    }


        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }


        @Override
        protected void onStart () {
            super.onStart();
            Log.d("MainActivity", "ANTONIO: onStart");
        }

        @Override
        protected void onResume () {
            super.onResume();
            Log.d("MainActivity", "ANTONIO: onResume");

        }

        @Override
        protected void onPause () {
            super.onPause();
            Log.d("MainActivity", "ANTONIO: onPause");
        }

        @Override
        protected void onStop () {
            super.onStop();
            Log.d("MainActivity", "ANTONIO: onStop");
        }

        @Override
        protected void onDestroy () {
            super.onDestroy();
            Log.d("MainActivity", "ANTONIO: onDestroy");
        }

        @Override
        protected void onRestart () {
            super.onRestart();
            Log.d("MainActivity", "ANTONIO: onRestart");
        }



}
