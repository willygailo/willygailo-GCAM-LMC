package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hvi {
    public static final ouj a = ouj.h("com/google/android/apps/camera/settings/upgrader/SettingsUpgrader");
    private final String b;
    private final int c;

    public hvi(String str, int i) {
        this.b = str;
        this.c = i;
    }

    protected static final String c(SharedPreferences sharedPreferences, String str) {
        String string = null;
        try {
            string = sharedPreferences.getString(str, null);
        } catch (ClassCastException e) {
            ((oug) ((oug) ((oug) a.b()).h(e)).G((char) 2658)).o("error reading old value, removing and returning default");
        }
        sharedPreferences.edit().remove(str).apply();
        return string;
    }

    protected abstract void a(hub hubVar, int i);

    protected int b(hub hubVar) {
        return hubVar.b(this.b, Integer.valueOf(this.c));
    }

    public final void d(hub hubVar) throws Exception {
        try {
            int iB = b(hubVar);
            if (iB != this.c) {
                a(hubVar, iB);
            }
            hubVar.i(this.b, this.c);
        } catch (Exception e) {
            ((oug) ((oug) ((oug) a.b()).h(e)).G((char) 2659)).o("exception during upgrade");
            throw e;
        }
    }
}
