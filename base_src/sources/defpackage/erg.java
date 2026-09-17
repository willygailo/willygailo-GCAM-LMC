package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class erg implements Runnable {
    public final /* synthetic */ erj a;
    private final /* synthetic */ int b;

    public /* synthetic */ erg(erj erjVar, int i) {
        this.b = i;
        this.a = erjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                erj erjVar = this.a;
                try {
                    if (erjVar.c.isDone() || erjVar.f) {
                        ((oug) ((oug) erk.a.c().g(ovl.a, "LasagnaProcQueue")).G(1425)).p("Cannot execute, already done %s", erjVar.d);
                    } else {
                        ljf ljfVar = erjVar.g.e;
                        int i = erjVar.d;
                        StringBuilder sb = new StringBuilder(29);
                        sb.append("LasagnaQueue#task-");
                        sb.append(i);
                        erjVar.e = ljfVar.a(sb.toString());
                        erjVar.b.run();
                        erjVar.c.o(true);
                    }
                } catch (Throwable th) {
                    erjVar.e();
                    erjVar.c.a(th);
                    erjVar.a.a(th);
                    return;
                }
                break;
            default:
                this.a.c(true);
                break;
        }
    }
}
