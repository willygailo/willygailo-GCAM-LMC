package defpackage;

import com.google.android.apps.camera.rectiface.Rectiface$RectifaceProgressCallback;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ecr implements Rectiface$RectifaceProgressCallback {
    public final /* synthetic */ ecq a;
    private final /* synthetic */ int b;

    public /* synthetic */ ecr(ecq ecqVar, int i) {
        this.b = i;
        this.a = ecqVar;
    }

    @Override // com.google.android.apps.camera.rectiface.Rectiface$RectifaceProgressCallback
    public final void update(float f) {
        switch (this.b) {
            case 0:
                ecq ecqVar = this.a;
                int i = ecs.k;
                ecqVar.k.d.a(ecs.a, f);
                break;
            default:
                ecq ecqVar2 = this.a;
                int i2 = ecs.k;
                ecqVar2.k.d.a(ecs.a, f);
                break;
        }
    }
}
