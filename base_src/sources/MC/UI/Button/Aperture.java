package MC.UI.Button;

import MC.hslh;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.ToggleButton;
import com.Fix.Pref;
import com.google.android.apps.camera.legacy.app.activity.main.CameraActivity;

/* JADX INFO: loaded from: classes4.dex */
public class Aperture extends ToggleButton {
    public static int SelState = 0;
    public CompoundButton.OnCheckedChangeListener myChangeListner;

    public Aperture(Context context) {
        super(context);
        this.myChangeListner = new CompoundButton.OnCheckedChangeListener() { // from class: MC.UI.Button.Aperture.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i = (Aperture.SelState + 1) % 2;
                Aperture.SelState = i;
                Pref.setValue("pref_aperture_key", i);
                Context context2 = compoundButton.getContext();
                hslh.HapticFeedback(context2);
                Aperture.this.UpdateUi(context2);
                CameraActivity.ReInit();
            }
        };
        init(context);
    }

    public Aperture(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.myChangeListner = new CompoundButton.OnCheckedChangeListener() { // from class: MC.UI.Button.Aperture.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i = (Aperture.SelState + 1) % 2;
                Aperture.SelState = i;
                Pref.setValue("pref_aperture_key", i);
                Context context2 = compoundButton.getContext();
                hslh.HapticFeedback(context2);
                Aperture.this.UpdateUi(context2);
                CameraActivity.ReInit();
            }
        };
        init(context);
    }

    public Aperture(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.myChangeListner = new CompoundButton.OnCheckedChangeListener() { // from class: MC.UI.Button.Aperture.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i2 = (Aperture.SelState + 1) % 2;
                Aperture.SelState = i2;
                Pref.setValue("pref_aperture_key", i2);
                Context context2 = compoundButton.getContext();
                hslh.HapticFeedback(context2);
                Aperture.this.UpdateUi(context2);
                CameraActivity.ReInit();
            }
        };
        init(context);
    }

    public Aperture(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.myChangeListner = new CompoundButton.OnCheckedChangeListener() { // from class: MC.UI.Button.Aperture.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i3 = (Aperture.SelState + 1) % 2;
                Aperture.SelState = i3;
                Pref.setValue("pref_aperture_key", i3);
                Context context2 = compoundButton.getContext();
                hslh.HapticFeedback(context2);
                Aperture.this.UpdateUi(context2);
                CameraActivity.ReInit();
            }
        };
        init(context);
    }

    public void UpdateUi(Context context) {
        switch (SelState) {
            case 0:
                setBackgroundResource(getResources().getIdentifier("apperture24", "drawable", context.getPackageName()));
                break;
            case 1:
                setBackgroundResource(getResources().getIdentifier("apperture18", "drawable", context.getPackageName()));
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
        setText("");
        setTextOff("");
        setTextOn("");
        context.getSharedPreferences("camera_preferences", 0);
        SelState = Pref.MenuValue("pref_aperture_key");
        getVisibility();
        UpdateUi(context);
        setOnCheckedChangeListener(this.myChangeListner);
    }
}
