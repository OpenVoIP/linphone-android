package org.linphone.flutter;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentTransaction;

import org.linphone.R;
import org.linphone.activities.MainActivity;
import io.flutter.embedding.android.FlutterFragment;
import io.flutter.embedding.android.RenderMode;
import io.flutter.embedding.android.TransparencyMode;

public class FlutterActivity extends MainActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FragmentTransaction tx = getSupportFragmentManager().beginTransaction();
        FlutterFragment flutterFragment = FlutterFragment.withNewEngine()
                .renderMode(RenderMode.texture)
                .transparencyMode (TransparencyMode.transparent)
                .build();
        tx.replace(R.id.fragmentContainer,flutterFragment);
        tx.commitAllowingStateLoss();
    }
}