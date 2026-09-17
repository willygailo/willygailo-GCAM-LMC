package defpackage;

import com.google.android.apps.camera.bottombar.R;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class lug implements lie {
    private static int l = 0;
    public final mag a;
    public final int b;
    public final lig c;
    public final Executor d;
    public final lis f;
    public final lrx g;
    public final ljk h;
    private final lap m;
    private final ljf o;
    private final lua p;
    private final String r;
    private List t;
    private mad u;
    public boolean k = false;
    private boolean s = true;
    public final Deque i = new ArrayDeque();
    public final Queue j = new osp(new ArrayDeque());
    private final Runnable n = new luf(this, 1);
    public final Runnable e = new luf(this, 0);
    private final long q = d();

    public lug(mag magVar, lap lapVar, Executor executor, lis lisVar, ljf ljfVar, lrx lrxVar, lua luaVar) {
        this.a = magVar;
        this.b = magVar.b();
        this.m = lapVar;
        this.d = executor;
        this.f = lisVar;
        this.o = ljfVar;
        this.g = lrxVar;
        this.c = lig.h(magVar.d(), magVar.a());
        this.p = luaVar;
        String strValueOf = String.valueOf(mip.aN(magVar));
        this.h = ljfVar.b(strValueOf.length() != 0 ? "PckImageCount_".concat(strValueOf) : new String("PckImageCount_"));
        String strValueOf2 = String.valueOf(mip.aN(magVar));
        this.r = strValueOf2.length() != 0 ? "distribute_".concat(strValueOf2) : new String("distribute_");
    }

    private static synchronized int d() {
        int i;
        i = l;
        l = i + 1;
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x021c A[Catch: all -> 0x025e, TryCatch #2 {, blocks: (B:5:0x000c, B:7:0x0010, B:11:0x0017, B:13:0x001b, B:15:0x001f, B:17:0x0023, B:18:0x0037, B:20:0x003b, B:22:0x003f, B:24:0x0044, B:25:0x004b, B:27:0x0051, B:29:0x0060, B:33:0x0071, B:36:0x008e, B:38:0x0092, B:39:0x009c, B:41:0x00a2, B:43:0x00ae, B:49:0x00bd, B:50:0x00c4, B:52:0x00ca, B:54:0x00d6, B:56:0x00de, B:59:0x00e8, B:60:0x00ed, B:73:0x0127, B:62:0x00f5, B:63:0x00fc, B:65:0x0102, B:67:0x010e, B:70:0x011a, B:71:0x011f, B:74:0x0129, B:76:0x012d, B:79:0x0135, B:80:0x0139, B:82:0x0140, B:85:0x015d, B:86:0x0169, B:105:0x020f, B:106:0x0216, B:108:0x021c, B:110:0x022b, B:114:0x023c, B:116:0x0251, B:117:0x0259), top: B:129:0x000c, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x022b A[Catch: all -> 0x025e, TryCatch #2 {, blocks: (B:5:0x000c, B:7:0x0010, B:11:0x0017, B:13:0x001b, B:15:0x001f, B:17:0x0023, B:18:0x0037, B:20:0x003b, B:22:0x003f, B:24:0x0044, B:25:0x004b, B:27:0x0051, B:29:0x0060, B:33:0x0071, B:36:0x008e, B:38:0x0092, B:39:0x009c, B:41:0x00a2, B:43:0x00ae, B:49:0x00bd, B:50:0x00c4, B:52:0x00ca, B:54:0x00d6, B:56:0x00de, B:59:0x00e8, B:60:0x00ed, B:73:0x0127, B:62:0x00f5, B:63:0x00fc, B:65:0x0102, B:67:0x010e, B:70:0x011a, B:71:0x011f, B:74:0x0129, B:76:0x012d, B:79:0x0135, B:80:0x0139, B:82:0x0140, B:85:0x015d, B:86:0x0169, B:105:0x020f, B:106:0x0216, B:108:0x021c, B:110:0x022b, B:114:0x023c, B:116:0x0251, B:117:0x0259), top: B:129:0x000c, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x023c A[Catch: all -> 0x025e, TryCatch #2 {, blocks: (B:5:0x000c, B:7:0x0010, B:11:0x0017, B:13:0x001b, B:15:0x001f, B:17:0x0023, B:18:0x0037, B:20:0x003b, B:22:0x003f, B:24:0x0044, B:25:0x004b, B:27:0x0051, B:29:0x0060, B:33:0x0071, B:36:0x008e, B:38:0x0092, B:39:0x009c, B:41:0x00a2, B:43:0x00ae, B:49:0x00bd, B:50:0x00c4, B:52:0x00ca, B:54:0x00d6, B:56:0x00de, B:59:0x00e8, B:60:0x00ed, B:73:0x0127, B:62:0x00f5, B:63:0x00fc, B:65:0x0102, B:67:0x010e, B:70:0x011a, B:71:0x011f, B:74:0x0129, B:76:0x012d, B:79:0x0135, B:80:0x0139, B:82:0x0140, B:85:0x015d, B:86:0x0169, B:105:0x020f, B:106:0x0216, B:108:0x021c, B:110:0x022b, B:114:0x023c, B:116:0x0251, B:117:0x0259), top: B:129:0x000c, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x0251 A[Catch: all -> 0x025e, TryCatch #2 {, blocks: (B:5:0x000c, B:7:0x0010, B:11:0x0017, B:13:0x001b, B:15:0x001f, B:17:0x0023, B:18:0x0037, B:20:0x003b, B:22:0x003f, B:24:0x0044, B:25:0x004b, B:27:0x0051, B:29:0x0060, B:33:0x0071, B:36:0x008e, B:38:0x0092, B:39:0x009c, B:41:0x00a2, B:43:0x00ae, B:49:0x00bd, B:50:0x00c4, B:52:0x00ca, B:54:0x00d6, B:56:0x00de, B:59:0x00e8, B:60:0x00ed, B:73:0x0127, B:62:0x00f5, B:63:0x00fc, B:65:0x0102, B:67:0x010e, B:70:0x011a, B:71:0x011f, B:74:0x0129, B:76:0x012d, B:79:0x0135, B:80:0x0139, B:82:0x0140, B:85:0x015d, B:86:0x0169, B:105:0x020f, B:106:0x0216, B:108:0x021c, B:110:0x022b, B:114:0x023c, B:116:0x0251, B:117:0x0259), top: B:129:0x000c, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:164:0x015b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x0238 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x0238 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x0216 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0140 A[Catch: all -> 0x025e, TryCatch #2 {, blocks: (B:5:0x000c, B:7:0x0010, B:11:0x0017, B:13:0x001b, B:15:0x001f, B:17:0x0023, B:18:0x0037, B:20:0x003b, B:22:0x003f, B:24:0x0044, B:25:0x004b, B:27:0x0051, B:29:0x0060, B:33:0x0071, B:36:0x008e, B:38:0x0092, B:39:0x009c, B:41:0x00a2, B:43:0x00ae, B:49:0x00bd, B:50:0x00c4, B:52:0x00ca, B:54:0x00d6, B:56:0x00de, B:59:0x00e8, B:60:0x00ed, B:73:0x0127, B:62:0x00f5, B:63:0x00fc, B:65:0x0102, B:67:0x010e, B:70:0x011a, B:71:0x011f, B:74:0x0129, B:76:0x012d, B:79:0x0135, B:80:0x0139, B:82:0x0140, B:85:0x015d, B:86:0x0169, B:105:0x020f, B:106:0x0216, B:108:0x021c, B:110:0x022b, B:114:0x023c, B:116:0x0251, B:117:0x0259), top: B:129:0x000c, outer: #0 }] */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0209, code lost:
    
        monitor-exit(r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x025a, code lost:
    
        r0 = r17.o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001c, code lost:
    
        r0 = r17.o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        r0 = r17.o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
    
        r0 = r17.o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x016a, code lost:
    
        r17.o.e(r17.r);
        r2 = new defpackage.lwk(r5);
        r3 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x017e, code lost:
    
        if (r3.hasNext() == false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0180, code lost:
    
        r6 = (defpackage.lun) r3.next();
        r8 = r6.c();
        r8.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0193, code lost:
    
        if (r8.b != r0.b) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x019b, code lost:
    
        if (r8.c != r0.c) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x019d, code lost:
    
        r6.k(r2.k());
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01a5, code lost:
    
        r9 = r17.f;
        r10 = java.lang.String.valueOf(r6.d());
        r11 = r8.c;
        r13 = r8.b;
        r8 = java.lang.String.valueOf(r5);
        r7 = new java.lang.StringBuilder((java.lang.String.valueOf(r10).length() + com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_textAppearanceLargePopupMenu) + java.lang.String.valueOf(r8).length());
        r7.append("Distributing null to ");
        r7.append(r10);
        r7.append(" for frame ");
        r7.append(r11);
        r7.append(" at ");
        r7.append(r13);
        r7.append(" because it is older than ");
        r7.append(r8);
        r9.h(r7.toString());
        r6.k(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01fd, code lost:
    
        r2.l();
        r17.o.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0205, code lost:
    
        monitor-enter(r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0207, code lost:
    
        r17.s = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instruction units count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lug.a():void");
    }

    public final void b() {
        synchronized (this) {
            if (!this.k) {
                this.d.execute(this.n);
            }
        }
    }

    public final synchronized void c(final lnx lnxVar, final long j) {
        final ArrayList arrayList = new ArrayList();
        this.d.execute(new Runnable() { // from class: lub
            @Override // java.lang.Runnable
            public final void run() {
                lmw lmwVarC;
                lug lugVar = this.a;
                lnx lnxVar2 = lnxVar;
                long j2 = j;
                List list = arrayList;
                synchronized (lugVar) {
                    Iterator it = lugVar.i.iterator();
                    while (it.hasNext()) {
                        lun lunVar = (lun) it.next();
                        if (lunVar.d() == lnxVar2 && (lmwVarC = lunVar.c()) != null && lmwVarC.c == j2) {
                            list.add(lunVar);
                            it.remove();
                        }
                    }
                }
                if (!list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        ((lun) it2.next()).k(null);
                    }
                    return;
                }
                lis lisVar = lugVar.f;
                String strValueOf = String.valueOf(lnxVar2);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + R.styleable.AppCompatTheme_textColorAlertDialogListItem);
                sb.append("Received onBufferLost from ");
                sb.append(strValueOf);
                sb.append(" for frame ");
                sb.append(j2);
                sb.append(" but was unable to find a matching request to abort.");
                lisVar.h(sb.toString());
            }
        });
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (this.k) {
                return;
            }
            this.k = true;
            mad madVar = this.u;
            ArrayList arrayList = new ArrayList();
            List list = this.t;
            if (list != null) {
                arrayList.addAll(list);
            }
            arrayList.addAll(this.i);
            this.u = null;
            this.t = null;
            this.i.clear();
            if (madVar != null) {
                madVar.close();
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((lun) arrayList.get(i)).k(null);
            }
            this.m.close();
        }
    }

    public final String toString() {
        String strAN = mip.aN(this.a);
        long j = this.q;
        StringBuilder sb = new StringBuilder(String.valueOf(strAN).length() + 21);
        sb.append(strAN);
        sb.append("-");
        sb.append(j);
        return sb.toString();
    }
}
