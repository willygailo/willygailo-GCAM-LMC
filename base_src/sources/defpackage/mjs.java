package defpackage;

import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mjs implements Runnable {
    public final /* synthetic */ mkb a;
    private final /* synthetic */ int b;

    public /* synthetic */ mjs(mkb mkbVar, int i) {
        this.b = i;
        this.a = mkbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                mkb mkbVar = this.a;
                mkbVar.a = true;
                try {
                    mkbVar.e();
                    return;
                } catch (IOException e) {
                    mkbVar.c.a(e);
                    return;
                }
            default:
                mkb mkbVar2 = this.a;
                if (mkbVar2.c.cancel(false)) {
                    mkbVar2.b = true;
                    try {
                        mkbVar2.f.close();
                        return;
                    } catch (IOException e2) {
                        Log.e("ConfigurableMux", "Couldn't close output after cancellation", e2);
                        return;
                    }
                }
                return;
        }
    }
}
