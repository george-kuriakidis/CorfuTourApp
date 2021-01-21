package android.example.corfutourapp;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new PictureFragment();
        } else if (position == 1) {
            return new sightFragment();
        } else if (position == 2) {
            return new FoodFragment();
        } else {
            return new DrinkFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.pictures);
        } else if (position == 1) {
            return mContext.getString(R.string.sights);
        } else if (position == 2) {
            return mContext.getString(R.string.food);
        } else {
            return mContext.getString(R.string.drink);
        }
    }
}
