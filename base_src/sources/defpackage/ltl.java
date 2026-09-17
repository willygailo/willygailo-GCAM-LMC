package defpackage;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Handler;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
abstract class ltl implements lso {
    protected final lnp a;
    protected final lis b;
    protected final ljf c;
    protected final int d;
    private final luk e;
    private final ltv f;

    protected ltl(int i, lnp lnpVar, luk lukVar, ltv ltvVar, lis lisVar, ljf ljfVar) {
        this.d = i;
        this.a = lnpVar;
        this.e = lukVar;
        this.f = ltvVar;
        this.c = ljfVar;
        this.b = lisVar.a("SessionOpener");
    }

    private static final void c(final lst lstVar, Executor executor) {
        lstVar.c.d(new gng(lstVar.a.a.a(new lij() { // from class: lti
            @Override // defpackage.lij
            public final void fB(Object obj) {
                lst lstVar2 = lstVar;
                ojc ojcVar = (ojc) obj;
                if (ojcVar.g()) {
                    lstVar2.b((Surface) ojcVar.c());
                }
            }
        }, executor), 4), pgr.INSTANCE);
    }

    protected abstract void a(lzp lzpVar, lsp lspVar, List list, Handler handler);

    public final void b(lzp lzpVar, lsp lspVar, List list, List list2, lap lapVar, Handler handler, Executor executor) {
        ljf ljfVar = this.c;
        String strValueOf = String.valueOf(lspVar);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 7);
        sb.append("Create-");
        sb.append(strValueOf);
        ljfVar.e(sb.toString());
        try {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Surface surfaceC = ((lsu) it.next()).c();
                surfaceC.getClass();
                arrayList.add(surfaceC);
            }
            this.f.d(lspVar);
            ltv ltvVar = this.f;
            synchronized (ltvVar) {
                obr.ar(ltvVar.d != null, "setActiveCaptureSession must be invoked first.", new Object[0]);
                if (lspVar == ltvVar.d) {
                    boolean zAddAll = ltvVar.a.addAll(arrayList);
                    if (zAddAll) {
                        ltvVar.c();
                    }
                }
            }
            ooh oohVarE = oom.e();
            oohVarE.h(list2);
            oohVarE.h(list);
            oom oomVarS = oom.s(yc.a, oohVarE.f());
            lis lisVar = this.b;
            String strValueOf2 = String.valueOf(lspVar);
            String strValueOf3 = String.valueOf(oomVarS);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 14 + String.valueOf(strValueOf3).length());
            sb2.append("Create ");
            sb2.append(strValueOf2);
            sb2.append(" using ");
            sb2.append(strValueOf3);
            lisVar.f(sb2.toString());
            a(lzpVar, lspVar, oomVarS, handler);
            if (!list2.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(list2.size());
                ArrayList arrayList3 = new ArrayList(list2.size());
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    lsr lsrVar = (lsr) it2.next();
                    c(lsrVar, executor);
                    arrayList2.add(lsrVar.c);
                    arrayList3.add(lsrVar.a());
                }
                plk.af(plk.R(arrayList2), new ltk(this, lapVar, lspVar, list2, arrayList3), executor);
            }
            this.c.f();
        } catch (Throwable th) {
            this.c.f();
            throw th;
        }
    }

    @Override // defpackage.lso
    public final void d(lzp lzpVar, lsp lspVar, lap lapVar, Handler handler) {
        int i;
        OutputConfiguration outputConfiguration;
        lam lamVar = new lam(handler);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        luk lukVar = this.e;
        ope<ltw> opeVar = lukVar.b;
        ope<lty> opeVar2 = lukVar.c;
        boolean z = (opeVar.isEmpty() && opeVar2.isEmpty()) ? false : true;
        obr.aG(z, "Cannot create a capture session without streams.");
        if (this.a == lnp.HIGH_SPEED) {
            obr.aG(opeVar.isEmpty(), "HIGH_SPEED Sessions cannot use buffered streams.");
            obr.aG(!opeVar2.isEmpty(), "HIGH_SPEED Sessions must have streams.");
            obr.aG(opeVar2.size() <= 2, "HIGH_SPEED Sessions may only have 1 or 2 streams.");
        }
        for (ltw ltwVar : opeVar) {
            Surface surfaceG = ltwVar.g();
            surfaceG.getClass();
            arrayList.add(lsv.b(ltwVar, surfaceG));
        }
        for (lty ltyVar : opeVar2) {
            Surface surfaceG2 = ltyVar.g();
            if (surfaceG2 != null) {
                if (surfaceG2.isValid()) {
                    arrayList.add(lsv.b(ltyVar, surfaceG2));
                } else {
                    this.b.h(mip.bp("%s for %s was not valid, this may prevent the viewfinder from starting!", surfaceG2, ltyVar));
                }
            }
            if (this.a != lnp.HIGH_SPEED && (i = this.d) != 5 && i != 3) {
                if (ltyVar.h() == loa.SURFACE_TEXTURE) {
                    outputConfiguration = new OutputConfiguration(ltyVar.b().c(), SurfaceTexture.class);
                    lsw.b(ltyVar, outputConfiguration);
                } else if (ltyVar.h() == loa.SURFACE_VIEW) {
                    outputConfiguration = new OutputConfiguration(ltyVar.b().c(), SurfaceHolder.class);
                    lsw.b(ltyVar, outputConfiguration);
                } else {
                    outputConfiguration = null;
                }
                lsr lsrVar = outputConfiguration != null ? new lsr(ltyVar, outputConfiguration) : null;
                if (lsrVar != null) {
                    arrayList2.add(lsrVar);
                }
            }
            arrayList3.add(new lss(ltyVar));
        }
        if (arrayList3.isEmpty()) {
            b(lzpVar, lspVar, oom.j(arrayList), arrayList2, lapVar, handler, lamVar);
            return;
        }
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        int size = arrayList3.size();
        for (int i2 = 0; i2 < size; i2++) {
            lss lssVar = (lss) arrayList3.get(i2);
            c(lssVar, lamVar);
            arrayList4.add(lssVar.c);
        }
        lis lisVar = this.b;
        String strValueOf = String.valueOf(lspVar);
        String strValueOf2 = String.valueOf(arrayList3);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 31 + String.valueOf(strValueOf2).length());
        sb.append("Awaiting required outputs for ");
        sb.append(strValueOf);
        sb.append(" ");
        sb.append(strValueOf2);
        lisVar.f(sb.toString());
        plk.af(plk.R(arrayList4), new ltj(this, lapVar, lspVar, arrayList3, lzpVar, arrayList, arrayList2, handler, lamVar), lamVar);
    }
}
