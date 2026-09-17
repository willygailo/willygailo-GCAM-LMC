package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ltc implements ltd, lie {
    public ltd a;
    public ltd b;
    public lrb e;
    private final Handler f;
    private final lis g;
    private ltm i;
    public boolean c = false;
    public boolean d = false;
    private final List h = new ArrayList();

    public ltc(Handler handler, lis lisVar) {
        this.f = handler;
        this.g = lisVar.a("QReqProcessor");
    }

    public final void a() {
        this.i = null;
        ArrayList arrayList = new ArrayList(this.h);
        this.h.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((lta) arrayList.get(i)).a(this.f);
        }
    }

    public final void b() {
        lrb lrbVar;
        synchronized (this) {
            this.a = null;
            this.b = null;
            this.c = false;
            lrbVar = this.e;
            if (this.d) {
                this.e = null;
            }
        }
        if (lrbVar != null) {
            synchronized (lrc.a) {
                lrbVar.a.e = 1;
            }
        }
    }

    @Override // defpackage.ltd
    public final synchronized void c(ltm ltmVar) {
        if (!this.d) {
            this.i = ltmVar;
            ltd ltdVar = this.a;
            if (ltdVar != null) {
                ltdVar.c(ltmVar);
            }
        }
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (this.d) {
                return;
            }
            this.d = true;
            a();
            b();
        }
    }

    @Override // defpackage.ltd
    public final synchronized void d() {
        if (!this.d) {
            this.i = null;
            ltd ltdVar = this.a;
            if (ltdVar != null) {
                ltdVar.d();
            }
        }
    }

    @Override // defpackage.ltd
    public final synchronized void e(ltm ltmVar) {
        if (this.d) {
            mip.aX(ltmVar, this.f);
            return;
        }
        ltd ltdVar = this.a;
        if (ltdVar != null) {
            ltdVar.e(ltmVar);
        } else {
            this.h.add(new ltb(ltmVar));
        }
    }

    @Override // defpackage.ltd
    public final synchronized void f(List list) {
        obr.aF(!list.isEmpty());
        if (this.d) {
            mip.aY(list, this.f);
            return;
        }
        ltd ltdVar = this.a;
        if (ltdVar != null) {
            ltdVar.f(list);
        } else {
            this.h.add(new lsz(list));
        }
    }

    public final lrb g() {
        try {
            ltd ltdVar = this.a;
            if (ltdVar != null) {
                ltm ltmVar = this.i;
                if (ltmVar != null) {
                    ltdVar.c(ltmVar);
                }
                for (lta ltaVar : this.h) {
                    ltd ltdVar2 = this.a;
                    ltdVar2.getClass();
                    ltaVar.b(ltdVar2);
                }
                this.h.clear();
            }
            return this.e;
        } catch (llv e) {
            this.g.i("Failed to submit queued requests.", e);
            close();
            return null;
        }
    }
}
