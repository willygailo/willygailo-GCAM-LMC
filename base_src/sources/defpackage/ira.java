package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class ira {
    public static final ouj a = ouj.h("com/google/android/apps/camera/timelapse/stabilization/EisProcessExecutor");
    public iqr f;
    public irc g;
    public final mip h;
    public final AtomicInteger b = new AtomicInteger(0);
    public final Queue d = new ArrayDeque();
    public final Queue e = new ArrayDeque();
    public final ExecutorService c = mip.bM("Cheetah-eis-executor");

    public ira(mip mipVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        this.h = mipVar;
    }
}
