package com.instacloud.order2fse.ui.Login;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.instacloud.order2fse.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoginTextFragment extends Fragment {


    public LoginTextFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login_text, container, false);
    }

}