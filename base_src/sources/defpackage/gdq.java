package defpackage;

import android.opengl.EGLExt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gdq implements mlu {
    public final /* synthetic */ long a;
    private final /* synthetic */ int b;

    public /* synthetic */ gdq(long j, int i) {
        this.b = i;
        this.a = j;
    }

    @Override // defpackage.mlu
    public final Object a(Object obj) {
        switch (this.b) {
            case 0:
                mqq mqqVar = (mqq) obj;
                EGLExt.eglPresentationTimeANDROID(mqqVar.f(), mqqVar.g(), this.a);
                return true;
            case 1:
                long j = this.a;
                mqq mqqVar2 = (mqq) obj;
                ouj oujVar = eot.a;
                EGLExt.eglPresentationTimeANDROID(mqqVar2.f(), mqqVar2.g(), j);
                return true;
            case 2:
                long j2 = this.a;
                mqq mqqVar3 = (mqq) obj;
                mqqVar3.i();
                EGLExt.eglPresentationTimeANDROID(mqqVar3.f(), mqqVar3.g(), j2);
                mqqVar3.k();
                return true;
            default:
                mqq mqqVar4 = (mqq) obj;
                EGLExt.eglPresentationTimeANDROID(mqqVar4.f(), mqqVar4.g(), this.a);
                return mlt.a;
        }
    }
}
