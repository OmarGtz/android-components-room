package examples.omar.mx.android_room_example.ui.activity;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import examples.omar.mx.android_room_example.R;
import examples.omar.mx.android_room_example.ui.fragment.BeneficiaryFragment;
import examples.omar.mx.android_room_example.ui.fragment.DonationFragment;
import examples.omar.mx.android_room_example.ui.fragment.SyncFragment;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private BottomNavigationView bottomNavigationView;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.main_navigation_bottom);
        toolbar = findViewById(R.id.main_toolbar);
        setToolbar();
        bottomNavigationView.setSelectedItemId(R.id.nav_menu_comunidad);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.nav_menu_comunidad);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        SearchView searchView = (SearchView) searchItem.getActionView();
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    public void setToolbar(){
        if(toolbar!=null){
            setSupportActionBar(toolbar);
            ActionBar ab = getSupportActionBar();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){

            case R.id.nav_menu_comunidad:
                changeFragment(new DonationFragment());
                //getSupportActionBar().setTitle("Baja California Sur");
                break;

            case R.id.nav_afiliado:
                changeFragment(new BeneficiaryFragment());
                //getSupportActionBar().setTitle("Beneficiarios");
                //getSupportActionBar().setSubtitle("");

                break;

            case R.id.nav_sync_up:
                changeFragment(new SyncFragment());
                //getSupportActionBar().setTitle("Syncronizar");
                //getSupportActionBar().setSubtitle("");
                break;

            default:
                changeFragment(new DonationFragment());

                break;
        }

        return true;
    }


    public void changeFragment(Fragment f){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.main_content,f)
                .commit();
    }


    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
