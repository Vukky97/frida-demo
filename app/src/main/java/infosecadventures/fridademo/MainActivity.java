package infosecadventures.fridademo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import infosecadventures.fridademo.fragments.PinBypass;
import infosecadventures.fridademo.fragments.RootBypass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.navigation_home:
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.frame, new PinBypass())
                                .commit();
                        return true;
                    case R.id.navigation_dashboard:
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.frame, new RootBypass())
                                .commit();
                        return true;
                    case R.id.navigation_notifications:
                        return true;
                }
                return false;
            }
        });
        navigation.setSelectedItemId(R.id.navigation_home);
    }
}
