package defpackage;

import android.content.Context;
import android.system.ErrnoException;
import android.system.Os;

/* JADX INFO: loaded from: classes.dex */
public final class egh {
    private static final ouj b = ouj.h("com/google/android/apps/camera/hexagon/HexagonLibPathInitializer");
    public final String a;

    public egh(Context context) {
        lar.a();
        String str = context.getApplicationInfo().dataDir;
        try {
            Os.setenv("ADSP_LIBRARY_PATH", String.valueOf(str).concat(";/dsp"), true);
        } catch (ErrnoException e) {
            ((oug) ((oug) b.c()).G((char) 1149)).r("Failed to set ADSP_LIBRARY_PATH: %s", e);
        }
        this.a = str;
    }
}
