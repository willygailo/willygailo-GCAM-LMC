package defpackage;

import com.google.lens.sdk.LensApi;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jcr implements Runnable {
    public final /* synthetic */ jcw a;
    private final /* synthetic */ int b;

    public /* synthetic */ jcr(jcw jcwVar, int i) {
        this.b = i;
        this.a = jcwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                jcw jcwVar = this.a;
                jcwVar.d().launchLensActivity(jcwVar.b, new LensApi.LensLaunchStatusCallback() { // from class: jcq
                    @Override // com.google.lens.sdk.LensApi.LensLaunchStatusCallback
                    public final void onLaunchStatusFetched(int i) {
                        if (i == 0) {
                            System.currentTimeMillis();
                        }
                    }
                });
                break;
            default:
                final jcw jcwVar2 = this.a;
                System.currentTimeMillis();
                final int i = 0;
                jcwVar2.d().checkLensAvailability(new LensApi.LensAvailabilityCallback() { // from class: jco
                    @Override // com.google.lens.sdk.LensApi.LensAvailabilityCallback
                    public final void onAvailabilityStatusFetched(int i2) {
                        switch (i) {
                            case 0:
                                jcw jcwVar3 = jcwVar2;
                                System.currentTimeMillis();
                                jcwVar3.d.o(Boolean.valueOf(i2 == 0));
                                break;
                            default:
                                jcw jcwVar4 = jcwVar2;
                                if (i2 != 0) {
                                    jcwVar4.e.o(jch.a().a());
                                } else {
                                    jcg jcgVarA = jch.a();
                                    jcgVarA.b(1 == (jcwVar4.d().a().a & 1));
                                    jcgVarA.c((jcwVar4.d().a().a & 4) != 0);
                                    jcgVarA.d(jcwVar4.d().f());
                                    kcp kcpVar = jcwVar4.d().a().b;
                                    if (kcpVar == null) {
                                        kcpVar = kcp.b;
                                    }
                                    jcgVarA.e(oom.j(kcpVar.a));
                                    jcwVar4.e.o(jcgVarA.a());
                                }
                                break;
                        }
                    }
                });
                final int i2 = 1;
                jcwVar2.d().checkPostCaptureAvailability(new LensApi.LensAvailabilityCallback() { // from class: jco
                    @Override // com.google.lens.sdk.LensApi.LensAvailabilityCallback
                    public final void onAvailabilityStatusFetched(int i3) {
                        switch (i2) {
                            case 0:
                                jcw jcwVar3 = jcwVar2;
                                System.currentTimeMillis();
                                jcwVar3.d.o(Boolean.valueOf(i3 == 0));
                                break;
                            default:
                                jcw jcwVar4 = jcwVar2;
                                if (i3 != 0) {
                                    jcwVar4.e.o(jch.a().a());
                                } else {
                                    jcg jcgVarA = jch.a();
                                    jcgVarA.b(1 == (jcwVar4.d().a().a & 1));
                                    jcgVarA.c((jcwVar4.d().a().a & 4) != 0);
                                    jcgVarA.d(jcwVar4.d().f());
                                    kcp kcpVar = jcwVar4.d().a().b;
                                    if (kcpVar == null) {
                                        kcpVar = kcp.b;
                                    }
                                    jcgVarA.e(oom.j(kcpVar.a));
                                    jcwVar4.e.o(jcgVarA.a());
                                }
                                break;
                        }
                    }
                });
                plk.P(jcwVar2.d, jcwVar2.e).a(new jct(jcwVar2), jcwVar2.c);
                break;
        }
    }
}
