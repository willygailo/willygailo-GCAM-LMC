package MC.UI.Button;

import MC.hslh;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.ToggleButton;
import com.Fix.Pref;
import com.google.android.apps.camera.legacy.app.activity.main.CameraActivity;

/* JADX INFO: loaded from: classes4.dex */
public class Leica extends ToggleButton {
    public static int SelState = 0;
    public CompoundButton.OnCheckedChangeListener myChangeListner;

    public Leica(Context context) {
        super(context);
        this.myChangeListner = new CompoundButton.OnCheckedChangeListener() { // from class: MC.UI.Button.Leica.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i = (Leica.SelState + 1) % 2;
                Leica.SelState = i;
                Pref.setValue("pref_shading_mode_key", i);
                Context context2 = compoundButton.getContext();
                hslh.HapticFeedback(context2);
                Leica.this.UpdateUi(context2);
                CameraActivity.ReInit();
            }
        };
        init(context);
    }

    public Leica(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.myChangeListner = new CompoundButton.OnCheckedChangeListener() { // from class: MC.UI.Button.Leica.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i = (Leica.SelState + 1) % 2;
                Leica.SelState = i;
                Pref.setValue("pref_shading_mode_key", i);
                Context context2 = compoundButton.getContext();
                hslh.HapticFeedback(context2);
                Leica.this.UpdateUi(context2);
                CameraActivity.ReInit();
            }
        };
        init(context);
    }

    public Leica(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.myChangeListner = new CompoundButton.OnCheckedChangeListener() { // from class: MC.UI.Button.Leica.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i2 = (Leica.SelState + 1) % 2;
                Leica.SelState = i2;
                Pref.setValue("pref_shading_mode_key", i2);
                Context context2 = compoundButton.getContext();
                hslh.HapticFeedback(context2);
                Leica.this.UpdateUi(context2);
                CameraActivity.ReInit();
            }
        };
        init(context);
    }

    public Leica(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.myChangeListner = new CompoundButton.OnCheckedChangeListener() { // from class: MC.UI.Button.Leica.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i3 = (Leica.SelState + 1) % 2;
                Leica.SelState = i3;
                Pref.setValue("pref_shading_mode_key", i3);
                Context context2 = compoundButton.getContext();
                hslh.HapticFeedback(context2);
                Leica.this.UpdateUi(context2);
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

    /* JADX WARN: Multi-variable type inference failed */
    public void init(Context context) {
        setText("");
        setTextOff("");
        setTextOn("");
        context.getSharedPreferences("camera_preferences", 0);
        SelState = Pref.MenuValue("pref_shading_mode_key");
        UpdateUi(context);
        setOnCheckedChangeListener(this.myChangeListner);
    }
}
