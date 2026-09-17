package defpackage;

import android.content.Context;
import j$.util.Collection;
import j$.util.DesugarTimeZone;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class hsg {
    private static final SimpleDateFormat h;
    public final mas a;
    public final long b;
    public final dxh c;
    public final hss d;
    public final Context e;
    public final String f;
    public final lis g;
    private String i = null;
    private final Map j = new HashMap();

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd_HHmmssSSS", Locale.ROOT);
        DesugarTimeZone.getTimeZone("UTC");
        h = simpleDateFormat;
    }

    private hsg(mas masVar, long j, dxh dxhVar, String str, lis lisVar, hss hssVar, Context context) {
        this.a = masVar;
        this.b = j;
        this.c = dxhVar == null ? dxh.NONE : dxhVar;
        this.f = str;
        this.g = lisVar.a("GcaMediaGroup");
        this.d = hssVar;
        this.e = context;
    }

    public static hsg b(mbk mbkVar, long j, dxh dxhVar, String str, lis lisVar, ddf ddfVar, mcc mccVar, hss hssVar) {
        mas masVarA;
        if (hssVar == hss.MARS_STORE) {
            masVarA = mbkVar.a(mccVar, oje.c(str), j);
        } else {
            mbl mblVar = (mbl) mbkVar;
            masVarA = mblVar.a(mblVar.b, oje.c(str), j);
        }
        ddi ddiVar = ddl.a;
        ddfVar.d();
        return new hsg(masVarA, j, dxhVar, str, lisVar, hssVar, mccVar.a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0035 A[Catch: all -> 0x0067, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x001a, B:7:0x0029, B:11:0x0035, B:15:0x003d, B:17:0x004e, B:16:0x0046, B:12:0x0038), top: B:23:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:12:0x0038 A[Catch: all -> 0x0067, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x001a, B:7:0x0029, B:11:0x0035, B:15:0x003d, B:17:0x004e, B:16:0x0046, B:12:0x0038), top: B:23:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x003d A[Catch: all -> 0x0067, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x001a, B:7:0x0029, B:11:0x0035, B:15:0x003d, B:17:0x004e, B:16:0x0046, B:12:0x0038), top: B:23:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0046 A[Catch: all -> 0x0067, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x001a, B:7:0x0029, B:11:0x0035, B:15:0x003d, B:17:0x004e, B:16:0x0046, B:12:0x0038), top: B:23:0x0003 }] */
    private final synchronized hsc j(String str, boolean z) {
        hsc hscVar;
        mas masVar;
        String strJ;
        boolean z2;
        mcf mcfVar;
        String str2;
        if (z) {
            obr.aT(Collection.EL.stream(this.j.keySet()).noneMatch(bql.i), "Already created a primary item: %s", this.j);
            masVar = this.a;
            strJ = mip.J(str);
            z2 = false;
            if (!oje.d(strJ) && mcf.DCIM.c(strJ)) {
                z2 = true;
            }
            if (z2) {
                mcfVar = mcf.DCIM;
            } else {
                mcfVar = mcf.APP_DATA;
            }
            mcf mcfVar2 = mcfVar;
            if (z2) {
                str2 = ((mau) masVar).a.n;
            } else {
                str2 = ((mau) masVar).a.m;
            }
            hscVar = new hsc(this, ((mau) masVar).d(1, mcfVar2, str2, str, System.currentTimeMillis()), z);
            this.j.put(hscVar, hsf.PENDING);
        } else {
            masVar = this.a;
            strJ = mip.J(str);
            z2 = false;
            if (!oje.d(strJ)) {
                z2 = true;
            }
            if (z2) {
                mcfVar = mcf.DCIM;
            } else {
                mcfVar = mcf.APP_DATA;
            }
            mcf mcfVar3 = mcfVar;
            if (z2) {
                str2 = ((mau) masVar).a.n;
            } else {
                str2 = ((mau) masVar).a.m;
            }
            hscVar = new hsc(this, ((mau) masVar).d(1, mcfVar3, str2, str, System.currentTimeMillis()), z);
            this.j.put(hscVar, hsf.PENDING);
        }
        throw th;
        return hscVar;
    }

    private final synchronized void k() {
        lis lisVar = this.g;
        String strValueOf = String.valueOf(this);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 12);
        sb.append("#tryPublish ");
        sb.append(strValueOf);
        lisVar.f(sb.toString());
        hsc hscVar = null;
        hsc hscVar2 = null;
        for (hsc hscVar3 : this.j.keySet()) {
            if (hscVar3.b) {
                obr.aW(hscVar2 == null, "Found multiple primaries (%s and %s) in %s: %s", hscVar2, hscVar3, this, this.j);
                hscVar2 = hscVar3;
            } else if (hscVar == null && this.j.get(hscVar3) == hsf.PUBLISH) {
                hscVar = hscVar3;
            }
        }
        Map map = this.j;
        hscVar2.getClass();
        if (map.get(hscVar2) != hsf.PUBLISH) {
            if (hscVar == null) {
                this.g.h(String.format(Locale.ROOT, "No published files found for %s: %s", this, this.j));
                this.a.a();
                return;
            }
            try {
                FileInputStream fileInputStreamD = hscVar.a.d();
                try {
                    mip.M(fileInputStreamD, hscVar2.a);
                    hscVar2.c();
                    hscVar.b();
                    fileInputStreamD.close();
                } catch (Throwable th) {
                    try {
                        fileInputStreamD.close();
                    } catch (Throwable th2) {
                    }
                    throw th;
                }
            } catch (IOException e) {
                this.g.i(String.format(Locale.ROOT, "Error publishing %s: %s", this, this.j), e);
                this.a.a();
            }
        }
        for (hsc hscVar4 : this.j.keySet()) {
            hsf hsfVar = (hsf) this.j.get(hscVar4);
            hsfVar.getClass();
            switch (hsfVar.ordinal()) {
                case 0:
                    hscVar4.a.g();
                    break;
                case 1:
                case 2:
                    hscVar4.a.f();
                    break;
            }
        }
        lis lisVar2 = this.g;
        String strValueOf2 = String.valueOf(this.j);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 25);
        sb2.append("State before publishing: ");
        sb2.append(strValueOf2);
        lisVar2.f(sb2.toString());
        this.a.b();
    }

    private final synchronized boolean l() {
        boolean z;
        z = this.i == null;
        if (z) {
            this.i = "Ignored";
        }
        return z;
    }

    public final hsc a(String str) {
        return j(str, true);
    }

    public final synchronized mak c() {
        return ((hsc) Collection.EL.stream(this.j.keySet()).filter(bql.i).findFirst().get()).a;
    }

    public final synchronized void d() {
        if (l()) {
            Iterator it = this.j.keySet().iterator();
            while (it.hasNext()) {
                ((hsc) it.next()).a.f();
            }
            this.a.a();
        }
    }

    public final void e(mar marVar) {
        mau mauVar = (mau) this.a;
        obr.aR(!mauVar.d, "Cannot modify the listener list after publish() or abandon()");
        marVar.getClass();
        mauVar.c.g(marVar);
    }

    final synchronized void f(hsc hscVar, hsf hsfVar) {
        obr.aU(this.j.containsKey(hscVar), "Trying to mark as published %s not contained in %s", hscVar, this.j);
        this.j.put(hscVar, hsfVar);
    }

    public final synchronized void g() {
        if (l()) {
            k();
        }
    }

    public final hsc h() {
        return j("jpg", false);
    }

    public final synchronized hsc i() {
        hsc hscVar;
        mas masVar = this.a;
        hscVar = new hsc(this, ((mau) masVar).d(3, mcf.APP_CACHE, ((mau) masVar).a.l, "mp4", System.currentTimeMillis()), false);
        this.j.put(hscVar, hsf.PENDING);
        return hscVar;
    }

    public final String toString() {
        String strConcat;
        if (oje.d(this.f)) {
            strConcat = "";
        } else {
            String strValueOf = String.valueOf(this.f);
            strConcat = strValueOf.length() != 0 ? "-".concat(strValueOf) : new String("-");
        }
        String str = h.format(new Date(this.b));
        String strValueOf2 = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7 + String.valueOf(strConcat).length() + String.valueOf(strValueOf2).length());
        sb.append("PXL_");
        sb.append(str);
        sb.append(strConcat);
        sb.append(" (");
        sb.append(strValueOf2);
        sb.append(")");
        return sb.toString();
    }
}
