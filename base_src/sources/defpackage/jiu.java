package defpackage;

import android.widget.TextView;
import com.google.android.apps.camera.ui.remotecontrol.RemoteControlView;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jiu implements Runnable {
    public final /* synthetic */ jiy a;
    public final /* synthetic */ float b;
    private final /* synthetic */ int c;

    public /* synthetic */ jiu(jiy jiyVar, float f, int i) {
        this.c = i;
        this.a = jiyVar;
        this.b = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String str2;
        switch (this.c) {
            case 0:
                jiy jiyVar = this.a;
                float f = this.b;
                RemoteControlView remoteControlView = jiyVar.c;
                if (remoteControlView != null) {
                    boolean z = jiyVar.i;
                    if (f >= -100.0f && f <= 200.0f) {
                        if (z) {
                            f = ((f * 9.0f) / 5.0f) + 32.0f;
                            str = "F";
                        } else {
                            str = "C";
                        }
                        TextView textView = remoteControlView.d;
                        String strValueOf = String.valueOf(String.format("%.1f", Float.valueOf(f)));
                        textView.setText(str.length() != 0 ? strValueOf.concat(str) : new String(strValueOf));
                        remoteControlView.f.setVisibility(0);
                    } else {
                        remoteControlView.d.setText("");
                    }
                }
                break;
            default:
                jiy jiyVar2 = this.a;
                float f2 = this.b;
                RemoteControlView remoteControlView2 = jiyVar2.c;
                if (remoteControlView2 != null) {
                    boolean z2 = jiyVar2.i;
                    if (f2 < 0.0f) {
                        remoteControlView2.c.setText("");
                    } else {
                        if (z2) {
                            f2 *= 3.2808f;
                            str2 = "ft";
                        } else {
                            str2 = "m";
                        }
                        TextView textView2 = remoteControlView2.c;
                        String strValueOf2 = String.valueOf(String.format("%.1f", Float.valueOf(f2)));
                        textView2.setText(str2.length() != 0 ? strValueOf2.concat(str2) : new String(strValueOf2));
                        remoteControlView2.e.setVisibility(0);
                    }
                }
                break;
        }
    }
}
