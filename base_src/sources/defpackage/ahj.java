package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;

/* JADX INFO: loaded from: classes.dex */
public final class ahj {
    public boolean a;
    public PreferenceScreen b;
    public ahi c;
    public ahg d;
    public ahh e;
    private final Context f;
    private long g = 0;
    private SharedPreferences h = null;
    private SharedPreferences.Editor i;
    private final String j;

    public ahj(Context context) {
        this.f = context;
        this.j = g(context);
    }

    public static SharedPreferences c(Context context) {
        return context.getSharedPreferences(g(context), 0);
    }

    private static String g(Context context) {
        return context.getPackageName() + "_preferences";
    }

    public final long a() {
        long j;
        synchronized (this) {
            j = this.g;
            this.g = 1 + j;
        }
        return j;
    }

    public final SharedPreferences.Editor b() {
        if (!this.a) {
            return d().edit();
        }
        if (this.i == null) {
            this.i = d().edit();
        }
        return this.i;
    }

    public final SharedPreferences d() {
        if (this.h == null) {
            this.h = this.f.getSharedPreferences(this.j, 0);
        }
        return this.h;
    }

    public final Preference e(CharSequence charSequence) {
        PreferenceScreen preferenceScreen = this.b;
        if (preferenceScreen == null) {
            return null;
        }
        return preferenceScreen.l(charSequence);
    }

    public final void f(boolean z) {
        SharedPreferences.Editor editor;
        if (!z && (editor = this.i) != null) {
            editor.apply();
        }
        this.a = z;
    }
}
