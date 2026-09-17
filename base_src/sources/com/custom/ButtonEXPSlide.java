package com.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ToggleButton;
import com.Fix.Pref;
import com.Helper;

/* JADX INFO: loaded from: classes2.dex */
public class ButtonEXPSlide extends ToggleButton {
    public static int SelState = 0;
    public CompoundButton.OnCheckedChangeListener myChangeListner;
    public View.OnClickListener myClickListener;

    public ButtonEXPSlide(Context context) {
        super(context);
        this.myChangeListner = new CompoundButton.OnCheckedChangeListener() { // from class: com.custom.ButtonEXPSlide.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i = (ButtonEXPSlide.SelState + 1) % 2;
                ButtonEXPSlide.SelState = i;
                Helper.setValue("pref_pro_key", i);
                ButtonEXPSlide.this.UpdateUi(compoundButton.getContext());
            }
        };
        this.myClickListener = new View.OnClickListener() { // from class: com.custom.ButtonEXPSlide.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws InterruptedException {
                Helper.onRestart();
            }
        };
        init(context);
    }

    public ButtonEXPSlide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.myChangeListner = new CompoundButton.OnCheckedChangeListener() { // from class: com.custom.ButtonEXPSlide.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i = (ButtonEXPSlide.SelState + 1) % 2;
                ButtonEXPSlide.SelState = i;
                Helper.setValue("pref_pro_key", i);
                ButtonEXPSlide.this.UpdateUi(compoundButton.getContext());
            }
        };
        this.myClickListener = new View.OnClickListener() { // from class: com.custom.ButtonEXPSlide.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws InterruptedException {
                Helper.onRestart();
            }
        };
        init(context);
    }

    public ButtonEXPSlide(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.myChangeListner = new CompoundButton.OnCheckedChangeListener() { // from class: com.custom.ButtonEXPSlide.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i2 = (ButtonEXPSlide.SelState + 1) % 2;
                ButtonEXPSlide.SelState = i2;
                Helper.setValue("pref_pro_key", i2);
                ButtonEXPSlide.this.UpdateUi(compoundButton.getContext());
            }
        };
        this.myClickListener = new View.OnClickListener() { // from class: com.custom.ButtonEXPSlide.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws InterruptedException {
                Helper.onRestart();
            }
        };
        init(context);
    }

    public ButtonEXPSlide(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.myChangeListner = new CompoundButton.OnCheckedChangeListener() { // from class: com.custom.ButtonEXPSlide.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i3 = (ButtonEXPSlide.SelState + 1) % 2;
                ButtonEXPSlide.SelState = i3;
                Helper.setValue("pref_pro_key", i3);
                ButtonEXPSlide.this.UpdateUi(compoundButton.getContext());
            }
        };
        this.myClickListener = new View.OnClickListener() { // from class: com.custom.ButtonEXPSlide.2
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
                setBackgroundResource(getResources().getIdentifier("pref_expslide_off", "drawable", context.getPackageName()));
                break;
            case 1:
                setBackgroundResource(getResources().getIdentifier("pref_expslide_on", "drawable", context.getPackageName()));
                break;
        }
        invalidate();
    }

    @Override // android.view.View
    public void getVisibility() {
        if (Pref.MenuValue("pref_show_button_expslide") == 0) {
            setVisibility(8);
        }
    }

    public void init(Context context) {
        SelState = Pref.MenuValue("pref_pro_key");
        getVisibility();
        UpdateUi(context);
        setOnCheckedChangeListener(this.myChangeListner);
        setOnClickListener(this.myClickListener);
    }
}
