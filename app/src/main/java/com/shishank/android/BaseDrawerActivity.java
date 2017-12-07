package com.shishank.android;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.FrameLayout;

public abstract class BaseDrawerActivity extends BaseActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private FrameLayout container;
    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(com.shishank.android.R.layout.activity_base_drawer);
        Toolbar toolbar = (Toolbar) findViewById(com.shishank.android.R.id.toolbar);
        setSupportActionBar(toolbar);

        container = (FrameLayout)findViewById(com.shishank.android.R.id.drawer_container);
        drawerLayout = (DrawerLayout) findViewById(com.shishank.android.R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar, com.shishank.android.R.string.navigation_drawer_open, com.shishank.android.R.string.navigation_drawer_close);
        drawerLayout.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(com.shishank.android.R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void setContentView(int layoutResId) {
        getLayoutInflater().inflate(layoutResId, container, true);
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == com.shishank.android.R.id.nav_camera) {
            // Handle the camera action
        } else if (id == com.shishank.android.R.id.nav_gallery) {

        } else if (id == com.shishank.android.R.id.nav_slideshow) {

        } else if (id == com.shishank.android.R.id.nav_manage) {

        } else if (id == com.shishank.android.R.id.nav_share) {

        } else if (id == com.shishank.android.R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(com.shishank.android.R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}