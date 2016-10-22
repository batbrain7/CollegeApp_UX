package sd_dtu.hollerandroid;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabWidget;
import android.widget.TableLayout;

import me.relex.circleindicator.CircleIndicator;


public class LoginActivity extends AppCompatActivity {

    Fragment fragment = new WelcomeFragment();
    Fragment fragment1 = new PersonalDetailsFragment();
    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        viewPager = (ViewPager) findViewById(R.id.pager);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addfragments(new WelcomeFragment(),"");
        viewPagerAdapter.addfragments(new PersonalDetailsFragment(),"");
        viewPagerAdapter.addfragments(new InterestsFragment(),"");
        //CircleIndicator circleIndicator = (CircleIndicator) findViewById(R.id.circle_indicator);
        viewPager.setAdapter(viewPagerAdapter);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager, true);
        //circleIndicator.setViewPager(viewPager);
       // viewPagerAdapter.registerDataSetObserver(circleIndicator.getDataSetObserver());
    }
}
