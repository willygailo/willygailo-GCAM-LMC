package defpackage;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.PersistableBundle;
import android.os.SystemClock;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes2.dex */
final class kel extends kdu {
    public boolean a;
    public final kef c;
    public final kep d;
    public long e;
    public boolean f;
    private final kfd g;
    private final kfb h;
    private final ked i;
    private final kep j;
    private final kfm k;

    protected kel(kdx kdxVar) {
        super(kdxVar);
        this.h = new kfb(kdxVar);
        this.c = new kef(kdxVar);
        this.g = new kfd(kdxVar);
        this.i = new ked(kdxVar);
        this.k = new kfm();
        this.j = new keh(this, kdxVar);
        this.d = new kei(this, kdxVar);
    }

    private final void H() {
        if (this.j.e()) {
            q("All hits dispatched or no network/service. Going to power save mode");
        }
        this.j.c();
        ker kerVarH = h();
        if (kerVarH.c) {
            kerVarH.c();
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x004f A[Catch: SQLiteException -> 0x0053, TRY_ENTER, TryCatch #2 {SQLiteException -> 0x0053, blocks: (B:7:0x0014, B:14:0x0034, B:17:0x003b, B:30:0x004f, B:31:0x0052), top: B:44:0x0014 }] */
    private final void I() throws Throwable {
        long j;
        ker kerVarH = h();
        if (!kerVarH.a || kerVarH.c) {
            return;
        }
        kdo.a();
        z();
        try {
            kef kefVar = this.c;
            kdo.a();
            kefVar.z();
            String str = kef.c;
            Cursor cursor = null;
            try {
                try {
                    Cursor cursorRawQuery = kefVar.b().rawQuery(str, null);
                    try {
                        if (cursorRawQuery.moveToFirst()) {
                            j = cursorRawQuery.getLong(0);
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                        } else {
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                            j = 0;
                        }
                        if (j == 0 || Math.abs(System.currentTimeMillis() - j) > ((Long) keu.f.a()).longValue()) {
                            return;
                        }
                        r("Dispatch alarm scheduled (ms)", Long.valueOf(ken.b()));
                        kerVarH.z();
                        mip.dr(kerVarH.a, "Receiver not registered");
                        kerVarH.g();
                        long jB = ken.b();
                        if (jB > 0) {
                            kerVarH.c();
                            kerVarH.y();
                            SystemClock.elapsedRealtime();
                            kerVarH.c = true;
                            ((Boolean) keu.C.a()).booleanValue();
                            kerVarH.q("Scheduling upload with JobScheduler");
                            Context contextD = kerVarH.d();
                            ComponentName componentName = new ComponentName(contextD, "com.google.android.gms.analytics.AnalyticsJobService");
                            int iB = kerVarH.b();
                            PersistableBundle persistableBundle = new PersistableBundle();
                            persistableBundle.putString("action", "com.google.android.gms.analytics.ANALYTICS_DISPATCH");
                            JobInfo jobInfoBuild = new JobInfo.Builder(iB, componentName).setMinimumLatency(jB).setOverrideDeadline(jB + jB).setExtras(persistableBundle).build();
                            kerVarH.r("Scheduling job. JobID", Integer.valueOf(iB));
                            kse.a(contextD, jobInfoBuild);
                        }
                    } catch (SQLiteException e) {
                        e = e;
                        kefVar.p("Database error", str, e);
                        throw e;
                    }
                } catch (Throwable th) {
                    th = th;
                    if (0 != 0) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e2) {
                e = e2;
            } catch (Throwable th2) {
                th = th2;
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            o("Failed to get min/max hit times from local store", e3);
            j = 0;
        }
    }

    protected final void C() {
        key keyVar;
        if (this.f || !ken.i() || this.i.D()) {
            return;
        }
        if (this.k.c(((Long) keu.z.a()).longValue())) {
            this.k.b();
            q("Connecting to service");
            ked kedVar = this.i;
            kdo.a();
            kedVar.z();
            if (kedVar.c == null) {
                kec kecVar = kedVar.a;
                ked kedVar2 = kecVar.b;
                kdo.a();
                Intent intent = new Intent("com.google.android.gms.analytics.service.START");
                intent.setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.analytics.service.AnalyticsService"));
                Context contextD = kecVar.b.d();
                intent.putExtra("app_package_name", contextD.getPackageName());
                knx knxVarA = knx.a();
                synchronized (kecVar) {
                    keyVar = null;
                    kecVar.c = null;
                    kecVar.a = true;
                    boolean zC = knxVarA.c(contextD, contextD.getClass().getName(), intent, kecVar.b.a, 129);
                    kecVar.b.r("Bind to service requested", Boolean.valueOf(zC));
                    if (zC) {
                        try {
                            kecVar.wait(((Long) keu.y.a()).longValue());
                        } catch (InterruptedException e) {
                            kecVar.b.t("Wait for service connect was interrupted");
                        }
                        kecVar.a = false;
                        key keyVar2 = kecVar.c;
                        kecVar.c = null;
                        if (keyVar2 == null) {
                            kecVar.b.n("Successfully bound to service but never got onServiceConnected callback");
                        }
                        keyVar = keyVar2;
                    } else {
                        kecVar.a = false;
                    }
                }
                if (keyVar == null) {
                    return;
                }
                kedVar.c = keyVar;
                kedVar.C();
            }
            q("Connected to service");
            this.k.a();
            D();
        }
    }

    protected final void D() {
        kdo.a();
        kdo.a();
        z();
        if (!ken.i()) {
            t("Service client disabled. Can't dispatch local hits to device AnalyticsService");
        }
        if (!this.i.D()) {
            q("Service not connected");
            return;
        }
        if (this.c.H()) {
            return;
        }
        q("Dispatching local hits to device AnalyticsService");
        while (true) {
            try {
                List listC = this.c.c(ken.e());
                if (listC.isEmpty()) {
                    F();
                    return;
                }
                while (!listC.isEmpty()) {
                    kex kexVar = (kex) listC.get(0);
                    if (!this.i.E(kexVar)) {
                        F();
                        return;
                    }
                    listC.remove(kexVar);
                    try {
                        this.c.D(kexVar.b);
                    } catch (SQLiteException e) {
                        o("Failed to remove hit that was send for delivery", e);
                        H();
                        return;
                    }
                }
            } catch (SQLiteException e2) {
                o("Failed to read hits from store", e2);
                H();
                return;
            }
        }
    }

    public final void E() {
        z();
        kdo.a();
        this.f = true;
        this.i.b();
        F();
    }

    public final void F() {
        long jMin;
        long jAbs;
        kdo.a();
        z();
        if (!this.f) {
            if (b() > 0) {
                if (this.c.H()) {
                    this.h.c();
                    H();
                    return;
                }
                if (!((Boolean) keu.w.a()).booleanValue()) {
                    kfb kfbVar = this.h;
                    kfbVar.b();
                    if (!kfbVar.c) {
                        Context contextA = kfbVar.a();
                        contextA.registerReceiver(kfbVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                        IntentFilter intentFilter = new IntentFilter("com.google.analytics.RADIO_POWERED");
                        intentFilter.addCategory(contextA.getPackageName());
                        contextA.registerReceiver(kfbVar, intentFilter);
                        kfbVar.d = kfbVar.d();
                        kfbVar.b.d().r("Registering connectivity change receiver. Network connected", Boolean.valueOf(kfbVar.d));
                        kfbVar.c = true;
                    }
                    kfb kfbVar2 = this.h;
                    if (!kfbVar2.c) {
                        kfbVar2.b.d().t("Connectivity unknown. Receiver not registered");
                    }
                    if (!kfbVar2.d) {
                        H();
                        I();
                        return;
                    }
                }
                I();
                long jB = b();
                long jB2 = j().b();
                if (jB2 != 0) {
                    jMin = jB - Math.abs(System.currentTimeMillis() - jB2);
                    if (jMin <= 0) {
                        jMin = Math.min(ken.c(), jB);
                    }
                } else {
                    jMin = Math.min(ken.c(), jB);
                }
                r("Dispatch scheduled (ms)", Long.valueOf(jMin));
                if (!this.j.e()) {
                    this.j.d(jMin);
                    return;
                }
                kep kepVar = this.j;
                if (kepVar.d == 0) {
                    jAbs = 0;
                } else {
                    kdx kdxVar = kepVar.b;
                    jAbs = Math.abs(System.currentTimeMillis() - kepVar.d);
                }
                long jMax = Math.max(1L, jMin + jAbs);
                kep kepVar2 = this.j;
                if (kepVar2.e()) {
                    if (jMax < 0) {
                        kepVar2.c();
                        return;
                    }
                    kdx kdxVar2 = kepVar2.b;
                    long jAbs2 = jMax - Math.abs(System.currentTimeMillis() - kepVar2.d);
                    long j = jAbs2 >= 0 ? jAbs2 : 0L;
                    kepVar2.b().removeCallbacks(kepVar2.c);
                    if (kepVar2.b().postDelayed(kepVar2.c, j)) {
                        return;
                    }
                    kepVar2.b.d().o("Failed to adjust delayed post. time", Long.valueOf(j));
                    return;
                }
                return;
            }
        }
        this.h.c();
        H();
    }

    public final boolean G(String str) {
        return koe.b(d()).e(str) == 0;
    }

    @Override // defpackage.kdu
    protected final void a() {
        this.c.A();
        this.g.A();
        this.i.A();
    }

    public final long b() {
        long jLongValue = ((Long) keu.c.a()).longValue();
        kfn kfnVarK = k();
        kfnVarK.z();
        if (!kfnVarK.d) {
            return jLongValue;
        }
        kfn kfnVarK2 = k();
        kfnVarK2.z();
        return ((long) kfnVarK2.e) * 1000;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0286 A[Catch: IOException -> 0x0299, all -> 0x0591, TryCatch #18 {IOException -> 0x0299, blocks: (B:99:0x027e, B:101:0x0286, B:102:0x028d), top: B:311:0x027e, outer: #28 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x02b6 A[EDGE_INSN: B:110:0x02b6->B:320:0x0503 BREAK  A[LOOP:5: B:181:0x040d->B:355:?]] */
    /* JADX WARN: Code duplicated, block: B:111:0x02ba A[Catch: all -> 0x0591, TryCatch #28 {all -> 0x0591, blocks: (B:12:0x006d, B:13:0x007c, B:15:0x0088, B:22:0x00a9, B:23:0x00b6, B:24:0x00ba, B:26:0x00c0, B:28:0x00cc, B:34:0x00f0, B:36:0x00f9, B:37:0x00fe, B:39:0x0104, B:53:0x0155, B:55:0x015d, B:57:0x0173, B:82:0x01e2, B:83:0x0209, B:85:0x020f, B:108:0x02b2, B:111:0x02ba, B:113:0x02c0, B:115:0x02cf, B:88:0x0226, B:90:0x022f, B:106:0x02a1, B:91:0x023d, B:93:0x0252, B:94:0x025e, B:96:0x0266, B:97:0x0269, B:99:0x027e, B:101:0x0286, B:102:0x028d, B:103:0x0292, B:105:0x029a, B:60:0x018f, B:76:0x01ca, B:63:0x01a1, B:66:0x01ab, B:69:0x01b5, B:72:0x01bf, B:42:0x0115, B:43:0x0125, B:46:0x0139), top: B:321:0x006d, inners: #18 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x02c0 A[Catch: all -> 0x0591, EDGE_INSN: B:113:0x02c0->B:320:0x0503 BREAK  A[LOOP:5: B:181:0x040d->B:355:?], TryCatch #28 {all -> 0x0591, blocks: (B:12:0x006d, B:13:0x007c, B:15:0x0088, B:22:0x00a9, B:23:0x00b6, B:24:0x00ba, B:26:0x00c0, B:28:0x00cc, B:34:0x00f0, B:36:0x00f9, B:37:0x00fe, B:39:0x0104, B:53:0x0155, B:55:0x015d, B:57:0x0173, B:82:0x01e2, B:83:0x0209, B:85:0x020f, B:108:0x02b2, B:111:0x02ba, B:113:0x02c0, B:115:0x02cf, B:88:0x0226, B:90:0x022f, B:106:0x02a1, B:91:0x023d, B:93:0x0252, B:94:0x025e, B:96:0x0266, B:97:0x0269, B:99:0x027e, B:101:0x0286, B:102:0x028d, B:103:0x0292, B:105:0x029a, B:60:0x018f, B:76:0x01ca, B:63:0x01a1, B:66:0x01ab, B:69:0x01b5, B:72:0x01bf, B:42:0x0115, B:43:0x0125, B:46:0x0139), top: B:321:0x006d, inners: #18 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x02cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x02cf A[Catch: all -> 0x0591, TRY_LEAVE, TryCatch #28 {all -> 0x0591, blocks: (B:12:0x006d, B:13:0x007c, B:15:0x0088, B:22:0x00a9, B:23:0x00b6, B:24:0x00ba, B:26:0x00c0, B:28:0x00cc, B:34:0x00f0, B:36:0x00f9, B:37:0x00fe, B:39:0x0104, B:53:0x0155, B:55:0x015d, B:57:0x0173, B:82:0x01e2, B:83:0x0209, B:85:0x020f, B:108:0x02b2, B:111:0x02ba, B:113:0x02c0, B:115:0x02cf, B:88:0x0226, B:90:0x022f, B:106:0x02a1, B:91:0x023d, B:93:0x0252, B:94:0x025e, B:96:0x0266, B:97:0x0269, B:99:0x027e, B:101:0x0286, B:102:0x028d, B:103:0x0292, B:105:0x029a, B:60:0x018f, B:76:0x01ca, B:63:0x01a1, B:66:0x01ab, B:69:0x01b5, B:72:0x01bf, B:42:0x0115, B:43:0x0125, B:46:0x0139), top: B:321:0x006d, inners: #18 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x0316 A[Catch: all -> 0x0379, IOException -> 0x037b, TryCatch #28 {IOException -> 0x037b, all -> 0x0379, blocks: (B:118:0x0302, B:120:0x0316, B:121:0x031f), top: B:332:0x0302 }] */
    /* JADX WARN: Code duplicated, block: B:127:0x034c A[Catch: all -> 0x0371, IOException -> 0x0376, TryCatch #31 {IOException -> 0x0376, all -> 0x0371, blocks: (B:123:0x0327, B:125:0x0341, B:127:0x034c, B:128:0x0356), top: B:326:0x0327 }] */
    /* JADX WARN: Code duplicated, block: B:130:0x0361 A[Catch: all -> 0x058f, TRY_ENTER, TRY_LEAVE, TryCatch #26 {all -> 0x058f, blocks: (B:234:0x0503, B:235:0x0509, B:237:0x050f, B:239:0x051e, B:249:0x0545, B:242:0x0528, B:130:0x0361, B:175:0x03c8, B:176:0x03d5, B:178:0x03ec, B:179:0x03f6, B:164:0x03ab, B:170:0x03b6, B:171:0x03b9, B:168:0x03b1, B:152:0x0390, B:158:0x039b, B:156:0x0396, B:172:0x03ba, B:180:0x03fc, B:181:0x040d, B:183:0x0413, B:185:0x0426, B:231:0x04ef, B:186:0x0434, B:188:0x0446, B:190:0x044c, B:191:0x0453, B:198:0x047f, B:217:0x04a4, B:218:0x04a7, B:213:0x049c, B:219:0x04a8, B:221:0x04af, B:222:0x04bb, B:224:0x04ce, B:225:0x04da, B:227:0x04e0, B:228:0x04e6, B:264:0x0577), top: B:320:0x0503, inners: #6, #21 }] */
    /* JADX WARN: Code duplicated, block: B:158:0x039b A[Catch: all -> 0x058f, TRY_LEAVE, TryCatch #26 {all -> 0x058f, blocks: (B:234:0x0503, B:235:0x0509, B:237:0x050f, B:239:0x051e, B:249:0x0545, B:242:0x0528, B:130:0x0361, B:175:0x03c8, B:176:0x03d5, B:178:0x03ec, B:179:0x03f6, B:164:0x03ab, B:170:0x03b6, B:171:0x03b9, B:168:0x03b1, B:152:0x0390, B:158:0x039b, B:156:0x0396, B:172:0x03ba, B:180:0x03fc, B:181:0x040d, B:183:0x0413, B:185:0x0426, B:231:0x04ef, B:186:0x0434, B:188:0x0446, B:190:0x044c, B:191:0x0453, B:198:0x047f, B:217:0x04a4, B:218:0x04a7, B:213:0x049c, B:219:0x04a8, B:221:0x04af, B:222:0x04bb, B:224:0x04ce, B:225:0x04da, B:227:0x04e0, B:228:0x04e6, B:264:0x0577), top: B:320:0x0503, inners: #6, #21 }] */
    /* JADX WARN: Code duplicated, block: B:160:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:170:0x03b6 A[Catch: all -> 0x058f, TryCatch #26 {all -> 0x058f, blocks: (B:234:0x0503, B:235:0x0509, B:237:0x050f, B:239:0x051e, B:249:0x0545, B:242:0x0528, B:130:0x0361, B:175:0x03c8, B:176:0x03d5, B:178:0x03ec, B:179:0x03f6, B:164:0x03ab, B:170:0x03b6, B:171:0x03b9, B:168:0x03b1, B:152:0x0390, B:158:0x039b, B:156:0x0396, B:172:0x03ba, B:180:0x03fc, B:181:0x040d, B:183:0x0413, B:185:0x0426, B:231:0x04ef, B:186:0x0434, B:188:0x0446, B:190:0x044c, B:191:0x0453, B:198:0x047f, B:217:0x04a4, B:218:0x04a7, B:213:0x049c, B:219:0x04a8, B:221:0x04af, B:222:0x04bb, B:224:0x04ce, B:225:0x04da, B:227:0x04e0, B:228:0x04e6, B:264:0x0577), top: B:320:0x0503, inners: #6, #21 }] */
    /* JADX WARN: Code duplicated, block: B:172:0x03ba A[Catch: all -> 0x058f, TryCatch #26 {all -> 0x058f, blocks: (B:234:0x0503, B:235:0x0509, B:237:0x050f, B:239:0x051e, B:249:0x0545, B:242:0x0528, B:130:0x0361, B:175:0x03c8, B:176:0x03d5, B:178:0x03ec, B:179:0x03f6, B:164:0x03ab, B:170:0x03b6, B:171:0x03b9, B:168:0x03b1, B:152:0x0390, B:158:0x039b, B:156:0x0396, B:172:0x03ba, B:180:0x03fc, B:181:0x040d, B:183:0x0413, B:185:0x0426, B:231:0x04ef, B:186:0x0434, B:188:0x0446, B:190:0x044c, B:191:0x0453, B:198:0x047f, B:217:0x04a4, B:218:0x04a7, B:213:0x049c, B:219:0x04a8, B:221:0x04af, B:222:0x04bb, B:224:0x04ce, B:225:0x04da, B:227:0x04e0, B:228:0x04e6, B:264:0x0577), top: B:320:0x0503, inners: #6, #21 }] */
    /* JADX WARN: Code duplicated, block: B:175:0x03c8 A[Catch: all -> 0x058f, EDGE_INSN: B:175:0x03c8->B:320:0x0503 BREAK  A[LOOP:5: B:181:0x040d->B:355:?], TryCatch #26 {all -> 0x058f, blocks: (B:234:0x0503, B:235:0x0509, B:237:0x050f, B:239:0x051e, B:249:0x0545, B:242:0x0528, B:130:0x0361, B:175:0x03c8, B:176:0x03d5, B:178:0x03ec, B:179:0x03f6, B:164:0x03ab, B:170:0x03b6, B:171:0x03b9, B:168:0x03b1, B:152:0x0390, B:158:0x039b, B:156:0x0396, B:172:0x03ba, B:180:0x03fc, B:181:0x040d, B:183:0x0413, B:185:0x0426, B:231:0x04ef, B:186:0x0434, B:188:0x0446, B:190:0x044c, B:191:0x0453, B:198:0x047f, B:217:0x04a4, B:218:0x04a7, B:213:0x049c, B:219:0x04a8, B:221:0x04af, B:222:0x04bb, B:224:0x04ce, B:225:0x04da, B:227:0x04e0, B:228:0x04e6, B:264:0x0577), top: B:320:0x0503, inners: #6, #21 }] */
    /* JADX WARN: Code duplicated, block: B:176:0x03d5 A[Catch: all -> 0x058f, TryCatch #26 {all -> 0x058f, blocks: (B:234:0x0503, B:235:0x0509, B:237:0x050f, B:239:0x051e, B:249:0x0545, B:242:0x0528, B:130:0x0361, B:175:0x03c8, B:176:0x03d5, B:178:0x03ec, B:179:0x03f6, B:164:0x03ab, B:170:0x03b6, B:171:0x03b9, B:168:0x03b1, B:152:0x0390, B:158:0x039b, B:156:0x0396, B:172:0x03ba, B:180:0x03fc, B:181:0x040d, B:183:0x0413, B:185:0x0426, B:231:0x04ef, B:186:0x0434, B:188:0x0446, B:190:0x044c, B:191:0x0453, B:198:0x047f, B:217:0x04a4, B:218:0x04a7, B:213:0x049c, B:219:0x04a8, B:221:0x04af, B:222:0x04bb, B:224:0x04ce, B:225:0x04da, B:227:0x04e0, B:228:0x04e6, B:264:0x0577), top: B:320:0x0503, inners: #6, #21 }] */
    /* JADX WARN: Code duplicated, block: B:178:0x03ec A[Catch: all -> 0x058f, TryCatch #26 {all -> 0x058f, blocks: (B:234:0x0503, B:235:0x0509, B:237:0x050f, B:239:0x051e, B:249:0x0545, B:242:0x0528, B:130:0x0361, B:175:0x03c8, B:176:0x03d5, B:178:0x03ec, B:179:0x03f6, B:164:0x03ab, B:170:0x03b6, B:171:0x03b9, B:168:0x03b1, B:152:0x0390, B:158:0x039b, B:156:0x0396, B:172:0x03ba, B:180:0x03fc, B:181:0x040d, B:183:0x0413, B:185:0x0426, B:231:0x04ef, B:186:0x0434, B:188:0x0446, B:190:0x044c, B:191:0x0453, B:198:0x047f, B:217:0x04a4, B:218:0x04a7, B:213:0x049c, B:219:0x04a8, B:221:0x04af, B:222:0x04bb, B:224:0x04ce, B:225:0x04da, B:227:0x04e0, B:228:0x04e6, B:264:0x0577), top: B:320:0x0503, inners: #6, #21 }] */
    /* JADX WARN: Code duplicated, block: B:180:0x03fc A[Catch: all -> 0x058f, TryCatch #26 {all -> 0x058f, blocks: (B:234:0x0503, B:235:0x0509, B:237:0x050f, B:239:0x051e, B:249:0x0545, B:242:0x0528, B:130:0x0361, B:175:0x03c8, B:176:0x03d5, B:178:0x03ec, B:179:0x03f6, B:164:0x03ab, B:170:0x03b6, B:171:0x03b9, B:168:0x03b1, B:152:0x0390, B:158:0x039b, B:156:0x0396, B:172:0x03ba, B:180:0x03fc, B:181:0x040d, B:183:0x0413, B:185:0x0426, B:231:0x04ef, B:186:0x0434, B:188:0x0446, B:190:0x044c, B:191:0x0453, B:198:0x047f, B:217:0x04a4, B:218:0x04a7, B:213:0x049c, B:219:0x04a8, B:221:0x04af, B:222:0x04bb, B:224:0x04ce, B:225:0x04da, B:227:0x04e0, B:228:0x04e6, B:264:0x0577), top: B:320:0x0503, inners: #6, #21 }] */
    /* JADX WARN: Code duplicated, block: B:183:0x0413 A[Catch: all -> 0x058f, TryCatch #26 {all -> 0x058f, blocks: (B:234:0x0503, B:235:0x0509, B:237:0x050f, B:239:0x051e, B:249:0x0545, B:242:0x0528, B:130:0x0361, B:175:0x03c8, B:176:0x03d5, B:178:0x03ec, B:179:0x03f6, B:164:0x03ab, B:170:0x03b6, B:171:0x03b9, B:168:0x03b1, B:152:0x0390, B:158:0x039b, B:156:0x0396, B:172:0x03ba, B:180:0x03fc, B:181:0x040d, B:183:0x0413, B:185:0x0426, B:231:0x04ef, B:186:0x0434, B:188:0x0446, B:190:0x044c, B:191:0x0453, B:198:0x047f, B:217:0x04a4, B:218:0x04a7, B:213:0x049c, B:219:0x04a8, B:221:0x04af, B:222:0x04bb, B:224:0x04ce, B:225:0x04da, B:227:0x04e0, B:228:0x04e6, B:264:0x0577), top: B:320:0x0503, inners: #6, #21 }] */
    /* JADX WARN: Code duplicated, block: B:185:0x0426 A[Catch: all -> 0x058f, TryCatch #26 {all -> 0x058f, blocks: (B:234:0x0503, B:235:0x0509, B:237:0x050f, B:239:0x051e, B:249:0x0545, B:242:0x0528, B:130:0x0361, B:175:0x03c8, B:176:0x03d5, B:178:0x03ec, B:179:0x03f6, B:164:0x03ab, B:170:0x03b6, B:171:0x03b9, B:168:0x03b1, B:152:0x0390, B:158:0x039b, B:156:0x0396, B:172:0x03ba, B:180:0x03fc, B:181:0x040d, B:183:0x0413, B:185:0x0426, B:231:0x04ef, B:186:0x0434, B:188:0x0446, B:190:0x044c, B:191:0x0453, B:198:0x047f, B:217:0x04a4, B:218:0x04a7, B:213:0x049c, B:219:0x04a8, B:221:0x04af, B:222:0x04bb, B:224:0x04ce, B:225:0x04da, B:227:0x04e0, B:228:0x04e6, B:264:0x0577), top: B:320:0x0503, inners: #6, #21 }] */
    /* JADX WARN: Code duplicated, block: B:186:0x0434 A[Catch: all -> 0x058f, TryCatch #26 {all -> 0x058f, blocks: (B:234:0x0503, B:235:0x0509, B:237:0x050f, B:239:0x051e, B:249:0x0545, B:242:0x0528, B:130:0x0361, B:175:0x03c8, B:176:0x03d5, B:178:0x03ec, B:179:0x03f6, B:164:0x03ab, B:170:0x03b6, B:171:0x03b9, B:168:0x03b1, B:152:0x0390, B:158:0x039b, B:156:0x0396, B:172:0x03ba, B:180:0x03fc, B:181:0x040d, B:183:0x0413, B:185:0x0426, B:231:0x04ef, B:186:0x0434, B:188:0x0446, B:190:0x044c, B:191:0x0453, B:198:0x047f, B:217:0x04a4, B:218:0x04a7, B:213:0x049c, B:219:0x04a8, B:221:0x04af, B:222:0x04bb, B:224:0x04ce, B:225:0x04da, B:227:0x04e0, B:228:0x04e6, B:264:0x0577), top: B:320:0x0503, inners: #6, #21 }] */
    /* JADX WARN: Code duplicated, block: B:188:0x0446 A[Catch: all -> 0x058f, TryCatch #26 {all -> 0x058f, blocks: (B:234:0x0503, B:235:0x0509, B:237:0x050f, B:239:0x051e, B:249:0x0545, B:242:0x0528, B:130:0x0361, B:175:0x03c8, B:176:0x03d5, B:178:0x03ec, B:179:0x03f6, B:164:0x03ab, B:170:0x03b6, B:171:0x03b9, B:168:0x03b1, B:152:0x0390, B:158:0x039b, B:156:0x0396, B:172:0x03ba, B:180:0x03fc, B:181:0x040d, B:183:0x0413, B:185:0x0426, B:231:0x04ef, B:186:0x0434, B:188:0x0446, B:190:0x044c, B:191:0x0453, B:198:0x047f, B:217:0x04a4, B:218:0x04a7, B:213:0x049c, B:219:0x04a8, B:221:0x04af, B:222:0x04bb, B:224:0x04ce, B:225:0x04da, B:227:0x04e0, B:228:0x04e6, B:264:0x0577), top: B:320:0x0503, inners: #6, #21 }] */
    /* JADX WARN: Code duplicated, block: B:191:0x0453 A[Catch: all -> 0x058f, TRY_LEAVE, TryCatch #26 {all -> 0x058f, blocks: (B:234:0x0503, B:235:0x0509, B:237:0x050f, B:239:0x051e, B:249:0x0545, B:242:0x0528, B:130:0x0361, B:175:0x03c8, B:176:0x03d5, B:178:0x03ec, B:179:0x03f6, B:164:0x03ab, B:170:0x03b6, B:171:0x03b9, B:168:0x03b1, B:152:0x0390, B:158:0x039b, B:156:0x0396, B:172:0x03ba, B:180:0x03fc, B:181:0x040d, B:183:0x0413, B:185:0x0426, B:231:0x04ef, B:186:0x0434, B:188:0x0446, B:190:0x044c, B:191:0x0453, B:198:0x047f, B:217:0x04a4, B:218:0x04a7, B:213:0x049c, B:219:0x04a8, B:221:0x04af, B:222:0x04bb, B:224:0x04ce, B:225:0x04da, B:227:0x04e0, B:228:0x04e6, B:264:0x0577), top: B:320:0x0503, inners: #6, #21 }] */
    /* JADX WARN: Code duplicated, block: B:195:0x046a A[Catch: all -> 0x048c, IOException -> 0x048e, TryCatch #26 {IOException -> 0x048e, all -> 0x048c, blocks: (B:193:0x045c, B:195:0x046a, B:196:0x0474), top: B:336:0x045c }] */
    /* JADX WARN: Code duplicated, block: B:198:0x047f A[Catch: all -> 0x058f, TRY_ENTER, TRY_LEAVE, TryCatch #26 {all -> 0x058f, blocks: (B:234:0x0503, B:235:0x0509, B:237:0x050f, B:239:0x051e, B:249:0x0545, B:242:0x0528, B:130:0x0361, B:175:0x03c8, B:176:0x03d5, B:178:0x03ec, B:179:0x03f6, B:164:0x03ab, B:170:0x03b6, B:171:0x03b9, B:168:0x03b1, B:152:0x0390, B:158:0x039b, B:156:0x0396, B:172:0x03ba, B:180:0x03fc, B:181:0x040d, B:183:0x0413, B:185:0x0426, B:231:0x04ef, B:186:0x0434, B:188:0x0446, B:190:0x044c, B:191:0x0453, B:198:0x047f, B:217:0x04a4, B:218:0x04a7, B:213:0x049c, B:219:0x04a8, B:221:0x04af, B:222:0x04bb, B:224:0x04ce, B:225:0x04da, B:227:0x04e0, B:228:0x04e6, B:264:0x0577), top: B:320:0x0503, inners: #6, #21 }] */
    /* JADX WARN: Code duplicated, block: B:202:0x0488  */
    /* JADX WARN: Code duplicated, block: B:217:0x04a4 A[Catch: all -> 0x058f, TryCatch #26 {all -> 0x058f, blocks: (B:234:0x0503, B:235:0x0509, B:237:0x050f, B:239:0x051e, B:249:0x0545, B:242:0x0528, B:130:0x0361, B:175:0x03c8, B:176:0x03d5, B:178:0x03ec, B:179:0x03f6, B:164:0x03ab, B:170:0x03b6, B:171:0x03b9, B:168:0x03b1, B:152:0x0390, B:158:0x039b, B:156:0x0396, B:172:0x03ba, B:180:0x03fc, B:181:0x040d, B:183:0x0413, B:185:0x0426, B:231:0x04ef, B:186:0x0434, B:188:0x0446, B:190:0x044c, B:191:0x0453, B:198:0x047f, B:217:0x04a4, B:218:0x04a7, B:213:0x049c, B:219:0x04a8, B:221:0x04af, B:222:0x04bb, B:224:0x04ce, B:225:0x04da, B:227:0x04e0, B:228:0x04e6, B:264:0x0577), top: B:320:0x0503, inners: #6, #21 }] */
    /* JADX WARN: Code duplicated, block: B:219:0x04a8 A[Catch: all -> 0x058f, TryCatch #26 {all -> 0x058f, blocks: (B:234:0x0503, B:235:0x0509, B:237:0x050f, B:239:0x051e, B:249:0x0545, B:242:0x0528, B:130:0x0361, B:175:0x03c8, B:176:0x03d5, B:178:0x03ec, B:179:0x03f6, B:164:0x03ab, B:170:0x03b6, B:171:0x03b9, B:168:0x03b1, B:152:0x0390, B:158:0x039b, B:156:0x0396, B:172:0x03ba, B:180:0x03fc, B:181:0x040d, B:183:0x0413, B:185:0x0426, B:231:0x04ef, B:186:0x0434, B:188:0x0446, B:190:0x044c, B:191:0x0453, B:198:0x047f, B:217:0x04a4, B:218:0x04a7, B:213:0x049c, B:219:0x04a8, B:221:0x04af, B:222:0x04bb, B:224:0x04ce, B:225:0x04da, B:227:0x04e0, B:228:0x04e6, B:264:0x0577), top: B:320:0x0503, inners: #6, #21 }] */
    /* JADX WARN: Code duplicated, block: B:221:0x04af A[Catch: all -> 0x058f, TryCatch #26 {all -> 0x058f, blocks: (B:234:0x0503, B:235:0x0509, B:237:0x050f, B:239:0x051e, B:249:0x0545, B:242:0x0528, B:130:0x0361, B:175:0x03c8, B:176:0x03d5, B:178:0x03ec, B:179:0x03f6, B:164:0x03ab, B:170:0x03b6, B:171:0x03b9, B:168:0x03b1, B:152:0x0390, B:158:0x039b, B:156:0x0396, B:172:0x03ba, B:180:0x03fc, B:181:0x040d, B:183:0x0413, B:185:0x0426, B:231:0x04ef, B:186:0x0434, B:188:0x0446, B:190:0x044c, B:191:0x0453, B:198:0x047f, B:217:0x04a4, B:218:0x04a7, B:213:0x049c, B:219:0x04a8, B:221:0x04af, B:222:0x04bb, B:224:0x04ce, B:225:0x04da, B:227:0x04e0, B:228:0x04e6, B:264:0x0577), top: B:320:0x0503, inners: #6, #21 }] */
    /* JADX WARN: Code duplicated, block: B:222:0x04bb A[Catch: all -> 0x058f, TryCatch #26 {all -> 0x058f, blocks: (B:234:0x0503, B:235:0x0509, B:237:0x050f, B:239:0x051e, B:249:0x0545, B:242:0x0528, B:130:0x0361, B:175:0x03c8, B:176:0x03d5, B:178:0x03ec, B:179:0x03f6, B:164:0x03ab, B:170:0x03b6, B:171:0x03b9, B:168:0x03b1, B:152:0x0390, B:158:0x039b, B:156:0x0396, B:172:0x03ba, B:180:0x03fc, B:181:0x040d, B:183:0x0413, B:185:0x0426, B:231:0x04ef, B:186:0x0434, B:188:0x0446, B:190:0x044c, B:191:0x0453, B:198:0x047f, B:217:0x04a4, B:218:0x04a7, B:213:0x049c, B:219:0x04a8, B:221:0x04af, B:222:0x04bb, B:224:0x04ce, B:225:0x04da, B:227:0x04e0, B:228:0x04e6, B:264:0x0577), top: B:320:0x0503, inners: #6, #21 }] */
    /* JADX WARN: Code duplicated, block: B:224:0x04ce A[Catch: all -> 0x058f, TryCatch #26 {all -> 0x058f, blocks: (B:234:0x0503, B:235:0x0509, B:237:0x050f, B:239:0x051e, B:249:0x0545, B:242:0x0528, B:130:0x0361, B:175:0x03c8, B:176:0x03d5, B:178:0x03ec, B:179:0x03f6, B:164:0x03ab, B:170:0x03b6, B:171:0x03b9, B:168:0x03b1, B:152:0x0390, B:158:0x039b, B:156:0x0396, B:172:0x03ba, B:180:0x03fc, B:181:0x040d, B:183:0x0413, B:185:0x0426, B:231:0x04ef, B:186:0x0434, B:188:0x0446, B:190:0x044c, B:191:0x0453, B:198:0x047f, B:217:0x04a4, B:218:0x04a7, B:213:0x049c, B:219:0x04a8, B:221:0x04af, B:222:0x04bb, B:224:0x04ce, B:225:0x04da, B:227:0x04e0, B:228:0x04e6, B:264:0x0577), top: B:320:0x0503, inners: #6, #21 }] */
    /* JADX WARN: Code duplicated, block: B:225:0x04da A[Catch: all -> 0x058f, TryCatch #26 {all -> 0x058f, blocks: (B:234:0x0503, B:235:0x0509, B:237:0x050f, B:239:0x051e, B:249:0x0545, B:242:0x0528, B:130:0x0361, B:175:0x03c8, B:176:0x03d5, B:178:0x03ec, B:179:0x03f6, B:164:0x03ab, B:170:0x03b6, B:171:0x03b9, B:168:0x03b1, B:152:0x0390, B:158:0x039b, B:156:0x0396, B:172:0x03ba, B:180:0x03fc, B:181:0x040d, B:183:0x0413, B:185:0x0426, B:231:0x04ef, B:186:0x0434, B:188:0x0446, B:190:0x044c, B:191:0x0453, B:198:0x047f, B:217:0x04a4, B:218:0x04a7, B:213:0x049c, B:219:0x04a8, B:221:0x04af, B:222:0x04bb, B:224:0x04ce, B:225:0x04da, B:227:0x04e0, B:228:0x04e6, B:264:0x0577), top: B:320:0x0503, inners: #6, #21 }] */
    /* JADX WARN: Code duplicated, block: B:228:0x04e6 A[Catch: all -> 0x058f, TryCatch #26 {all -> 0x058f, blocks: (B:234:0x0503, B:235:0x0509, B:237:0x050f, B:239:0x051e, B:249:0x0545, B:242:0x0528, B:130:0x0361, B:175:0x03c8, B:176:0x03d5, B:178:0x03ec, B:179:0x03f6, B:164:0x03ab, B:170:0x03b6, B:171:0x03b9, B:168:0x03b1, B:152:0x0390, B:158:0x039b, B:156:0x0396, B:172:0x03ba, B:180:0x03fc, B:181:0x040d, B:183:0x0413, B:185:0x0426, B:231:0x04ef, B:186:0x0434, B:188:0x0446, B:190:0x044c, B:191:0x0453, B:198:0x047f, B:217:0x04a4, B:218:0x04a7, B:213:0x049c, B:219:0x04a8, B:221:0x04af, B:222:0x04bb, B:224:0x04ce, B:225:0x04da, B:227:0x04e0, B:228:0x04e6, B:264:0x0577), top: B:320:0x0503, inners: #6, #21 }] */
    /* JADX WARN: Code duplicated, block: B:237:0x050f A[Catch: all -> 0x058f, LOOP:4: B:235:0x0509->B:237:0x050f, LOOP_END, TRY_LEAVE, TryCatch #26 {all -> 0x058f, blocks: (B:234:0x0503, B:235:0x0509, B:237:0x050f, B:239:0x051e, B:249:0x0545, B:242:0x0528, B:130:0x0361, B:175:0x03c8, B:176:0x03d5, B:178:0x03ec, B:179:0x03f6, B:164:0x03ab, B:170:0x03b6, B:171:0x03b9, B:168:0x03b1, B:152:0x0390, B:158:0x039b, B:156:0x0396, B:172:0x03ba, B:180:0x03fc, B:181:0x040d, B:183:0x0413, B:185:0x0426, B:231:0x04ef, B:186:0x0434, B:188:0x0446, B:190:0x044c, B:191:0x0453, B:198:0x047f, B:217:0x04a4, B:218:0x04a7, B:213:0x049c, B:219:0x04a8, B:221:0x04af, B:222:0x04bb, B:224:0x04ce, B:225:0x04da, B:227:0x04e0, B:228:0x04e6, B:264:0x0577), top: B:320:0x0503, inners: #6, #21 }] */
    /* JADX WARN: Code duplicated, block: B:248:0x0541  */
    /* JADX WARN: Code duplicated, block: B:280:0x05b0 A[Catch: Exception -> 0x05d8, TryCatch #22 {Exception -> 0x05d8, blocks: (B:7:0x0034, B:10:0x0052, B:278:0x05a4, B:280:0x05b0, B:281:0x05b3, B:283:0x05b9, B:11:0x005b, B:16:0x0090, B:19:0x009f, B:20:0x00a2, B:29:0x00e0, B:32:0x00ec, B:251:0x054b, B:257:0x055e, B:254:0x0557, B:255:0x055a, B:260:0x0570, B:243:0x0530, B:246:0x053d, B:274:0x0594, B:275:0x059e, B:277:0x05a0, B:47:0x0141, B:50:0x014e, B:265:0x057f, B:268:0x058b, B:239:0x051e, B:43:0x0125, B:13:0x007c, B:15:0x0088, B:22:0x00a9), top: B:317:0x0034, inners: #3, #5, #8, #10, #13, #15, #17, #19, #24, #29, #30 }] */
    /* JADX WARN: Code duplicated, block: B:283:0x05b9 A[Catch: Exception -> 0x05d8, TRY_LEAVE, TryCatch #22 {Exception -> 0x05d8, blocks: (B:7:0x0034, B:10:0x0052, B:278:0x05a4, B:280:0x05b0, B:281:0x05b3, B:283:0x05b9, B:11:0x005b, B:16:0x0090, B:19:0x009f, B:20:0x00a2, B:29:0x00e0, B:32:0x00ec, B:251:0x054b, B:257:0x055e, B:254:0x0557, B:255:0x055a, B:260:0x0570, B:243:0x0530, B:246:0x053d, B:274:0x0594, B:275:0x059e, B:277:0x05a0, B:47:0x0141, B:50:0x014e, B:265:0x057f, B:268:0x058b, B:239:0x051e, B:43:0x0125, B:13:0x007c, B:15:0x0088, B:22:0x00a9), top: B:317:0x0034, inners: #3, #5, #8, #10, #13, #15, #17, #19, #24, #29, #30 }] */
    /* JADX WARN: Code duplicated, block: B:288:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:290:0x05ee A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:295:0x054b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:0x03ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:305:0x055e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:311:0x027e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:315:0x0390 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:344:0x02b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:345:0x0222 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:346:0x02b2 A[EDGE_INSN: B:346:0x02b2->B:108:0x02b2 BREAK  A[LOOP:3: B:83:0x0209->B:106:0x02a1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:351:0x04e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:352:0x04ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:353:0x0502 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:354:0x044c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:355:? A[LOOP:5: B:181:0x040d->B:355:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:356:? A[Catch: all -> 0x058f, SYNTHETIC, TryCatch #26 {all -> 0x058f, blocks: (B:234:0x0503, B:235:0x0509, B:237:0x050f, B:239:0x051e, B:249:0x0545, B:242:0x0528, B:130:0x0361, B:175:0x03c8, B:176:0x03d5, B:178:0x03ec, B:179:0x03f6, B:164:0x03ab, B:170:0x03b6, B:171:0x03b9, B:168:0x03b1, B:152:0x0390, B:158:0x039b, B:156:0x0396, B:172:0x03ba, B:180:0x03fc, B:181:0x040d, B:183:0x0413, B:185:0x0426, B:231:0x04ef, B:186:0x0434, B:188:0x0446, B:190:0x044c, B:191:0x0453, B:198:0x047f, B:217:0x04a4, B:218:0x04a7, B:213:0x049c, B:219:0x04a8, B:221:0x04af, B:222:0x04bb, B:224:0x04ce, B:225:0x04da, B:227:0x04e0, B:228:0x04e6, B:264:0x0577), top: B:320:0x0503, inners: #6, #21 }] */
    /* JADX WARN: Code duplicated, block: B:357:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x015d A[Catch: all -> 0x0591, TryCatch #28 {all -> 0x0591, blocks: (B:12:0x006d, B:13:0x007c, B:15:0x0088, B:22:0x00a9, B:23:0x00b6, B:24:0x00ba, B:26:0x00c0, B:28:0x00cc, B:34:0x00f0, B:36:0x00f9, B:37:0x00fe, B:39:0x0104, B:53:0x0155, B:55:0x015d, B:57:0x0173, B:82:0x01e2, B:83:0x0209, B:85:0x020f, B:108:0x02b2, B:111:0x02ba, B:113:0x02c0, B:115:0x02cf, B:88:0x0226, B:90:0x022f, B:106:0x02a1, B:91:0x023d, B:93:0x0252, B:94:0x025e, B:96:0x0266, B:97:0x0269, B:99:0x027e, B:101:0x0286, B:102:0x028d, B:103:0x0292, B:105:0x029a, B:60:0x018f, B:76:0x01ca, B:63:0x01a1, B:66:0x01ab, B:69:0x01b5, B:72:0x01bf, B:42:0x0115, B:43:0x0125, B:46:0x0139), top: B:321:0x006d, inners: #18 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01e2 A[Catch: all -> 0x0591, TryCatch #28 {all -> 0x0591, blocks: (B:12:0x006d, B:13:0x007c, B:15:0x0088, B:22:0x00a9, B:23:0x00b6, B:24:0x00ba, B:26:0x00c0, B:28:0x00cc, B:34:0x00f0, B:36:0x00f9, B:37:0x00fe, B:39:0x0104, B:53:0x0155, B:55:0x015d, B:57:0x0173, B:82:0x01e2, B:83:0x0209, B:85:0x020f, B:108:0x02b2, B:111:0x02ba, B:113:0x02c0, B:115:0x02cf, B:88:0x0226, B:90:0x022f, B:106:0x02a1, B:91:0x023d, B:93:0x0252, B:94:0x025e, B:96:0x0266, B:97:0x0269, B:99:0x027e, B:101:0x0286, B:102:0x028d, B:103:0x0292, B:105:0x029a, B:60:0x018f, B:76:0x01ca, B:63:0x01a1, B:66:0x01ab, B:69:0x01b5, B:72:0x01bf, B:42:0x0115, B:43:0x0125, B:46:0x0139), top: B:321:0x006d, inners: #18 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x020f A[Catch: all -> 0x0591, TryCatch #28 {all -> 0x0591, blocks: (B:12:0x006d, B:13:0x007c, B:15:0x0088, B:22:0x00a9, B:23:0x00b6, B:24:0x00ba, B:26:0x00c0, B:28:0x00cc, B:34:0x00f0, B:36:0x00f9, B:37:0x00fe, B:39:0x0104, B:53:0x0155, B:55:0x015d, B:57:0x0173, B:82:0x01e2, B:83:0x0209, B:85:0x020f, B:108:0x02b2, B:111:0x02ba, B:113:0x02c0, B:115:0x02cf, B:88:0x0226, B:90:0x022f, B:106:0x02a1, B:91:0x023d, B:93:0x0252, B:94:0x025e, B:96:0x0266, B:97:0x0269, B:99:0x027e, B:101:0x0286, B:102:0x028d, B:103:0x0292, B:105:0x029a, B:60:0x018f, B:76:0x01ca, B:63:0x01a1, B:66:0x01ab, B:69:0x01b5, B:72:0x01bf, B:42:0x0115, B:43:0x0125, B:46:0x0139), top: B:321:0x006d, inners: #18 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0226 A[Catch: all -> 0x0591, TryCatch #28 {all -> 0x0591, blocks: (B:12:0x006d, B:13:0x007c, B:15:0x0088, B:22:0x00a9, B:23:0x00b6, B:24:0x00ba, B:26:0x00c0, B:28:0x00cc, B:34:0x00f0, B:36:0x00f9, B:37:0x00fe, B:39:0x0104, B:53:0x0155, B:55:0x015d, B:57:0x0173, B:82:0x01e2, B:83:0x0209, B:85:0x020f, B:108:0x02b2, B:111:0x02ba, B:113:0x02c0, B:115:0x02cf, B:88:0x0226, B:90:0x022f, B:106:0x02a1, B:91:0x023d, B:93:0x0252, B:94:0x025e, B:96:0x0266, B:97:0x0269, B:99:0x027e, B:101:0x0286, B:102:0x028d, B:103:0x0292, B:105:0x029a, B:60:0x018f, B:76:0x01ca, B:63:0x01a1, B:66:0x01ab, B:69:0x01b5, B:72:0x01bf, B:42:0x0115, B:43:0x0125, B:46:0x0139), top: B:321:0x006d, inners: #18 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x022f A[Catch: all -> 0x0591, TryCatch #28 {all -> 0x0591, blocks: (B:12:0x006d, B:13:0x007c, B:15:0x0088, B:22:0x00a9, B:23:0x00b6, B:24:0x00ba, B:26:0x00c0, B:28:0x00cc, B:34:0x00f0, B:36:0x00f9, B:37:0x00fe, B:39:0x0104, B:53:0x0155, B:55:0x015d, B:57:0x0173, B:82:0x01e2, B:83:0x0209, B:85:0x020f, B:108:0x02b2, B:111:0x02ba, B:113:0x02c0, B:115:0x02cf, B:88:0x0226, B:90:0x022f, B:106:0x02a1, B:91:0x023d, B:93:0x0252, B:94:0x025e, B:96:0x0266, B:97:0x0269, B:99:0x027e, B:101:0x0286, B:102:0x028d, B:103:0x0292, B:105:0x029a, B:60:0x018f, B:76:0x01ca, B:63:0x01a1, B:66:0x01ab, B:69:0x01b5, B:72:0x01bf, B:42:0x0115, B:43:0x0125, B:46:0x0139), top: B:321:0x006d, inners: #18 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x023d A[Catch: all -> 0x0591, TryCatch #28 {all -> 0x0591, blocks: (B:12:0x006d, B:13:0x007c, B:15:0x0088, B:22:0x00a9, B:23:0x00b6, B:24:0x00ba, B:26:0x00c0, B:28:0x00cc, B:34:0x00f0, B:36:0x00f9, B:37:0x00fe, B:39:0x0104, B:53:0x0155, B:55:0x015d, B:57:0x0173, B:82:0x01e2, B:83:0x0209, B:85:0x020f, B:108:0x02b2, B:111:0x02ba, B:113:0x02c0, B:115:0x02cf, B:88:0x0226, B:90:0x022f, B:106:0x02a1, B:91:0x023d, B:93:0x0252, B:94:0x025e, B:96:0x0266, B:97:0x0269, B:99:0x027e, B:101:0x0286, B:102:0x028d, B:103:0x0292, B:105:0x029a, B:60:0x018f, B:76:0x01ca, B:63:0x01a1, B:66:0x01ab, B:69:0x01b5, B:72:0x01bf, B:42:0x0115, B:43:0x0125, B:46:0x0139), top: B:321:0x006d, inners: #18 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0252 A[Catch: all -> 0x0591, TryCatch #28 {all -> 0x0591, blocks: (B:12:0x006d, B:13:0x007c, B:15:0x0088, B:22:0x00a9, B:23:0x00b6, B:24:0x00ba, B:26:0x00c0, B:28:0x00cc, B:34:0x00f0, B:36:0x00f9, B:37:0x00fe, B:39:0x0104, B:53:0x0155, B:55:0x015d, B:57:0x0173, B:82:0x01e2, B:83:0x0209, B:85:0x020f, B:108:0x02b2, B:111:0x02ba, B:113:0x02c0, B:115:0x02cf, B:88:0x0226, B:90:0x022f, B:106:0x02a1, B:91:0x023d, B:93:0x0252, B:94:0x025e, B:96:0x0266, B:97:0x0269, B:99:0x027e, B:101:0x0286, B:102:0x028d, B:103:0x0292, B:105:0x029a, B:60:0x018f, B:76:0x01ca, B:63:0x01a1, B:66:0x01ab, B:69:0x01b5, B:72:0x01bf, B:42:0x0115, B:43:0x0125, B:46:0x0139), top: B:321:0x006d, inners: #18 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x025e A[Catch: all -> 0x0591, TryCatch #28 {all -> 0x0591, blocks: (B:12:0x006d, B:13:0x007c, B:15:0x0088, B:22:0x00a9, B:23:0x00b6, B:24:0x00ba, B:26:0x00c0, B:28:0x00cc, B:34:0x00f0, B:36:0x00f9, B:37:0x00fe, B:39:0x0104, B:53:0x0155, B:55:0x015d, B:57:0x0173, B:82:0x01e2, B:83:0x0209, B:85:0x020f, B:108:0x02b2, B:111:0x02ba, B:113:0x02c0, B:115:0x02cf, B:88:0x0226, B:90:0x022f, B:106:0x02a1, B:91:0x023d, B:93:0x0252, B:94:0x025e, B:96:0x0266, B:97:0x0269, B:99:0x027e, B:101:0x0286, B:102:0x028d, B:103:0x0292, B:105:0x029a, B:60:0x018f, B:76:0x01ca, B:63:0x01a1, B:66:0x01ab, B:69:0x01b5, B:72:0x01bf, B:42:0x0115, B:43:0x0125, B:46:0x0139), top: B:321:0x006d, inners: #18 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0266 A[Catch: all -> 0x0591, TryCatch #28 {all -> 0x0591, blocks: (B:12:0x006d, B:13:0x007c, B:15:0x0088, B:22:0x00a9, B:23:0x00b6, B:24:0x00ba, B:26:0x00c0, B:28:0x00cc, B:34:0x00f0, B:36:0x00f9, B:37:0x00fe, B:39:0x0104, B:53:0x0155, B:55:0x015d, B:57:0x0173, B:82:0x01e2, B:83:0x0209, B:85:0x020f, B:108:0x02b2, B:111:0x02ba, B:113:0x02c0, B:115:0x02cf, B:88:0x0226, B:90:0x022f, B:106:0x02a1, B:91:0x023d, B:93:0x0252, B:94:0x025e, B:96:0x0266, B:97:0x0269, B:99:0x027e, B:101:0x0286, B:102:0x028d, B:103:0x0292, B:105:0x029a, B:60:0x018f, B:76:0x01ca, B:63:0x01a1, B:66:0x01ab, B:69:0x01b5, B:72:0x01bf, B:42:0x0115, B:43:0x0125, B:46:0x0139), top: B:321:0x006d, inners: #18 }] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void c(kes kesVar) throws Throwable {
        long j;
        long j2;
        kfd kfdVar;
        boolean z;
        boolean z2;
        long j3;
        List arrayList;
        String strC;
        String strC2;
        byte[] bytes;
        URL urlE;
        URL urlF;
        HttpURLConnection httpURLConnectionC;
        int responseCode;
        Iterator it;
        kfc kfcVar;
        Iterator it2;
        URL urlD;
        int iB;
        Integer numValueOf;
        Throwable th;
        OutputStream outputStream;
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnectionC2;
        OutputStream outputStream2;
        int length;
        Integer numValueOf2;
        int length2;
        int responseCode2;
        kex kexVar;
        String strC3;
        byte[] bytes2;
        int length3;
        long j4 = this.e;
        kdo.a();
        z();
        long jB = j().b();
        long jMax = 0;
        m("Dispatching local hits. Elapsed time since last dispatch (ms)", Long.valueOf(jB != 0 ? Math.abs(System.currentTimeMillis() - jB) : -1L));
        C();
        try {
            kdo.a();
            z();
            q("Dispatching a batch of local hits");
            int i = 1;
            boolean z3 = !this.i.D();
            boolean z4 = !this.g.H();
            if (z3 && z4) {
                q("No network or service available. Will retry later");
                j = j4;
            } else {
                long jMax2 = Math.max(ken.e(), ken.d());
                ArrayList arrayList2 = new ArrayList();
                loop0: while (true) {
                    try {
                        kef kefVar = this.c;
                        kefVar.z();
                        kefVar.b().beginTransaction();
                        arrayList2.clear();
                        try {
                            List<kex> listC = this.c.c(jMax2);
                            if (listC.isEmpty()) {
                                q("Store is empty, nothing to dispatch");
                                H();
                                try {
                                    this.c.G();
                                    this.c.F();
                                    j = j4;
                                    break;
                                } catch (SQLiteException e) {
                                    o("Failed to commit local dispatch transaction", e);
                                    H();
                                    j = j4;
                                }
                            } else {
                                r("Hits loaded from store. count", Integer.valueOf(listC.size()));
                                Iterator it3 = listC.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        if (!this.i.D()) {
                                            j2 = jMax2;
                                            if (this.g.H()) {
                                                kfdVar = this.g;
                                                kdo.a();
                                                kfdVar.z();
                                                if (kfdVar.g().a().isEmpty()) {
                                                    z = false;
                                                    z2 = false;
                                                } else {
                                                    z = false;
                                                    z2 = false;
                                                }
                                                if (z) {
                                                    mip.dl((listC.isEmpty() ? 1 : 0) ^ i);
                                                    kfdVar.s("Uploading batched hits. compression, count", Boolean.valueOf(z2), Integer.valueOf(listC.size()));
                                                    kfcVar = new kfc(kfdVar);
                                                    arrayList = new ArrayList();
                                                    it2 = listC.iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            j3 = jMax;
                                                            break;
                                                        }
                                                        kexVar = (kex) it2.next();
                                                        mip.dk(kexVar);
                                                        if (kfcVar.a + i > ken.d()) {
                                                            j3 = jMax;
                                                            break;
                                                        }
                                                        strC3 = kfcVar.c.c(kexVar, false);
                                                        if (strC3 == null) {
                                                            bytes2 = strC3.getBytes();
                                                            length3 = bytes2.length;
                                                            j3 = jMax;
                                                            if (length3 > ((Integer) keu.p.a()).intValue()) {
                                                                if (kfcVar.b.size() > 0) {
                                                                    length3++;
                                                                }
                                                                if (kfcVar.b.size() + length3 <= ((Integer) keu.r.a()).intValue()) {
                                                                    break;
                                                                    break;
                                                                }
                                                                if (kfcVar.b.size() > 0) {
                                                                    kfcVar.b.write(kfd.a);
                                                                }
                                                                kfcVar.b.write(bytes2);
                                                                kfcVar.a++;
                                                            } else {
                                                                kfcVar.c.i().b(kexVar, "Hit size exceeds the maximum size limit");
                                                            }
                                                        } else {
                                                            kfcVar.c.i().b(kexVar, "Error formatting hit");
                                                            j3 = jMax;
                                                        }
                                                        arrayList.add(Long.valueOf(kexVar.b));
                                                        jMax = j3;
                                                        i = 1;
                                                    }
                                                    if (kfcVar.a == 0) {
                                                        urlD = kfdVar.D();
                                                        if (urlD == null) {
                                                            if (z2) {
                                                                byte[] bArrA = kfcVar.a();
                                                                mip.dk(bArrA);
                                                                kfdVar.d().getPackageName();
                                                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                                                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                                                                gZIPOutputStream.write(bArrA);
                                                                gZIPOutputStream.close();
                                                                byteArrayOutputStream.close();
                                                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                                length = byteArray.length;
                                                                numValueOf2 = Integer.valueOf(length);
                                                                long j5 = ((long) length) * 100;
                                                                length2 = bArrA.length;
                                                                j = j4;
                                                                super.w(3, "POST compressed size, ratio %, url", numValueOf2, Long.valueOf(j5 / ((long) length2)), urlD);
                                                                if (length > length2) {
                                                                    kfdVar.v("Compressed payload is larger then uncompressed. compressed, uncompressed", numValueOf2, Integer.valueOf(length2));
                                                                }
                                                                kfd.x();
                                                                httpURLConnectionC2 = kfdVar.C(urlD);
                                                                httpURLConnectionC2.setDoOutput(true);
                                                                httpURLConnectionC2.addRequestProperty("Content-Encoding", "gzip");
                                                                httpURLConnectionC2.setFixedLengthStreamingMode(length);
                                                                httpURLConnectionC2.connect();
                                                                outputStream2 = httpURLConnectionC2.getOutputStream();
                                                                outputStream2.write(byteArray);
                                                                outputStream2.close();
                                                                kfdVar.G(httpURLConnectionC2);
                                                                responseCode2 = httpURLConnectionC2.getResponseCode();
                                                                if (responseCode2 == 200) {
                                                                    kfdVar.f().c();
                                                                    responseCode2 = 200;
                                                                }
                                                                kfdVar.m("POST status", Integer.valueOf(responseCode2));
                                                                if (httpURLConnectionC2 != null) {
                                                                    httpURLConnectionC2.disconnect();
                                                                }
                                                                iB = responseCode2;
                                                            } else {
                                                                j = j4;
                                                                iB = kfdVar.b(urlD, kfcVar.a());
                                                            }
                                                            if (iB != 200) {
                                                                numValueOf = Integer.valueOf(iB);
                                                                kfdVar.r("Network error uploading hits. status code", numValueOf);
                                                                if (kfdVar.g().a().contains(numValueOf)) {
                                                                    kfdVar.t("Server instructed the client to stop batching");
                                                                    kfdVar.c.b();
                                                                }
                                                                arrayList = Collections.emptyList();
                                                                break;
                                                            }
                                                            kfdVar.r("Batched upload completed. Hits batched", Integer.valueOf(kfcVar.a));
                                                            break;
                                                        }
                                                        kfdVar.n("Failed to build batching endpoint url");
                                                        arrayList = Collections.emptyList();
                                                        j = j4;
                                                        break;
                                                    }
                                                    j = j4;
                                                    break;
                                                }
                                                j = j4;
                                                j3 = jMax;
                                                arrayList = new ArrayList(listC.size());
                                                for (kex kexVar2 : listC) {
                                                    mip.dk(kexVar2);
                                                    strC = kfdVar.c(kexVar2, !kexVar2.d);
                                                    if (strC == null) {
                                                        kfdVar.i().b(kexVar2, "Error formatting hit for upload");
                                                    } else if (strC.length() > ((Integer) keu.m.a()).intValue()) {
                                                        urlF = kfdVar.F(kexVar2, strC);
                                                        if (urlF == null) {
                                                            kfdVar.n("Failed to build collect GET endpoint url");
                                                            break;
                                                        }
                                                        kfdVar.m("GET request", urlF);
                                                        httpURLConnectionC = kfdVar.C(urlF);
                                                        httpURLConnectionC.connect();
                                                        kfdVar.G(httpURLConnectionC);
                                                        responseCode = httpURLConnectionC.getResponseCode();
                                                        if (responseCode == 200) {
                                                            kfdVar.f().c();
                                                            responseCode = 200;
                                                        }
                                                        kfdVar.m("GET status", Integer.valueOf(responseCode));
                                                        if (httpURLConnectionC != null) {
                                                            httpURLConnectionC.disconnect();
                                                        }
                                                        if (responseCode == 200) {
                                                            break;
                                                        }
                                                    } else {
                                                        strC2 = kfdVar.c(kexVar2, false);
                                                        if (strC2 == null) {
                                                            bytes = strC2.getBytes();
                                                            if (bytes.length > ((Integer) keu.q.a()).intValue()) {
                                                                urlE = kfdVar.E(kexVar2);
                                                                if (urlE != null) {
                                                                    if (kfdVar.b(urlE, bytes) == 200) {
                                                                        break;
                                                                    }
                                                                    break;
                                                                    break;
                                                                }
                                                                kfdVar.n("Failed to build collect POST endpoint url");
                                                                break;
                                                            }
                                                            kfdVar.i().b(kexVar2, "Hit payload exceeds size limit");
                                                        } else {
                                                            kfdVar.i().b(kexVar2, "Error formatting hit for POST upload");
                                                        }
                                                    }
                                                    arrayList.add(Long.valueOf(kexVar2.b));
                                                    if (arrayList.size() >= ken.e()) {
                                                        break;
                                                        break;
                                                    }
                                                }
                                                it = arrayList.iterator();
                                                jMax = j3;
                                                while (it.hasNext()) {
                                                    jMax = Math.max(jMax, ((Long) it.next()).longValue());
                                                }
                                                this.c.E(arrayList);
                                                arrayList2.addAll(arrayList);
                                            } else {
                                                j = j4;
                                            }
                                            if (arrayList2.isEmpty()) {
                                                this.c.G();
                                                this.c.F();
                                                break;
                                            } else {
                                                this.c.G();
                                                this.c.F();
                                                jMax2 = j2;
                                                j4 = j;
                                                i = 1;
                                            }
                                            o("Local dispatch failed", e);
                                            j().c();
                                            F();
                                            if (kesVar != null) {
                                                kesVar.a();
                                            }
                                        }
                                        q("Service connected, sending hits to the service");
                                        while (true) {
                                            if (listC.isEmpty()) {
                                                j2 = jMax2;
                                                break;
                                            }
                                            kex kexVar3 = (kex) listC.get(0);
                                            if (!this.i.E(kexVar3)) {
                                                j2 = jMax2;
                                                break;
                                            }
                                            long j6 = jMax2;
                                            jMax = Math.max(jMax, kexVar3.b);
                                            listC.remove(kexVar3);
                                            m("Hit sent do device AnalyticsService for delivery", kexVar3);
                                            try {
                                                this.c.D(kexVar3.b);
                                                arrayList2.add(Long.valueOf(kexVar3.b));
                                                jMax2 = j6;
                                            } catch (SQLiteException e2) {
                                                o("Failed to remove hit that was send for delivery", e2);
                                                H();
                                                try {
                                                    this.c.G();
                                                    this.c.F();
                                                    j = j4;
                                                    break;
                                                } catch (SQLiteException e3) {
                                                    o("Failed to commit local dispatch transaction", e3);
                                                    H();
                                                    j = j4;
                                                }
                                                j().c();
                                                F();
                                                if (kesVar != null) {
                                                    kesVar.a();
                                                }
                                                if (this.e != j) {
                                                    Context contextA = this.h.a();
                                                    Intent intent = new Intent("com.google.analytics.RADIO_POWERED");
                                                    intent.addCategory(contextA.getPackageName());
                                                    intent.putExtra(kfb.a, true);
                                                    contextA.sendOrderedBroadcast(intent, null);
                                                }
                                            }
                                            o("Local dispatch failed", e);
                                            j().c();
                                            F();
                                            if (kesVar != null) {
                                                kesVar.a();
                                            }
                                        }
                                        if (this.g.H()) {
                                            kfdVar = this.g;
                                            kdo.a();
                                            kfdVar.z();
                                            if (kfdVar.g().a().isEmpty() || !kfdVar.c.c(((long) ((Integer) keu.t.a()).intValue()) * 1000)) {
                                                z = false;
                                                z2 = false;
                                            } else {
                                                String str = (String) keu.n.a();
                                                z = "BATCH_BY_SESSION".equalsIgnoreCase(str) || "BATCH_BY_TIME".equalsIgnoreCase(str) || "BATCH_BY_BRUTE_FORCE".equalsIgnoreCase(str) || "BATCH_BY_COUNT".equalsIgnoreCase(str) || "BATCH_BY_SIZE".equalsIgnoreCase(str);
                                                z2 = i == "GZIP".equalsIgnoreCase((String) keu.o.a());
                                            }
                                            if (z) {
                                                mip.dl((listC.isEmpty() ? 1 : 0) ^ i);
                                                kfdVar.s("Uploading batched hits. compression, count", Boolean.valueOf(z2), Integer.valueOf(listC.size()));
                                                kfcVar = new kfc(kfdVar);
                                                arrayList = new ArrayList();
                                                it2 = listC.iterator();
                                                while (true) {
                                                    if (it2.hasNext()) {
                                                        j3 = jMax;
                                                        break;
                                                    }
                                                    kexVar = (kex) it2.next();
                                                    mip.dk(kexVar);
                                                    if (kfcVar.a + i > ken.d()) {
                                                        j3 = jMax;
                                                        break;
                                                    }
                                                    strC3 = kfcVar.c.c(kexVar, false);
                                                    if (strC3 == null) {
                                                        bytes2 = strC3.getBytes();
                                                        length3 = bytes2.length;
                                                        j3 = jMax;
                                                        if (length3 > ((Integer) keu.p.a()).intValue()) {
                                                            if (kfcVar.b.size() > 0) {
                                                                length3++;
                                                            }
                                                            if (kfcVar.b.size() + length3 <= ((Integer) keu.r.a()).intValue()) {
                                                                break;
                                                            }
                                                            try {
                                                                if (kfcVar.b.size() > 0) {
                                                                    kfcVar.b.write(kfd.a);
                                                                }
                                                                kfcVar.b.write(bytes2);
                                                                kfcVar.a++;
                                                            } catch (IOException e4) {
                                                                kfcVar.c.o("Failed to write payload when batching hits", e4);
                                                            }
                                                        } else {
                                                            kfcVar.c.i().b(kexVar, "Hit size exceeds the maximum size limit");
                                                        }
                                                    } else {
                                                        kfcVar.c.i().b(kexVar, "Error formatting hit");
                                                        j3 = jMax;
                                                    }
                                                    arrayList.add(Long.valueOf(kexVar.b));
                                                    jMax = j3;
                                                    i = 1;
                                                }
                                                if (kfcVar.a == 0) {
                                                    urlD = kfdVar.D();
                                                    if (urlD == null) {
                                                        if (z2) {
                                                            byte[] bArrA2 = kfcVar.a();
                                                            mip.dk(bArrA2);
                                                            try {
                                                                kfdVar.d().getPackageName();
                                                                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                                                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream2);
                                                                gZIPOutputStream2.write(bArrA2);
                                                                gZIPOutputStream2.close();
                                                                byteArrayOutputStream2.close();
                                                                byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                                                                length = byteArray2.length;
                                                                numValueOf2 = Integer.valueOf(length);
                                                                long j7 = ((long) length) * 100;
                                                                length2 = bArrA2.length;
                                                                j = j4;
                                                                try {
                                                                    super.w(3, "POST compressed size, ratio %, url", numValueOf2, Long.valueOf(j7 / ((long) length2)), urlD);
                                                                    if (length > length2) {
                                                                        kfdVar.v("Compressed payload is larger then uncompressed. compressed, uncompressed", numValueOf2, Integer.valueOf(length2));
                                                                    }
                                                                    kfd.x();
                                                                    httpURLConnectionC2 = kfdVar.C(urlD);
                                                                    try {
                                                                        httpURLConnectionC2.setDoOutput(true);
                                                                        httpURLConnectionC2.addRequestProperty("Content-Encoding", "gzip");
                                                                        httpURLConnectionC2.setFixedLengthStreamingMode(length);
                                                                        httpURLConnectionC2.connect();
                                                                        outputStream2 = httpURLConnectionC2.getOutputStream();
                                                                        try {
                                                                            outputStream2.write(byteArray2);
                                                                            outputStream2.close();
                                                                            kfdVar.G(httpURLConnectionC2);
                                                                            responseCode2 = httpURLConnectionC2.getResponseCode();
                                                                            if (responseCode2 == 200) {
                                                                                kfdVar.f().c();
                                                                                responseCode2 = 200;
                                                                            }
                                                                            kfdVar.m("POST status", Integer.valueOf(responseCode2));
                                                                            if (httpURLConnectionC2 != null) {
                                                                                httpURLConnectionC2.disconnect();
                                                                            }
                                                                            iB = responseCode2;
                                                                        } catch (IOException e5) {
                                                                            e = e5;
                                                                            try {
                                                                                kfdVar.u("Network compressed POST connection error", e);
                                                                                if (outputStream2 != null) {
                                                                                    try {
                                                                                        outputStream2.close();
                                                                                    } catch (IOException e6) {
                                                                                        kfdVar.o("Error closing http compressed post connection output stream", e6);
                                                                                    }
                                                                                }
                                                                                if (httpURLConnectionC2 != null) {
                                                                                    httpURLConnectionC2.disconnect();
                                                                                    iB = 0;
                                                                                } else {
                                                                                    iB = 0;
                                                                                }
                                                                            } catch (Throwable th2) {
                                                                                HttpURLConnection httpURLConnection2 = httpURLConnectionC2;
                                                                                th = th2;
                                                                                outputStream = outputStream2;
                                                                                httpURLConnection = httpURLConnection2;
                                                                                if (outputStream != null) {
                                                                                    try {
                                                                                        outputStream.close();
                                                                                    } catch (IOException e7) {
                                                                                        kfdVar.o("Error closing http compressed post connection output stream", e7);
                                                                                    }
                                                                                }
                                                                                if (httpURLConnection == null) {
                                                                                    throw th;
                                                                                }
                                                                                httpURLConnection.disconnect();
                                                                                throw th;
                                                                            }
                                                                        } catch (Throwable th3) {
                                                                            th = th3;
                                                                            outputStream = outputStream2;
                                                                            httpURLConnection = httpURLConnectionC2;
                                                                            if (outputStream != null) {
                                                                                outputStream.close();
                                                                            }
                                                                            if (httpURLConnection == null) {
                                                                                throw th;
                                                                            }
                                                                            httpURLConnection.disconnect();
                                                                            throw th;
                                                                        }
                                                                    } catch (IOException e8) {
                                                                        e = e8;
                                                                        outputStream2 = null;
                                                                    } catch (Throwable th4) {
                                                                        httpURLConnection = httpURLConnectionC2;
                                                                        th = th4;
                                                                        outputStream = null;
                                                                    }
                                                                } catch (IOException e9) {
                                                                    e = e9;
                                                                    httpURLConnectionC2 = null;
                                                                    outputStream2 = null;
                                                                    kfdVar.u("Network compressed POST connection error", e);
                                                                    if (outputStream2 != null) {
                                                                        outputStream2.close();
                                                                    }
                                                                    if (httpURLConnectionC2 != null) {
                                                                        httpURLConnectionC2.disconnect();
                                                                        iB = 0;
                                                                    } else {
                                                                        iB = 0;
                                                                    }
                                                                    if (iB != 200) {
                                                                        numValueOf = Integer.valueOf(iB);
                                                                        kfdVar.r("Network error uploading hits. status code", numValueOf);
                                                                        if (kfdVar.g().a().contains(numValueOf)) {
                                                                            kfdVar.t("Server instructed the client to stop batching");
                                                                            kfdVar.c.b();
                                                                        }
                                                                        arrayList = Collections.emptyList();
                                                                        break;
                                                                    }
                                                                    kfdVar.r("Batched upload completed. Hits batched", Integer.valueOf(kfcVar.a));
                                                                    break;
                                                                    it = arrayList.iterator();
                                                                    jMax = j3;
                                                                    while (it.hasNext()) {
                                                                        jMax = Math.max(jMax, ((Long) it.next()).longValue());
                                                                    }
                                                                    try {
                                                                        this.c.E(arrayList);
                                                                        arrayList2.addAll(arrayList);
                                                                        if (arrayList2.isEmpty()) {
                                                                            try {
                                                                                this.c.G();
                                                                                this.c.F();
                                                                                break;
                                                                            } catch (SQLiteException e10) {
                                                                                o("Failed to commit local dispatch transaction", e10);
                                                                                H();
                                                                            }
                                                                            j().c();
                                                                            F();
                                                                            if (kesVar != null) {
                                                                                kesVar.a();
                                                                            }
                                                                            if (this.e != j) {
                                                                                Context contextA2 = this.h.a();
                                                                                Intent intent2 = new Intent("com.google.analytics.RADIO_POWERED");
                                                                                intent2.addCategory(contextA2.getPackageName());
                                                                                intent2.putExtra(kfb.a, true);
                                                                                contextA2.sendOrderedBroadcast(intent2, null);
                                                                            }
                                                                        }
                                                                        try {
                                                                            this.c.G();
                                                                            this.c.F();
                                                                            jMax2 = j2;
                                                                            j4 = j;
                                                                            i = 1;
                                                                        } catch (SQLiteException e11) {
                                                                            o("Failed to commit local dispatch transaction", e11);
                                                                            H();
                                                                            j().c();
                                                                            F();
                                                                            if (kesVar != null) {
                                                                                kesVar.a();
                                                                            }
                                                                            if (this.e != j) {
                                                                                Context contextA3 = this.h.a();
                                                                                Intent intent3 = new Intent("com.google.analytics.RADIO_POWERED");
                                                                                intent3.addCategory(contextA3.getPackageName());
                                                                                intent3.putExtra(kfb.a, true);
                                                                                contextA3.sendOrderedBroadcast(intent3, null);
                                                                            }
                                                                        }
                                                                    } catch (SQLiteException e12) {
                                                                        o("Failed to remove successfully uploaded hits", e12);
                                                                        H();
                                                                        try {
                                                                            this.c.G();
                                                                            this.c.F();
                                                                        } catch (SQLiteException e13) {
                                                                            o("Failed to commit local dispatch transaction", e13);
                                                                            H();
                                                                        }
                                                                    }
                                                                    o("Local dispatch failed", e);
                                                                    j().c();
                                                                    F();
                                                                    if (kesVar != null) {
                                                                        kesVar.a();
                                                                    }
                                                                } catch (Throwable th5) {
                                                                    th = th5;
                                                                    th = th;
                                                                    outputStream = null;
                                                                    httpURLConnection = null;
                                                                    if (outputStream != null) {
                                                                        outputStream.close();
                                                                    }
                                                                    if (httpURLConnection == null) {
                                                                        throw th;
                                                                    }
                                                                    httpURLConnection.disconnect();
                                                                    throw th;
                                                                }
                                                            } catch (IOException e14) {
                                                                e = e14;
                                                                j = j4;
                                                            } catch (Throwable th6) {
                                                                th = th6;
                                                                j = j4;
                                                            }
                                                        } else {
                                                            j = j4;
                                                            iB = kfdVar.b(urlD, kfcVar.a());
                                                        }
                                                        if (iB != 200) {
                                                            numValueOf = Integer.valueOf(iB);
                                                            kfdVar.r("Network error uploading hits. status code", numValueOf);
                                                            if (kfdVar.g().a().contains(numValueOf)) {
                                                                kfdVar.t("Server instructed the client to stop batching");
                                                                kfdVar.c.b();
                                                            }
                                                            arrayList = Collections.emptyList();
                                                            break;
                                                        }
                                                        kfdVar.r("Batched upload completed. Hits batched", Integer.valueOf(kfcVar.a));
                                                        break;
                                                    }
                                                    kfdVar.n("Failed to build batching endpoint url");
                                                    arrayList = Collections.emptyList();
                                                    j = j4;
                                                    break;
                                                }
                                                j = j4;
                                                break;
                                            }
                                            j = j4;
                                            j3 = jMax;
                                            arrayList = new ArrayList(listC.size());
                                            while (r0.hasNext()) {
                                                mip.dk(kexVar2);
                                                strC = kfdVar.c(kexVar2, !kexVar2.d);
                                                if (strC == null) {
                                                    kfdVar.i().b(kexVar2, "Error formatting hit for upload");
                                                } else if (strC.length() > ((Integer) keu.m.a()).intValue()) {
                                                    strC2 = kfdVar.c(kexVar2, false);
                                                    if (strC2 == null) {
                                                        bytes = strC2.getBytes();
                                                        if (bytes.length > ((Integer) keu.q.a()).intValue()) {
                                                            urlE = kfdVar.E(kexVar2);
                                                            if (urlE != null) {
                                                                kfdVar.n("Failed to build collect POST endpoint url");
                                                                break;
                                                            } else if (kfdVar.b(urlE, bytes) == 200) {
                                                                break;
                                                            } else {
                                                                break;
                                                            }
                                                        }
                                                        kfdVar.i().b(kexVar2, "Hit payload exceeds size limit");
                                                    } else {
                                                        kfdVar.i().b(kexVar2, "Error formatting hit for POST upload");
                                                    }
                                                } else {
                                                    urlF = kfdVar.F(kexVar2, strC);
                                                    if (urlF == null) {
                                                        kfdVar.n("Failed to build collect GET endpoint url");
                                                        break;
                                                    }
                                                    kfdVar.m("GET request", urlF);
                                                    try {
                                                        httpURLConnectionC = kfdVar.C(urlF);
                                                        try {
                                                            httpURLConnectionC.connect();
                                                            kfdVar.G(httpURLConnectionC);
                                                            responseCode = httpURLConnectionC.getResponseCode();
                                                            if (responseCode == 200) {
                                                                kfdVar.f().c();
                                                                responseCode = 200;
                                                            }
                                                            kfdVar.m("GET status", Integer.valueOf(responseCode));
                                                            if (httpURLConnectionC != null) {
                                                                httpURLConnectionC.disconnect();
                                                            }
                                                            if (responseCode == 200) {
                                                                break;
                                                            }
                                                        } catch (IOException e15) {
                                                            e = e15;
                                                            try {
                                                                kfdVar.u("Network GET connection error", e);
                                                                if (httpURLConnectionC == null) {
                                                                    break;
                                                                }
                                                                httpURLConnectionC.disconnect();
                                                                break;
                                                            } catch (Throwable th7) {
                                                                th = th7;
                                                                if (httpURLConnectionC != null) {
                                                                    httpURLConnectionC.disconnect();
                                                                }
                                                                throw th;
                                                            }
                                                        } catch (Throwable th8) {
                                                            th = th8;
                                                            if (httpURLConnectionC != null) {
                                                                httpURLConnectionC.disconnect();
                                                            }
                                                            throw th;
                                                        }
                                                    } catch (IOException e16) {
                                                        e = e16;
                                                        httpURLConnectionC = null;
                                                    } catch (Throwable th9) {
                                                        th = th9;
                                                        httpURLConnectionC = null;
                                                    }
                                                }
                                                arrayList.add(Long.valueOf(kexVar2.b));
                                                if (arrayList.size() >= ken.e()) {
                                                    break;
                                                }
                                            }
                                            try {
                                                it = arrayList.iterator();
                                                jMax = j3;
                                                while (it.hasNext()) {
                                                    jMax = Math.max(jMax, ((Long) it.next()).longValue());
                                                }
                                                this.c.E(arrayList);
                                                arrayList2.addAll(arrayList);
                                            } catch (Throwable th10) {
                                                th = th10;
                                                try {
                                                    this.c.G();
                                                    this.c.F();
                                                    throw th;
                                                } catch (SQLiteException e17) {
                                                    o("Failed to commit local dispatch transaction", e17);
                                                    H();
                                                    j().c();
                                                    F();
                                                    if (kesVar != null) {
                                                        kesVar.a();
                                                    }
                                                    if (this.e != j) {
                                                        Context contextA4 = this.h.a();
                                                        Intent intent4 = new Intent("com.google.analytics.RADIO_POWERED");
                                                        intent4.addCategory(contextA4.getPackageName());
                                                        intent4.putExtra(kfb.a, true);
                                                        contextA4.sendOrderedBroadcast(intent4, null);
                                                    }
                                                }
                                            }
                                        } else {
                                            j = j4;
                                        }
                                        if (arrayList2.isEmpty()) {
                                            this.c.G();
                                            this.c.F();
                                            break;
                                        } else {
                                            this.c.G();
                                            this.c.F();
                                            jMax2 = j2;
                                            j4 = j;
                                            i = 1;
                                        }
                                        o("Local dispatch failed", e);
                                        j().c();
                                        F();
                                        if (kesVar != null) {
                                            kesVar.a();
                                        }
                                    }
                                    if (((kex) it3.next()).b == jMax) {
                                        p("Database contains successfully uploaded hit", Long.valueOf(jMax), Integer.valueOf(listC.size()));
                                        H();
                                        try {
                                            this.c.G();
                                            this.c.F();
                                            j = j4;
                                            break;
                                        } catch (SQLiteException e18) {
                                            o("Failed to commit local dispatch transaction", e18);
                                            H();
                                            j = j4;
                                        }
                                    }
                                }
                            }
                        } catch (SQLiteException e19) {
                            j = j4;
                            u("Failed to read hits from persisted store", e19);
                            H();
                            try {
                                this.c.G();
                                this.c.F();
                            } catch (SQLiteException e20) {
                                o("Failed to commit local dispatch transaction", e20);
                                H();
                            }
                        }
                    } catch (Throwable th11) {
                        th = th11;
                        j = j4;
                        this.c.G();
                        this.c.F();
                        throw th;
                    }
                }
            }
            j().c();
            F();
            if (kesVar != null) {
                kesVar.a();
            }
            if (this.e != j) {
                Context contextA5 = this.h.a();
                Intent intent5 = new Intent("com.google.analytics.RADIO_POWERED");
                intent5.addCategory(contextA5.getPackageName());
                intent5.putExtra(kfb.a, true);
                contextA5.sendOrderedBroadcast(intent5, null);
            }
        } catch (Exception e21) {
            o("Local dispatch failed", e21);
            j().c();
            F();
            if (kesVar != null) {
                kesVar.a();
            }
        }
    }
}
