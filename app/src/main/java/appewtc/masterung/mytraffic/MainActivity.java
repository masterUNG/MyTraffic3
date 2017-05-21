package appewtc.masterung.mytraffic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private MyData myData;
    private String[] titleStrings, detailStrings;
    private int[] ints;
    private ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get Value for MyData
        getValueMyData();

        //Create ListView
        createListView();


    }   // Method Main

    private void createListView() {

        //Initial View
        listView = (ListView) findViewById(R.id.livTraffic);
        MyAdapter myAdapter = new MyAdapter(this, titleStrings, detailStrings, ints);
        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("Title", titleStrings[i]);
                intent.putExtra("Detail", detailStrings[i]);
                intent.putExtra("Image", ints[i]);
                startActivity(intent);


            }
        });

    }

    private void getValueMyData() {
        myData = new MyData();
        titleStrings = myData.getTitleStrings();
        detailStrings = myData.getDetailStrings();
        ints = myData.getInts();

        //Check Value
        String tag = "21MayV1";
        String tag2 = "21MayV2";


        for (int i = 0; i < titleStrings.length; i++) {
            Log.d(tag, "titleString(" + i + ") ==> " + titleStrings[i]);
            Log.d(tag2, "detailString(" + i + ") ==> " + detailStrings[i]);
        }


    }

}   // Main Class
