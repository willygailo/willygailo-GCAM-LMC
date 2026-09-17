package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class lxe implements lxa {
    final /* synthetic */ lxg a;
    private final String b;
    private final List c = new ArrayList(6000);
    private boolean d = true;

    public lxe(lxg lxgVar, String str) {
        this.a = lxgVar;
        this.b = str;
    }

    @Override // defpackage.lxa
    public final String a() {
        return this.b;
    }

    @Override // defpackage.lxa
    public final synchronized void b(long j, long j2, lwz lwzVar) {
        int i;
        int i2;
        if (!this.d) {
            lwzVar.a(oom.l());
            return;
        }
        synchronized (this.a) {
            this.c.clear();
            int i3 = this.a.c;
            while (true) {
                if (i3 >= 6000) {
                    i2 = 0;
                    break;
                }
                lxc lxcVar = (lxc) this.a.a.get(i3);
                long j3 = lxcVar.e;
                if (j3 > j2) {
                    i2 = 0;
                    break;
                }
                if (j3 >= j) {
                    lxc lxcVar2 = (lxc) this.a.b.a();
                    lxcVar2.a(lxcVar);
                    this.c.add(lxcVar2);
                }
                i3++;
            }
            while (true) {
                lxg lxgVar = this.a;
                if (i2 >= lxgVar.c) {
                    break;
                }
                lxc lxcVar3 = (lxc) lxgVar.a.get(i2);
                long j4 = lxcVar3.e;
                if (j4 > j2) {
                    break;
                }
                if (j4 >= j) {
                    lxc lxcVar4 = (lxc) this.a.b.a();
                    lxcVar4.a(lxcVar3);
                    this.c.add(lxcVar4);
                }
                i2++;
            }
        }
        lwzVar.a(this.c);
        synchronized (this.a) {
            for (i = 0; i < this.c.size(); i++) {
                this.a.b.b((lxc) this.c.get(i));
            }
            this.c.clear();
        }
    }

    @Override // defpackage.lxa, defpackage.lie, java.lang.AutoCloseable
    public final synchronized void close() {
        this.d = false;
        this.a.b(this);
    }
}
