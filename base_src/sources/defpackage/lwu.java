package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class lwu implements lxa {
    public final String a;
    final /* synthetic */ lww b;
    private final List c = new ArrayList(100);
    private boolean d = true;

    public lwu(lww lwwVar, String str) {
        this.b = lwwVar;
        this.a = str;
    }

    @Override // defpackage.lxa
    public final String a() {
        return this.a;
    }

    @Override // defpackage.lxa
    public final synchronized void b(long j, long j2, lwz lwzVar) {
        if (!this.d) {
            lwzVar.a(oom.l());
            return;
        }
        synchronized (this.b) {
            lwv lwvVar = this.b.b;
            if (lwvVar != null) {
                lwvVar.d.a(j, j2, this.c);
            }
        }
        lwzVar.a(this.c);
        synchronized (this.b) {
            lwv lwvVar2 = this.b.b;
            if (lwvVar2 != null) {
                lwvVar2.d.b(this.c);
            }
        }
    }

    @Override // defpackage.lxa, defpackage.lie, java.lang.AutoCloseable
    public final synchronized void close() {
        lis lisVar = this.b.a;
        String strValueOf = String.valueOf(this.a);
        lisVar.b(strValueOf.length() != 0 ? "Closing session : ".concat(strValueOf) : new String("Closing session : "));
        this.d = false;
        this.b.b(this);
    }
}
