package defpackage;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.camera.ui.preference.KeyListenerPreference;

/* JADX INFO: loaded from: classes2.dex */
public final class jhw implements DialogInterface.OnKeyListener {
    final /* synthetic */ TextView a;
    final /* synthetic */ Button b;
    final /* synthetic */ Button c;
    final /* synthetic */ KeyListenerPreference d;

    public jhw(KeyListenerPreference keyListenerPreference, TextView textView, Button button, Button button2) {
        this.d = keyListenerPreference;
        this.a = textView;
        this.b = button;
        this.c = button2;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0058  */
    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        String strA = KeyListenerPreference.a(keyEvent);
        if (!strA.isEmpty()) {
            switch (i) {
                case 4:
                case 22:
                case 24:
                case 25:
                    this.a.setText("Error: Key is not supported by Pixel Camera");
                    this.b.setEnabled(false);
                    break;
                default:
                    TextView textView = this.a;
                    StringBuilder sb = new StringBuilder(String.valueOf(strA).length() + 38);
                    sb.append("New Key Bind: ");
                    sb.append(strA);
                    sb.append(" (Key Code: ");
                    sb.append(i);
                    sb.append(")");
                    textView.setText(sb.toString());
                    if (Integer.parseInt(this.d.a) != i) {
                        this.d.a = Integer.toString(i);
                        this.d.b = strA;
                    }
                    this.b.setEnabled(true);
                    break;
            }
        } else {
            this.a.setText("Error: Key is not supported by Pixel Camera");
            this.b.setEnabled(false);
        }
        this.c.setVisibility(0);
        this.a.sendAccessibilityEvent(32768);
        return true;
    }
}
