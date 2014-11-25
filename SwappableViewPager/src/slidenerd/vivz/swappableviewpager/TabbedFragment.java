
package slidenerd.vivz.swappableviewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 */
public class TabbedFragment extends Fragment {

    private ViewPager viewPager;
    private TabAdapter adapter;

    public TabbedFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tabbed, container, false);
        viewPager = (ViewPager) view.findViewById(R.id.tab_pager);
        L.m("onCreateView TabbedFragment");
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onActivityCreated(savedInstanceState);
        adapter = new TabAdapter(getChildFragmentManager());
        viewPager.setAdapter(adapter);
        L.m("onActivityCreated");
    }

    public boolean onBackPressed() {
        // TODO Auto-generated method stub
        L.m("onBackPressed");
        BackPressedListener currentFragment = (BackPressedListener) adapter.getFragment(viewPager
                .getCurrentItem());
        if (currentFragment != null) {
            return currentFragment.onBackPressed();
        }
        return false;
    }

}
