package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Process;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class mzv implements mxo {
    public final Application a;
    public final phw b;
    public final muz c;
    public final pyn d;
    public final mxl e;
    public final mzz f;
    private final boolean g;
    private final mzu h;

    public mzv() {
    }

    public mzv(mxm mxmVar, Context context, mzu mzuVar, phw phwVar, pyn pynVar, mzz mzzVar, muz muzVar, qkg qkgVar, Executor executor, ojc ojcVar) {
        this();
        new AtomicReference(mzn.a);
        new ConcurrentHashMap();
        this.h = mzuVar;
        this.c = muzVar;
        this.e = mxmVar.a(executor, pynVar, qkgVar);
        this.a = (Application) context;
        this.b = phwVar;
        this.d = pynVar;
        this.f = mzzVar;
        this.g = ((Boolean) ojcVar.e(Boolean.FALSE)).booleanValue();
    }

    public final void a() {
        this.h.a = new mzt() { // from class: mzw
            @Override // defpackage.mzt
            public final void a(final int i, final String str) {
                final mzv mzvVar = this.a;
                if (mzvVar.c.b) {
                    plk.T();
                } else {
                    plk.aa(new pgj() { // from class: mzx
                        @Override // defpackage.pgj
                        public final pht a() {
                            mzv mzvVar2 = mzvVar;
                            int i2 = i;
                            String str2 = str;
                            mzm mzmVar = (mzm) mzvVar2.d.get();
                            long j = mzmVar.f == 3 ? 1000L : -1L;
                            if (j == -1) {
                                return phq.a;
                            }
                            if (mzmVar.c) {
                                System.gc();
                                System.runFinalization();
                                System.gc();
                            }
                            ojc ojcVar = mzmVar.b;
                            if (!mzmVar.a) {
                                poy poyVarM = qyk.t.m();
                                qxi qxiVarB = mzvVar2.f.b(i2, Process.myPid(), null, str2);
                                if (poyVarM.c) {
                                    poyVarM.m();
                                    poyVarM.c = false;
                                }
                                qyk qykVar = (qyk) poyVarM.b;
                                qxiVarB.getClass();
                                qykVar.b = qxiVarB;
                                qykVar.a |= 1;
                                qyk qykVar2 = (qyk) poyVarM.j();
                                mxf mxfVarA = mxg.a();
                                mxfVarA.a = null;
                                mxfVarA.b(true);
                                mxfVarA.d = Long.valueOf(j);
                                mxfVarA.d(qykVar2);
                                mxfVarA.b = null;
                                mxfVarA.c(true);
                                return mzvVar2.e.b(mxfVarA.a());
                            }
                            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = mwh.a(mzvVar2.a).getRunningAppProcesses();
                            if (runningAppProcesses == null) {
                                return phq.a;
                            }
                            ArrayList arrayList = new ArrayList(runningAppProcesses.size());
                            mzvVar2.a.getPackageName();
                            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                                poy poyVarM2 = qyk.t.m();
                                qxi qxiVarB2 = mzvVar2.f.b(i2, runningAppProcessInfo.pid, runningAppProcessInfo.processName, str2);
                                if (poyVarM2.c) {
                                    poyVarM2.m();
                                    poyVarM2.c = false;
                                }
                                qyk qykVar3 = (qyk) poyVarM2.b;
                                qxiVarB2.getClass();
                                qykVar3.b = qxiVarB2;
                                qykVar3.a |= 1;
                                qyk qykVar4 = (qyk) poyVarM2.j();
                                mxf mxfVarA2 = mxg.a();
                                mxfVarA2.a = null;
                                mxfVarA2.b(true);
                                mxfVarA2.d = Long.valueOf(j);
                                mxfVarA2.d(qykVar4);
                                mxfVarA2.b = null;
                                mxfVarA2.c(true);
                                arrayList.add(mzvVar2.e.b(mxfVarA2.a()));
                            }
                            return plk.Q(arrayList).a(plk.ah(), pgr.INSTANCE);
                        }
                    }, mzvVar.b);
                }
            }
        };
    }

    @Override // defpackage.mxo
    public final void t() {
        if (this.g) {
            a();
        }
    }
}
