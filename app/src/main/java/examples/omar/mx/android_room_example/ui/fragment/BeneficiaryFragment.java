package examples.omar.mx.android_room_example.ui.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import examples.omar.mx.android_room_example.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BeneficiaryFragment extends Fragment {


    public BeneficiaryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_beneficiary, container, false);
    }

}
