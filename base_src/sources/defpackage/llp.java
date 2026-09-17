package defpackage;

import android.hardware.camera2.CameraManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class llp implements lkd {
    public llm b;
    private final lld d;
    private final llt e;
    private final Executor f;
    private final ljp g;
    private final ljf h;
    private final lis i;
    private final lle j;
    private final dkc k;
    private final mbg l;
    public final Object a = new Object();
    public final List c = new ArrayList();

    public llp(mbg mbgVar, dkc dkcVar, lld lldVar, Executor executor, llt lltVar, ljp ljpVar, ljf ljfVar, lis lisVar, lle lleVar, byte[] bArr) {
        this.l = mbgVar;
        this.k = dkcVar;
        this.d = lldVar;
        this.e = lltVar;
        this.f = executor;
        this.g = ljpVar;
        this.h = ljfVar;
        this.i = lisVar.a("VirtualCameraMgr");
        this.j = lleVar;
    }

    private final void f(lvs lvsVar, lkc lkcVar) {
        boolean zA;
        synchronized (this.a) {
            llm llmVar = this.b;
            if (llmVar != null) {
                if (llmVar.a.equals(lvsVar)) {
                    if (lkcVar != null) {
                        lis lisVar = this.i;
                        String strValueOf = String.valueOf(llmVar);
                        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 46);
                        sb.append("Attaching listener to existing CameraSession: ");
                        sb.append(strValueOf);
                        lisVar.b(sb.toString());
                        llmVar.e(lkcVar);
                    } else {
                        lis lisVar2 = this.i;
                        String strValueOf2 = String.valueOf(llmVar);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 39);
                        sb2.append("Has existing CameraSession. Noop Open: ");
                        sb2.append(strValueOf2);
                        lisVar2.b(sb2.toString());
                    }
                    return;
                }
                this.c.add(llmVar);
                llmVar.f();
                this.b = null;
            }
            lld lldVar = this.d;
            synchronized (lldVar.b) {
                zA = lldVar.d.a();
            }
            if (zA) {
                if (lkcVar != null) {
                    this.f.execute(new lli(lkcVar, 1));
                }
                this.i.b("WakeLock is yet to be acquired. Cannot open.");
                return;
            }
            mbg mbgVar = this.l;
            String str = lvsVar.a;
            Handler handler = (Handler) mbgVar.e.get();
            handler.getClass();
            Executor executor = (Executor) mbgVar.a.get();
            executor.getClass();
            CameraManager cameraManager = ((emu) mbgVar.c).get();
            lkm lkmVar = (lkm) mbgVar.d.get();
            lkmVar.getClass();
            ljf ljfVar = (ljf) mbgVar.b.get();
            ljfVar.getClass();
            str.getClass();
            llm llmVar2 = new llm(lvsVar, this, new lkj(handler, executor, cameraManager, lkmVar, ljfVar, str), this.e, this.f, this.g, this.i, this.h, this.j, this.d.a());
            synchronized (llmVar2) {
                if (!llmVar2.g && !llmVar2.e && !llmVar2.f) {
                    llmVar2.g = true;
                    lis lisVar3 = llmVar2.d;
                    String strValueOf3 = String.valueOf(llmVar2);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(strValueOf3).length() + 8);
                    sb3.append(strValueOf3);
                    sb3.append(" Opening");
                    lisVar3.b(sb3.toString());
                    llmVar2.b.e(llmVar2);
                    lke lkeVar = llmVar2.c;
                    synchronized (((lkj) lkeVar).g) {
                        if (!((lkj) lkeVar).k && !((lkj) lkeVar).l) {
                            ((lkj) lkeVar).k = true;
                            Executor executor2 = ((lkj) lkeVar).d;
                            final lkj lkjVar = (lkj) lkeVar;
                            executor2.execute(new Runnable() { // from class: lkf
                                /* JADX WARN: Code restructure failed: missing block: B:86:0x016a, code lost:
                                
                                    r4 = android.os.SystemClock.elapsedRealtime();
                                    r12.a();
                                    r7 = new defpackage.lky();
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:87:0x0176, code lost:
                                
                                    r0 = r3;
                                    r16 = r4;
                                    r5 = true;
                                    r12 = 2;
                                    r15 = 1;
                                 */
                                @Override // java.lang.Runnable
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct add '--show-bad-code' argument
                                */
                                public final void run() {
                                    /*
                                        Method dump skipped, instruction units count: 459
                                        To view this dump add '--comments-level debug' option
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: defpackage.lkf.run():void");
                                }
                            });
                        }
                    }
                }
            }
            if (lkcVar != null) {
                llmVar2.e(lkcVar);
            }
            this.b = llmVar2;
            this.k.a(lvsVar);
        }
    }

    @Override // defpackage.lkd
    public final void a() {
        synchronized (this.a) {
            llm llmVar = this.b;
            if (llmVar != null) {
                this.c.add(llmVar);
                this.b = null;
            }
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((llm) it.next()).f();
            }
        }
    }

    @Override // defpackage.lkd
    public final void b() {
        oom oomVarJ;
        synchronized (this.a) {
            llm llmVar = this.b;
            if (llmVar != null) {
                this.c.add(llmVar);
                this.b = null;
            }
        }
        do {
            synchronized (this.a) {
                oomVarJ = oom.j(this.c);
            }
            int size = oomVarJ.size();
            for (int i = 0; i < size; i++) {
                llm llmVar2 = (llm) oomVarJ.get(i);
                try {
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    llmVar2.f();
                    lke lkeVar = llmVar2.c;
                    synchronized (((lkj) lkeVar).g) {
                        try {
                            if (((lkj) lkeVar).k) {
                                ((lkj) lkeVar).j.await(1500L, timeUnit);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    llmVar2.b.b.await(1500L, timeUnit);
                } catch (InterruptedException e) {
                    lis lisVar = this.i;
                    String strValueOf = String.valueOf(llmVar2);
                    StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 40);
                    sb.append("Warning: Failed to synchronously close ");
                    sb.append(strValueOf);
                    sb.append(".");
                    lisVar.i(sb.toString(), e);
                }
            }
        } while (!oomVarJ.isEmpty());
    }

    @Override // defpackage.lkd
    public final void c(lvs lvsVar, lkc lkcVar) {
        f(lvsVar, lkcVar);
    }

    @Override // defpackage.lkd
    public final void d(lvs lvsVar) {
        f(lvsVar, null);
    }

    public final void e(llm llmVar) {
        synchronized (this.a) {
            if (this.b == llmVar) {
                this.b = null;
            }
            if (!this.c.contains(llmVar)) {
                this.c.add(llmVar);
            }
        }
    }
}
