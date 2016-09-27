package com.example.andorid.miwok;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class CategoryAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private final Context mContext;

    public CategoryAdapter(Context context, FragmentManager fragmentManager) {
        super(fragmentManager);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0) {
            return new NumberFragment();
        } else if (position==1) {
            return new FamilyMemberFragment();
        } else if (position==2) {
            return new ColorFragment();
        } else {
            return new PhraseFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.menu_numbers);
        } else if (position == 1) {
            return mContext.getString(R.string.menu_family_members);
        } else if (position == 2) {
            return mContext.getString(R.string.menu_colors);
        } else {
            return mContext.getString(R.string.menu_phrases);
        }
    }
}
