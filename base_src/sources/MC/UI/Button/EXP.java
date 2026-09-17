package MC.UI.Button;

import MC.hslh;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.ToggleButton;
import com.Fix.Pref;

/* JADX INFO: loaded from: classes4.dex */
public class EXP extends ToggleButton {
    public static int SelState = 0;
    public CompoundButton.OnCheckedChangeListener myChangeListner;

    public EXP(Context context) {
        super(context);
        this.myChangeListner = new CompoundButton.OnCheckedChangeListener() { // from class: MC.UI.Button.EXP.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i = (EXP.SelState + 1) % 2;
                EXP.SelState = i;
                Pref.setValue("auto_exp_key", i);
                Context context2 = compoundButton.getContext();
                hslh.HapticFeedback(context2);
                EXP.this.UpdateUi(context2);
            }
        };
        init(context);
    }

    public EXP(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.myChangeListner = new CompoundButton.OnCheckedChangeListener() { // from class: MC.UI.Button.EXP.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i = (EXP.SelState + 1) % 2;
                EXP.SelState = i;
                Pref.setValue("auto_exp_key", i);
                Context context2 = compoundButton.getContext();
                hslh.HapticFeedback(context2);
                EXP.this.UpdateUi(context2);
            }
        };
        init(context);
    }

    public EXP(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.myChangeListner = new CompoundButton.OnCheckedChangeListener() { // from class: MC.UI.Button.EXP.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i2 = (EXP.SelState + 1) % 2;
                EXP.SelState = i2;
                Pref.setValue("auto_exp_key", i2);
                Context context2 = compoundButton.getContext();
                hslh.HapticFeedback(context2);
                EXP.this.UpdateUi(context2);
            }
        };
        init(context);
    }

    public EXP(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.myChangeListner = new CompoundButton.OnCheckedChangeListener() { // from class: MC.UI.Button.EXP.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i3 = (EXP.SelState + 1) % 2;
                EXP.SelState = i3;
                Pref.setValue("auto_exp_key", i3);
                Context context2 = compoundButton.getContext();
                hslh.HapticFeedback(context2);
                EXP.this.UpdateUi(context2);
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

    public void init(Context context) {
        setText("");
        setTextOff("");
        setTextOn("");
        context.getSharedPreferences("camera_preferences", 0);
        SelState = Pref.MenuValue("auto_exp_key");
        UpdateUi(context);
        setOnCheckedChangeListener(this.myChangeListner);
    }
}
