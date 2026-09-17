package defpackage;

import android.app.backup.BackupManager;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class hue extends hub {
    private static final ouj a = ouj.h("com/google/android/apps/camera/settings/SettingsManagerConcrete");
    private final Context c;
    private final String d;
    private final SharedPreferences e;
    private final List f = new ArrayList();
    private final List g = new ArrayList();
    private final Object b = new Object();

    public hue(final Context context, SharedPreferences sharedPreferences) {
        this.c = context;
        this.d = context.getPackageName();
        this.e = sharedPreferences;
        f(new htd() { // from class: hud
            @Override // defpackage.htd
            public final void a(String str) {
                BackupManager.dataChanged(context.getPackageName());
            }
        });
    }

    @Override // defpackage.hub
    public final int a(String str) {
        int iB;
        synchronized (this.b) {
            iB = b(str, 0);
        }
        return iB;
    }

    @Override // defpackage.hub
    public final int b(String str, Integer num) {
        synchronized (this.b) {
            String strQ = q(str, Integer.toString(num.intValue()));
            if (strQ == null) {
                return num.intValue();
            }
            return Integer.parseInt(strQ);
        }
    }

    @Override // defpackage.hub
    public final long c(String str) {
        long jLongValue;
        synchronized (this.b) {
            Long l = 0L;
            synchronized (this.b) {
                String strQ = q(str, Long.toString(l.longValue()));
                jLongValue = strQ == null ? l.longValue() : Long.parseLong(strQ);
            }
        }
        return jLongValue;
    }

    @Override // defpackage.hub
    public final SharedPreferences d() {
        SharedPreferences sharedPreferences;
        synchronized (this.b) {
            sharedPreferences = this.e;
        }
        return sharedPreferences;
    }

    @Override // defpackage.hub
    public final String e(String str) {
        String string;
        synchronized (this.b) {
            try {
                try {
                    string = this.e.getString(str, null);
                } catch (ClassCastException e) {
                    ((oug) ((oug) ((oug) a.c()).h(e)).G(2645)).o("existing preference with invalid type, removing and returning default");
                    this.e.edit().remove(str).apply();
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }

    @Override // defpackage.hub
    public final void f(final htd htdVar) {
        obr.ao(this.b);
        obr.ao(this.g);
        obr.ao(this.e);
        synchronized (this.b) {
            try {
                if (htdVar == null) {
                    throw new IllegalArgumentException("OnSettingChangedListener cannot be null.");
                }
                if (this.f.contains(htdVar)) {
                    return;
                }
                this.f.add(htdVar);
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: huc
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                        htdVar.a(str);
                    }
                };
                this.g.add(onSharedPreferenceChangeListener);
                this.e.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.hub
    public final void g(String str) {
        synchronized (this.b) {
            this.e.edit().remove(str).apply();
        }
    }

    @Override // defpackage.hub
    public final void h(htd htdVar) {
        obr.ao(this.b);
        obr.ao(this.g);
        obr.ao(this.e);
        synchronized (this.b) {
            if (this.f.contains(htdVar)) {
                int iIndexOf = this.f.indexOf(htdVar);
                this.f.remove(htdVar);
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = (SharedPreferences.OnSharedPreferenceChangeListener) this.g.get(iIndexOf);
                this.g.remove(iIndexOf);
                this.e.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
            }
        }
    }

    @Override // defpackage.hub
    public final void i(String str, int i) {
        synchronized (this.b) {
            k(str, Integer.toString(i));
        }
    }

    @Override // defpackage.hub
    public final void j(String str, long j) {
        synchronized (this.b) {
            k(str, Long.toString(j));
        }
    }

    @Override // defpackage.hub
    public final void k(String str, String str2) {
        synchronized (this.b) {
            this.e.edit().putString(str, str2).apply();
        }
    }

    @Override // defpackage.hub
    public final void l(String str, boolean z) {
        synchronized (this.b) {
            k(str, true != z ? "0" : "1");
        }
    }

    @Override // defpackage.hub
    public final boolean m(String str) {
        boolean zO;
        synchronized (this.b) {
            zO = o(str);
        }
        return zO;
    }

    @Override // defpackage.hub
    public final boolean n(String str) {
        boolean zContains;
        synchronized (this.b) {
            zContains = this.e.contains(str);
        }
        return zContains;
    }

    @Override // defpackage.hub
    public final boolean o(String str) {
        synchronized (this.b) {
            String strQ = q(str, "0");
            if (strQ == null) {
                return false;
            }
            return Integer.parseInt(strQ) != 0;
        }
    }

    @Override // defpackage.hub
    public final SharedPreferences p() {
        SharedPreferences sharedPreferences;
        synchronized (this.b) {
            sharedPreferences = this.c.getSharedPreferences(String.valueOf(this.d).concat("_preferences_camera"), 0);
            Iterator it = this.g.iterator();
            while (it.hasNext()) {
                sharedPreferences.registerOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener) it.next());
            }
        }
        return sharedPreferences;
    }

    public final String q(String str, String str2) {
        String string;
        synchronized (this.b) {
            try {
                try {
                    string = this.e.getString(str, str2);
                } catch (ClassCastException e) {
                    ((oug) ((oug) ((oug) a.c()).h(e)).G(2646)).o("existing preference with invalid type, removing and returning default");
                    this.e.edit().remove(str).apply();
                    return str2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }
}
