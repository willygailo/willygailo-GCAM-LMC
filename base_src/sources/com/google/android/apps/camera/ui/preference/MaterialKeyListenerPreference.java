package com.google.android.apps.camera.ui.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import androidx.preference.DialogPreference;
import com.google.android.apps.camera.bottombar.R;
import defpackage.oje;

/* JADX INFO: loaded from: classes.dex */
public class MaterialKeyListenerPreference extends DialogPreference {
    private String g;
    private String h;

    public MaterialKeyListenerPreference(Context context) {
        super(context);
        l();
    }

    public MaterialKeyListenerPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l();
    }

    public MaterialKeyListenerPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l();
    }

    public MaterialKeyListenerPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        l();
    }

    private final void l() {
        k("-1");
    }

    @Override // androidx.preference.Preference
    protected final void E(boolean z, Object obj) {
        k(z ? u("-1") : (String) obj);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    protected final void c() {
        String strValueOf = String.valueOf(this.q);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 12);
        sb.append("Bind Key to ");
        sb.append(strValueOf);
        ((DialogPreference) this).a = sb.toString();
        String str = this.h;
        String str2 = this.g;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str2).length());
        sb2.append("Current Key Bind: ");
        sb2.append(str);
        sb2.append(" (Key Code: ");
        sb2.append(str2);
        sb2.append(")\nPress key to rebind");
        ((DialogPreference) this).b = sb2.toString();
        ((DialogPreference) this).e = "Reset";
        super.c();
    }

    @Override // androidx.preference.Preference
    protected final Object f(TypedArray typedArray, int i) {
        String string = typedArray.getString(i);
        return string == null ? "-1" : string;
    }

    public final void k(String str) {
        String string;
        this.g = str;
        if (str.equals("-1")) {
            this.h = "None";
        } else {
            KeyEvent keyEvent = new KeyEvent(0, Integer.parseInt(str));
            int unicodeChar = keyEvent.getUnicodeChar();
            if (unicodeChar == 0 || unicodeChar == 10 || unicodeChar == 32) {
                switch (keyEvent.getKeyCode()) {
                    case 19:
                        string = "Up Arrow";
                        break;
                    case 20:
                        string = "Down Arrow";
                        break;
                    case 21:
                        string = "Left Arrow";
                        break;
                    case 22:
                        string = "Right Arrow";
                        break;
                    case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                        string = "Shift";
                        break;
                    case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                        string = "Space";
                        break;
                    case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                        string = "Enter";
                        break;
                    default:
                        string = "";
                        break;
                }
            } else {
                StringBuilder sb = new StringBuilder(1);
                sb.append((char) unicodeChar);
                string = sb.toString();
            }
            this.h = string;
        }
        n(this.h);
        ab(str);
        z(j());
        d();
    }

    @Override // androidx.preference.Preference
    public final /* bridge */ /* synthetic */ CharSequence m() {
        String str = this.h;
        return oje.d(str) ? "None" : str;
    }
}
