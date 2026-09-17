package defpackage;

import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class gmy {
    public static final ouj a = ouj.h("com/google/android/apps/camera/one/lifecycle/CameraAsyncTaskRunner");
    public final Set b;
    public final ljf c;
    public final pih d;
    private final Executor e;

    public gmy(Set set, pih pihVar, Executor executor, ljf ljfVar) {
        this.b = set;
        this.c = ljfVar;
        this.d = pihVar;
        this.e = new ljl(executor, ljfVar, "CameraStarter");
    }

    public final pht a() {
        this.b.size();
        Collection.EL.stream(this.b).map(cgw.m).collect(Collectors.joining(","));
        ArrayList arrayList = new ArrayList();
        this.c.e("CameraStarter.start");
        for (final bvv bvvVar : this.b) {
            try {
                arrayList.add(pgb.h(bvvVar.fz(), new oiu() { // from class: gmw
                    @Override // defpackage.oiu
                    public final Object a(Object obj) {
                        Boolean bool = (Boolean) obj;
                        bvvVar.c();
                        bool.booleanValue();
                        return bool;
                    }
                }, pgr.INSTANCE));
            } catch (Throwable th) {
                ((oug) ((oug) ((oug) a.b()).h(th)).G((char) 2087)).o("Failed to run task");
                arrayList.add(plk.U(th));
            }
        }
        this.c.f();
        long jCount = Collection.EL.stream(arrayList).map(cgw.n).filter(bql.h).count();
        ljf ljfVar = this.c;
        StringBuilder sb = new StringBuilder(45);
        sb.append("CameraStarter.startAsync:");
        sb.append(jCount);
        final lji ljiVarA = ljfVar.a(sb.toString());
        pht phtVarH = pgb.h(plk.R(arrayList), new oiu() { // from class: gmx
            @Override // defpackage.oiu
            public final Object a(Object obj) {
                lji ljiVar = ljiVarA;
                boolean z = true;
                for (Boolean bool : (List) obj) {
                    boolean z2 = false;
                    if (bool != null && bool.booleanValue()) {
                        z2 = true;
                    }
                    z &= z2;
                }
                ljiVar.a();
                return Boolean.valueOf(z);
            }
        }, pgr.INSTANCE);
        mip.ca(phtVarH, new lht() { // from class: gmz
            @Override // defpackage.lht
            public final void a(Object obj) {
                this.a.d.o(bxg.h);
            }
        }, this.e);
        return phtVarH;
    }
}
