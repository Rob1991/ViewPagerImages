package am.aca.viewpagerimages;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;
import android.widget.TextView;


public class MyFragment extends Fragment {

    public static final String IMAGE_NAME = "IMAGE_NAME";

    public static MyFragment newInstance(int img) {
        MyFragment fragment = new MyFragment();
        Bundle args = new Bundle();

        args.putInt(IMAGE_NAME, img);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_my, container, false);

        int img = getArguments().getInt(IMAGE_NAME);

        ImageView image = v.findViewById(R.id.imageView);
        image.setImageResource(img);
        return v;
    }


}
