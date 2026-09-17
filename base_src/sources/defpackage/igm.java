package defpackage;

import com.google.babelfish.device.avenh.l2l.speechenhancer2.jni.SpeechEnhancerJniWrapperRealtime;

/* JADX INFO: loaded from: classes2.dex */
final class igm implements phh {
    final /* synthetic */ lji a;
    final /* synthetic */ igq b;

    public igm(igq igqVar, lji ljiVar) {
        this.b = igqVar;
        this.a = ljiVar;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
        this.a.a();
        throw new okf(th, null);
    }

    @Override // defpackage.phh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.a.a();
        igq.j(new Runnable() { // from class: igl
            @Override // java.lang.Runnable
            public final void run() {
                igm igmVar = this.a;
                igmVar.b.g.e("SEController#warmupModel");
                SpeechEnhancerJniWrapperRealtime.modelWarmup(igmVar.b.j);
                igmVar.b.g.f();
            }
        }, this.b.e);
        synchronized (this.b.f) {
            this.b.i = igp.PREINITIALIZED;
        }
    }
}
