package com.example.qing.viewpagertest;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by qing on 17-3-21.
 */

public class MyFragment extends Fragment{
    public static final String ARG_OBJECT = "object";

    private int pageNum;

    public MyFragment(int pageNum) {
        this.pageNum = pageNum;
    }


    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate( R.layout.fragment_page, container, false);
        TextView mTextView = (TextView) rootView.findViewById(R.id.txt);

        mTextView.setText(""+pageNum);
        return rootView;
    }

}
