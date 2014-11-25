
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
public class A1 extends BaseFragment {

    public A1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        L.m("onCreateView A1");
        View view = inflater.inflate(R.layout.fragment_a1, container, false);
        Button navigate = (Button) view.findViewById(R.id.button_navigate);
        navigate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                L.m("onClick A1");
                nextFragment();
            }

        });
        L.m("container ID of A1 " + container.getId());
        return view;
    }

    private void nextFragment() {
        // TODO Auto-generated method stub
        L.m("nextFragment from A1F");
        A2 a2 = new A2();
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.addToBackStack(null);
        transaction.replace(R.id.fragment_layout_container, a2).commit();

    }
}
