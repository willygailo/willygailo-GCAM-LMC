package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class lpc {
    public final Set a;
    private final Map b;
    private final Set c;

    public lpc(Map map, Set set, Set set2) {
        this.b = map;
        this.c = set;
        this.a = set2;
    }

    public static lpc a(lpc lpcVar) {
        return new lpc(new HashMap(lpcVar.b), new HashSet(lpcVar.c), new HashSet(lpcVar.a));
    }

    public final lpd b() {
        return new lpd(new HashSet(this.b.values()), new HashSet(this.c), new HashSet(this.a));
    }

    public final void c() {
        this.a.clear();
    }

    public final void d(CaptureRequest.Key key, Object obj) {
        this.b.put(key, mip.be(key, obj));
    }

    public final void e(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            lnq lnqVar = (lnq) it.next();
            this.b.put(lnqVar.a, lnqVar);
        }
    }

    public final void f(lqd lqdVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            lqd lqdVar2 = (lqd) it.next();
            if (!mip.aZ(lqdVar, lqdVar2, null)) {
                String strValueOf = String.valueOf(lqdVar2);
                String strValueOf2 = String.valueOf(lqdVar);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 36 + String.valueOf(strValueOf2).length());
                sb.append("Removing ");
                sb.append(strValueOf);
                sb.append(" because it conflicts with ");
                sb.append(strValueOf2);
                Log.w("pck", sb.toString());
                it.remove();
            }
        }
        this.a.add(lqdVar);
    }

    public final void g(mip mipVar) {
        this.c.add(mipVar);
    }
}
