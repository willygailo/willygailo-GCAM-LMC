package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class gkh implements gmt {
    private final Map a = new HashMap();
    private final Map b = new HashMap();
    private final gkx c;

    public gkh(gkx gkxVar) {
        this.c = gkxVar;
    }

    private final void b() {
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((mad) it.next()).close();
        }
        Iterator it2 = this.b.values().iterator();
        while (it2.hasNext()) {
            ((mad) it2.next()).close();
        }
    }

    private static final void c(long j, Map map) {
        ArrayList arrayList = new ArrayList();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            long jLongValue = ((Long) it.next()).longValue();
            if (jLongValue < j) {
                Long lValueOf = Long.valueOf(jLongValue);
                ((mad) map.get(lValueOf)).close();
                arrayList.add(lValueOf);
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            map.remove((Long) arrayList.get(i));
        }
    }

    @Override // defpackage.gmt
    public final void a(mad madVar, pht phtVar) {
        ojc ojcVarI;
        Map map = this.b;
        Long lValueOf = Long.valueOf(madVar.d());
        gjs gjsVar = new gjs(madVar);
        gjsVar.a.put(gjr.a, phtVar);
        map.put(lValueOf, gjsVar);
        if (this.b.isEmpty()) {
            ojcVarI = oih.a;
        } else {
            Iterator it = this.b.values().iterator();
            boolean z = false;
            long j = 0;
            while (it.hasNext()) {
                long jD = ((mad) it.next()).d();
                if (!z || jD > j) {
                    j = jD;
                }
                z = true;
            }
            ojcVarI = !z ? oih.a : ojc.i(Long.valueOf(j));
        }
        if (ojcVarI.g()) {
            c(((Long) ojcVarI.c()).longValue(), this.b);
            c(((Long) ojcVarI.c()).longValue(), this.a);
        }
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        gjs gjsVar;
        try {
            pht phtVarU = plk.U(new llv());
            mad madVar = null;
            if (this.b.isEmpty()) {
                gjsVar = null;
            } else {
                gjsVar = null;
                for (gjs gjsVar2 : this.b.values()) {
                    if (gjsVar == null || gjsVar2.d() > gjsVar.d()) {
                        gjsVar = gjsVar2;
                    }
                }
            }
            if (gjsVar != null) {
                this.b.remove(Long.valueOf(gjsVar.d()));
                phtVarU = gjsVar.k();
                phtVarU.getClass();
            }
            if (gjsVar != null) {
                madVar = (mad) this.a.get(Long.valueOf(gjsVar.d()));
                if (madVar != null) {
                    this.a.remove(Long.valueOf(madVar.d()));
                }
            }
            gkx gkxVar = this.c;
            ojc ojcVarH = ojc.h(gjsVar);
            ojc ojcVarH2 = ojc.h(madVar);
            try {
                if (ojcVarH2.g()) {
                    ((mad) ojcVarH2.c()).close();
                }
                HashSet hashSet = new HashSet();
                hashSet.add(hib.CREATE_EARLY_FILMSTRIP_PREVIEW);
                hashSet.add(hib.CONVERT_TO_RGB_PREVIEW);
                hashSet.add(hib.COMPRESS_TO_JPEG_AND_WRITE_TO_DISK);
                hashSet.add(hib.CLOSE_ON_ALL_TASKS_RELEASE);
                if (ojcVarH.g()) {
                    gkxVar.e.b.add(phtVarU);
                    try {
                        hia hiaVar = gkxVar.d.b;
                        him himVarA = hin.a((mad) ojcVarH.c());
                        himVarA.d = phtVarU;
                        himVarA.c = gkxVar.b;
                        himVarA.f = gkxVar.d.c;
                        himVarA.b(gkxVar.a.d());
                        hiaVar.e(himVarA.a(), gkxVar.d.d, hashSet, gkxVar.a, ojc.i(gkxVar.c));
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    dmd dmdVar = new dmd("received an image, but it did not have any image data!");
                    ((oug) ((oug) gky.a.b()).G(2082)).r("%s", dmdVar.getMessage());
                    gkxVar.a.C(jmq.a, dmdVar);
                }
                gkxVar.e.close();
                b();
            } catch (Throwable th) {
                gkxVar.e.close();
                throw th;
            }
        } catch (Throwable th2) {
            b();
            throw th2;
        }
    }
}
