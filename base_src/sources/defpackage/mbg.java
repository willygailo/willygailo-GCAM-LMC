package defpackage;

import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class mbg {
    public final qkg a;
    public final qkg b;
    public final qkg c;
    public final qkg d;
    public final qkg e;

    public mbg(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5) {
        qkgVar.getClass();
        this.a = qkgVar;
        qkgVar2.getClass();
        this.b = qkgVar2;
        qkgVar3.getClass();
        this.c = qkgVar3;
        qkgVar4.getClass();
        this.d = qkgVar4;
        qkgVar5.getClass();
        this.e = qkgVar5;
    }

    public mbg(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, byte[] bArr) {
        qkgVar.getClass();
        this.e = qkgVar;
        qkgVar2.getClass();
        this.a = qkgVar2;
        qkgVar3.getClass();
        this.c = qkgVar3;
        qkgVar4.getClass();
        this.d = qkgVar4;
        qkgVar5.getClass();
        this.b = qkgVar5;
    }

    public mbg(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, byte[] bArr, byte[] bArr2) {
        qkgVar.getClass();
        this.c = qkgVar;
        qkgVar2.getClass();
        this.b = qkgVar2;
        qkgVar3.getClass();
        this.d = qkgVar3;
        qkgVar4.getClass();
        this.a = qkgVar4;
        qkgVar5.getClass();
        this.e = qkgVar5;
    }

    public mbg(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        qkgVar.getClass();
        this.c = qkgVar;
        qkgVar2.getClass();
        this.e = qkgVar2;
        qkgVar3.getClass();
        this.d = qkgVar3;
        qkgVar4.getClass();
        this.b = qkgVar4;
        qkgVar5.getClass();
        this.a = qkgVar5;
    }

    public mbg(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, byte[] bArr, char[] cArr) {
        qkgVar.getClass();
        this.e = qkgVar;
        qkgVar2.getClass();
        this.b = qkgVar2;
        qkgVar3.getClass();
        this.a = qkgVar3;
        qkgVar4.getClass();
        this.d = qkgVar4;
        qkgVar5.getClass();
        this.c = qkgVar5;
    }

    public mbg(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, char[] cArr) {
        qkgVar.getClass();
        this.b = qkgVar;
        qkgVar2.getClass();
        this.d = qkgVar2;
        qkgVar3.getClass();
        this.e = qkgVar3;
        qkgVar4.getClass();
        this.c = qkgVar4;
        qkgVar5.getClass();
        this.a = qkgVar5;
    }

    public mbg(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, char[] cArr, byte[] bArr) {
        qkgVar.getClass();
        this.d = qkgVar;
        qkgVar2.getClass();
        this.b = qkgVar2;
        qkgVar3.getClass();
        this.e = qkgVar3;
        qkgVar4.getClass();
        this.c = qkgVar4;
        qkgVar5.getClass();
        this.a = qkgVar5;
    }

    public mbg(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, short[] sArr) {
        qkgVar.getClass();
        this.a = qkgVar;
        qkgVar2.getClass();
        this.b = qkgVar2;
        qkgVar3.getClass();
        this.c = qkgVar3;
        qkgVar4.getClass();
        this.d = qkgVar4;
        qkgVar5.getClass();
        this.e = qkgVar5;
    }

    public final jwq a(Set set) {
        set.getClass();
        ddf ddfVar = (ddf) this.b.get();
        ddfVar.getClass();
        ljf ljfVar = (ljf) this.d.get();
        ljfVar.getClass();
        Executor executor = (Executor) this.e.get();
        executor.getClass();
        CameraActivityTiming cameraActivityTiming = (CameraActivityTiming) this.c.get();
        cameraActivityTiming.getClass();
        cvo cvoVar = (cvo) this.a.get();
        cvoVar.getClass();
        return new jwq(set, ddfVar, ljfVar, executor, cameraActivityTiming, cvoVar);
    }

    public final gza b(int i) {
        lnc lncVar = (lnc) this.e.get();
        lncVar.getClass();
        Map map = (Map) this.b.get();
        map.getClass();
        lco lcoVar = (lco) this.a.get();
        lcoVar.getClass();
        lap lapVar = (lap) this.d.get();
        lapVar.getClass();
        Executor executor = (Executor) this.c.get();
        executor.getClass();
        return new gza(lncVar, map, lcoVar, lapVar, executor, i);
    }

    public final /* synthetic */ bni c(bmq bmqVar) {
        jrr jrrVarA = ((jrs) this.c).get();
        jcf jcfVar = (jcf) this.e.get();
        jcfVar.getClass();
        lco lcoVar = (lco) this.d.get();
        lcoVar.getClass();
        fjs fjsVar = (fjs) this.b.get();
        fjsVar.getClass();
        ddf ddfVar = (ddf) this.a.get();
        ddfVar.getClass();
        return new bnk(jrrVarA, jcfVar, lcoVar, fjsVar, ddfVar, bmqVar);
    }
}
