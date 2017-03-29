package com.example.qing.viewpagertest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by qing on 17-3-29.
 */

public class SecFragment extends Fragment {
    public static final String ARG_OBJECT = "object";

    private int pageNum;

    public SecFragment(int pageNum) {
        this.pageNum = pageNum;
    }


    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate( R.layout.fragment_page2, container, false);
        Button mButton = (Button) rootView.findViewById(R.id.btn);

        mButton.setText("btn"+pageNum);
        return rootView;
    }
}
