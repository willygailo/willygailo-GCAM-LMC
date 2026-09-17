package MC.UI;

import MC.Utils;
import MC.hslh;
import android.content.Context;
import android.os.Handler;
import android.util.Log;
import android.util.TypedValue;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.ToggleButton;

/* JADX INFO: loaded from: classes4.dex */
public class OpenButtonListExtenderLeft extends ToggleButton implements CompoundButton.OnCheckedChangeListener {
    int marginw;
    int sizew;
    public static boolean SelState = false;
    public static String prefString = "OpenButtonListExtenderLeft";
    public static String Icon1 = "s_on";
    public static String Icon2 = "s_off";

    public OpenButtonListExtenderLeft(Context context) {
        super(context);
        this.sizew = (int) TypedValue.applyDimension(1, 28.0f, getResources().getDisplayMetrics());
        this.marginw = (int) TypedValue.applyDimension(1, 12.0f, getResources().getDisplayMetrics());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.sizew, this.sizew);
        layoutParams.rightMargin = 0;
        setBackgroundColor(0);
        setLayoutParams(layoutParams);
        setOnCheckedChangeListener(this);
        init(context);
    }

    public void UpdateUi(Context context) {
        int identifier = getResources().getIdentifier(Icon1, "drawable", context.getPackageName());
        int identifier2 = getResources().getIdentifier(Icon2, "drawable", context.getPackageName());
        if (SelState) {
            setBackgroundResource(identifier);
        } else {
            setBackgroundResource(identifier2);
        }
        invalidate();
    }

    public void init(Context context) {
        setText("");
        setTextOff("");
        setTextOn("");
        context.getSharedPreferences("camera_preferences", 0);
        SelState = Utils.staticMenuValueBB(prefString);
        setChecked(SelState);
        UpdateUi(context);
        setPressed(SelState);
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        SelState = z;
        Context context = compoundButton.getContext();
        hslh.HapticFeedback(context);
        Utils.putBool(prefString, SelState);
        UpdateUi(context);
        new Handler().postDelayed(new Runnable() { // from class: MC.UI.OpenButtonListExtenderLeft.1
            @Override // java.lang.Runnable
            public void run() {
            }
        }, 300L);
        Log.d("Zoran Log: ", "ZFlash State is : " + SelState);
    }
}
