package defpackage;

import android.app.Activity;
import android.content.Context;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class nai extends naq implements mwa, mxo {
    public final mxl a;
    public final pyn b;
    private final phw c;
    private final Object d = new Object();
    private final ArrayList e = new ArrayList(0);
    private final AtomicInteger f = new AtomicInteger();

    public nai(mxm mxmVar, Context context, mwe mweVar, phw phwVar, pyn pynVar, pyn pynVar2, qkg qkgVar, Executor executor) {
        this.a = mxmVar.a(executor, pynVar, qkgVar);
        this.c = phwVar;
        this.b = pynVar2;
        mweVar.a(this);
    }

    public final pht a() {
        final nad[] nadVarArr;
        if (this.f.get() > 0) {
            return plk.X(new pgj() { // from class: nag
                @Override // defpackage.pgj
                public final pht a() {
                    return this.a.a();
                }
            }, 1L, TimeUnit.SECONDS, this.c);
        }
        synchronized (this.d) {
            if (this.e.isEmpty()) {
                nadVarArr = null;
            } else {
                ArrayList arrayList = this.e;
                nadVarArr = (nad[]) arrayList.toArray(new nad[arrayList.size()]);
                this.e.clear();
            }
        }
        return nadVarArr == null ? phq.a : plk.aa(new pgj() { // from class: nah
            @Override // defpackage.pgj
            public final pht a() {
                nai naiVar = this.a;
                nad[] nadVarArr2 = nadVarArr;
                mxl mxlVar = naiVar.a;
                mxf mxfVarA = mxg.a();
                nae naeVar = (nae) naiVar.b.get();
                poy poyVarM = qxk.b.m();
                if (nadVarArr2.length <= 0) {
                    poy poyVarM2 = qyk.t.m();
                    if (poyVarM2.c) {
                        poyVarM2.m();
                        poyVarM2.c = false;
                    }
                    qyk qykVar = (qyk) poyVarM2.b;
                    qxk qxkVar = (qxk) poyVarM.j();
                    qxkVar.getClass();
                    qykVar.f = qxkVar;
                    qykVar.a |= 32;
                    try {
                        ((mue) naeVar.b).get();
                    } catch (Exception e) {
                        ((oug) ((oug) ((oug) nae.a.c()).h(e)).G((char) 3644)).o("Exception while getting network metric extension!");
                    }
                    mxfVarA.d((qyk) poyVarM2.j());
                    return mxlVar.b(mxfVarA.a());
                }
                poy poyVarM3 = qxj.g.m();
                nad nadVar = nadVarArr2[0];
                int i = nadVar.d;
                int i2 = nadVar.c;
                long j = nadVar.b;
                long j2 = nadVar.a;
                int i3 = nadVar.g;
                if (poyVarM3.c) {
                    poyVarM3.m();
                    poyVarM3.c = false;
                }
                qxj qxjVar = (qxj) poyVarM3.b;
                qxjVar.a |= 32;
                qxjVar.b = 0;
                int i4 = nadVarArr2[0].j;
                poy poyVarM4 = qxl.c.m();
                int i5 = nadVarArr2[0].j;
                if (poyVarM4.c) {
                    poyVarM4.m();
                    poyVarM4.c = false;
                }
                qxl qxlVar = (qxl) poyVarM4.b;
                qxlVar.a |= 1;
                qxlVar.b = 0;
                qxl qxlVar2 = (qxl) poyVarM4.j();
                if (poyVarM3.c) {
                    poyVarM3.m();
                    poyVarM3.c = false;
                }
                qxj qxjVar2 = (qxj) poyVarM3.b;
                qxlVar2.getClass();
                qxjVar2.f = qxlVar2;
                qxjVar2.a |= 4194304;
                nad nadVar2 = nadVarArr2[0];
                String str = nadVar2.h;
                String str2 = nadVar2.f;
                if (!oje.d(null)) {
                    throw null;
                }
                if (poyVarM3.c) {
                    poyVarM3.m();
                    poyVarM3.c = false;
                }
                qxj qxjVar3 = (qxj) poyVarM3.b;
                qxjVar3.c = 0;
                qxjVar3.a |= 256;
                ((mue) naeVar.b).get();
                nad nadVar3 = nadVarArr2[0];
                String str3 = nadVar3.e;
                qxs qxsVar = nadVar3.i;
                throw null;
            }
        }, this.c);
    }

    @Override // defpackage.mwa
    public final void c(Activity activity) {
        a();
    }

    @Override // defpackage.mxo
    public final /* synthetic */ void t() {
    }
}
