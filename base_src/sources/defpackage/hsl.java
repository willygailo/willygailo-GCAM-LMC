package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class hsl {
    public final ljf a;
    public final HashSet b;
    public boolean c;
    private final List d;

    public hsl() {
        this(new ljd());
    }

    public hsl(ljf ljfVar) {
        this.b = new HashSet();
        this.c = false;
        this.d = new ArrayList();
        this.a = ljfVar;
    }

    public final List a() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.d);
        }
        return arrayList;
    }

    public final void b(hsk hskVar) {
        boolean zD;
        synchronized (this) {
            this.d.add(hskVar);
            zD = d();
        }
        if (zD) {
            c();
        }
    }

    public final void c() {
        ArrayList arrayList;
        this.a.e("#notifyPipelineFinished");
        synchronized (this) {
            arrayList = new ArrayList(this.d);
            this.d.clear();
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((hsk) arrayList.get(i)).a();
        }
        this.a.f();
    }

    public final boolean d() {
        return this.c && this.b.isEmpty();
    }
}
