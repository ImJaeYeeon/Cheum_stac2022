package com.example.cheum_stac;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.LinearLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private FragmentManager fragmentManager = getSupportFragmentManager();
    private HomeFragment homeFragment = new HomeFragment();
    private MapFragment mapFragment = new MapFragment();
    private KategorieFragment kategorieFragment = new KategorieFragment();
    private MyPageFragment myPageFragment = new MyPageFragment();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frameLayout, homeFragment).commitAllowingStateLoss();

        BottomNavigationView bottomNavigationView = findViewById(R.id.btn_navi_menu);
        bottomNavigationView.setOnNavigationItemSelectedListener(new ItemSelectedListener());
    }

     class ItemSelectedListener implements BottomNavigationView.OnNavigationItemSelectedListener {
         @Override
         public boolean onNavigationItemSelected(@NonNull MenuItem item) {
             FragmentTransaction transaction = fragmentManager.beginTransaction();
             switch (item.getItemId()){
                 case R.id.tab_home:
                     transaction.replace(R.id.frameLayout,homeFragment).commitAllowingStateLoss();
                     break;
                 case R.id.tab_map:
                     transaction.replace(R.id.frameLayout,mapFragment).commitAllowingStateLoss();
                     break;
                 case R.id.tab_kate:
                     transaction.replace(R.id.frameLayout,kategorieFragment).commitAllowingStateLoss();
                     break;
                 case R.id.tab_my:
                     transaction.replace(R.id.frameLayout,myPageFragment).commitAllowingStateLoss();
                     break;
             }
             return false;
         }
     }
}