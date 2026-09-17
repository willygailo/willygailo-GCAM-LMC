package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class lsd extends ltl {
    public lsd(lvp lvpVar, lnf lnfVar, luk lukVar, ltv ltvVar, lis lisVar, ljf ljfVar) {
        super(lvpVar.O(), lnfVar.b, lukVar, ltvVar, lisVar, ljfVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ltl
    protected final void a(lzp lzpVar, lsp lspVar, List list, Handler handler) {
        try {
            ArrayList arrayList = new ArrayList(((orr) list).c);
            otj it = ((oom) list).iterator();
            while (it.hasNext()) {
                arrayList.add(((lsu) it.next()).c());
            }
            lzpVar.d(arrayList, lspVar, handler);
        } catch (Throwable th) {
            lis lisVar = this.b;
            String strValueOf = String.valueOf(lspVar);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 35);
            sb.append("Unable to createCaptureSession for ");
            sb.append(strValueOf);
            lisVar.i(sb.toString(), th);
            lspVar.b();
        }
    }
}
