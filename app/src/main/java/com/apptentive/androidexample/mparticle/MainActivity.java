package com.apptentive.androidexample.mparticle;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.support.design.widget.NavigationView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.apptentive.android.sdk.Apptentive;
import com.mparticle.MPEvent;
import com.mparticle.MParticle;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                logEvent("fab_clicked", MParticle.EventType.Navigation);
            }
        });

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
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

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            logEvent("action_settings", MParticle.EventType.Navigation);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        if (id == R.id.nav_camera) {
            logEvent("nav_camera", MParticle.EventType.Navigation);
        } else if (id == R.id.nav_gallery) {
            logEvent("nav_gallery", MParticle.EventType.Navigation);
        } else if (id == R.id.nav_slideshow) {
            logEvent("nav_slideshow", MParticle.EventType.Navigation);
        } else if (id == R.id.nav_manage) {
            logEvent("nav_manage", MParticle.EventType.Navigation);
        } else if (id == R.id.nav_share) {
            logEvent("nav_share", MParticle.EventType.Navigation);
        } else if (id == R.id.nav_send) {
            logEvent("nav_send", MParticle.EventType.Navigation);
            if (MParticle.getInstance().isKitActive(MParticle.ServiceProviders.APPTENTIVE)) {
                Apptentive.showMessageCenter(this);
            }
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void logEvent(String name, MParticle.EventType eventType) {
        MPEvent event = new MPEvent.Builder(name, eventType).build();
        MParticle.getInstance().logEvent(event);

    }
}