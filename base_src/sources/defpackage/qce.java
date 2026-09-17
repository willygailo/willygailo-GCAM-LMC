package defpackage;

import java.io.PrintStream;

/* JADX INFO: loaded from: classes2.dex */
final class qce extends qcd {
    private final PrintStream a;

    public qce(PrintStream printStream) {
        this.a = printStream;
    }

    @Override // defpackage.qcd
    public final void a(Object obj) {
        this.a.println(obj);
    }
}
