package com.example.tp2;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailsActivity extends AppCompatActivity {
    private ImageView image5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        TextView text5=findViewById(R.id.text5);
        TextView text6=findViewById(R.id.text6);
        TextView text8=findViewById(R.id.text8);
        TextView text7 = findViewById(R.id.text7);
        TextView text9 = findViewById(R.id.text9);
        image5=findViewById(R.id.image5);
        image5.setImageResource( getIntent().getIntExtra("photo", 0));
        text5.setText(this.getIntent().getStringExtra("nom"));
        text9.setText(this.getIntent().getStringExtra("description"));
        text7.setText(this.getIntent().getStringExtra("detailsIngred"));
        text6.setText("Ingrédients"); // Ou utilisez une ressource de chaîne si nécessaire
        text8.setText("Description");
    }
}