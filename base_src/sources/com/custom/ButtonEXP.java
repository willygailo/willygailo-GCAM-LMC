package com.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.ToggleButton;
import com.Fix.Pref;
import com.Helper;

/* JADX INFO: loaded from: classes2.dex */
public class ButtonEXP extends ToggleButton {
    public static int SelState = 0;
    public CompoundButton.OnCheckedChangeListener myChangeListner;

    public ButtonEXP(Context context) {
        super(context);
        this.myChangeListner = new CompoundButton.OnCheckedChangeListener() { // from class: com.custom.ButtonEXP.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i = (ButtonEXP.SelState + 1) % 2;
                ButtonEXP.SelState = i;
                Helper.setValue("auto_exp_key", i);
                ButtonEXP.this.UpdateUi(compoundButton.getContext());
            }
        };
        init(context);
    }

    public ButtonEXP(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.myChangeListner = new CompoundButton.OnCheckedChangeListener() { // from class: com.custom.ButtonEXP.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i = (ButtonEXP.SelState + 1) % 2;
                ButtonEXP.SelState = i;
                Helper.setValue("auto_exp_key", i);
                ButtonEXP.this.UpdateUi(compoundButton.getContext());
            }
        };
        init(context);
    }

    public ButtonEXP(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.myChangeListner = new CompoundButton.OnCheckedChangeListener() { // from class: com.custom.ButtonEXP.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i2 = (ButtonEXP.SelState + 1) % 2;
                ButtonEXP.SelState = i2;
                Helper.setValue("auto_exp_key", i2);
                ButtonEXP.this.UpdateUi(compoundButton.getContext());
            }
        };
        init(context);
    }

    public ButtonEXP(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.myChangeListner = new CompoundButton.OnCheckedChangeListener() { // from class: com.custom.ButtonEXP.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i3 = (ButtonEXP.SelState + 1) % 2;
                ButtonEXP.SelState = i3;
                Helper.setValue("auto_exp_key", i3);
                ButtonEXP.this.UpdateUi(compoundButton.getContext());
            }
        };
        init(context);
    }

    public void UpdateUi(Context context) {
        switch (SelState) {
            case 0:
                setBackgroundResource(getResources().getIdentifier("pref_exp_off", "drawable", context.getPackageName()));
                break;
            case 1:
                setBackgroundResource(getResources().getIdentifier("pref_exp_on", "drawable", context.getPackageName()));
                break;
        }
        invalidate();
    }

    @Override // android.view.View
    public void getVisibility() {
        if (Pref.MenuValue("pref_show_button_exp") == 0) {
            setVisibility(8);
        }
    }

    public void init(Context context) {
        SelState = Pref.MenuValue("auto_exp_key");
        getVisibility();
        UpdateUi(context);
        setOnCheckedChangeListener(this.myChangeListner);
    }
}
