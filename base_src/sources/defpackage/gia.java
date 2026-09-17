package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class gia implements Runnable {
    final /* synthetic */ gib a;
    private final ghz b;

    public gia(gib gibVar, ghz ghzVar) {
        this.a = gibVar;
        this.b = ghzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ljf ljfVar;
        try {
            try {
                ljf ljfVar2 = this.a.a;
                String strValueOf = String.valueOf(this.b);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 8);
                sb.append("Command#");
                sb.append(strValueOf);
                ljfVar2.e(sb.toString());
                this.b.a();
                ljfVar = this.a.a;
            } catch (InterruptedException e) {
                ljfVar = this.a.a;
                ljfVar.f();
            } catch (llv e2) {
                ljfVar = this.a.a;
                ljfVar.f();
            } catch (Exception e3) {
                this.a.b.execute(new glt(e3, 1));
                ljfVar = this.a.a;
            }
            ljfVar.f();
        } catch (Throwable th) {
            this.a.a.f();
            throw th;
        }
    }
}
