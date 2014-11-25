package slidenerd.vivz.swappableviewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

public class BackPressImplementation implements BackPressedListener{

    private Fragment parent=null;
    public BackPressImplementation(Fragment parent) {
        // TODO Auto-generated constructor stub
        this.parent=parent;
        
    }
    @Override
    public boolean onBackPressed() {
        // TODO Auto-generated method stub
        if(parent==null) return false;
        int childCount=parent.getChildFragmentManager().getBackStackEntryCount();
        if(childCount==0){
            return false;
        }
        else{
            FragmentManager childFragmentManager=parent.getChildFragmentManager();
            BackPressedListener backPressedListener=(BackPressedListener) childFragmentManager.getFragments().get(0);
            if(!backPressedListener.onBackPressed()){
                childFragmentManager.popBackStackImmediate();
            }
            return true;
        }

    }

}
