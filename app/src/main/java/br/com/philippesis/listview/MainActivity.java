package br.com.philippesis.listview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String cars[] = {"FIAT", "VW", "Chevrolet", "Ferrari", "Jaguar"};
        ArrayAdapter<String> strAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, cars);

        ListView list = (ListView) findViewById(R.id.idLVEquipes);
        list.setAdapter(strAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView txtView = (TextView) findViewById(R.id.idTxtSelect);
                txtView.setText("ID: "+id+" Posição: "+position);
            }
        });

    }
}
