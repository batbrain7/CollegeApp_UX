package sd_dtu.hollerandroid;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

import me.anwarshahriar.calligrapher.Calligrapher;

public class FullDetails extends AppCompatActivity {

    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15;
    ImageView imageView1,imageView2,imageView3,imageView4;
    boolean isfilled = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_details);
        Calligrapher calligrapher = new Calligrapher(this);
        calligrapher.setFont(this, "fonts/OpenSans-Regular.ttf", true);
        Bundle b = getIntent().getExtras();
        String s = b.getString("item");
        t1 = (TextView) findViewById(R.id.full_eventname);
        t2 = (TextView) findViewById(R.id.full_desc);
        t3 = (TextView) findViewById(R.id.price);
        t4 = (TextView) findViewById(R.id.price2);
        t5 = (TextView) findViewById(R.id.organiser);
        t6 = (TextView) findViewById(R.id.big_event);
        t7 = (TextView) findViewById(R.id.collge_name);
        t8 = (TextView) findViewById(R.id.DATE);
        t9 = (TextView) findViewById(R.id.TIME);
        t10 = (TextView) findViewById(R.id.floor);
        t11 = (TextView) findViewById(R.id.place);
        t12 = (TextView) findViewById(R.id.short_colg);
        t13 = (TextView) findViewById(R.id.URL);
        t14 = (TextView) findViewById(R.id.namehead);
        t15 = (TextView) findViewById(R.id.connumber);
        imageView1 = (ImageView) findViewById(R.id.full_image);
        imageView2 = (ImageView) findViewById(R.id.calender_button);
        imageView3 = (ImageView) findViewById(R.id.navicon);
        imageView4 = (ImageView) findViewById(R.id.call);
        if(s.equals("nuclear conference"))
        {
            imageView1.setImageResource(R.drawable.demoimage);
            t1.setText("Nuclear Conference");
            t2.setText("bla + \n + bla \n + bla bla");
            t3.setText("FREE");
            t4.setText("No prize only for learning");
            t5.setText("SD DTU");
            t6.setText("EngiFest 2017");
            t7.setText("Delhi Technological University");
            t8.setText("11 FEBRUARY");
            t9.setText("11 AM ONWARDS");
            t10.setText("");
            t11.setText("B.R.Ambedkar Auditorium");
            t12.setText("DTU");
            t13.setText("www.google.com");
            t14.setText("KRISHNA RAI");
            t15.setText("9999777879");
        }
        else if(s.equals("startup"))
        {
            imageView1.setImageResource(R.drawable.sif);
            t1.setText("StartUp Internship Fair");
            t2.setText("bla + \n + bla \n + bla bla");
            t3.setText("Rs.200");
            t4.setText("No prize only for learning");
            t5.setText("SD DTU");
            t6.setText("EngiFest 2017");
            t7.setText("Delhi Technological University");
            t8.setText("11 FEBRUARY");
            t9.setText("12 AM ONWARDS");
            t10.setText("Floor 1");
            t11.setText("B.R.Ambedkar Auditorium");
            t12.setText("DTU");
            t13.setText("www.google.com");
            t14.setText("KRISHNA RAI");
            t15.setText("9999777879");
        }
        else if(s.equals("Ecellfair")) {
            imageView1.setImageResource(R.drawable.poster1);
            t1.setText("ECELL FAIR");
            t2.setText("bla + \n + bla \n + bla bla");
            t3.setText("Rs.250/-");
            t4.setText("Rs.1000/-");
            t5.setText("ECELL DTU");
            t6.setText("EngiFest 2017");
            t7.setText("Delhi Technological University");
            t8.setText("11 FEBRUARY");
            t9.setText("11 AM ONWARDS");
            t10.setText("");
            t11.setText("B.R.Ambedkar Auditorium");
            t12.setText("DTU");
            t13.setText("www.google.com");
            t14.setText("KRISHNA RAI");
            t15.setText("9999777879");
        }
        else if(s.equals("techweek"))
        {
            imageView1.setImageResource(R.drawable.demo1);
            t1.setText("Technological Week");
            t2.setText("bla + \n + bla \n + bla bla");
            t3.setText("FREE");
            t4.setText("No prize only for learning");
            t5.setText("SD DTU");
            t6.setText("EngiFest 2017");
            t7.setText("Delhi Technological University");
            t8.setText("11 FEBRUARY");
            t9.setText("11 AM ONWARDS");
            t10.setText("");
            t11.setText("B.R.Ambedkar Auditorium");
            t12.setText("DTU");
            t13.setText("www.google.com");
            t14.setText("KRISHNA RAI");
            t15.setText("9999777879");
        }
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent();
                ComponentName cn = new ComponentName("com.google.android.calendar", "com.android.calendar.LaunchActivity");
                i.setComponent(cn);
                startActivity(i);
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uri = String.format(Locale.ENGLISH,"geo:0,0?q="+t10.getText().toString()+t11.getText().toString()+t12.getText().toString());
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(intent);
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+t15.getText().toString()));
                startActivity(intent);
            }
        });
        Linkify.addLinks(t13,Linkify.WEB_URLS);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.eventfullmenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.shareit:
            {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.putExtra(Intent.EXTRA_TEXT, "Hey I'm interested in an Event! Come check it out");
                startActivity(Intent.createChooser(intent, "Share using"));
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }
}
