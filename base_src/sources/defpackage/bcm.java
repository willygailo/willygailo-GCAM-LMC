package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class bcm implements bbh, bab {
    private final bbg a;
    private final bbi b;
    private int c;
    private int d = -1;
    private azp e;
    private List f;
    private int g;
    private volatile bff h;
    private File i;
    private bcn j;

    public bcm(bbi bbiVar, bbg bbgVar) {
        this.b = bbiVar;
        this.a = bbgVar;
    }

    private final boolean d() {
        return this.g < this.f.size();
    }

    @Override // defpackage.bbh
    public final void a() {
        bff bffVar = this.h;
        if (bffVar != null) {
            bffVar.c.fu();
        }
    }

    @Override // defpackage.bab
    public final void b(Object obj) {
        this.a.e(this.e, obj, this.h.c, 4, this.j);
    }

    @Override // defpackage.bbh
    public final boolean c() {
        List arrayList;
        List listE = this.b.e();
        boolean z = false;
        if (listE.isEmpty()) {
            return false;
        }
        bbi bbiVar = this.b;
        ayi ayiVar = bbiVar.c.c;
        Class<?> cls = bbiVar.d.getClass();
        Class cls2 = bbiVar.g;
        Class cls3 = bbiVar.j;
        bkk bkkVar = ayiVar.c;
        bmd bmdVar = (bmd) bkkVar.a.getAndSet(null);
        if (bmdVar == null) {
            bmdVar = new bmd(cls, cls2, cls3);
        } else {
            bmdVar.a(cls, cls2, cls3);
        }
        synchronized (bkkVar.b) {
            arrayList = (List) bkkVar.b.get(bmdVar);
        }
        bkkVar.a.set(bmdVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
            Iterator it = ayiVar.a.a(cls).iterator();
            while (it.hasNext()) {
                for (Class cls4 : ayiVar.b.b((Class) it.next(), cls2)) {
                    if (!ayiVar.h.q(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                        arrayList.add(cls4);
                    }
                }
            }
            bkk bkkVar2 = ayiVar.c;
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            synchronized (bkkVar2.b) {
                bkkVar2.b.put(new bmd(cls, cls2, cls3), listUnmodifiableList);
            }
        }
        if (arrayList.isEmpty()) {
            if (File.class.equals(this.b.j)) {
                return false;
            }
            String strValueOf = String.valueOf(this.b.d.getClass());
            String strValueOf2 = String.valueOf(this.b.j);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 38 + String.valueOf(strValueOf2).length());
            sb.append("Failed to find any load path from ");
            sb.append(strValueOf);
            sb.append(" to ");
            sb.append(strValueOf2);
            throw new IllegalStateException(sb.toString());
        }
        while (true) {
            if (this.f != null && d()) {
                this.h = null;
                while (!z && d()) {
                    List list = this.f;
                    int i = this.g;
                    this.g = i + 1;
                    bfg bfgVar = (bfg) list.get(i);
                    File file = this.i;
                    bbi bbiVar2 = this.b;
                    this.h = bfgVar.a(file, bbiVar2.e, bbiVar2.f, bbiVar2.h);
                    if (this.h != null && this.b.h(this.h.c.a())) {
                        this.h.c.f(this.b.n, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.d + 1;
            this.d = i2;
            if (i2 >= arrayList.size()) {
                int i3 = this.c + 1;
                this.c = i3;
                if (i3 >= listE.size()) {
                    return false;
                }
                this.d = 0;
            }
            azp azpVar = (azp) listE.get(this.c);
            Class cls5 = (Class) arrayList.get(this.d);
            azx azxVarA = this.b.a(cls5);
            bct bctVarC = this.b.c();
            bbi bbiVar3 = this.b;
            this.j = new bcn(bctVarC, azpVar, bbiVar3.m, bbiVar3.e, bbiVar3.f, azxVarA, cls5, bbiVar3.h);
            File fileA = this.b.d().a(this.j);
            this.i = fileA;
            if (fileA != null) {
                this.e = azpVar;
                this.f = this.b.g(fileA);
                this.g = 0;
            }
        }
    }

    @Override // defpackage.bab
    public final void e(Exception exc) {
        this.a.d(this.j, exc, this.h.c, 4);
    }
}
