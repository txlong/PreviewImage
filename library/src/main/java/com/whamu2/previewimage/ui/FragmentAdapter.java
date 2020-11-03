package com.whamu2.previewimage.ui;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author whamu2
 * @date 2018/7/23
 */
public class FragmentAdapter extends FragmentPagerAdapter {
    private List<Fragment> fragments = new ArrayList<>();

    FragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    public void add(Fragment fragment) {
        fragments.add(fragment);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
