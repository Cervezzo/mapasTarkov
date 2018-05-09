package tarkov.android.teaching.com.mapastarkov;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String valor = getIntent().getStringExtra("nombre");


         if (valor.equalsIgnoreCase("factory")){
            ImageView image = findViewById(R.id.imageView);
            image.setImageResource(R.drawable.factorymap);
        }
        else if(valor.equalsIgnoreCase("woods")){
            ImageView image = findViewById(R.id.imageView);
            image.setImageResource(R.drawable.woodsmap);
        }

        else if(valor.equalsIgnoreCase("custom")){
             ImageView image = findViewById(R.id.imageView);
             image.setImageResource(R.drawable.customtresd);
         }

         else if(valor.equalsIgnoreCase("shoreline")){
             ImageView image = findViewById(R.id.imageView);
             image.setImageResource(R.drawable.shoreline3d);
         }

         else if(valor.equalsIgnoreCase("interchange")) {
             ImageView image = findViewById(R.id.imageView);
             image.setImageResource(R.drawable.interchangemap);
         }

    }



    }

