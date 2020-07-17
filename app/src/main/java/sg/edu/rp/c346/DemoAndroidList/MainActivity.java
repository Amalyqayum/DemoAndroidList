package sg.edu.rp.c346.DemoAndroidList;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvAndroid;
    ArrayList<AndroidVersion> androidList;
    ArrayAdapter<AndroidVersion> aaAndroidList;
    CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvAndroid = findViewById(R.id.listViewAndroid);
        androidList = new ArrayList<AndroidVersion>();
        AndroidVersion item1 = new AndroidVersion("Pie","9.0");
        AndroidVersion item2 = new AndroidVersion("Oreo","8.0-8.1");
        AndroidVersion item3 = new AndroidVersion("Nougat", "7.0-7.1.2");
        AndroidVersion item4 = new AndroidVersion("Marshmallow", "6.0");
        androidList.add(item1);
        androidList.add(item2);
        androidList.add(item3);
        androidList.add(item4);

        aaAndroidList = new ArrayAdapter<AndroidVersion>(this,android.R.layout.simple_list_item_1,androidList);
        lvAndroid.setAdapter(aaAndroidList);

        customAdapter = new CustomAdapter(this, R.layout.row, androidList);

        lvAndroid.setAdapter(customAdapter);

    }
}
