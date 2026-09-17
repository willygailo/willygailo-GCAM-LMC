package com.google.android.apps.camera.ui.preference;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.preference.DialogPreference;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.camera.bottombar.R;
import com.google.android.apps.camera.ui.preference.KeyListenerPreference;
import defpackage.jhw;
import defpackage.oje;

/* JADX INFO: loaded from: classes.dex */
public class KeyListenerPreference extends DialogPreference {
    public String a;
    public String b;

    public KeyListenerPreference(Context context) {
        super(context);
        c();
    }

    public KeyListenerPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    public KeyListenerPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c();
    }

    public KeyListenerPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        c();
    }

    public static String a(KeyEvent keyEvent) {
        int unicodeChar = keyEvent.getUnicodeChar();
        if (unicodeChar != 0 && unicodeChar != 10 && unicodeChar != 32) {
            StringBuilder sb = new StringBuilder(1);
            sb.append((char) unicodeChar);
            return sb.toString();
        }
        switch (keyEvent.getKeyCode()) {
            case 19:
                return "Up Arrow";
            case 20:
                return "Down Arrow";
            case 21:
                return "Left Arrow";
            case 22:
                return "Right Arrow";
            case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
            case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                return "Shift";
            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                return "Space";
            case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                return "Enter";
            default:
                return "";
        }
    }

    private final void c() {
        b("-1");
    }

    public final void b(String str) {
        this.a = str;
        if (str.equals("-1")) {
            this.b = "None";
        } else {
            this.b = a(new KeyEvent(0, Integer.parseInt(str)));
        }
        setSummary(this.b);
        persistString(str);
        notifyDependencyChange(shouldDisableDependents());
        notifyChanged();
    }

    @Override // android.preference.Preference
    public final /* bridge */ /* synthetic */ CharSequence getSummary() {
        String str = this.b;
        return oje.d(str) ? "None" : str;
    }

    @Override // android.preference.DialogPreference, android.preference.Preference
    protected final void onClick() {
        String strValueOf = String.valueOf(getTitle());
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 12);
        sb.append("Bind Key to ");
        sb.append(strValueOf);
        setDialogTitle(sb.toString());
        String str = this.b;
        String str2 = this.a;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str2).length());
        sb2.append("Current Key Bind: ");
        sb2.append(str);
        sb2.append(" (Key Code: ");
        sb2.append(str2);
        sb2.append(")\nPress key to rebind");
        setDialogMessage(sb2.toString());
        setNegativeButtonText("Reset");
        super.onClick();
        AlertDialog alertDialog = (AlertDialog) getDialog();
        ViewGroup viewGroup = (ViewGroup) alertDialog.findViewById(android.R.id.content);
        final TextView textView = (TextView) alertDialog.findViewById(android.R.id.message);
        final Button button = alertDialog.getButton(-1);
        final Button button2 = alertDialog.getButton(-2);
        viewGroup.setDescendantFocusability(393216);
        textView.setTextColor(-16777216);
        textView.setTextSize(18.0f);
        button.setEnabled(false);
        if (this.a.equals("-1")) {
            textView.setText("Current Key Bind: None\nPress key to bind");
            button2.setVisibility(4);
        }
        alertDialog.getButton(-2).setOnClickListener(new View.OnClickListener() { // from class: jhv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KeyListenerPreference keyListenerPreference = this.a;
                TextView textView2 = textView;
                Button button3 = button2;
                Button button4 = button;
                keyListenerPreference.b("-1");
                textView2.setText("Current Key Bind: None\nPress key to bind");
                textView2.sendAccessibilityEvent(4);
                button3.setVisibility(4);
                button4.setEnabled(true);
            }
        });
        alertDialog.setOnKeyListener(new jhw(this, textView, button, button2));
    }

    @Override // android.preference.DialogPreference
    protected final void onDialogClosed(boolean z) {
        super.onDialogClosed(z);
        if (z) {
            String str = this.a;
            if (callChangeListener(str)) {
                b(str);
            }
            setSummary(this.b);
        }
    }

    @Override // android.preference.Preference
    protected final Object onGetDefaultValue(TypedArray typedArray, int i) {
        String string = typedArray.getString(i);
        return string == null ? "-1" : string;
    }

    @Override // android.preference.Preference
    protected final void onSetInitialValue(boolean z, Object obj) {
        b(z ? getPersistedString("-1") : (String) obj);
    }
}
