package com.example.a16022970.demofragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentFirst extends Fragment {
    Button btnAddText;
    TextView tvFrag1;

    public FragmentFirst() {
        // Required empty public constructor
    }

//    implement a Click Event Action where clicking the Button will append some text to the TextView.
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        tvFrag1 = (TextView) view.findViewById(R.id.tvFrag1);
        btnAddText = (Button) view.findViewById(R.id.btnAddTextFrag1);

        btnAddText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = tvFrag1.getText().toString() + "\n" + "New Data";
                tvFrag1.setText(data);
            }
        });

        return view;

        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_first, container, false);
    }

}