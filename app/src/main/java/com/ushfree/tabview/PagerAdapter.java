package com.ushfree.tabview;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter{
    int mNumofTabs;

    public PagerAdapter(FragmentManager fm, int mNumofTabs){
        super(fm);
        this.mNumofTabs = mNumofTabs;
    }

    @Override
    public Fragment getItem(int position){
        switch (position){
            case 0:
                Fragment1 frag1 = new Fragment1();
                return frag1;
            case 1:
                Fragment2 frag2 = new Fragment2();
                return frag2;
            case 2:
                Fragment3 frag3 = new Fragment3();
                return frag3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumofTabs;
    }
}