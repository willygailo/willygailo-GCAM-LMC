package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class ogr implements Callable {
    private final /* synthetic */ int a;

    public ogr(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        switch (this.a) {
            case 0:
                try {
                    System.loadLibrary("speechenhancer_jni_avenhrealtimenative");
                    return true;
                } catch (Throwable th) {
                    return false;
                }
            case 1:
                return Thread.currentThread();
            case 2:
                return qjw.a;
            case 3:
                return qjx.a;
            case 4:
                return qjy.a;
            default:
                return qjz.a;
        }
    }
}
