package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class uk {
    public final /* synthetic */ String a;
    public final /* synthetic */ up b;
    public final /* synthetic */ um c;

    public uk() {
    }

    public uk(um umVar, String str, up upVar) {
        this.c = umVar;
        this.a = str;
        this.b = upVar;
    }

    public final void a() {
        Integer num;
        um umVar = this.c;
        String str = this.a;
        if (!umVar.e.contains(str) && (num = (Integer) umVar.c.remove(str)) != null) {
            umVar.b.remove(num);
        }
        umVar.f.remove(str);
        if (umVar.g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + umVar.g.get(str));
            umVar.g.remove(str);
        }
        if (umVar.h.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + umVar.h.getParcelable(str));
            umVar.h.remove(str);
        }
        if (((gk) umVar.d.get(str)) != null) {
            throw null;
        }
    }
}
