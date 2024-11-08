package com.example.hw_3m_2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw_3m_2.databinding.FragmentOneBinding;

import java.io.Serializable;

public class OneFragment extends Fragment {

    private FragmentOneBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentOneBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Warrior warrior = new Warrior("Kai", 15, "AK-47");
                Bundle bundle = new Bundle();
                bundle.putSerializable("key", warrior);
                SecondFragment secondFragment = new SecondFragment();
                secondFragment.setArguments(bundle);
                getFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container_view, secondFragment, null)
                        .addToBackStack(null)
                        .commit();
            }
        });
    }
}