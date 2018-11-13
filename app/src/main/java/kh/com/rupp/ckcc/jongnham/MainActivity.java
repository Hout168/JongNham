package kh.com.rupp.ckcc.jongnham;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    int[] tabIcons = {
                R.drawable.store, R.drawable.food, R.drawable.event, R.drawable.comment
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar=findViewById(R.id.toolBar);
        tabLayout=findViewById(R.id.tabLayout);
        viewPager=findViewById(R.id.viewPager);

        setSupportActionBar(toolbar);
        ActionBar actionBar =getSupportActionBar();
        setTitle("");
        if(actionBar!=null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        //set up viewPager
        PagerAdapter adapter=new PagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        for (int i=0;i<tabLayout.getTabCount();i++){
            tabLayout.getTabAt(i).setIcon(tabIcons[i]);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }


}
