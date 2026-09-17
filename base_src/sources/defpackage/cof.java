package defpackage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class cof implements chy {
    public static final ouj a = ouj.h("com/google/android/apps/camera/camcorder/mediastore/CamcorderMediaStorePublisher");
    public final hrx b;
    public final Executor c;
    public final huf d;
    public final dib e;
    private final cib f;
    private final clc g;

    public cof(hrx hrxVar, cib cibVar, clc clcVar, Executor executor, huf hufVar, dib dibVar) {
        this.b = hrxVar;
        this.f = cibVar;
        this.g = clcVar;
        this.c = executor;
        this.d = hufVar;
        this.e = dibVar;
    }

    public final mar a(hsq hsqVar, hsc hscVar, hsr hsrVar, hss hssVar, boolean z) {
        return new coe(this, hsrVar, hscVar, hsqVar, z, hssVar);
    }

    public final void b(final ckv ckvVar) {
        this.c.execute(new Runnable() { // from class: cob
            @Override // java.lang.Runnable
            public final void run() {
                cof cofVar = this.a;
                ckv ckvVar2 = ckvVar;
                hsp hspVar = ckvVar2.h.a;
                hsc hscVar = ckvVar2.c;
                hscVar.c();
                ckvVar2.d.e(cofVar.a(ckvVar2.h, hscVar, hsr.VIDEO_SNAPSHOT, ((Boolean) cofVar.d.c(htu.ab)).booleanValue() ? hss.MARS_STORE : hss.MEDIA_STORE, false));
                ckvVar2.d.g();
            }
        });
    }

    public final void d(final ckw ckwVar) {
        this.c.execute(new Runnable() { // from class: coc
            @Override // java.lang.Runnable
            public final void run() {
                cof cofVar = this.a;
                ckw ckwVar2 = ckwVar;
                hsr hsrVar = ckwVar2.m;
                ojc ojcVarD = ckwVar2.a.d();
                ojc ojcVarC = ckwVar2.a.c();
                long j = ckwVar2.e;
                ckwVar2.a.i();
                StringBuilder sb = new StringBuilder();
                if (!ckwVar2.n.isEmpty()) {
                    cqj cqjVar = (cqj) ckwVar2.n.get(0);
                    cqj cqjVar2 = cqj.OFF;
                    switch (cqjVar.ordinal()) {
                        case 2:
                            sb.append("CINEMATIC");
                            break;
                        case 3:
                            sb.append("LOCKED");
                            break;
                        case 4:
                            sb.append("ACTIVE");
                            break;
                    }
                }
                if (ckwVar2.u) {
                    if (!sb.toString().isEmpty()) {
                        sb.append(".");
                    }
                    sb.append("TS");
                }
                cofVar.e(hsrVar, ojcVarD, ojcVarC, j, "", sb.toString(), ckwVar2.p, ckwVar2.t);
            }
        });
    }

    public final void e(hsr hsrVar, ojc ojcVar, ojc ojcVar2, long j, String str, String str2, boolean z, hsq hsqVar) {
        ArrayList<mlb> arrayListAg;
        if (!ojcVar.g() || !ojcVar2.g()) {
            ((oug) ((oug) a.b()).G((char) 591)).r("No MediaGroup or MediaFile. Could not insert %s video into MediaStore failed", str);
            return;
        }
        clc clcVar = this.g;
        mak makVar = ((hsc) ojcVar2.c()).a;
        mak makVar2 = ((hsc) ojcVar2.c()).a;
        if (clcVar.a.k(dcu.Q)) {
            ArrayList arrayList = new ArrayList();
            int iA = clc.a(j);
            try {
                FileInputStream fileInputStreamD = makVar.d();
                try {
                    mkz mkzVarF = mkz.c(fileInputStreamD).f("moov");
                    mkz mkzVarB = mkzVarF.e("mvhd").b();
                    arrayList.add(Long.valueOf(mkzVarB.g().b + 4));
                    arrayList.add(Long.valueOf(mkzVarB.g().b + 8));
                    mkz mkzVarB2 = mkzVarF.b();
                    byte[] bArrA = mlc.a("trak");
                    if (mkzVarB2.a.g()) {
                        mlb mlbVarB = ((mlb) mkzVarB2.a.c()).b();
                        ArrayList arrayList2 = new ArrayList();
                        while (true) {
                            mlb mlbVarAl = mip.al(mlbVarB);
                            if (mlbVarAl == null) {
                                break;
                            } else if (Arrays.equals(mip.am(mlbVarAl), bArrA)) {
                                arrayList2.add(mlbVarAl);
                            }
                        }
                        arrayListAg = arrayList2;
                    } else {
                        arrayListAg = obr.ag();
                    }
                    for (mlb mlbVar : arrayListAg) {
                        mkz mkzVarB3 = mkz.d(mlbVar).e("tkhd").b();
                        arrayList.add(Long.valueOf(mkzVarB3.g().b + 4));
                        arrayList.add(Long.valueOf(mkzVarB3.g().b + 8));
                        mkz mkzVarB4 = mkz.d(mlbVar).e("mdia").e("mdhd").b();
                        arrayList.add(Long.valueOf(mkzVarB4.g().b + 4));
                        arrayList.add(Long.valueOf(mkzVarB4.g().b + 8));
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        fileInputStreamD.getChannel().position(((Long) it.next()).longValue());
                        int i = new DataInputStream(fileInputStreamD).readInt();
                        int i2 = i ^ Integer.MIN_VALUE;
                        if (adf.b(i2, iA ^ Integer.MIN_VALUE) > 0) {
                            StringBuilder sb = new StringBuilder(48);
                            sb.append("Modification time already too large: ");
                            sb.append(i);
                            throw new clb(sb.toString());
                        }
                        if (adf.b(Integer.MIN_VALUE ^ clc.a(j - TimeUnit.MILLISECONDS.convert(10L, TimeUnit.HOURS)), i2) > 0) {
                            StringBuilder sb2 = new StringBuilder(59);
                            sb2.append("Existing modification time too early, won' fix: ");
                            sb2.append(i);
                            throw new clb(sb2.toString());
                        }
                    }
                    fileInputStreamD.close();
                    FileOutputStream fileOutputStreamE = makVar2.e();
                    try {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            fileOutputStreamE.getChannel().position(((Long) it2.next()).longValue());
                            new DataOutputStream(fileOutputStreamE).writeInt(iA);
                        }
                        fileOutputStreamE.close();
                    } catch (Throwable th) {
                        try {
                            fileOutputStreamE.close();
                            throw th;
                        } catch (Throwable th2) {
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        fileInputStreamD.close();
                        throw th3;
                    } catch (Throwable th4) {
                        throw th3;
                    }
                }
            } catch (Exception e) {
                clcVar.b.i("Couldn't fix video duration", e);
            }
            clcVar.b.b("Successfully fixed creation time.");
        } else {
            clcVar.b.b("Not fixing creation time; disabled by flag.");
        }
        ((hsg) ojcVar.c()).e(a(hsqVar, (hsc) ojcVar2.c(), hsrVar, ((Boolean) this.d.c(htu.ab)).booleanValue() ? hss.MARS_STORE : hss.MEDIA_STORE, z));
        if (!str2.isEmpty()) {
            ((hsc) ojcVar2.c()).a.h(str2);
        }
        ((hsc) ojcVar2.c()).c();
        ((hsg) ojcVar.c()).g();
    }

    @Override // defpackage.chy
    public final void f() {
    }

    @Override // defpackage.chy
    public final void g() {
    }

    @Override // defpackage.chy
    public final void gb() {
    }

    @Override // defpackage.chy
    public final void h() {
    }

    @Override // defpackage.chy
    public final void i(clf clfVar) {
        if (this.f.n()) {
            Iterator it = clfVar.a.iterator();
            while (it.hasNext()) {
                d((ckw) it.next());
            }
            Iterator it2 = clfVar.b.iterator();
            while (it2.hasNext()) {
                b((ckv) it2.next());
            }
            return;
        }
        Iterator it3 = clfVar.a.iterator();
        while (it3.hasNext()) {
            this.e.h(((ckw) it3.next()).t.b);
        }
        Iterator it4 = clfVar.b.iterator();
        while (it4.hasNext()) {
            this.e.h(((ckv) it4.next()).h.b);
        }
    }

    @Override // defpackage.chy
    public final void j(boolean z) {
    }
}
