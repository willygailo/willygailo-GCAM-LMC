package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class hua implements huf, hug, lie {
    private final SharedPreferences b;
    private final ddf c;
    private final SharedPreferences.OnSharedPreferenceChangeListener d;
    public final Map a = new HashMap();
    private final List e = new ArrayList();

    public hua(final ddf ddfVar, final SharedPreferences sharedPreferences) {
        this.c = ddfVar;
        this.b = sharedPreferences;
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: htx
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str) {
                hua huaVar = this.a;
                SharedPreferences sharedPreferences3 = sharedPreferences;
                ddf ddfVar2 = ddfVar;
                htz htzVar = (htz) huaVar.a.get(str);
                if (htzVar == null) {
                    return;
                }
                String string = sharedPreferences3.getString(str, null);
                if (string != null) {
                    htzVar.b.fB(htzVar.a.b(string));
                } else {
                    htzVar.b.fB(htzVar.a.b.a(ddfVar2));
                }
            }
        };
        this.d = onSharedPreferenceChangeListener;
        sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    @Override // defpackage.huf
    public final lco a(hts htsVar) {
        return b(htsVar);
    }

    @Override // defpackage.hug
    public final lda b(final hts htsVar) {
        synchronized (this.a) {
            if (this.a.get(htsVar.a) == null) {
                lce lceVar = new lce(c(htsVar));
                this.e.add(lceVar.a(new lij() { // from class: hty
                    @Override // defpackage.lij
                    public final void fB(Object obj) {
                        hua huaVar = this.a;
                        hts htsVar2 = htsVar;
                        if (obj == null) {
                            huaVar.d(htsVar2);
                        } else {
                            if (obj.equals(huaVar.c(htsVar2))) {
                                return;
                            }
                            huaVar.e(htsVar2, obj);
                        }
                    }
                }, pgr.INSTANCE));
                this.a.put(htsVar.a, new htz(htsVar, lceVar));
            }
        }
        htz htzVar = (htz) this.a.get(htsVar.a);
        htzVar.getClass();
        return htzVar.b;
    }

    @Override // defpackage.huf
    public final Object c(hts htsVar) {
        String string;
        synchronized (this) {
            string = this.b.getString(htsVar.a, null);
        }
        return string != null ? htsVar.b(string) : htsVar.b.a(this.c);
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.b.unregisterOnSharedPreferenceChangeListener(this.d);
        }
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((lie) it.next()).close();
        }
    }

    @Override // defpackage.hug
    public final void d(hts htsVar) {
        synchronized (this) {
            this.b.edit().remove(htsVar.a).apply();
            String str = htsVar.a;
        }
    }

    @Override // defpackage.hug
    public final void e(hts htsVar, Object obj) {
        String str = htsVar.a;
        String strC = htsVar.c(obj);
        synchronized (this) {
            this.b.edit().putString(str, strC).apply();
        }
    }
}
