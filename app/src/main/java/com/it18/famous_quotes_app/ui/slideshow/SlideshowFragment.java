package com.it18.famous_quotes_app.ui.slideshow;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.it18.famous_quotes_app.R;
import com.it18.famous_quotes_app.databinding.FragmentSlideshowBinding;

public class SlideshowFragment extends Fragment {

    private SlideshowViewModel slideshowViewModel;
    private FragmentSlideshowBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        slideshowViewModel =
                new ViewModelProvider(this).get(SlideshowViewModel.class);

        binding = FragmentSlideshowBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        Button share;
        TextView txt;
        share=root.findViewById(R.id.btn);
        txt=root.findViewById(R.id.btntext);
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
        share1=root.findViewById(R.id.btn1);
        txt1=root.findViewById(R.id.btntext1);
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
        share2=root.findViewById(R.id.btn2);
        txt2=root.findViewById(R.id.btntext2);
        share2.setOnClickListener(view->{
            String sharetext2=txt2.getText().toString();
            Intent action=new Intent();
            action.setAction(Intent.ACTION_SEND);
            action.setType("text/plain");
            action.putExtra(Intent.EXTRA_TEXT,sharetext2);
            startActivity(action);
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}