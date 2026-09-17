package defpackage;

import com.google.vr.cardboard.ExternalSurfaceManager;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pwb implements pwh {
    public final /* synthetic */ ExternalSurfaceManager a;
    private final /* synthetic */ int b;

    public /* synthetic */ pwb(ExternalSurfaceManager externalSurfaceManager, int i) {
        this.b = i;
        this.a = externalSurfaceManager;
    }

    @Override // defpackage.pwh
    public final void a(pwf pwfVar) {
        switch (this.b) {
            case 0:
                pwc pwcVar = this.a.a;
                if (pwfVar.i && pwfVar.d.get() > 0) {
                    pwfVar.d.decrementAndGet();
                    pwfVar.g.updateTexImage();
                    pwfVar.g.getTransformMatrix(pwfVar.c);
                    pwcVar.a(pwfVar.a, pwfVar.f[0], pwfVar.g.getTimestamp(), pwfVar.c);
                }
                break;
            default:
                pwc pwcVar2 = this.a.a;
                if (pwfVar.i && pwfVar.d.getAndSet(0) > 0) {
                    pwfVar.g.updateTexImage();
                    pwfVar.g.getTransformMatrix(pwfVar.c);
                    pwcVar2.a(pwfVar.a, pwfVar.f[0], pwfVar.g.getTimestamp(), pwfVar.c);
                }
                break;
        }
    }
}
