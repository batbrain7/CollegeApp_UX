package sd_dtu.hollerandroid;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by mohitkumar on 24/10/16.
 */

public class NoticeViewPager extends FragmentPagerAdapter{
    ArrayList<Fragment> fragments = new ArrayList<Fragment>();
    ArrayList<String> tab_titles = new ArrayList<String>();

    public void addFragments(Fragment fragments,String titles)
    {
        this.fragments.add(fragments);
        this.tab_titles.add(titles);
    }

    public NoticeViewPager(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tab_titles.get(position);
    }



}
