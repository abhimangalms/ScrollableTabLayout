package com.abmangal.scrollabletablayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class pager extends FragmentPagerAdapter {
    public pager(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int i) {
        if (i == 0){
            return new TabFragmentOne();
        }
        if (i == 1){
            return new TabFragmentTwo();

        }
        if (i == 2){
            return new TabFragmentThree();

        }
        if (i == 3){
            return new TabFragmentFour();

        }
        return i == 4 ? new TabFragmentFive() : null;
    }

    @NonNull
    @Override
    public CharSequence getPageTitle(int i){
        return  i == 0 ? "Tab 1" : i == 1 ? "Tab 2" : i == 2 ? "Tab 3" : i == 3 ? "Tab 4" : i == 4 ? "Tab 5" : null;
    }

    @Override
    public int getCount() {
        return 5;
    }
}
