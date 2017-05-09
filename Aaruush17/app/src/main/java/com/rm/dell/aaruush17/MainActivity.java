package com.rm.dell.aaruush17;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
DrawerLayout drawerLayout;
    Toolbar toolbar;
    ActionBarDrawerToggle actionBarDrawerToggle;
    FragmentTransaction fragmentTransaction;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.drawer_open,R.string.drawer_close);
        drawerLayout.setDrawerListener(actionBarDrawerToggle);

        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.main_container,new home_fragment());
        fragmentTransaction.commit();
        getSupportActionBar().setTitle("Home");
        navigationView =(NavigationView)findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener(){
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
               switch (item.getItemId()){
                   case R.id.home_id:
                       fragmentTransaction = getSupportFragmentManager().beginTransaction();
                       fragmentTransaction.replace(R.id.main_container,new home_fragment());
                       fragmentTransaction.commit();
                       getSupportActionBar().setTitle("Home");
                       item.setChecked(true);
                       drawerLayout.closeDrawers();
                       break;

                   case R.id.domains_id:
                       fragmentTransaction = getSupportFragmentManager().beginTransaction();
                       fragmentTransaction.replace(R.id.main_container,new domains_fragment());
                       fragmentTransaction.commit();
                       getSupportActionBar().setTitle("Domains");
                       item.setChecked(true);
                       drawerLayout.closeDrawers();
                       break;

                   case R.id.workshops_id:
                       fragmentTransaction = getSupportFragmentManager().beginTransaction();
                       fragmentTransaction.replace(R.id.main_container,new workshops_fragment());
                       fragmentTransaction.commit();
                       getSupportActionBar().setTitle("Workshops");
                       item.setChecked(true);
                       drawerLayout.closeDrawers();
                       break;

                   case R.id.favourites_id:
                       fragmentTransaction = getSupportFragmentManager().beginTransaction();
                       fragmentTransaction.replace(R.id.main_container,new favourites());
                       fragmentTransaction.commit();
                       getSupportActionBar().setTitle("Favourites");
                       item.setChecked(true);
                       drawerLayout.closeDrawers();
                       break;

                   case R.id.highlights_id:
                       fragmentTransaction = getSupportFragmentManager().beginTransaction();
                       fragmentTransaction.replace(R.id.main_container,new highlights_fragment());
                       fragmentTransaction.commit();
                       getSupportActionBar().setTitle("Highlights");
                       item.setChecked(true);
                       drawerLayout.closeDrawers();
                       break;

                   case R.id.sponsors_id:
                       fragmentTransaction = getSupportFragmentManager().beginTransaction();
                       fragmentTransaction.replace(R.id.main_container,new Sponsors_fragment());
                       fragmentTransaction.commit();
                       getSupportActionBar().setTitle("Sponsors");
                       item.setChecked(true);
                       drawerLayout.closeDrawers();
                       break;

                   case R.id.patrons_id:
                       fragmentTransaction = getSupportFragmentManager().beginTransaction();
                       fragmentTransaction.replace(R.id.main_container,new patrons_fragment());
                       fragmentTransaction.commit();
                       getSupportActionBar().setTitle("Patrons");
                       item.setChecked(true);
                       drawerLayout.closeDrawers();
                       break;

                   case R.id.team_id:
                       fragmentTransaction = getSupportFragmentManager().beginTransaction();
                       fragmentTransaction.replace(R.id.main_container,new team_fragment());
                       fragmentTransaction.commit();
                       getSupportActionBar().setTitle("Team");
                       item.setChecked(true);
                       drawerLayout.closeDrawers();
                       break;

                   case R.id.credits_id:
                       fragmentTransaction = getSupportFragmentManager().beginTransaction();
                       fragmentTransaction.replace(R.id.main_container,new credits_fragment());
                       fragmentTransaction.commit();
                       getSupportActionBar().setTitle("Creatives");
                       item.setChecked(true);
                       drawerLayout.closeDrawers();
                       break;

               }



                return true;
            }
        });
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        actionBarDrawerToggle.syncState();
    }
}
