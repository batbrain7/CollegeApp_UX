package sd_dtu.hollerandroid;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

import me.anwarshahriar.calligrapher.Calligrapher;

public class Settings extends AppCompatActivity {

    ListView listView,listView1;
    ArrayAdapter arrayAdapter;
    String[] options = {"Personalisation","Data Usage","Backup & Restore"};
    String[] opts = {"Sign Out"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        Calligrapher calligrapher = new Calligrapher(this);
        calligrapher.setFont(this, "fonts/OpenSans-Regular.ttf", true);
        listView = (ListView) findViewById(R.id.settings_options);
        arrayAdapter = new ArrayAdapter<String>(getApplicationContext(),R.layout.listview_text,options);
        listView.setAdapter(arrayAdapter);
        ArrayAdapter arrayAdapter1 = new ArrayAdapter<String>(getApplicationContext(),R.layout.listviewdifferentcolor,opts);
        listView1 = (ListView) findViewById(R.id.settings_signout);

        listView1.setAdapter(arrayAdapter1);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView textView = (TextView) view.findViewById(R.id.sim_txt);
                String s = textView.getText().toString();
                if(s.equals("Personalisation"))
                {
                    Intent intent = new Intent(Settings.this,Personalisation.class);
                    startActivity(intent);
                }
                else if(s.equals("Data Usage"))
                {

                }
                else if(s.equals("Backup & Restore"))
                {

                }
            }
        });

    }
}
