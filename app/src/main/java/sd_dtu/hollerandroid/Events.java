package sd_dtu.hollerandroid;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class Events extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    NoticeViewPager viewPagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
        tabLayout = (TabLayout)findViewById(R.id.tab_layout);
        viewPager = (ViewPager)findViewById(R.id.event_pager);
        viewPagerAdapter = new NoticeViewPager(getSupportFragmentManager());
        viewPagerAdapter.addFragments(new AllFragment(),"ALL");
        viewPagerAdapter.addFragments(new MyFragment(),"MY COLLEGE");
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
