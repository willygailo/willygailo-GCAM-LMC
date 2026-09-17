package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.PackageStats;
import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class nbm extends myq implements mwa, mxo {
    public static final long a = TimeUnit.HOURS.toMillis(12);
    public final mxl b;
    public final Application c;
    public final pyn d;
    public final nce e;
    private final mwe f;
    private final Executor g;

    public nbm(mxm mxmVar, Context context, mwe mweVar, Executor executor, pyn pynVar, nce nceVar, qkg qkgVar) {
        super(null);
        this.b = mxmVar.a(executor, pynVar, qkgVar);
        this.g = executor;
        this.c = (Application) context;
        this.d = pynVar;
        this.e = nceVar;
        this.f = mweVar;
    }

    @Override // defpackage.mwa
    public final void c(Activity activity) {
        this.f.b(this);
        plk.aa(new pgj() { // from class: nbl
            /* JADX WARN: Code duplicated, block: B:192:0x04b5  */
            /* JADX WARN: Code duplicated, block: B:198:0x04d5  */
            /* JADX WARN: Code duplicated, block: B:201:0x04fa  */
            /* JADX WARN: Code duplicated, block: B:219:0x0379 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // defpackage.pgj
            public final pht a() throws Throwable {
                poy poyVar;
                nce nceVar;
                oom oomVarL;
                File parentFile;
                File dataDir;
                ArrayList<nbb> arrayList;
                PriorityQueue priorityQueue;
                nbb nbbVar;
                nbm nbmVar;
                poy poyVar2;
                poy poyVar3;
                Throwable th;
                nbm nbmVar2 = this.a;
                if (!((nbk) nbmVar2.d.get()).a && mez.c(nbmVar2.c)) {
                    myw.f();
                    nce nceVar2 = nbmVar2.e;
                    long j = nbm.a;
                    myw.f();
                    if (mez.c(nceVar2.a)) {
                        long j2 = mez.c(nceVar2.a) ? ((SharedPreferences) nceVar2.c.get()).getLong("primes.packageMetric.lastSendTime", -1L) : -1L;
                        long jB = nceVar2.b.b();
                        if (jB < j2) {
                            ((SharedPreferences) nceVar2.c.get()).edit().remove("primes.packageMetric.lastSendTime").commit();
                            j2 = -1;
                        }
                        if (j2 != -1 && jB <= j2 + j) {
                            return phq.a;
                        }
                    }
                    if (!nbmVar2.b.c(null)) {
                        return phq.a;
                    }
                    Application application = nbmVar2.c;
                    myw.f();
                    PackageStats packageStatsA = nbh.a(application);
                    if (packageStatsA == null) {
                        return plk.U(new IllegalStateException("PackageStats capture failed."));
                    }
                    poy poyVarM = qyk.t.m();
                    poy poyVarM2 = qyf.k.m();
                    long j3 = packageStatsA.cacheSize;
                    if (poyVarM2.c) {
                        poyVarM2.m();
                        poyVarM2.c = false;
                    }
                    qyf qyfVar = (qyf) poyVarM2.b;
                    int i = 1;
                    qyfVar.a |= 1;
                    qyfVar.b = j3;
                    long j4 = packageStatsA.codeSize;
                    if (poyVarM2.c) {
                        poyVarM2.m();
                        poyVarM2.c = false;
                    }
                    qyf qyfVar2 = (qyf) poyVarM2.b;
                    qyfVar2.a |= 2;
                    qyfVar2.c = j4;
                    long j5 = packageStatsA.dataSize;
                    if (poyVarM2.c) {
                        poyVarM2.m();
                        poyVarM2.c = false;
                    }
                    qyf qyfVar3 = (qyf) poyVarM2.b;
                    qyfVar3.a |= 4;
                    qyfVar3.d = j5;
                    long j6 = packageStatsA.externalCacheSize;
                    if (poyVarM2.c) {
                        poyVarM2.m();
                        poyVarM2.c = false;
                    }
                    qyf qyfVar4 = (qyf) poyVarM2.b;
                    qyfVar4.a |= 8;
                    qyfVar4.e = j6;
                    long j7 = packageStatsA.externalCodeSize;
                    if (poyVarM2.c) {
                        poyVarM2.m();
                        poyVarM2.c = false;
                    }
                    qyf qyfVar5 = (qyf) poyVarM2.b;
                    qyfVar5.a |= 16;
                    qyfVar5.f = j7;
                    long j8 = packageStatsA.externalDataSize;
                    if (poyVarM2.c) {
                        poyVarM2.m();
                        poyVarM2.c = false;
                    }
                    qyf qyfVar6 = (qyf) poyVarM2.b;
                    qyfVar6.a |= 32;
                    qyfVar6.g = j8;
                    long j9 = packageStatsA.externalMediaSize;
                    if (poyVarM2.c) {
                        poyVarM2.m();
                        poyVarM2.c = false;
                    }
                    qyf qyfVar7 = (qyf) poyVarM2.b;
                    qyfVar7.a |= 64;
                    qyfVar7.h = j9;
                    long j10 = packageStatsA.externalObbSize;
                    if (poyVarM2.c) {
                        poyVarM2.m();
                        poyVarM2.c = false;
                    }
                    qyf qyfVar8 = (qyf) poyVarM2.b;
                    qyfVar8.a |= 128;
                    qyfVar8.i = j10;
                    qyf qyfVar9 = (qyf) poyVarM2.j();
                    poy poyVar4 = (poy) qyfVar9.G(5);
                    poyVar4.o(qyfVar9);
                    ojc ojcVar = ((nbk) nbmVar2.d.get()).b;
                    if (ojcVar.g() && ((nbf) ojcVar.c()).b()) {
                        nbf nbfVar = (nbf) ojcVar.c();
                        if (poyVar4.c) {
                            poyVar4.m();
                            poyVar4.c = false;
                        }
                        ((qyf) poyVar4.b).j = qyf.A();
                        Application application2 = nbmVar2.c;
                        int i2 = nbfVar.a;
                        oom oomVar = nbfVar.b;
                        boolean z = nbfVar.c;
                        myw.f();
                        ArrayList arrayList2 = new ArrayList();
                        try {
                            EnumMap enumMap = new EnumMap(qyd.class);
                            try {
                                parentFile = new File(application2.getPackageManager().getApplicationInfo(application2.getPackageName(), 0).dataDir);
                                while (true) {
                                    nbb nbbVar2 = (nbb) priorityQueue.poll();
                                    if (nbbVar2 == null) {
                                        nbmVar2 = nbmVar2;
                                        poyVarM = poyVarM;
                                        poyVar4 = poyVar4;
                                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                                            nbb nbbVar3 = (nbb) arrayList.get(size);
                                            if (nbbVar3.e && (nbbVar = nbbVar3.c) != null) {
                                                nbbVar.g += nbbVar3.g;
                                            }
                                        }
                                        ArrayList arrayList3 = new ArrayList();
                                        for (nbb nbbVar4 : arrayList) {
                                            if (arrayList3.size() >= 512 || nbbVar4.d > i2) {
                                                break;
                                                break;
                                            }
                                            poy poyVarM3 = qye.f.m();
                                            qyd qydVar = nbbVar4.a;
                                            if (poyVarM3.c) {
                                                poyVarM3.m();
                                                poyVarM3.c = false;
                                            }
                                            qye qyeVar = (qye) poyVarM3.b;
                                            qyeVar.e = qydVar.d;
                                            int i3 = qyeVar.a | 4;
                                            qyeVar.a = i3;
                                            String str = nbbVar4.f;
                                            str.getClass();
                                            int i4 = i3 | 1;
                                            qyeVar.a = i4;
                                            qyeVar.b = str;
                                            long j11 = nbbVar4.g;
                                            qyeVar.a = i4 | 2;
                                            qyeVar.d = j11;
                                            arrayList3.add((qye) poyVarM3.j());
                                        }
                                        arrayList2.addAll(arrayList3);
                                        oomVarL = oom.j(arrayList2);
                                        break;
                                    }
                                    arrayList.add(nbbVar2);
                                    if (nbbVar2.e) {
                                        try {
                                            DirectoryStream<Path> directoryStreamNewDirectoryStream = Files.newDirectoryStream(nbbVar2.b.toPath().resolve(nbbVar2.f));
                                            try {
                                                for (Path path : directoryStreamNewDirectoryStream) {
                                                    LinkOption[] linkOptionArr = new LinkOption[i];
                                                    linkOptionArr[0] = LinkOption.NOFOLLOW_LINKS;
                                                    BasicFileAttributes attributes = Files.readAttributes(path, (Class<BasicFileAttributes>) BasicFileAttributes.class, linkOptionArr);
                                                    if (attributes.isSymbolicLink()) {
                                                        nbmVar2 = nbmVar2;
                                                        i = 1;
                                                    } else if (attributes.isRegularFile()) {
                                                        nbmVar = nbmVar2;
                                                        try {
                                                            long size2 = attributes.size();
                                                            poyVar2 = poyVarM;
                                                            poyVar3 = poyVar4;
                                                            try {
                                                                nbbVar2.g += size2;
                                                                if (oomVar.isEmpty()) {
                                                                    nbmVar2 = nbmVar;
                                                                    poyVarM = poyVar2;
                                                                    poyVar4 = poyVar3;
                                                                    i = 1;
                                                                } else if (priorityQueue.size() + arrayList.size() <= 512) {
                                                                    nbb nbbVar5 = new nbb(nbbVar2, false, path.getFileName().toString());
                                                                    otj it = oomVar.iterator();
                                                                    while (true) {
                                                                        if (!it.hasNext()) {
                                                                            nbmVar2 = nbmVar;
                                                                            poyVarM = poyVar2;
                                                                            poyVar4 = poyVar3;
                                                                            i = 1;
                                                                            break;
                                                                        }
                                                                        if (((nbe) it.next()).a()) {
                                                                            nbbVar5.g = size2;
                                                                            priorityQueue.add(nbbVar5);
                                                                            nbmVar2 = nbmVar;
                                                                            poyVarM = poyVar2;
                                                                            poyVar4 = poyVar3;
                                                                            i = 1;
                                                                            break;
                                                                        }
                                                                    }
                                                                } else {
                                                                    nbmVar2 = nbmVar;
                                                                    poyVarM = poyVar2;
                                                                    poyVar4 = poyVar3;
                                                                    i = 1;
                                                                }
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                th = th;
                                                                if (directoryStreamNewDirectoryStream != null) {
                                                                    try {
                                                                        directoryStreamNewDirectoryStream.close();
                                                                    } catch (Throwable th3) {
                                                                    }
                                                                }
                                                                throw th;
                                                            }
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            poyVar2 = poyVarM;
                                                            poyVar3 = poyVar4;
                                                        }
                                                    } else {
                                                        nbmVar = nbmVar2;
                                                        poyVar2 = poyVarM;
                                                        poyVar3 = poyVar4;
                                                        try {
                                                            if (attributes.isDirectory()) {
                                                                try {
                                                                    priorityQueue.add(new nbb(nbbVar2, true, path.getFileName().toString()));
                                                                    nbmVar2 = nbmVar;
                                                                    poyVarM = poyVar2;
                                                                    poyVar4 = poyVar3;
                                                                    i = 1;
                                                                } catch (Throwable th5) {
                                                                    th = th5;
                                                                    th = th;
                                                                    if (directoryStreamNewDirectoryStream != null) {
                                                                        directoryStreamNewDirectoryStream.close();
                                                                    }
                                                                    throw th;
                                                                }
                                                            } else {
                                                                nbmVar2 = nbmVar;
                                                                poyVarM = poyVar2;
                                                                poyVar4 = poyVar3;
                                                                i = 1;
                                                            }
                                                        } catch (Throwable th6) {
                                                            th = th6;
                                                            th = th;
                                                            if (directoryStreamNewDirectoryStream != null) {
                                                                directoryStreamNewDirectoryStream.close();
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                }
                                                nbmVar = nbmVar2;
                                                poyVar2 = poyVarM;
                                                poyVar3 = poyVar4;
                                                if (directoryStreamNewDirectoryStream != null) {
                                                    try {
                                                        directoryStreamNewDirectoryStream.close();
                                                        nbmVar2 = nbmVar;
                                                        poyVarM = poyVar2;
                                                        poyVar4 = poyVar3;
                                                        i = 1;
                                                    } catch (IOException e) {
                                                        e = e;
                                                        ((oug) ((oug) ((oug) nbc.a.c()).h(e)).G(3647)).r("exception while collecting DirStats for dir %s", nbbVar2.f);
                                                        nbmVar2 = nbmVar;
                                                        poyVarM = poyVar2;
                                                        poyVar4 = poyVar3;
                                                        i = 1;
                                                    } catch (SecurityException e2) {
                                                        e = e2;
                                                        ((oug) ((oug) ((oug) nbc.a.c()).h(e)).G(3647)).r("exception while collecting DirStats for dir %s", nbbVar2.f);
                                                        nbmVar2 = nbmVar;
                                                        poyVarM = poyVar2;
                                                        poyVar4 = poyVar3;
                                                        i = 1;
                                                    }
                                                } else {
                                                    nbmVar2 = nbmVar;
                                                    poyVarM = poyVar2;
                                                    poyVar4 = poyVar3;
                                                    i = 1;
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                nbmVar = nbmVar2;
                                                poyVar2 = poyVarM;
                                                poyVar3 = poyVar4;
                                            }
                                        } catch (IOException | SecurityException e3) {
                                            e = e3;
                                            nbmVar = nbmVar2;
                                            poyVar2 = poyVarM;
                                            poyVar3 = poyVar4;
                                        }
                                    } else {
                                        nbmVar2 = nbmVar2;
                                        i = 1;
                                    }
                                }
                            } catch (PackageManager.NameNotFoundException e4) {
                                ((oug) ((oug) nbc.a.c()).G((char) 3650)).o("Failed to use package manager getting data directory from context instead.");
                                File filesDir = application2.getFilesDir();
                                parentFile = filesDir != null ? filesDir.getParentFile() : null;
                            }
                            if (parentFile != null) {
                                enumMap.put(qyd.CREDENTIAL_ENCRYPTED, parentFile);
                            }
                            if (z && (dataDir = application2.createDeviceProtectedStorageContext().getDataDir()) != null && parentFile != null) {
                                try {
                                    if (!dataDir.getCanonicalPath().equals(parentFile.getCanonicalPath())) {
                                        enumMap.put(qyd.DEVICE_ENCRYPTED, dataDir);
                                    }
                                } catch (IOException e5) {
                                    ((oug) ((oug) ((oug) nbc.a.b()).h(e5)).G((char) 3651)).o("Failed to retrieve canonical paths.");
                                }
                            }
                            arrayList = new ArrayList();
                            priorityQueue = new PriorityQueue();
                            for (Map.Entry entry : enumMap.entrySet()) {
                                nbmVar2 = nbmVar2;
                                poyVarM = poyVarM;
                                poyVar4 = poyVar4;
                                try {
                                    try {
                                        priorityQueue.add(new nbb((qyd) entry.getKey(), ((File) entry.getValue()).getCanonicalFile()));
                                        i = 1;
                                    } catch (Exception e6) {
                                        ((oug) ((oug) ((oug) nbc.a.c()).h(e6)).G((char) 3648)).r("couldn't canonicalize %s, skipping", entry);
                                        i = 1;
                                    }
                                } catch (Exception e7) {
                                    e = e7;
                                    ((oug) ((oug) ((oug) nbc.a.c()).h(e)).G((char) 3649)).o("Failed to retrieve DirStats.");
                                    oomVarL = oom.l();
                                    poyVar4 = poyVar4;
                                    if (poyVar4.c) {
                                        poyVar4.m();
                                        poyVar4.c = false;
                                    }
                                    qyf qyfVar10 = (qyf) poyVar4.b;
                                    qyfVar10.i();
                                    pnl.e(oomVarL, qyfVar10.j);
                                    poyVar = poyVarM;
                                    if (poyVar.c) {
                                        poyVar.m();
                                        poyVar.c = false;
                                    }
                                    qyk qykVar = (qyk) poyVar.b;
                                    qyf qyfVar11 = (qyf) poyVar4.j();
                                    qyfVar11.getClass();
                                    qykVar.i = qyfVar11;
                                    qykVar.a |= 256;
                                    nceVar = nbmVar2.e;
                                    if (mez.c(nceVar.a)) {
                                        ((SharedPreferences) nceVar.c.get()).edit().putLong("primes.packageMetric.lastSendTime", nceVar.b.b()).commit();
                                    }
                                    mxl mxlVar = nbmVar2.b;
                                    mxf mxfVarA = mxg.a();
                                    mxfVarA.d((qyk) poyVar.j());
                                    return mxlVar.b(mxfVarA.a());
                                }
                            }
                        } catch (Exception e8) {
                            e = e8;
                            nbmVar2 = nbmVar2;
                            poyVarM = poyVarM;
                            poyVar4 = poyVar4;
                            ((oug) ((oug) ((oug) nbc.a.c()).h(e)).G((char) 3649)).o("Failed to retrieve DirStats.");
                            oomVarL = oom.l();
                            poyVar4 = poyVar4;
                            if (poyVar4.c) {
                                poyVar4.m();
                                poyVar4.c = false;
                            }
                            qyf qyfVar12 = (qyf) poyVar4.b;
                            qyfVar12.i();
                            pnl.e(oomVarL, qyfVar12.j);
                            poyVar = poyVarM;
                            if (poyVar.c) {
                                poyVar.m();
                                poyVar.c = false;
                            }
                            qyk qykVar2 = (qyk) poyVar.b;
                            qyf qyfVar13 = (qyf) poyVar4.j();
                            qyfVar13.getClass();
                            qykVar2.i = qyfVar13;
                            qykVar2.a |= 256;
                            nceVar = nbmVar2.e;
                            if (mez.c(nceVar.a)) {
                                ((SharedPreferences) nceVar.c.get()).edit().putLong("primes.packageMetric.lastSendTime", nceVar.b.b()).commit();
                            }
                            mxl mxlVar2 = nbmVar2.b;
                            mxf mxfVarA2 = mxg.a();
                            mxfVarA2.d((qyk) poyVar.j());
                            return mxlVar2.b(mxfVarA2.a());
                        }
                        poyVar4 = poyVar4;
                        if (poyVar4.c) {
                            poyVar4.m();
                            poyVar4.c = false;
                        }
                        qyf qyfVar14 = (qyf) poyVar4.b;
                        qyfVar14.i();
                        pnl.e(oomVarL, qyfVar14.j);
                    } else {
                        nbmVar2 = nbmVar2;
                        poyVarM = poyVarM;
                    }
                    poyVar = poyVarM;
                    if (poyVar.c) {
                        poyVar.m();
                        poyVar.c = false;
                    }
                    qyk qykVar3 = (qyk) poyVar.b;
                    qyf qyfVar15 = (qyf) poyVar4.j();
                    qyfVar15.getClass();
                    qykVar3.i = qyfVar15;
                    qykVar3.a |= 256;
                    nceVar = nbmVar2.e;
                    if (mez.c(nceVar.a)) {
                        ((SharedPreferences) nceVar.c.get()).edit().putLong("primes.packageMetric.lastSendTime", nceVar.b.b()).commit();
                    }
                    mxl mxlVar3 = nbmVar2.b;
                    mxf mxfVarA3 = mxg.a();
                    mxfVarA3.d((qyk) poyVar.j());
                    return mxlVar3.b(mxfVarA3.a());
                }
                return phq.a;
            }
        }, this.g);
    }

    @Override // defpackage.mxo
    public final void t() {
        this.f.a(this);
    }
}
