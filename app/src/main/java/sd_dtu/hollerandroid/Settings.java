package sd_dtu.hollerandroid;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class Settings extends AppCompatActivity {

    ListView listView,listView1;
    ArrayAdapter arrayAdapter;
    String[] options = {"Personalisation","Data Usage","Backup & Restore"};
    String[] opts = {"Sign Out"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        listView = (ListView) findViewById(R.id.settings_options);
        arrayAdapter = new ArrayAdapter<String>(getApplicationContext(),R.layout.listview_text,options);
        listView.setAdapter(arrayAdapter);
        ArrayAdapter arrayAdapter1 = new ArrayAdapter<String>(getApplicationContext(),R.layout.listviewdifferentcolor,opts);
        listView1 = (ListView) findViewById(R.id.settings_signout);

        listView1.setAdapter(arrayAdapter1);


    }
}
