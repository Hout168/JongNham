package kh.com.rupp.ckcc.jongnham;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter{

    int mNoOfTab;

    public PagerAdapter(FragmentManager fm, int NumberOfTab){
        super(fm);
        this.mNoOfTab = NumberOfTab;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                StoreFragment storeFragment = new StoreFragment();
                return storeFragment;
            case 1:
                FoodFragment foodFragment = new FoodFragment();
                return foodFragment;
            case 2:
                EventFragment eventFragment = new EventFragment();
                return eventFragment;
            case 3:
                CommentFragment commentFragment = new CommentFragment();
                return commentFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNoOfTab;
    }
}
