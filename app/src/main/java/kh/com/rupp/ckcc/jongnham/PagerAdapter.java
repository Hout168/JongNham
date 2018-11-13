package kh.com.rupp.ckcc.jongnham;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter{

    String[] titles={"store","food","event","comment"};
    int[] tabIcons = {
            R.drawable.store, R.drawable.food, R.drawable.event, R.drawable.comment
    };
    public PagerAdapter(FragmentManager fm){
        super(fm);
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
        return titles.length;
    }

//    @Nullable
//    @Override
//    public CharSequence getPageTitle(int position) {
//        switch (position){
//            case 0: return titles[position];
//            case 1 : return titles[position];
//            case 2 : return titles[position];
//            case 3 : return titles[position];
//            default: return  "";
//        }
//    }
}
