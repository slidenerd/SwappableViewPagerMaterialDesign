
package slidenerd.vivz.swappableviewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 */
public class A2 extends BaseFragment {

    public A2() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        L.m("onCreateView A2");
        View view = inflater.inflate(R.layout.fragment_a2, container, false);
        Button navigate = (Button) view.findViewById(R.id.button_navigate);
        navigate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                L.m("onClick A2");
                nextFragment();
            }
        });
        L.m("container ID of A2 " + container.getId());
        return view;
    }

    private void nextFragment() {
        // TODO Auto-generated method stub
        L.m("nextFragment A3");
        A3 a3 = new A3();
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.addToBackStack(null);
        transaction.replace(R.id.fragment_layout_container, a3).commit();
    }

}
