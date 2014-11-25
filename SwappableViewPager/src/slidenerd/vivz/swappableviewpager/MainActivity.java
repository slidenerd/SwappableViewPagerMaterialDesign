
package slidenerd.vivz.swappableviewpager;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends ActionBarActivity {

    private TabbedFragment tabbedFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeButtonEnabled(true);
        if (savedInstanceState == null) {
            // withholding the previously created fragment from being created
            // again
            // On orientation change, it will prevent fragment recreation
            // its necessary to reserving the fragment stack inside each tab
            L.m("onCreate first time");
            initScreen();

        } else {
            // restoring the previously created fragment
            // and getting the reference
            L.m("onCreate sub time");
            tabbedFragment = (TabbedFragment) getSupportFragmentManager().getFragments().get(0);
        }
    }

    private void initScreen() {
        // TODO Auto-generated method stub
        tabbedFragment = new TabbedFragment();

        final FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.container, tabbedFragment)
                .commit();
        L.m("initScreen replaced with tabfragment");
    }

    @Override
    public void onBackPressed() {
        // TODO Auto-generated method stub
        L.m("MainActivity onBackPressed");
        if (!tabbedFragment.onBackPressed()) {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
