package sd_dtu.hollerandroid;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NoticesAndProfile extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    NoticeViewPager viewPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notices_and_profile);
        tabLayout = (TabLayout)findViewById(R.id.tab_layout);
        viewPager = (ViewPager)findViewById(R.id.noticeview_pager);
        viewPagerAdapter = new NoticeViewPager(getSupportFragmentManager());
        viewPagerAdapter.addFragments(new AllFragment(),"ALL");
        viewPagerAdapter.addFragments(new MyFragment(),"MY");
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
