package com.example.android.miwok;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Harshit on 17-01-2018.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
    private Context mContext = null;

    public SimpleFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new NumbersFragment();
            case 1:
                return new FamilyFragment();
            case 2:
                return new ColorsFragment();
            case 3:
                return new PhrasesFragment();
            default:
                return null;
        }

    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.category_numbers).toUpperCase();
            case 1:
                return mContext.getString(R.string.category_family).toUpperCase();
            case 2:
                return mContext.getString(R.string.category_colors).toUpperCase();
            case 3:
                return mContext.getString(R.string.category_phrases).toUpperCase();
            default:
                return null;
        }

    }


}
