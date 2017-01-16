package com.survy.slidingpanel;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Page2Fragment extends Fragment {

    Button backButton;

    public Page2Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_page2, container, false);

        backButton = (Button) rootView.findViewById(R.id.previous_page_button);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pop fragment off of back stack if it exists,
                // or exit activity.
                int backStackEntryCount = getFragmentManager().getBackStackEntryCount();
                if (backStackEntryCount > 0) {
                    getFragmentManager().popBackStack();
                }
                else {
                    getActivity().finish();
                    getActivity().overridePendingTransition(R.anim.enter_from_left, R.anim.exit_to_right);
                }
            }
        });

        return rootView;
    }

}
