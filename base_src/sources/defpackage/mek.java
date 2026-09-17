package defpackage;

import android.content.Context;
import android.provider.Settings;

/* JADX INFO: loaded from: classes2.dex */
public final class mek implements mec {
    public final Context a;
    private ojc b = oih.a;
    private final Object c = new Object();
    private final khx d;

    public mek(Context context, khx khxVar, byte[] bArr) {
        this.a = context;
        this.d = khxVar;
    }

    @Override // defpackage.mec
    public final boolean a() {
        boolean zBooleanValue;
        synchronized (this.c) {
            zBooleanValue = this.b.g() ? ((Boolean) this.b.c()).booleanValue() : b();
        }
        return zBooleanValue;
    }

    public final boolean b() {
        boolean z;
        synchronized (this.c) {
            try {
                try {
                    z = true;
                    if (Settings.Global.getInt(this.d.a.getContentResolver(), "multi_cb") != 1) {
                        z = false;
                    }
                    this.b = ojc.i(Boolean.valueOf(z));
                } catch (Settings.SettingNotFoundException e) {
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}
