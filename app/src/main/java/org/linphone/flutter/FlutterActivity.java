package org.linphone.flutter;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentTransaction;

import org.linphone.R;
import org.linphone.activities.MainActivity;

import io.flutter.facade.Flutter;


public class FlutterActivity extends MainActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FragmentTransaction tx = getSupportFragmentManager().beginTransaction();
        tx.replace(R.id.fragmentContainer, Flutter.createFragment("route1"));
        tx.commit();
    }
}