package MC.UI.Button;

import MC.Utils;
import MC.hslh;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ToggleButton;
import com.Fix.Pref;

/* JADX INFO: loaded from: classes4.dex */
public class EXPSlide extends ToggleButton {
    public static int SelState = 0;
    public CompoundButton.OnCheckedChangeListener myChangeListner;
    public View.OnClickListener myClickListener;

    public EXPSlide(Context context) {
        super(context);
        this.myChangeListner = new CompoundButton.OnCheckedChangeListener() { // from class: MC.UI.Button.EXPSlide.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i = (EXPSlide.SelState + 1) % 2;
                EXPSlide.SelState = i;
                Pref.setValue("pref_pro_key", i);
                Context context2 = compoundButton.getContext();
                hslh.HapticFeedback(context2);
                EXPSlide.this.UpdateUi(context2);
            }
        };
        this.myClickListener = new View.OnClickListener() { // from class: MC.UI.Button.EXPSlide.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws InterruptedException {
                Utils.onRestart();
            }
        };
        init(context);
    }

    public EXPSlide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.myChangeListner = new CompoundButton.OnCheckedChangeListener() { // from class: MC.UI.Button.EXPSlide.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i = (EXPSlide.SelState + 1) % 2;
                EXPSlide.SelState = i;
                Pref.setValue("pref_pro_key", i);
                Context context2 = compoundButton.getContext();
                hslh.HapticFeedback(context2);
                EXPSlide.this.UpdateUi(context2);
            }
        };
        this.myClickListener = new View.OnClickListener() { // from class: MC.UI.Button.EXPSlide.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws InterruptedException {
                Utils.onRestart();
            }
        };
        init(context);
    }

    public EXPSlide(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.myChangeListner = new CompoundButton.OnCheckedChangeListener() { // from class: MC.UI.Button.EXPSlide.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i2 = (EXPSlide.SelState + 1) % 2;
                EXPSlide.SelState = i2;
                Pref.setValue("pref_pro_key", i2);
                Context context2 = compoundButton.getContext();
                hslh.HapticFeedback(context2);
                EXPSlide.this.UpdateUi(context2);
            }
        };
        this.myClickListener = new View.OnClickListener() { // from class: MC.UI.Button.EXPSlide.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws InterruptedException {
                Utils.onRestart();
            }
        };
        init(context);
    }

    public EXPSlide(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.myChangeListner = new CompoundButton.OnCheckedChangeListener() { // from class: MC.UI.Button.EXPSlide.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i3 = (EXPSlide.SelState + 1) % 2;
                EXPSlide.SelState = i3;
                Pref.setValue("pref_pro_key", i3);
                Context context2 = compoundButton.getContext();
                hslh.HapticFeedback(context2);
                EXPSlide.this.UpdateUi(context2);
            }
        };
        this.myClickListener = new View.OnClickListener() { // from class: MC.UI.Button.EXPSlide.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws InterruptedException {
                Utils.onRestart();
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
        setText("");
        setTextOff("");
        setTextOn("");
        context.getSharedPreferences("camera_preferences", 0);
        SelState = Pref.MenuValue("pref_pro_key");
        getVisibility();
        UpdateUi(context);
        setOnCheckedChangeListener(this.myChangeListner);
        setOnClickListener(this.myClickListener);
    }
}
