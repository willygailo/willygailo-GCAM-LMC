package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class got implements goy {
    public final hsl a;
    private final goy b;

    public got(goy goyVar, hsl hslVar) {
        this.b = goyVar;
        this.a = hslVar;
    }

    @Override // defpackage.goy
    public final lco a() {
        return this.b.a();
    }

    @Override // defpackage.goy
    public final lco b() {
        return this.b.b();
    }

    @Override // defpackage.goy
    public final void c(gox goxVar, gog gogVar) throws llv {
        final hsa hsaVar = gogVar.b;
        try {
            hsl hslVar = this.a;
            synchronized (hslVar) {
                if (hslVar.c) {
                    throw new IllegalStateException("Attempting to add shot after pipeline was shutdown!");
                }
                if (hslVar.b.isEmpty()) {
                    hslVar.a.e("#notifyPipelineResumed");
                    Iterator it = hslVar.a().iterator();
                    while (it.hasNext()) {
                        ((hsk) it.next()).c();
                    }
                    hslVar.a.f();
                }
                hslVar.b.add(hsaVar);
            }
            hsaVar.p().d(new Runnable() { // from class: gos
                @Override // java.lang.Runnable
                public final void run() {
                    boolean z;
                    boolean z2;
                    got gotVar = this.a;
                    hsa hsaVar2 = hsaVar;
                    hsl hslVar2 = gotVar.a;
                    synchronized (hslVar2) {
                        boolean zRemove = hslVar2.b.remove(hsaVar2);
                        z = true;
                        z2 = zRemove && hslVar2.b.isEmpty();
                        if (!zRemove || !hslVar2.d()) {
                            z = false;
                        }
                    }
                    if (z2) {
                        hslVar2.a.e("#notifyPipelinePaused");
                        Iterator it2 = hslVar2.a().iterator();
                        while (it2.hasNext()) {
                            ((hsk) it2.next()).b();
                        }
                        hslVar2.a.f();
                    }
                    if (z) {
                        hslVar2.c();
                    }
                }
            }, pgr.INSTANCE);
            this.b.c(goxVar, gogVar);
        } catch (IllegalStateException e) {
            throw new llv("ShotPipeline not available", e);
        }
    }

    public final String toString() {
        ojb ojbVarAZ = obr.aZ(this);
        ojbVarAZ.b("delegate", this.b);
        return ojbVarAZ.toString();
    }
}
