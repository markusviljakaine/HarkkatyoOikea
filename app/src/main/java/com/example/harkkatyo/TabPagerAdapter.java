package com.example.harkkatyo;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.harkkatyo.Fragments.Koti;
import com.example.harkkatyo.Fragments.Kuollut;
import com.example.harkkatyo.Fragments.Taistelu;
import com.example.harkkatyo.Fragments.Treeni;

public class TabPagerAdapter extends FragmentStateAdapter {
    public TabPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new Koti();
            case 1:
                return new Treeni();
            case 2:
                return new Taistelu();
            case 3:
                return new Kuollut();

            default:
                return new Koti();
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
