package com.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.ToggleButton;
import com.Fix.Pref;
import com.Helper;
import com.google.android.apps.camera.legacy.app.activity.main.CameraActivity;

/* JADX INFO: loaded from: classes2.dex */
public class ButtonOIS extends ToggleButton {
    public static int SelState = 0;
    public CompoundButton.OnCheckedChangeListener myChangeListner;

    public ButtonOIS(Context context) {
        super(context);
        this.myChangeListner = new CompoundButton.OnCheckedChangeListener() { // from class: com.custom.ButtonOIS.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i = (ButtonOIS.SelState + 1) % 2;
                ButtonOIS.SelState = i;
                Helper.setValue("pref_ois_key", i);
                ButtonOIS.this.UpdateUi(compoundButton.getContext());
                CameraActivity.ReInit();
            }
        };
        init(context);
    }

    public ButtonOIS(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.myChangeListner = new CompoundButton.OnCheckedChangeListener() { // from class: com.custom.ButtonOIS.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i = (ButtonOIS.SelState + 1) % 2;
                ButtonOIS.SelState = i;
                Helper.setValue("pref_ois_key", i);
                ButtonOIS.this.UpdateUi(compoundButton.getContext());
                CameraActivity.ReInit();
            }
        };
        init(context);
    }

    public ButtonOIS(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.myChangeListner = new CompoundButton.OnCheckedChangeListener() { // from class: com.custom.ButtonOIS.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i2 = (ButtonOIS.SelState + 1) % 2;
                ButtonOIS.SelState = i2;
                Helper.setValue("pref_ois_key", i2);
                ButtonOIS.this.UpdateUi(compoundButton.getContext());
                CameraActivity.ReInit();
            }
        };
        init(context);
    }

    public ButtonOIS(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.myChangeListner = new CompoundButton.OnCheckedChangeListener() { // from class: com.custom.ButtonOIS.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i3 = (ButtonOIS.SelState + 1) % 2;
                ButtonOIS.SelState = i3;
                Helper.setValue("pref_ois_key", i3);
                ButtonOIS.this.UpdateUi(compoundButton.getContext());
                CameraActivity.ReInit();
            }
        };
        init(context);
    }

    public void UpdateUi(Context context) {
        switch (SelState) {
            case 0:
                setBackgroundResource(getResources().getIdentifier("ois_off", "drawable", context.getPackageName()));
                break;
            case 1:
                setBackgroundResource(getResources().getIdentifier("ois_on", "drawable", context.getPackageName()));
                break;
        }
        invalidate();
    }

    @Override // android.view.View
    public void getVisibility() {
        if (Pref.MenuValue("pref_show_button_ois") == 0) {
            setVisibility(8);
        }
    }

    public void init(Context context) {
        SelState = Pref.MenuValue("pref_ois_key");
        getVisibility();
        UpdateUi(context);
        setOnCheckedChangeListener(this.myChangeListner);
    }
}
