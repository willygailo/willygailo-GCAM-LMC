package com.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.ToggleButton;
import com.Fix.Pref;
import com.google.android.apps.camera.legacy.app.activity.main.CameraActivity;

/* JADX INFO: loaded from: classes2.dex */
public class OneShot extends ToggleButton {
    public static int OneShotState = Pref.MenuValue("pref_oneshot_key");
    public CompoundButton.OnCheckedChangeListener myChangeListner;

    public OneShot(Context context) {
        super(context);
        this.myChangeListner = new CompoundButton.OnCheckedChangeListener() { // from class: com.custom.OneShot.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                OneShot.OneShotState = OneShot.OneShotState != 0 ? 0 : 1;
                OneShot.this.UpdateUi(compoundButton.getContext());
                CameraActivity.ReInit();
            }
        };
        init(context);
    }

    public OneShot(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.myChangeListner = new CompoundButton.OnCheckedChangeListener() { // from class: com.custom.OneShot.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                OneShot.OneShotState = OneShot.OneShotState != 0 ? 0 : 1;
                OneShot.this.UpdateUi(compoundButton.getContext());
                CameraActivity.ReInit();
            }
        };
        init(context);
    }

    public OneShot(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.myChangeListner = new CompoundButton.OnCheckedChangeListener() { // from class: com.custom.OneShot.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                OneShot.OneShotState = OneShot.OneShotState != 0 ? 0 : 1;
                OneShot.this.UpdateUi(compoundButton.getContext());
                CameraActivity.ReInit();
            }
        };
        init(context);
    }

    public OneShot(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.myChangeListner = new CompoundButton.OnCheckedChangeListener() { // from class: com.custom.OneShot.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                OneShot.OneShotState = OneShot.OneShotState != 0 ? 0 : 1;
                OneShot.this.UpdateUi(compoundButton.getContext());
                CameraActivity.ReInit();
            }
        };
        init(context);
    }

    public void UpdateUi(Context context) {
        switch (OneShotState) {
            case 0:
                setBackgroundResource(getResources().getIdentifier("tog_trail_off", "drawable", context.getPackageName()));
                break;
            case 1:
                setBackgroundResource(getResources().getIdentifier("tog_trail_on", "drawable", context.getPackageName()));
                break;
        }
        invalidate();
    }

    public void init(Context context) {
        UpdateUi(context);
        setOnCheckedChangeListener(this.myChangeListner);
    }
}
