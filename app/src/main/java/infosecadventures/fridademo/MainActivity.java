package infosecadventures.fridademo;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import infosecadventures.fridademo.fragments.EncryptionKey;
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
                    case R.id.pin_bypass:
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.frame, new PinBypass())
                                .commit();
                        return true;
                    case R.id.root_bypass:
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.frame, new RootBypass())
                                .commit();
                        return true;
                    case R.id.encryption_key:
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.frame, new EncryptionKey())
                                .commit();
                        return true;
                }
                return false;
            }
        });
        navigation.setSelectedItemId(R.id.pin_bypass);
    }
}
