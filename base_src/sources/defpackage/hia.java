package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class hia implements hic, hil {
    private static final lig l = new lig(512, 384);
    protected final ExecutorService a;
    protected final ExecutorService b;
    protected final ExecutorService c;
    protected final ExecutorService d;
    private final hjf m;
    private final ljf n;
    private final lig o;
    private final hhl p;
    public int h = 0;
    public int i = 0;
    public int j = 0;
    public final hii k = new hii();
    public final Map e = new HashMap();
    public final Map f = new HashMap();
    public final Set g = new HashSet();

    public hia(ExecutorService executorService, ExecutorService executorService2, ExecutorService executorService3, ExecutorService executorService4, hjf hjfVar, hhl hhlVar, ljf ljfVar, int i) {
        this.a = executorService;
        this.b = executorService2;
        this.c = executorService3;
        this.d = executorService4;
        this.m = hjfVar;
        this.p = hhlVar;
        this.n = ljfVar;
        this.o = new lig(i, i);
    }

    public final void a(hja hjaVar) {
        synchronized (this.f) {
            this.f.remove(hjaVar);
        }
    }

    @Override // defpackage.hil
    public final void b(mad madVar, Executor executor) {
        synchronized (this.e) {
            hhx hhxVar = (hhx) this.e.get(madVar);
            if (hhxVar == null || hhxVar.b() <= 0) {
                throw new RuntimeException("ERROR: Task implementation did NOT balance its release.");
            }
            hhxVar.a(-1);
            this.h--;
            if (hhxVar.b() == 0) {
                this.e.remove(madVar);
                this.g.retainAll(this.e.keySet());
                if (hhxVar.b) {
                    hhw hhwVar = new hhw(this, madVar);
                    if (executor == null) {
                        hhwVar.run();
                    } else {
                        executor.execute(hhwVar);
                    }
                }
                if (hhxVar.a) {
                    hhxVar.d();
                }
            } else {
                this.e.put(madVar, hhxVar);
            }
        }
    }

    public final void c(Set set, hhz hhzVar) {
        synchronized (this.f) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                hja hjaVar = (hja) it.next();
                this.f.put(hjaVar, hhzVar);
                hhy hhyVar = new hhy(this, hhzVar, hjaVar, this.n);
                switch (hjaVar.h - 1) {
                    case 0:
                        this.a.execute(hhyVar);
                        break;
                    case 1:
                        this.b.execute(hhyVar);
                        break;
                    case 2:
                        this.c.execute(hhyVar);
                        break;
                    default:
                        this.d.execute(hhyVar);
                        break;
                }
            }
        }
    }

    public final boolean d(hsa hsaVar, Set set, boolean z, boolean z2, ojc ojcVar) {
        hhx hhxVar;
        hsaVar.getClass();
        if (set.size() <= 0) {
            return false;
        }
        HashMap map = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            mad madVar = ((hja) it.next()).f.a;
            Integer num = (Integer) map.get(madVar);
            if (num == null) {
                map.put(madVar, 1);
            } else {
                map.put(madVar, Integer.valueOf(num.intValue() + 1));
            }
        }
        Set setKeySet = map.keySet();
        hgy hgyVar = new hgy();
        hgyVar.e(set.size());
        hik hikVar = new hik(hgyVar, hsaVar, ojcVar);
        synchronized (this.f) {
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                obr.aR(((hhz) this.f.get((hja) it2.next())) == null, "Overlap of Shadow Task association.  You've possibly submitted the same task twice?");
            }
        }
        hhz hhzVar = new hhz(hikVar, setKeySet);
        HashSet<hhx> hashSet = new HashSet(map.keySet().size());
        for (mad madVar2 : map.keySet()) {
            int iIntValue = ((Integer) map.get(madVar2)).intValue();
            synchronized (this.e) {
                obr.aR(this.e.get(madVar2) == null, "Image is already being processed by another task.");
                hhxVar = new hhx(z, z2);
                hhxVar.e(iIntValue);
                this.e.put(madVar2, hhxVar);
                this.h += iIntValue;
                this.i++;
            }
            hashSet.add(hhxVar);
        }
        this.p.a(hhzVar.a);
        c(set, hhzVar);
        for (hhx hhxVar2 : hashSet) {
            if (hhxVar2.a) {
                hhxVar2.c();
            }
        }
        return true;
    }

    @Override // defpackage.hic
    public final void e(hin hinVar, Executor executor, Set set, hsa hsaVar, ojc ojcVar) {
        HashSet hashSet = new HashSet();
        if (set.contains(hib.COMPRESS_TO_JPEG_AND_WRITE_TO_DISK)) {
            hiv hivVar = new hiv(hinVar, executor, this, hsaVar, this.m);
            if (set.contains(hib.CREATE_EARLY_FILMSTRIP_PREVIEW)) {
                hashSet.add(new hjc(hinVar, executor, this, hsaVar, l, ojc.i(hivVar), this.n));
            } else {
                hashSet.add(hivVar);
            }
        } else if (set.contains(hib.CREATE_EARLY_FILMSTRIP_PREVIEW)) {
            hashSet.add(new hjc(hinVar, executor, this, hsaVar, l, oih.a, this.n));
        }
        if (set.contains(hib.CONVERT_TO_RGB_PREVIEW)) {
            hashSet.add(new hiw(hinVar, executor, this, 3, hsaVar, this.o, 3, this.n));
        }
        ojj ojjVar = (ojj) ojcVar;
        if (d(hsaVar, hashSet, set.contains(hib.BLOCK_UNTIL_ALL_TASKS_RELEASE), set.contains(hib.CLOSE_ON_ALL_TASKS_RELEASE), ojc.i(new hhv(this, (hih) ojjVar.a)))) {
            hii hiiVar = this.k;
            hih hihVar = (hih) ojjVar.a;
            mad madVar = hinVar.a;
            synchronized (hiiVar.a) {
                hiiVar.a.size();
                if (!hiiVar.a.contains(hihVar)) {
                    hiiVar.a.add(hihVar);
                }
                if (madVar == null) {
                    hiiVar.b.put(hihVar, null);
                } else {
                    hiiVar.b.put(hihVar, Long.valueOf(madVar.d()));
                }
                hiiVar.a.size();
            }
        }
    }

    public final String toString() {
        int size;
        int size2;
        int size3 = this.f.size();
        int size4 = this.e.size();
        int i = this.h;
        hii hiiVar = this.k;
        synchronized (hiiVar.a) {
            size = hiiVar.b.size();
        }
        hii hiiVar2 = this.k;
        synchronized (hiiVar2.a) {
            size2 = hiiVar2.a.size();
        }
        StringBuilder sb = new StringBuilder(229);
        sb.append("ImageBackend Status BEGIN:\nShadow Image Map Size = ");
        sb.append(size3);
        sb.append("\nImage Semaphore Map Size = ");
        sb.append(size4);
        sb.append("\nOutstandingImageRefs = ");
        sb.append(i);
        sb.append("\nProxy Listener Map Size = ");
        sb.append(size);
        sb.append("\nProxy Listener = ");
        sb.append(size2);
        sb.append("\nImageBackend Status END:\n");
        return sb.toString();
    }
}
