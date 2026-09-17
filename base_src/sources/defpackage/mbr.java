package defpackage;

import android.net.Uri;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
final class mbr implements mak {
    private static final AtomicInteger a = new AtomicInteger(0);
    private final int b;
    private final mch c;
    private final mbq d;
    private final mal e;
    private final long f;
    private final long g;
    private final long h;
    private final long i;
    private final mcf j;
    private final String k;
    private final String l;
    private final String m;
    private final mcc n;
    private final ljf o;
    private final lis p;
    private boolean q;
    private String r = "";
    private mce s;
    private final pih t;
    private final int u;
    private final man v;

    public mbr(mch mchVar, man manVar, mcc mccVar, mbq mbqVar, long j, long j2, long j3, long j4, String str, int i, mcf mcfVar, String str2, String str3, ljf ljfVar, lis lisVar) {
        String strJ = mip.J(str3);
        obr.aF(mcfVar.c(strJ == null ? "" : strJ));
        this.c = mchVar;
        this.v = manVar;
        this.d = mbqVar;
        this.f = j;
        this.g = j2;
        this.h = j3;
        this.i = j4;
        this.j = mcfVar;
        this.u = i;
        this.k = str2;
        this.l = str3;
        this.m = str;
        this.s = null;
        this.o = ljfVar;
        this.n = mccVar;
        this.t = pih.f();
        mal malVar = new mal();
        malVar.a("");
        mcj mcjVar = mcj.a;
        if (mcjVar == null) {
            throw new NullPointerException("Null metadata");
        }
        malVar.d = mcjVar;
        malVar.a = Long.valueOf(j3);
        malVar.b = Long.valueOf(j4);
        this.e = malVar;
        this.b = a.incrementAndGet();
        this.p = lisVar.a("MediaFile");
    }

