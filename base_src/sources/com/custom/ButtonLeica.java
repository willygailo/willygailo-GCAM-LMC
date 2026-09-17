package com.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.ToggleButton;
import com.Fix.Pref;
import com.Helper;
import com.google.android.apps.camera.legacy.app.activity.main.CameraActivity;

/* JADX INFO: loaded from: classes2.dex */
public class ButtonLeica extends ToggleButton {
    public static int SelState = 0;
    public CompoundButton.OnCheckedChangeListener myChangeListner;

    public ButtonLeica(Context context) {
        super(context);
        this.myChangeListner = new CompoundButton.OnCheckedChangeListener() { // from class: com.custom.ButtonLeica.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i = (ButtonLeica.SelState + 1) % 2;
                ButtonLeica.SelState = i;
                Helper.setValue("pref_shading_mode_key", i);
                ButtonLeica.this.UpdateUi(compoundButton.getContext());
                CameraActivity.ReInit();
            }
        };
        init(context);
    }

    public ButtonLeica(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.myChangeListner = new CompoundButton.OnCheckedChangeListener() { // from class: com.custom.ButtonLeica.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i = (ButtonLeica.SelState + 1) % 2;
                ButtonLeica.SelState = i;
                Helper.setValue("pref_shading_mode_key", i);
                ButtonLeica.this.UpdateUi(compoundButton.getContext());
                CameraActivity.ReInit();
            }
        };
        init(context);
    }

    public ButtonLeica(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.myChangeListner = new CompoundButton.OnCheckedChangeListener() { // from class: com.custom.ButtonLeica.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i2 = (ButtonLeica.SelState + 1) % 2;
                ButtonLeica.SelState = i2;
                Helper.setValue("pref_shading_mode_key", i2);
                ButtonLeica.this.UpdateUi(compoundButton.getContext());
                CameraActivity.ReInit();
            }
        };
        init(context);
    }

    public ButtonLeica(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.myChangeListner = new CompoundButton.OnCheckedChangeListener() { // from class: com.custom.ButtonLeica.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i3 = (ButtonLeica.SelState + 1) % 2;
                ButtonLeica.SelState = i3;
                Helper.setValue("pref_shading_mode_key", i3);
                ButtonLeica.this.UpdateUi(compoundButton.getContext());
                CameraActivity.ReInit();
            }
        };
        init(context);
    }

    public void UpdateUi(Context context) {
        switch (SelState) {
            case 0:
                setBackgroundResource(getResources().getIdentifier("leica_off", "drawable", context.getPackageName()));
                break;
            case 1:
                setBackgroundResource(getResources().getIdentifier("leica_on", "drawable", context.getPackageName()));
                break;
        }
        invalidate();
    }

    @Override // android.view.View
    public void getVisibility() {
        if (Pref.MenuValue("pref_show_button_leica") == 0) {
            setVisibility(8);
        }
    }

    public void init(Context context) {
        SelState = Pref.MenuValue("pref_shading_mode_key");
        getVisibility();
        UpdateUi(context);
        setOnCheckedChangeListener(this.myChangeListner);
    }
}
