package slidenerd.vivz.swappableviewpager;

import android.support.v4.app.Fragment;

public class BaseFragment extends Fragment implements BackPressedListener{

    @Override
    public boolean onBackPressed() {
        // TODO Auto-generated method stub
        return new BackPressImplementation(this).onBackPressed();
    }
    
}
