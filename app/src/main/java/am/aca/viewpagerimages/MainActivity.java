package am.aca.viewpagerimages;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.lib.Deck;
import com.shuhart.bubblepagerindicator.BubblePageIndicator;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    MyPageAdapter pageAdapter;

    public List<Fragment> fragments = getFragments();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        pageAdapter = new MyPageAdapter(getSupportFragmentManager(), fragments);
        final Deck pager = findViewById(R.id.deck_pager);
        // pager.setPercentagePadding(MainActivity, 8);
        //pager.setDpPadding(MainActivity, 16);
        BubblePageIndicator indicator = findViewById(R.id.indicator);
        pager.setAdapter(pageAdapter);
        indicator.setViewPager(pager);


        pager.setOffscreenPageLimit(3);
        pager.setPageMargin(-150);


    }

    private List<Fragment> getFragments() {
        List<Fragment> fList = new ArrayList<Fragment>();

        fList.add(MyFragment.newInstance(R.drawable.image1));
        fList.add(MyFragment.newInstance(R.drawable.image2));
        fList.add(MyFragment.newInstance(R.drawable.image3));
        fList.add(MyFragment.newInstance(R.drawable.image4));
        fList.add(MyFragment.newInstance(R.drawable.image5));
        fList.add(MyFragment.newInstance(R.drawable.image6));
        fList.add(MyFragment.newInstance(R.drawable.image7));
        fList.add(MyFragment.newInstance(R.drawable.image8));
        fList.add(MyFragment.newInstance(R.drawable.image9));
        fList.add(MyFragment.newInstance(R.drawable.image10));
        return fList;
    }

}

