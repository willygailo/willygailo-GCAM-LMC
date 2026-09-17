package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class kgt {

    @Deprecated
    public static final kif a;
    public static final String[] b;
    public static final List c;
    public static volatile int d;
    public static final mip m;
    public final Context e;
    public final String f;
    public final EnumSet g;
    public final kgq h;
    public final List i;
    public String j;
    public int k;
    final khb l;

    static {
        kgn kgnVar = new kgn();
        m = kgnVar;
        a = new kif("ClearcutLogger.API", kgnVar, null, null, null, null, null);
        b = new String[0];
        c = new CopyOnWriteArrayList();
        d = -1;
    }

    public kgt(Context context, String str) {
        this(context, str, kgs.e, khb.b(context), new khf(context));
    }

    public kgt(Context context, String str, EnumSet enumSet, khb khbVar, kgq kgqVar) {
        this.i = new CopyOnWriteArrayList();
        this.k = 1;
        if (!enumSet.contains(kgs.ACCOUNT_NAME)) {
            mip.dm(true, "Upload account name cannot be used with a deidentified or pseudonymous logger.");
        }
        if (!enumSet.equals(kgs.g) && !enumSet.equals(kgs.e) && !enumSet.equals(kgs.f)) {
            throw new IllegalArgumentException("piiLevelSet must be one of ZWIEBACK_ONLY, NO_RESTRICTIONS, or PIILevel.DEIDENTIFIED");
        }
        this.e = context.getApplicationContext();
        this.f = context.getPackageName();
        this.j = str;
        this.g = enumSet;
        this.l = khbVar;
        this.k = 1;
        this.h = kgqVar;
    }

    public static String b(Iterable iterable) {
        return oxk.e(", ").a(iterable);
    }

    public static int[] d(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            iArr[i2] = ((Integer) arrayList.get(i)).intValue();
            i++;
            i2++;
        }
        return iArr;
    }

    public final kgp a(pqm pqmVar) {
        pqmVar.getClass();
        return new kgp(this, null, new kgm(pqmVar));
    }

    public final boolean c() {
        return this.g.equals(kgs.f);
    }
}
