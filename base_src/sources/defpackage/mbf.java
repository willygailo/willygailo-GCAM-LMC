package defpackage;

import android.os.SystemClock;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class mbf implements mbc {
    public final maz a;
    public final lis b;
    public final ljf c;
    private final ScheduledExecutorService d;
    private final mbj e;
    private Set h;
    private Set i;
    private Set j;
    private mak k;
    private maw l;
    private ScheduledFuture m;
    private final List f = new ArrayList();
    private final List g = new ArrayList();
    private oom n = oom.l();
    private boolean o = false;
    private boolean p = false;
    private int q = 1;

    public mbf(ScheduledExecutorService scheduledExecutorService, maz mazVar, mbj mbjVar, ljf ljfVar, lis lisVar) {
        this.d = scheduledExecutorService;
        this.a = mazVar;
        this.e = mbjVar;
        this.c = ljfVar;
        this.b = lisVar.a("MediaGroup");
    }

    private final synchronized void g() {
        if (this.m == null && !this.o && this.e.r >= 0) {
            this.m = this.d.schedule(new Runnable() { // from class: mbd
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.f();
                }
            }, this.e.r, TimeUnit.MILLISECONDS);
        }
    }

    private final synchronized void h() {
        if (!this.p && this.l != null && this.h != null && this.i != null && this.j != null && (this.o || this.f.size() + this.g.size() == this.h.size() + this.i.size() + this.j.size())) {
            this.p = true;
            ScheduledFuture scheduledFuture = this.m;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.m = null;
            }
            final max maxVarC = c();
            this.d.execute(new Runnable() { // from class: mbe
                @Override // java.lang.Runnable
                public final void run() {
                    ljf ljfVar;
                    mbf mbfVar = this.a;
                    final max maxVar = maxVarC;
                    mbfVar.c.e("Publish");
                    try {
                        final maz mazVar = mbfVar.a;
                        final long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                        ljf ljfVar2 = mazVar.e;
                        String strValueOf = String.valueOf(maxVar.a);
                        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 6);
                        sb.append("names-");
                        sb.append(strValueOf);
                        ljfVar2.e(sb.toString());
                        final maj majVar = new maj(maxVar, mazVar.c.h);
                        ljf ljfVar3 = mazVar.e;
                        String strValueOf2 = String.valueOf(maxVar.a);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 6);
                        sb2.append("await-");
                        sb2.append(strValueOf2);
                        ljfVar3.g(sb2.toString());
                        mce mceVar = null;
                        try {
                            oti otiVarListIterator = maxVar.e.listIterator();
                            while (otiVarListIterator.hasNext()) {
                                try {
                                    mceVar = ((mam) otiVarListIterator.next()).e;
                                    lis lisVar = mazVar.f;
                                    String strValueOf3 = String.valueOf(mceVar);
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(strValueOf3).length() + 9);
                                    sb3.append("Awaiting ");
                                    sb3.append(strValueOf3);
                                    lisVar.f(sb3.toString());
                                    mceVar.j();
                                } catch (InterruptedException e) {
                                    lis lisVar2 = mazVar.f;
                                    String strValueOf4 = String.valueOf(maxVar.a);
                                    String strValueOf5 = String.valueOf(mceVar);
                                    StringBuilder sb4 = new StringBuilder(String.valueOf(strValueOf4).length() + 56 + String.valueOf(strValueOf5).length());
                                    sb4.append("Interrupted while publishing ");
                                    sb4.append(strValueOf4);
                                    sb4.append(", waiting for ");
                                    sb4.append(strValueOf5);
                                    sb4.append(" to complete!");
                                    lisVar2.h(sb4.toString());
                                }
                            }
                            oti otiVarListIterator2 = maxVar.f.listIterator();
                            while (otiVarListIterator2.hasNext()) {
                                mceVar = ((mam) otiVarListIterator2.next()).e;
                                lis lisVar3 = mazVar.f;
                                String strValueOf6 = String.valueOf(mceVar);
                                StringBuilder sb5 = new StringBuilder(String.valueOf(strValueOf6).length() + 9);
                                sb5.append("Awaiting ");
                                sb5.append(strValueOf6);
                                lisVar3.f(sb5.toString());
                                mceVar.j();
                            }
                            oti otiVarListIterator3 = maxVar.g.listIterator();
                            while (otiVarListIterator3.hasNext()) {
                                mce mceVar2 = (mce) otiVarListIterator3.next();
                                lis lisVar4 = mazVar.f;
                                String strValueOf7 = String.valueOf(mceVar2);
                                StringBuilder sb6 = new StringBuilder(String.valueOf(strValueOf7).length() + 9);
                                sb6.append("Awaiting ");
                                sb6.append(strValueOf7);
                                lisVar4.f(sb6.toString());
                                mceVar2.j();
                            }
                        } catch (InterruptedException e2) {
                        }
                        mazVar.e.f();
                        mazVar.d.execute(new Runnable() { // from class: may
                            @Override // java.lang.Runnable
                            public final void run() {
                                maz mazVar2 = mazVar;
                                long j = jElapsedRealtimeNanos;
                                final max maxVar2 = maxVar;
                                mai maiVar = majVar;
                                lis lisVar5 = mazVar2.f;
                                String strValueOf8 = String.valueOf(maxVar2.a);
                                StringBuilder sb7 = new StringBuilder(String.valueOf(strValueOf8).length() + 11);
                                sb7.append("Publishing ");
                                sb7.append(strValueOf8);
                                lisVar5.f(sb7.toString());
                                long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
                                try {
                                    try {
                                        ljf ljfVar4 = mazVar2.e;
                                        String strValueOf9 = String.valueOf(maxVar2.a);
                                        StringBuilder sb8 = new StringBuilder(String.valueOf(strValueOf9).length() + 8);
                                        sb8.append("publish-");
                                        sb8.append(strValueOf9);
                                        ljfVar4.e(sb8.toString());
                                        mcg mcgVarB = mazVar2.a.b(maxVar2.i);
                                        try {
                                            oti otiVarListIterator4 = maxVar2.f.listIterator();
                                            while (otiVarListIterator4.hasNext()) {
                                                mazVar2.a(mcgVarB, maiVar, maxVar2, (mam) otiVarListIterator4.next());
                                            }
                                            oti otiVarListIterator5 = maxVar2.e.listIterator();
                                            while (otiVarListIterator5.hasNext()) {
                                                mazVar2.a(mcgVarB, maiVar, maxVar2, (mam) otiVarListIterator5.next());
                                            }
                                            oti otiVarListIterator6 = maxVar2.g.listIterator();
                                            while (otiVarListIterator6.hasNext()) {
                                                mcgVarB.a((mce) otiVarListIterator6.next());
                                            }
                                            if (mcgVarB != null) {
                                                mcgVarB.close();
                                            }
                                            final maq maqVar = mazVar2.b;
                                            synchronized (maqVar.e) {
                                                if (maqVar.a.p) {
                                                    maqVar.a(maxVar2);
                                                } else {
                                                    boolean zEquals = Boolean.TRUE.equals(maqVar.f.get(maxVar2.a));
                                                    long j2 = maqVar.a.q;
                                                    if (zEquals || j2 <= 0) {
                                                        maqVar.a(maxVar2);
                                                    } else if (maqVar.g.get(maxVar2) == null) {
                                                        Map map = maqVar.g;
                                                        lis lisVar6 = maqVar.d;
                                                        String strValueOf10 = String.valueOf(maxVar2.a);
                                                        StringBuilder sb9 = new StringBuilder(String.valueOf(strValueOf10).length() + 69);
                                                        sb9.append("Scheduled to notify change for media group ");
                                                        sb9.append(strValueOf10);
                                                        sb9.append(" in ");
                                                        sb9.append(j2);
                                                        sb9.append("ms");
                                                        lisVar6.f(sb9.toString());
                                                        map.put(maxVar2, maqVar.b.schedule(new Runnable() { // from class: mao
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                final maq maqVar2 = maqVar;
                                                                max maxVar3 = maxVar2;
                                                                synchronized (maqVar2.e) {
                                                                    if (maqVar2.g.containsKey(maxVar3)) {
                                                                        maqVar2.g.remove(maxVar3);
                                                                        final Set setSingleton = Collections.singleton(maxVar3);
                                                                        maqVar2.c.execute(new Runnable() { // from class: map
                                                                            @Override // java.lang.Runnable
                                                                            public final void run() {
                                                                                maq maqVar3 = maqVar2;
                                                                                Set set = setSingleton;
                                                                                synchronized (maqVar3.e) {
                                                                                    Iterator it = set.iterator();
                                                                                    while (it.hasNext()) {
                                                                                        maqVar3.a((max) it.next());
                                                                                    }
                                                                                }
                                                                            }
                                                                        });
                                                                    }
                                                                }
                                                            }
                                                        }, j2, TimeUnit.MILLISECONDS));
                                                    }
                                                }
                                            }
                                            mazVar2.e.f();
                                            long jElapsedRealtimeNanos3 = SystemClock.elapsedRealtimeNanos();
                                            lis lisVar7 = mazVar2.f;
                                            String strValueOf11 = String.valueOf(maxVar2.a);
                                            int size = maxVar2.e.size();
                                            StringBuilder sb10 = new StringBuilder(String.valueOf(strValueOf11).length() + 89);
                                            sb10.append("Published ");
                                            sb10.append(strValueOf11);
                                            sb10.append(" (");
                                            sb10.append(size);
                                            sb10.append(" file(s)) in ");
                                            sb10.append((jElapsedRealtimeNanos3 - jElapsedRealtimeNanos2) / 1000000);
                                            sb10.append("ms (");
                                            sb10.append((jElapsedRealtimeNanos3 - j) / 1000000);
                                            sb10.append("ms total)");
                                            lisVar7.f(sb10.toString());
                                            int i = maxVar2.j;
                                            int i2 = i - 1;
                                            if (i == 0) {
                                                throw null;
                                            }
                                            switch (i2) {
                                                case 1:
                                                    oom oomVar = maxVar2.h;
                                                    int i3 = ((orr) oomVar).c;
                                                    for (int i4 = 0; i4 < i3; i4++) {
                                                        try {
                                                            ((mar) oomVar.get(i4)).c();
                                                        } catch (Throwable th) {
                                                            mazVar2.f.e("Error notifying a listener of onPublished", th);
                                                        }
                                                    }
                                                    return;
                                                case 2:
                                                    oom oomVar2 = maxVar2.h;
                                                    int i5 = ((orr) oomVar2).c;
                                                    for (int i6 = 0; i6 < i5; i6++) {
                                                        try {
                                                            ((mar) oomVar2.get(i6)).a();
                                                        } catch (Throwable th2) {
                                                            mazVar2.f.e("Error notifying a listener of onAbandoned", th2);
                                                        }
                                                    }
                                                    return;
                                                default:
                                                    return;
                                            }
                                        } catch (Throwable th3) {
                                            if (mcgVarB == null) {
                                                throw th3;
                                            }
                                            try {
                                                mcgVarB.close();
                                                throw th3;
                                            } catch (Throwable th4) {
                                                throw th3;
                                            }
                                        }
                                    } catch (IOException e3) {
                                        lis lisVar8 = mazVar2.f;
                                        String strValueOf12 = String.valueOf(maxVar2.a);
                                        int size2 = maxVar2.e.size();
                                        StringBuilder sb11 = new StringBuilder(String.valueOf(strValueOf12).length() + 39);
                                        sb11.append("Error publishing ");
                                        sb11.append(strValueOf12);
                                        sb11.append(" (");
                                        sb11.append(size2);
                                        sb11.append(" file(s))");
                                        lisVar8.d(sb11.toString());
                                        ojc ojcVarI = ojc.i(e3);
                                        mazVar2.e.f();
                                        long jElapsedRealtimeNanos4 = SystemClock.elapsedRealtimeNanos();
                                        lis lisVar9 = mazVar2.f;
                                        String strValueOf13 = String.valueOf(maxVar2.a);
                                        int size3 = maxVar2.e.size();
                                        StringBuilder sb12 = new StringBuilder(String.valueOf(strValueOf13).length() + 89);
                                        sb12.append("Published ");
                                        sb12.append(strValueOf13);
                                        sb12.append(" (");
                                        sb12.append(size3);
                                        sb12.append(" file(s)) in ");
                                        sb12.append((jElapsedRealtimeNanos4 - jElapsedRealtimeNanos2) / 1000000);
                                        sb12.append("ms (");
                                        sb12.append((jElapsedRealtimeNanos4 - j) / 1000000);
                                        sb12.append("ms total)");
                                        lisVar9.f(sb12.toString());
                                        oom oomVar3 = maxVar2.h;
                                        int i7 = ((orr) oomVar3).c;
                                        for (int i8 = 0; i8 < i7; i8++) {
                                            try {
                                                ((mar) oomVar3.get(i8)).b((Throwable) ((ojj) ojcVarI).a);
                                            } catch (Throwable th5) {
                                                mazVar2.f.e("Error notifying a listener of onError", th5);
                                            }
                                        }
                                    }
                                } catch (Throwable th6) {
                                    mazVar2.e.f();
                                    long jElapsedRealtimeNanos5 = SystemClock.elapsedRealtimeNanos();
                                    lis lisVar10 = mazVar2.f;
                                    String strValueOf14 = String.valueOf(maxVar2.a);
                                    int size4 = maxVar2.e.size();
                                    StringBuilder sb13 = new StringBuilder(String.valueOf(strValueOf14).length() + 89);
                                    sb13.append("Published ");
                                    sb13.append(strValueOf14);
                                    sb13.append(" (");
                                    sb13.append(size4);
                                    sb13.append(" file(s)) in ");
                                    sb13.append((jElapsedRealtimeNanos5 - jElapsedRealtimeNanos2) / 1000000);
                                    sb13.append("ms (");
                                    sb13.append((jElapsedRealtimeNanos5 - j) / 1000000);
                                    sb13.append("ms total)");
                                    lisVar10.f(sb13.toString());
                                    int i9 = maxVar2.j;
                                    int i10 = i9 - 1;
                                    if (i9 == 0) {
                                        throw null;
                                    }
                                    switch (i10) {
                                        case 1:
                                            oom oomVar4 = maxVar2.h;
                                            int i11 = ((orr) oomVar4).c;
                                            for (int i12 = 0; i12 < i11; i12++) {
                                                try {
                                                    ((mar) oomVar4.get(i12)).c();
                                                } catch (Throwable th7) {
                                                    mazVar2.f.e("Error notifying a listener of onPublished", th7);
                                                }
                                            }
                                            throw th6;
                                        case 2:
                                            oom oomVar5 = maxVar2.h;
                                            int i13 = ((orr) oomVar5).c;
                                            for (int i14 = 0; i14 < i13; i14++) {
                                                try {
                                                    ((mar) oomVar5.get(i14)).a();
                                                } catch (Throwable th8) {
                                                    mazVar2.f.e("Error notifying a listener of onAbandoned", th8);
                                                }
                                            }
                                            throw th6;
                                        default:
                                            throw th6;
                                    }
                                }
                            }
                        });
                        ljfVar = mbfVar.c;
                    } catch (Throwable th) {
                        try {
                            mbfVar.b.e("Error publishing media group!", th);
                            otj it = maxVar.h.iterator();
                            while (it.hasNext()) {
                                try {
                                    ((mar) it.next()).b(th);
                                } catch (Throwable th2) {
                                    mbfVar.b.e("Error notifying a listener of onError", th);
                                }
                            }
                            ljfVar = mbfVar.c;
                        } catch (Throwable th3) {
                            mbfVar.c.f();
                            throw th3;
                        }
                    }
                    ljfVar.f();
                }
            });
        }
    }

    @Override // defpackage.mbc
    public final synchronized void a(mbb mbbVar) {
        obr.aQ(this.l == null);
        this.l = mbbVar.e;
        this.h = orx.a;
        this.i = orx.a;
        this.n = mbbVar.f;
        this.q = 3;
        HashSet hashSet = new HashSet(mbbVar.d);
        hashSet.addAll(mbbVar.b);
        hashSet.addAll(mbbVar.c);
        this.j = hashSet;
        g();
        h();
    }

    @Override // defpackage.mbc
    public final synchronized void b(mbb mbbVar) {
        obr.aQ(this.l == null);
        this.l = mbbVar.e;
        this.k = mbbVar.a;
        this.h = mbbVar.b;
        this.i = mbbVar.c;
        this.j = ope.F(mbbVar.d);
        this.n = mbbVar.f;
        this.q = 2;
        g();
        h();
    }

    final synchronized max c() {
        maw mawVar;
        mat matVar;
        Long l;
        Set set = this.h;
        set.getClass();
        Set set2 = this.i;
        set2.getClass();
        mawVar = this.l;
        mawVar.getClass();
        opc opcVarD = ope.D();
        opc opcVarD2 = ope.D();
        opc opcVarD3 = ope.D();
        for (mbr mbrVar : this.f) {
            if (set.contains(mbrVar)) {
                if (mbrVar.a() <= 0) {
                    lis lisVar = this.b;
                    String strValueOf = String.valueOf(mbrVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 47);
                    sb.append("Refusing to publish ");
                    sb.append(strValueOf);
                    sb.append(" because the file is empty.");
                    lisVar.d(sb.toString());
                    mce mceVarK = mbrVar.k();
                    if (mceVarK != null) {
                        opcVarD3.d(mceVarK);
                    }
                } else {
                    mam mamVarJ = mbrVar.j();
                    if (mbrVar == this.k) {
                        mawVar.e = mamVarJ;
                    }
                    opcVarD.d(mamVarJ);
                }
            } else if (!set2.contains(mbrVar)) {
                mce mceVarK2 = mbrVar.k();
                if (mceVarK2 != null) {
                    opcVarD3.d(mceVarK2);
                }
            } else if (mbrVar.a() <= 0) {
                lis lisVar2 = this.b;
                String strValueOf2 = String.valueOf(mbrVar);
                StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 47);
                sb2.append("Refusing to publish ");
                sb2.append(strValueOf2);
                sb2.append(" because the file is empty.");
                lisVar2.d(sb2.toString());
                mce mceVarK3 = mbrVar.k();
                if (mceVarK3 != null) {
                    opcVarD3.d(mceVarK3);
                }
            } else {
                mam mamVarJ2 = mbrVar.j();
                if (mbrVar == this.k) {
                    mawVar.e = mamVarJ2;
                }
                opcVarD2.d(mamVarJ2);
            }
        }
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            mce mceVarK4 = ((mbr) it.next()).k();
            if (mceVarK4 != null) {
                opcVarD3.d(mceVarK4);
            }
        }
        ope opeVarF = opcVarD.f();
        if (opeVarF == null) {
            throw new NullPointerException("Null mediaFiles");
        }
        mawVar.f = opeVarF;
        ope opeVarF2 = opcVarD2.f();
        if (opeVarF2 == null) {
            throw new NullPointerException("Null privateMediaFiles");
        }
        mawVar.g = opeVarF2;
        ope opeVarF3 = opcVarD3.f();
        if (opeVarF3 == null) {
            throw new NullPointerException("Null cachedFiles");
        }
        mawVar.h = opeVarF3;
        mawVar.a(this.n);
        mawVar.b(this.q);
        matVar = mawVar.a;
        if (matVar != null && (l = mawVar.b) != null && mawVar.c != null && mawVar.d != null && mawVar.f != null && mawVar.g != null && mawVar.h != null && mawVar.k != 0 && mawVar.i != null && mawVar.j != null) {
        }
        StringBuilder sb3 = new StringBuilder();
        if (mawVar.a == null) {
            sb3.append(" mediaGroupId");
        }
        if (mawVar.b == null) {
            sb3.append(" timestampNs");
        }
        if (mawVar.c == null) {
            sb3.append(" utcTimestampMs");
        }
        if (mawVar.d == null) {
            sb3.append(" tag");
        }
        if (mawVar.f == null) {
            sb3.append(" mediaFiles");
        }
        if (mawVar.g == null) {
            sb3.append(" privateMediaFiles");
        }
        if (mawVar.h == null) {
            sb3.append(" cachedFiles");
        }
        if (mawVar.k == 0) {
            sb3.append(" publishIntent");
        }
        if (mawVar.i == null) {
            sb3.append(" listeners");
        }
        if (mawVar.j == null) {
            sb3.append(" contentResolverApi");
        }
        String strValueOf3 = String.valueOf(sb3);
        StringBuilder sb4 = new StringBuilder(String.valueOf(strValueOf3).length() + 28);
        sb4.append("Missing required properties:");
        sb4.append(strValueOf3);
        throw new IllegalStateException(sb4.toString());
        return new max(matVar, l.longValue(), mawVar.c.longValue(), mawVar.d, mawVar.e, mawVar.f, mawVar.g, mawVar.h, mawVar.k, mawVar.i, mawVar.j);
    }

    @Override // defpackage.mbq
    public final synchronized void d(mbr mbrVar) {
        this.g.add(mbrVar);
        h();
    }

    @Override // defpackage.mbq
    public final synchronized void e(mbr mbrVar) {
        this.f.add(mbrVar);
        h();
    }

    public final synchronized void f() {
        HashSet hashSetB = obr.B();
        Set set = this.h;
        set.getClass();
        hashSetB.addAll(set);
        Set set2 = this.i;
        set2.getClass();
        hashSetB.addAll(set2);
        Set set3 = this.j;
        set3.getClass();
        hashSetB.addAll(set3);
        hashSetB.removeAll(this.f);
        hashSetB.removeAll(this.g);
        lis lisVar = this.b;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[4];
        maw mawVar = this.l;
        mawVar.getClass();
        mat matVar = mawVar.a;
        if (matVar == null) {
            throw new IllegalStateException("Property \"mediaGroupId\" has not been set");
        }
        objArr[0] = matVar;
        objArr[1] = Long.valueOf(this.e.r);
        objArr[2] = Integer.valueOf(hashSetB.size());
        objArr[3] = hashSetB;
        lisVar.h(String.format(locale, "Failed to publish MediaGroup-%s after %s ms. Forcibly publishing, and ignoring %s files that are neither published nor abandoned: %s.", objArr));
        oom oomVar = this.n;
        int i = ((orr) oomVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            ((mar) oomVar.get(i2)).d();
        }
        this.o = true;
        h();
    }
}
