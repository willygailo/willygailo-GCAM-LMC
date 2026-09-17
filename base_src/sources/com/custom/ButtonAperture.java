package com.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.ToggleButton;
import com.Fix.Pref;
import com.Helper;
import com.google.android.apps.camera.legacy.app.activity.main.CameraActivity;

/* JADX INFO: loaded from: classes2.dex */
public class ButtonAperture extends ToggleButton {
    public static int SelState = 0;
    public CompoundButton.OnCheckedChangeListener myChangeListner;

    public ButtonAperture(Context context) {
        super(context);
        this.myChangeListner = new CompoundButton.OnCheckedChangeListener() { // from class: com.custom.ButtonAperture.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i = (ButtonAperture.SelState + 1) % 2;
                ButtonAperture.SelState = i;
                Helper.setValue("pref_aperture_key", i);
                ButtonAperture.this.UpdateUi(compoundButton.getContext());
                CameraActivity.ReInit();
            }
        };
        init(context);
    }

    public ButtonAperture(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.myChangeListner = new CompoundButton.OnCheckedChangeListener() { // from class: com.custom.ButtonAperture.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i = (ButtonAperture.SelState + 1) % 2;
                ButtonAperture.SelState = i;
                Helper.setValue("pref_aperture_key", i);
                ButtonAperture.this.UpdateUi(compoundButton.getContext());
                CameraActivity.ReInit();
            }
        };
        init(context);
    }

    public ButtonAperture(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.myChangeListner = new CompoundButton.OnCheckedChangeListener() { // from class: com.custom.ButtonAperture.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i2 = (ButtonAperture.SelState + 1) % 2;
                ButtonAperture.SelState = i2;
                Helper.setValue("pref_aperture_key", i2);
                ButtonAperture.this.UpdateUi(compoundButton.getContext());
                CameraActivity.ReInit();
            }
        };
        init(context);
    }

    public ButtonAperture(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.myChangeListner = new CompoundButton.OnCheckedChangeListener() { // from class: com.custom.ButtonAperture.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i3 = (ButtonAperture.SelState + 1) % 2;
                ButtonAperture.SelState = i3;
                Helper.setValue("pref_aperture_key", i3);
                ButtonAperture.this.UpdateUi(compoundButton.getContext());
                CameraActivity.ReInit();
            }
        };
        init(context);
    }

    public void UpdateUi(Context context) {
        switch (SelState) {
            case 0:
                setBackgroundResource(getResources().getIdentifier("aperture24", "drawable", context.getPackageName()));
                break;
            case 1:
                setBackgroundResource(getResources().getIdentifier("aperture15", "drawable", context.getPackageName()));
                break;
        }
        invalidate();
    }

    @Override // android.view.View
    public void getVisibility() {
        if (Pref.MenuValue("pref_show_button_aperture") == 0) {
            setVisibility(8);
        }
    }

    public void init(Context context) {
        SelState = Pref.MenuValue("pref_aperture_key");
        getVisibility();
        UpdateUi(context);
        setOnCheckedChangeListener(this.myChangeListner);
    }
}
