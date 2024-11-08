package com.example.hw_3m_2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw_3m_2.databinding.FragmentSecondBinding;

import java.io.Serializable;


public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSecondBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if(getArguments() != null) {
            Serializable warrior = getArguments().getSerializable("key");
            String text = "Name: " + ((Warrior) warrior).getName() + "\n" +
                    "Level: " + ((Warrior) warrior).getLevel() + "\n" +
                    "Weapon: " + ((Warrior) warrior).getWeapon();
            binding.textview.setText(text);

        }
    }
}