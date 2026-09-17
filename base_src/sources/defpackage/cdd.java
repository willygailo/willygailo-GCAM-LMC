package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class cdd implements phh {
    private final /* synthetic */ int a;

    public cdd(int i) {
        this.a = i;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
        switch (this.a) {
            case 0:
                ((oug) ((oug) ((oug) cde.a.b()).h(th)).G((char) 258)).o("Failed to clear all examples");
                return;
            case 1:
                ((oug) ((oug) ((oug) cas.a.b()).h(th)).G((char) 183)).o("Failed to add session data.");
                return;
            case 2:
                if (!(th instanceof CancellationException)) {
                    throw new IllegalStateException("Error during photos launch", th);
                }
                ((oug) ((oug) ((oug) dtz.a.c()).h(th)).G((char) 911)).o("Photos launch was cancelled");
                return;
            case 3:
                ((oug) ((oug) ((oug) mvi.a.c()).h(th)).G((char) 3599)).o("Failed to add examples");
                return;
            default:
                return;
        }
    }

    @Override // defpackage.phh
    public final /* synthetic */ void b(Object obj) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                break;
        }
    }
}
