package com.it18.famous_quotes_app.ui.myFragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.it18.famous_quotes_app.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link william_shakespeare#newInstance} factory method to
 * create an instance of this fragment.
 */
public class william_shakespeare extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public william_shakespeare() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment william_shakespeare.
     */
    // TODO: Rename and change types and number of parameters
    public static william_shakespeare newInstance(String param1, String param2) {
        william_shakespeare fragment = new william_shakespeare();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_william_shakespeare, container, false);
        Button share;
        TextView txt;
        share=v.findViewById(R.id.btn);
        txt=v.findViewById(R.id.btntext);
        share.setOnClickListener(view->{
            String sharetext=txt.getText().toString();
            Intent action=new Intent();
            action.setAction(Intent.ACTION_SEND);
            action.setType("text/plain");
            action.putExtra(Intent.EXTRA_TEXT,sharetext);
            startActivity(action);
        });
        //quote2
        Button share1;
        TextView txt1;
        share1=v.findViewById(R.id.btn1);
        txt1=v.findViewById(R.id.btntext1);
        share1.setOnClickListener(view->{
            String sharetext1=txt1.getText().toString();
            Intent action=new Intent();
            action.setAction(Intent.ACTION_SEND);
            action.setType("text/plain");
            action.putExtra(Intent.EXTRA_TEXT,sharetext1);
            startActivity(action);
        });
        //quote3
        Button share2;
        TextView txt2;
        share2=v.findViewById(R.id.btn2);
        txt2=v.findViewById(R.id.btntext2);
        share2.setOnClickListener(view->{
            String sharetext2=txt2.getText().toString();
            Intent action=new Intent();
            action.setAction(Intent.ACTION_SEND);
            action.setType("text/plain");
            action.putExtra(Intent.EXTRA_TEXT,sharetext2);
            startActivity(action);
        });
    return v;
    }
}