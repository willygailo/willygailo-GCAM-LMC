package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public final class bio {
    public final Queue a;

    public bio() {
        this.a = bmf.h(0);
    }

    public bio(byte[] bArr) {
        this.a = new ArrayDeque();
    }

    final synchronized azb a(ByteBuffer byteBuffer) {
        azb azbVar;
        azbVar = (azb) this.a.poll();
        if (azbVar == null) {
            azbVar = new azb();
        }
        azbVar.b = null;
        Arrays.fill(azbVar.a, (byte) 0);
        azbVar.c = new aza();
        azbVar.d = 0;
        azbVar.b = byteBuffer.asReadOnlyBuffer();
        azbVar.b.order(ByteOrder.LITTLE_ENDIAN);
        return azbVar;
    }

    final synchronized void b(azb azbVar) {
        azbVar.b = null;
        azbVar.c = null;
        this.a.offer(azbVar);
    }
}
