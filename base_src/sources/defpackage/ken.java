package defpackage;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ken {
    public final kdx a;
    public volatile Boolean b;
    private String c;
    private Set d;

    protected ken(kdx kdxVar) {
        this.a = kdxVar;
    }

    public static final long b() {
        return ((Long) keu.e.a()).longValue();
    }

    public static final long c() {
        return ((Long) keu.d.a()).longValue();
    }

    public static final int d() {
        return ((Integer) keu.h.a()).intValue();
    }

    public static final int e() {
        return ((Integer) keu.g.a()).intValue();
    }

    public static final String f() {
        return (String) keu.j.a();
    }

    public static final String g() {
        return (String) keu.k.a();
    }

    public static final String h() {
        return (String) keu.i.a();
    }

    public static final boolean i() {
        return ((Boolean) keu.a.a()).booleanValue();
    }

    public final Set a() {
        String str;
        String str2 = (String) keu.s.a();
        if (this.d == null || (str = this.c) == null || !str.equals(str2)) {
            String[] strArrSplit = TextUtils.split(str2, ",");
            HashSet hashSet = new HashSet();
            for (String str3 : strArrSplit) {
                try {
                    hashSet.add(Integer.valueOf(Integer.parseInt(str3)));
                } catch (NumberFormatException e) {
                }
            }
            this.c = str2;
            this.d = hashSet;
        }
        return this.d;
    }
}
