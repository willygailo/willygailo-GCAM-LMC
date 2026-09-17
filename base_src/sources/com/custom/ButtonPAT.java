package com.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ToggleButton;
import com.Fix.Pref;
import com.Helper;

/* JADX INFO: loaded from: classes2.dex */
public class ButtonPAT extends ToggleButton {
    public static int SelState = 0;
    public CompoundButton.OnCheckedChangeListener myChangeListner;
    public View.OnClickListener myClickListener;

    public ButtonPAT(Context context) {
        super(context);
        this.myChangeListner = new CompoundButton.OnCheckedChangeListener() { // from class: com.custom.ButtonPAT.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i = (ButtonPAT.SelState + 1) % 2;
                ButtonPAT.SelState = i;
                Helper.setValue("pref_enable_patcher_key", i);
                ButtonPAT.this.UpdateUi(compoundButton.getContext());
            }
        };
        this.myClickListener = new View.OnClickListener() { // from class: com.custom.ButtonPAT.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws InterruptedException {
                Helper.onRestart();
            }
        };
        init(context);
    }

    public ButtonPAT(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.myChangeListner = new CompoundButton.OnCheckedChangeListener() { // from class: com.custom.ButtonPAT.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i = (ButtonPAT.SelState + 1) % 2;
                ButtonPAT.SelState = i;
                Helper.setValue("pref_enable_patcher_key", i);
                ButtonPAT.this.UpdateUi(compoundButton.getContext());
            }
        };
        this.myClickListener = new View.OnClickListener() { // from class: com.custom.ButtonPAT.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws InterruptedException {
                Helper.onRestart();
            }
        };
        init(context);
    }

    public ButtonPAT(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.myChangeListner = new CompoundButton.OnCheckedChangeListener() { // from class: com.custom.ButtonPAT.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i2 = (ButtonPAT.SelState + 1) % 2;
                ButtonPAT.SelState = i2;
                Helper.setValue("pref_enable_patcher_key", i2);
                ButtonPAT.this.UpdateUi(compoundButton.getContext());
            }
        };
        this.myClickListener = new View.OnClickListener() { // from class: com.custom.ButtonPAT.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws InterruptedException {
                Helper.onRestart();
            }
        };
        init(context);
    }

    public ButtonPAT(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.myChangeListner = new CompoundButton.OnCheckedChangeListener() { // from class: com.custom.ButtonPAT.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i3 = (ButtonPAT.SelState + 1) % 2;
                ButtonPAT.SelState = i3;
                Helper.setValue("pref_enable_patcher_key", i3);
                ButtonPAT.this.UpdateUi(compoundButton.getContext());
            }
        };
        this.myClickListener = new View.OnClickListener() { // from class: com.custom.ButtonPAT.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws InterruptedException {
                Helper.onRestart();
            }
        };
        init(context);
    }

    public void UpdateUi(Context context) {
        switch (SelState) {
            case 0:
                setBackgroundResource(getResources().getIdentifier("lib_off", "drawable", context.getPackageName()));
                break;
            case 1:
                setBackgroundResource(getResources().getIdentifier("lib_on", "drawable", context.getPackageName()));
                break;
        }
        invalidate();
    }

    @Override // android.view.View
    public void getVisibility() {
        if (Pref.MenuValue("pref_show_button_pat") == 0) {
            setVisibility(8);
        }
    }

    public void init(Context context) {
        SelState = Pref.MenuValue("pref_enable_patcher_key");
        getVisibility();
        UpdateUi(context);
        setOnCheckedChangeListener(this.myChangeListner);
        setOnClickListener(this.myClickListener);
    }
}
