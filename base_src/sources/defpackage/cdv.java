package defpackage;

import com.google.android.apps.camera.brella.examplestore.beholder.BeholderExampleStoreDataTtlService;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class cdv implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final qkg e;
    private final qkg f;
    private final qkg g;
    private final qkg h;

    public cdv(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.e = qkgVar5;
        this.f = qkgVar6;
        this.g = qkgVar7;
        this.h = qkgVar8;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cdu get() {
        return new cdu(((emd) this.a).get(), (Executor) this.b.get(), (ddf) this.c.get(), ((cbj) this.d).get(), (lda) this.e.get(), (lar) this.f.get(), ((etf) this.g).get(), ((cbf) this.h).get(), new BeholderExampleStoreDataTtlService());
    }
}
