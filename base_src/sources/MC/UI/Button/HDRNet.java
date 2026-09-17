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
public class HDRNet extends ToggleButton {
    public static int SelState = 0;
    public CompoundButton.OnCheckedChangeListener myChangeListner;
    public View.OnClickListener myClickListener;

    public HDRNet(Context context) {
        super(context);
        this.myChangeListner = new CompoundButton.OnCheckedChangeListener() { // from class: MC.UI.Button.HDRNet.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i = (HDRNet.SelState + 1) % 2;
                HDRNet.SelState = i;
                Pref.setValue("pref_hdrnet_key", i);
                Context context2 = compoundButton.getContext();
                hslh.HapticFeedback(context2);
                HDRNet.this.UpdateUi(context2);
            }
        };
        this.myClickListener = new View.OnClickListener() { // from class: MC.UI.Button.HDRNet.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws InterruptedException {
                Utils.onRestart();
            }
        };
        init(context);
    }

    public HDRNet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.myChangeListner = new CompoundButton.OnCheckedChangeListener() { // from class: MC.UI.Button.HDRNet.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i = (HDRNet.SelState + 1) % 2;
                HDRNet.SelState = i;
                Pref.setValue("pref_hdrnet_key", i);
                Context context2 = compoundButton.getContext();
                hslh.HapticFeedback(context2);
                HDRNet.this.UpdateUi(context2);
            }
        };
        this.myClickListener = new View.OnClickListener() { // from class: MC.UI.Button.HDRNet.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws InterruptedException {
                Utils.onRestart();
            }
        };
        init(context);
    }

    public HDRNet(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.myChangeListner = new CompoundButton.OnCheckedChangeListener() { // from class: MC.UI.Button.HDRNet.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i2 = (HDRNet.SelState + 1) % 2;
                HDRNet.SelState = i2;
                Pref.setValue("pref_hdrnet_key", i2);
                Context context2 = compoundButton.getContext();
                hslh.HapticFeedback(context2);
                HDRNet.this.UpdateUi(context2);
            }
        };
        this.myClickListener = new View.OnClickListener() { // from class: MC.UI.Button.HDRNet.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws InterruptedException {
                Utils.onRestart();
            }
        };
        init(context);
    }

    public HDRNet(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.myChangeListner = new CompoundButton.OnCheckedChangeListener() { // from class: MC.UI.Button.HDRNet.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i3 = (HDRNet.SelState + 1) % 2;
                HDRNet.SelState = i3;
                Pref.setValue("pref_hdrnet_key", i3);
                Context context2 = compoundButton.getContext();
                hslh.HapticFeedback(context2);
                HDRNet.this.UpdateUi(context2);
            }
        };
        this.myClickListener = new View.OnClickListener() { // from class: MC.UI.Button.HDRNet.2
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
                setBackgroundResource(getResources().getIdentifier("hdrnet_off", "drawable", context.getPackageName()));
                break;
            case 1:
                setBackgroundResource(getResources().getIdentifier("hdrnet_on", "drawable", context.getPackageName()));
                break;
        }
        invalidate();
    }

    @Override // android.view.View
    public void getVisibility() {
        if (Pref.MenuValue("pref_show_button_hdrnet") == 0) {
            setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void init(Context context) {
        setText("");
        setTextOff("");
        setTextOn("");
        context.getSharedPreferences("camera_preferences", 0);
        SelState = Pref.MenuValue("pref_hdrnet_key");
        getVisibility();
        UpdateUi(context);
        setOnCheckedChangeListener(this.myChangeListner);
        setOnClickListener(this.myClickListener);
    }
}
