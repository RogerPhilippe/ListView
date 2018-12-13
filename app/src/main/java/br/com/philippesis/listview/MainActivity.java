package br.com.philippesis.listview;

import android.app.Activity;
import android.app.ListActivity;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String cars[] = {"FIAT", "VW", "Chevrolet", "Ferrari", "Jaguar"};
        ArrayAdapter<String> strAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, cars);

        ListView list = (ListView) findViewById(R.id.idLVEquipes);
        list.setAdapter(strAdapter);

    }
}
