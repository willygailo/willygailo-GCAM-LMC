package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class lsf extends ltl {
    private final lvp e;
    private final Set f;
    private final lnt g;

    public lsf(lvp lvpVar, lnf lnfVar, luk lukVar, ltv ltvVar, lis lisVar, ljf ljfVar) {
        super(lvpVar.O(), lnfVar.b, lukVar, ltvVar, lisVar, ljfVar);
        this.e = lvpVar;
        this.f = lnfVar.h;
        this.g = lnfVar.c;
    }

    private static final void c(luz luzVar, lnq lnqVar) {
        luzVar.b(lnqVar.a, lnqVar.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ltl
    protected final void a(lzp lzpVar, lsp lspVar, List list, Handler handler) {
        try {
            ArrayList arrayList = new ArrayList(((orr) list).c);
            otj it = ((oom) list).iterator();
            while (it.hasNext()) {
                lzx lzxVarA = ((lsu) it.next()).a();
                lzxVarA.getClass();
                arrayList.add(lzxVarA);
            }
            lzy lzyVar = new lzy();
            lzyVar.c = new lam(handler);
            lzyVar.b = arrayList;
            luz luzVarH = lzpVar.h(this.g.a);
            Set setBf = mip.bf(this.e.A());
            oom oomVar = this.g.b;
            int size = oomVar.size();
            for (int i = 0; i < size; i++) {
                lnq lnqVar = (lnq) oomVar.get(i);
                if (setBf.contains(lnqVar.a())) {
                    c(luzVarH, lnqVar);
                }
            }
            for (lnq lnqVar2 : this.f) {
                if (setBf.contains(lnqVar2.a())) {
                    c(luzVarH, lnqVar2);
                }
            }
            lzyVar.e = luzVarH.a();
            lzyVar.a = Integer.valueOf(this.a == lnp.HIGH_SPEED ? 1 : 0);
            if (lspVar == null) {
                throw new NullPointerException("Null stateCallback");
            }
            lzyVar.d = lspVar;
            Integer num = lzyVar.a;
            if (num != null && lzyVar.b != null && lzyVar.c != null && lzyVar.d != null && lzyVar.e != null) {
                lzpVar.c(new lzz(num.intValue(), lzyVar.b, lzyVar.c, lzyVar.d, lzyVar.e));
                return;
            }
            StringBuilder sb = new StringBuilder();
            if (lzyVar.a == null) {
                sb.append(" sessionType");
            }
            if (lzyVar.b == null) {
                sb.append(" outputConfigurations");
            }
            if (lzyVar.c == null) {
                sb.append(" executor");
            }
            if (lzyVar.d == null) {
                sb.append(" stateCallback");
            }
            if (lzyVar.e == null) {
                sb.append(" sessionParameters");
            }
            String strValueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(strValueOf);
            throw new IllegalStateException(sb2.toString());
        } catch (Throwable th) {
            lis lisVar = this.b;
            String strValueOf2 = String.valueOf(lspVar);
            StringBuilder sb3 = new StringBuilder(String.valueOf(strValueOf2).length() + 35);
            sb3.append("Unable to createCaptureSession for ");
            sb3.append(strValueOf2);
            lisVar.i(sb3.toString(), th);
            lspVar.b();
        }
    }
}
