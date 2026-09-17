package defpackage;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class net {
    private static final Map a = new wy();
    private final SharedPreferences b;
    private final SharedPreferences.OnSharedPreferenceChangeListener c;

    static synchronized void a() {
        Map map = a;
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            net netVar = (net) it.next();
            SharedPreferences sharedPreferences = netVar.b;
            SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = netVar.c;
            throw null;
        }
        map.clear();
    }
}
