package sd_dtu.hollerandroid;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.PersistableBundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class NoticesAndProfile extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    Toolbar toolbar;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    NavigationView navigationView;
    NoticeViewPager viewPagerAdapter;
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<NavRecyclerProvider> arrayList = new ArrayList<NavRecyclerProvider>();
    int[] image_id = {R.drawable.notices,R.drawable.chats,R.drawable.events};
    String[] name = {"Notices","Chats","Events"};
    String[] nums = {"5","86","3"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notices_and_profile);
        toolbar = (Toolbar)findViewById(R.id.toolbar_wid);
        tabLayout = (TabLayout)findViewById(R.id.tab_layout);
        setSupportActionBar(toolbar);
//        int count = 0;
//        for(String n : name)
//        {
//            NavRecyclerProvider provider = new NavRecyclerProvider(image_id[count],name[count],nums[count]);
//            arrayList.add(provider);
//            count++;
//        }
//        recyclerView = (RecyclerView) findViewById(R.id.recyc_view);
//        layoutManager = new LinearLayoutManager(this);
        drawerLayout = (DrawerLayout) findViewById(R.id.activity_notices_and_profile);
      //  recyclerView.setLayoutManager(layoutManager);
       // adapter = new NavigatinRecyclerView(arrayList);
       // recyclerView.setAdapter(adapter);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.drawer_open,
                R.string.drawer_close);
        drawerLayout.setDrawerListener(actionBarDrawerToggle);
        navigationView = (NavigationView) findViewById(R.id.navigation_view);
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        DrawerLayout.LayoutParams params = (DrawerLayout.LayoutParams) navigationView.getLayoutParams();
        params.width = metrics.widthPixels;
        navigationView.setLayoutParams(params);
        //  ImageView iconImage = (ImageView) findViewById(android.R.id.home);
//        iconImage.setOnClickListener(new android.view.View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//            }
//        });

        viewPager = (ViewPager)findViewById(R.id.noticeview_pager);
        viewPagerAdapter = new NoticeViewPager(getSupportFragmentManager());
        viewPagerAdapter.addFragments(new AllFragment(),"ALL");
        viewPagerAdapter.addFragments(new MyFragment(),"MY");
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
//        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/OpenSans-Light.ttf");
//        for (int i = 0; i < tabLayout.getTabCount(); i++) {
//            tv.setText(viewPagerAdapter.getPageTitle(i));
//            tv.setTypeface(tf);
//            tabLayout.getTabAt(i).setCustomView(tv);}
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        actionBarDrawerToggle.syncState();
    }
}
