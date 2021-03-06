package appewtc.masterung.mytraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //For Back
        forBack();

        //Show View
        TextView titleTextView = (TextView) findViewById(R.id.txtTitle);
        TextView detailTextView = (TextView) findViewById(R.id.txtDetail);
        ImageView trafficImageView = (ImageView) findViewById(R.id.imvTraffic);

        titleTextView.setText(getIntent().getStringExtra("Title"));
        detailTextView.setText(getIntent().getStringExtra("Detail"));
        trafficImageView.setImageResource(getIntent().getIntExtra("Image", R.drawable.traffic_01));

    }   // Main Method

    private void forBack() {
        ImageView backImageView = (ImageView) findViewById(R.id.imvBack);
        backImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

}   // Main Class
