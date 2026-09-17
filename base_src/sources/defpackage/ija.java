package defpackage;

import com.google.android.apps.camera.stats.Instrumentation;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ija implements ijn {
    public final /* synthetic */ mcu a;
    public final /* synthetic */ Instrumentation b;
    private final /* synthetic */ int c;

    public /* synthetic */ ija(Instrumentation instrumentation, mcu mcuVar, int i) {
        this.c = i;
        this.b = instrumentation;
        this.a = mcuVar;
    }

    @Override // defpackage.ijn
    public final Object a() {
        switch (this.c) {
            case 0:
                Instrumentation instrumentation = this.b;
                ijy ijyVar = new ijy(this.a);
                instrumentation.f(ijyVar);
                return ijyVar;
            case 1:
                Instrumentation instrumentation2 = this.b;
                ijs ijsVar = new ijs(this.a, ijh.values());
                instrumentation2.f(ijsVar);
                return ijsVar;
            case 2:
                Instrumentation instrumentation3 = this.b;
                ijs ijsVar2 = new ijs(this.a, iji.values());
                instrumentation3.f(ijsVar2);
                return ijsVar2;
            case 3:
                Instrumentation instrumentation4 = this.b;
                iju ijuVar = new iju(this.a);
                instrumentation4.f(ijuVar);
                return ijuVar;
            case 4:
                Instrumentation instrumentation5 = this.b;
                ijw ijwVar = new ijw(this.a);
                instrumentation5.f(ijwVar);
                return ijwVar;
            default:
                Instrumentation instrumentation6 = this.b;
                ijs ijsVar3 = new ijs(this.a, ijz.values());
                instrumentation6.f(ijsVar3);
                return ijsVar3;
        }
    }
}
