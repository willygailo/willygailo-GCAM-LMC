package defpackage;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class haw extends hbd {
    private final hbb a;
    private final ljf b;

    public haw(hen henVar, hbb hbbVar, ljf ljfVar, gyg gygVar, Set set, goy goyVar) {
        super(henVar, goyVar, set, ljfVar, gygVar);
        this.a = hbbVar;
        this.b = ljfVar;
    }

    @Override // defpackage.hbd, defpackage.goy
    public final void c(gox goxVar, gog gogVar) {
        this.b.e("pckHdrZsl#captureImage");
        super.c(goxVar, gogVar);
        this.b.f();
    }

    @Override // defpackage.hbd
    protected final boolean d(List list, gox goxVar, gog gogVar) {
        this.b.e("pckHdrZsl#process");
        this.a.g(list, goxVar, gogVar);
        this.b.f();
        return true;
    }
}
