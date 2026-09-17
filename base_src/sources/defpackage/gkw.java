package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class gkw implements glc, lie {
    public final Executor a;
    public final jtx c;
    public final hnm d;
    public final ljf e;
    private final hoh f;
    private final AtomicBoolean h = new AtomicBoolean(false);
    private final lda g = new lce(2);
    public final hjf b = new hjd();
    private final gjw i = new gjw(2);

    public gkw(Executor executor, jtx jtxVar, hnm hnmVar, hoh hohVar, ljf ljfVar) {
        this.a = executor;
        this.c = jtxVar;
        this.d = hnmVar;
        this.f = hohVar;
        this.e = ljfVar;
    }

    @Override // defpackage.glb
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final pht a(hin hinVar) {
        if (hinVar.a.a() != 35) {
            hinVar.a.close();
            return plk.U(new llv("Only YUV_420_888 images are supported"));
        }
        hoh hohVar = this.f;
        lwd lwdVar = hinVar.g;
        lwdVar.getClass();
        if (hohVar.e(lwdVar)) {
            hoh.g(hinVar.a, hinVar.b);
        }
        return this.i.a(new gku(this, hinVar));
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        if (this.h.compareAndSet(false, true)) {
            this.i.close();
            this.g.fB(0);
        }
    }
}
