package com.klinker.android.twitter.settings.configure_pages;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.support.v13.app.FragmentPagerAdapter;

import com.klinker.android.twitter.R;
import com.klinker.android.twitter.settings.configure_pages.fragments.ExampleHomeFragment;
import com.klinker.android.twitter.settings.configure_pages.fragments.PageOneFragment;
import com.klinker.android.twitter.settings.configure_pages.fragments.PageTwoFragment;


public class ConfigurationPagerAdapter extends FragmentPagerAdapter {

    private Context context;

    public ConfigurationPagerAdapter(FragmentManager manager, Context context) {
        super(manager);
        context = context;
    }

    @Override
    public Fragment getItem(int i) {

        switch (i) {
            case 0:
                return new PageOneFragment();
            case 1:
                return new PageTwoFragment();
            case 2:
                return new ExampleHomeFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        return 3; // 3 pages
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return context.getResources().getString(R.string.page_1);
            case 1:
                return context.getResources().getString(R.string.page_2);
            case 2:
                return context.getResources().getString(R.string.timeline);
        }
        return null;
    }
}
