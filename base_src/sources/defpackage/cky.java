package defpackage;

import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cky implements Runnable {
    public final /* synthetic */ cla a;
    private final /* synthetic */ int b;

    public /* synthetic */ cky(cla claVar, int i) {
        this.b = i;
        this.a = claVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                cla claVar = this.a;
                synchronized (claVar) {
                    try {
                        FileOutputStream fileOutputStream = claVar.c;
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                    } catch (IOException e) {
                        ((oug) ((oug) ((oug) cla.a.b()).h(e)).G(464)).o("Error closing MediaFile.");
                    }
                    break;
                }
                return;
            default:
                cla claVar2 = this.a;
                try {
                    FileOutputStream fileOutputStream2 = claVar2.c;
                    if (fileOutputStream2 != null) {
                        fileOutputStream2.close();
                    }
                    claVar2.b.d();
                    return;
                } catch (IOException e2) {
                    ((oug) ((oug) ((oug) cla.a.b()).h(e2)).G((char) 462)).o("Error closing MediaFile.");
                    return;
                }
        }
    }
}
