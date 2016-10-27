package sd_dtu.hollerandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import me.anwarshahriar.calligrapher.Calligrapher;

public class Personalisation extends AppCompatActivity {

    ListView listView;
    ArrayAdapter arrayAdapter;
    String[] options = {"Notification Sound","Notification LED","Vibration","Font Size","Background"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personalisation);
        Calligrapher calligrapher = new Calligrapher(this);
        calligrapher.setFont(this, "fonts/OpenSans-Regular.ttf", true);
        listView = (ListView) findViewById(R.id.list_personal);
        arrayAdapter = new ArrayAdapter<String>(getApplicationContext(),R.layout.listview_text,options);
        listView.setAdapter(arrayAdapter);
    }
}