    private final mce l() {
        this.o.e(String.valueOf(toString()).concat("-create"));
        man manVar = this.v;
        mbt mbtVar = new mbt();
        mbtVar.a = Long.valueOf(this.f);
        mbtVar.b = Long.valueOf(this.g);
        mbtVar.e = this.m;
        mbtVar.c = Long.valueOf(this.h);
        mbtVar.d = Long.valueOf(this.i);
        String str = this.r;
        if (str == null) {
            throw new NullPointerException("Null tag");
        }
        mbtVar.f = str;
        String str2 = this.l;
        if (str2 == null) {
            throw new NullPointerException("Null extension");
        }
        mbtVar.g = str2;
        Long l = mbtVar.a;
        if (l != null && mbtVar.b != null && mbtVar.c != null && mbtVar.d != null && mbtVar.e != null && mbtVar.f != null && mbtVar.g != null) {
            mbu mbuVar = new mbu(l.longValue(), mbtVar.b.longValue(), mbtVar.c.longValue(), mbtVar.d.longValue(), mbtVar.e, mbtVar.f, mbtVar.g);
            String str3 = manVar.a.d + mbuVar.a + "_" + mbuVar.b + "_" + mbuVar.c;
            mcf mcfVar = this.j;
            String str4 = this.k;
            String str5 = this.l;
            String strJ = mip.J(str5);
            if (strJ == null) {
                strJ = "";
            }
            mce mceVarA = this.c.a(mcn.a(mcfVar, str4, str3, str5, strJ), this.n);
            this.o.f();
            return mceVarA;
        }
        StringBuilder sb = new StringBuilder();
        if (mbtVar.a == null) {
            sb.append(" groupTimestampNs");
        }
        if (mbtVar.b == null) {
            sb.append(" groupUtcTimestampMs");
        }
        if (mbtVar.c == null) {
            sb.append(" timestampNs");
        }
        if (mbtVar.d == null) {
            sb.append(" utcTimestampMs");
        }
        if (mbtVar.e == null) {
            sb.append(" groupTag");
        }
        if (mbtVar.f == null) {
            sb.append(" tag");
        }
        if (mbtVar.g == null) {
            sb.append(" extension");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }

    @Override // defpackage.mak
    public final synchronized long a() {
        mce mceVar;
        mceVar = this.s;
        return mceVar != null ? mceVar.a() : -1L;
    }

    @Override // defpackage.mak
    public final Uri b() {
        mce mceVar = this.s;
        return mceVar == null ? Uri.EMPTY : mceVar.h();
    }

    @Override // defpackage.mak
    public final pht c() {
        return plk.W(this.t);
    }

    @Override // defpackage.mak
    public final synchronized FileInputStream d() {
        FileInputStream fileInputStreamB;
        obr.aT(!this.q, "Cannot open an input stream after %s has been published or abandoned.", this);
        ljf ljfVar = this.o;
        String strValueOf = String.valueOf(this);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 16);
        sb.append(strValueOf);
        sb.append("#openInputStream");
        ljfVar.e(sb.toString());
        if (this.s == null) {
            this.s = l();
        }
        try {
            fileInputStreamB = this.s.b();
            lis lisVar = this.p;
            String strValueOf2 = String.valueOf(this);
            String strValueOf3 = String.valueOf(fileInputStreamB);
            String strValueOf4 = String.valueOf(this.s.i());
            StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 10 + String.valueOf(strValueOf3).length() + String.valueOf(strValueOf4).length());
            sb2.append(strValueOf2);
            sb2.append(" opened ");
            sb2.append(strValueOf3);
            sb2.append(": ");
            sb2.append(strValueOf4);
            lisVar.f(sb2.toString());
            this.o.f();
            pih pihVar = this.t;
            mce mceVar = this.s;
            mceVar.getClass();
            pihVar.o(mceVar.h());
        } catch (Throwable th) {
            this.o.f();
            throw th;
        }
        return fileInputStreamB;
    }

    @Override // defpackage.mak
    public final synchronized FileOutputStream e() {
        FileOutputStream fileOutputStreamC;
        obr.aT(!this.q, "Cannot open an output stream after %s has been published or abandoned.", this);
        ljf ljfVar = this.o;
        String strValueOf = String.valueOf(this);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 17);
        sb.append(strValueOf);
        sb.append("#openOutputStream");
        ljfVar.e(sb.toString());
        if (this.s == null) {
            this.s = l();
        }
        try {
            fileOutputStreamC = this.s.c();
            lis lisVar = this.p;
            String strValueOf2 = String.valueOf(this);
            String strValueOf3 = String.valueOf(fileOutputStreamC);
            String strValueOf4 = String.valueOf(this.s.i());
            StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 10 + String.valueOf(strValueOf3).length() + String.valueOf(strValueOf4).length());
            sb2.append(strValueOf2);
            sb2.append(" opened ");
            sb2.append(strValueOf3);
            sb2.append(": ");
            sb2.append(strValueOf4);
            lisVar.f(sb2.toString());
            this.o.f();
            pih pihVar = this.t;
            mce mceVar = this.s;
            mceVar.getClass();
            pihVar.o(mceVar.h());
        } catch (Throwable th) {
            this.o.f();
            pih pihVar2 = this.t;
            mce mceVar2 = this.s;
            mceVar2.getClass();
            pihVar2.o(mceVar2.h());
            throw th;
        }
        return fileOutputStreamC;
    }

    @Override // defpackage.mak
    public final synchronized void f() {
        synchronized (this) {
            if (this.q) {
                return;
            }
            this.q = true;
            lis lisVar = this.p;
            String strValueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 10);
            sb.append(strValueOf);
            sb.append(" Abandoned");
            lisVar.f(sb.toString());
            this.d.d(this);
        }
    }

    @Override // defpackage.mak
    public final void g() {
        synchronized (this) {
            if (this.q) {
                return;
            }
            this.q = true;
            mal malVar = this.e;
            mce mceVar = this.s;
            mceVar.getClass();
            malVar.e = mceVar;
            lis lisVar = this.p;
            String strValueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 86);
            sb.append(strValueOf);
            sb.append(" Published, but will be visible to other apps after the MediaGroup is also published).");
            lisVar.f(sb.toString());
            this.d.e(this);
        }
    }

    @Override // defpackage.mak
    public final void h(String str) {
        obr.aT(!this.q, "Cannot set tag after %s has been published or abandoned.", this);
        this.r = str;
        this.e.a(str);
    }

    @Override // defpackage.mak
    public final synchronized void i() {
        obr.aT(!this.q, "Cannot create new file after %s has been published or abandoned.", this);
        if (this.s == null) {
            ljf ljfVar = this.o;
            String strValueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 6);
            sb.append(strValueOf);
            sb.append("#touch");
            ljfVar.e(sb.toString());
            mce mceVarL = l();
            this.s = mceVarL;
            try {
                mceVarL.d();
                lis lisVar = this.p;
                String strValueOf2 = String.valueOf(this);
                String strValueOf3 = String.valueOf(this.s.i());
                StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 10 + String.valueOf(strValueOf3).length());
                sb2.append(strValueOf2);
                sb2.append(" created: ");
                sb2.append(strValueOf3);
                lisVar.f(sb2.toString());
                this.o.f();
                pih pihVar = this.t;
                mce mceVar = this.s;
                mceVar.getClass();
                pihVar.o(mceVar.h());
            } catch (Throwable th) {
                this.o.f();
                pih pihVar2 = this.t;
                mce mceVar2 = this.s;
                mceVar2.getClass();
                pihVar2.o(mceVar2.h());
                throw th;
            }
        }
    }

    final synchronized mam j() {
        mal malVar;
        Long l;
        obr.aT(this.q, "Cannot be invoked until %s is published or abandoned.", this);
        malVar = this.e;
        l = malVar.a;
        if (l != null && malVar.b != null && malVar.c != null && malVar.d != null && malVar.e != null) {
        }
        StringBuilder sb = new StringBuilder();
        if (malVar.a == null) {
            sb.append(" timestampNs");
        }
        if (malVar.b == null) {
            sb.append(" utcTimestampMs");
        }
        if (malVar.c == null) {
            sb.append(" tag");
        }
        if (malVar.d == null) {
            sb.append(" metadata");
        }
        if (malVar.e == null) {
            sb.append(" fileObject");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
        return new mam(l.longValue(), malVar.b.longValue(), malVar.c, malVar.d, malVar.e);
    }

    final synchronized mce k() {
        obr.aT(this.q, "Cannot be invoked until %s is published or abandoned.", this);
        return this.s;
    }

    public final String toString() {
        String str;
        String string;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(this.b);
        int i = this.u;
        if (i == 1) {
            string = "";
        } else {
            switch (i) {
                case 2:
                    str = "PRIVATE";
                    break;
                default:
                    str = "CACHE";
                    break;
            }
            StringBuilder sb = new StringBuilder(str.length() + 3);
            sb.append(" (");
            sb.append(str);
            sb.append(")");
            string = sb.toString();
        }
        objArr[1] = string;
        return String.format(locale, "MediaFile-%s%s", objArr);
    }
}
