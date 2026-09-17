package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ctb {
    private final lco d;
    private boolean c = false;
    public final List a = new ArrayList();
    private boolean e = false;
    lie b = null;

    public ctb(lco lcoVar) {
        this.d = lcoVar;
        lcoVar.a(new lij() { // from class: cta
            @Override // defpackage.lij
            public final void fB(Object obj) {
                ctb ctbVar = this.a;
                ((Boolean) obj).booleanValue();
                ctbVar.d();
            }
        }, pgr.INSTANCE);
    }

    private final void e() {
        if (!this.c) {
            this.e = false;
        } else if (!((Boolean) this.d.fA()).booleanValue() && !this.e) {
            if (this.b != null || this.a.isEmpty()) {
                return;
            }
            this.b = ((csw) ohh.t(this.a)).a();
            return;
        }
        lie lieVar = this.b;
        if (lieVar != null) {
            lieVar.close();
            this.b = null;
        }
    }

    public final synchronized lie a(final csw cswVar) {
        this.a.add(cswVar);
        e();
        return new lie() { // from class: csz
            @Override // defpackage.lie, java.lang.AutoCloseable
            public final void close() {
                ctb ctbVar = this.a;
                csw cswVar2 = cswVar;
                synchronized (ctbVar) {
                    ctbVar.a.remove(cswVar2);
                }
            }
        };
    }

    public final synchronized void b() {
        this.e = true;
        e();
    }

    public final synchronized void c(boolean z) {
        this.c = z;
        e();
    }

    public final synchronized void d() {
        e();
    }
}
