
package slidenerd.vivz.swappableviewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.SparseArray;
import android.view.ViewGroup;

public class TabAdapter extends FragmentPagerAdapter {

    private SparseArray<Fragment> array = new SparseArray<>();

    public TabAdapter(FragmentManager fm) {
        super(fm);
        // TODO Auto-generated constructor stub
    }

    @Override
    public Fragment getItem(int arg0) {
        // TODO Auto-generated method stub
        Fragment item = null;
        switch (arg0) {
            case 0:
                item = new A1();
                break;
            case 1:
                item = new B1();
                break;
            case 2:
                item = new C1();
                break;
            default:
                item = null;
                break;
        }
        return item;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // TODO Auto-generated method stub
        String title = null;
        switch (position) {
            case 0:
                title = "TAB 1";
                break;
            case 1:
                title = "TAB 2";
                break;
            case 2:
                title = "TAB 3";
                break;
            default:
                title = "NA";
                break;
        }
        return title;
    }

    @Override
    public Object instantiateItem(ViewGroup arg0, int arg1) {
        // TODO Auto-generated method stub
        Fragment fragment = (Fragment) super.instantiateItem(arg0, arg1);
        array.put(arg1, fragment);
        return fragment;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        // TODO Auto-generated method stub
        array.remove(position);
        super.destroyItem(container, position, object);
    }

    public Fragment getFragment(int position) {
        return array.get(position);
    }
}
