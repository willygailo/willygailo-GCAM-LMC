package defpackage;

import android.hardware.camera2.CaptureResult;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class efe {
    public final byte[] a;
    public final byte[] b;
    public final byte[] c;
    private final long d;
    private final long e;

    public efe() {
    }

    public efe(long j, long j2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.d = j;
        this.e = j2;
        this.a = bArr;
        this.b = bArr2;
        this.c = bArr3;
    }

    public static ojc a(lzr lzrVar) {
        if (lzrVar == null) {
            return oih.a;
        }
        efd efdVar = new efd();
        efdVar.a(0L);
        efdVar.a = Long.valueOf(lzrVar.b());
        Long l = (Long) lzrVar.d(CaptureResult.SENSOR_TIMESTAMP);
        efdVar.a(l != null ? l.longValue() : 0L);
        if (kda.h != null) {
            efdVar.c = (byte[]) lzrVar.d(kda.h);
        }
        if (kda.i != null) {
            efdVar.d = (byte[]) lzrVar.d(kda.i);
        }
        if (kda.j != null) {
            efdVar.e = (byte[]) lzrVar.d(kda.j);
        }
        Long l2 = efdVar.a;
        if (l2 != null && efdVar.b != null) {
            return ojc.i(new efe(l2.longValue(), efdVar.b.longValue(), efdVar.c, efdVar.d, efdVar.e));
        }
        StringBuilder sb = new StringBuilder();
        if (efdVar.a == null) {
            sb.append(" frameNumber");
        }
        if (efdVar.b == null) {
            sb.append(" timestampNanos");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof efe) {
            efe efeVar = (efe) obj;
            if (this.d == efeVar.d && this.e == efeVar.e) {
                boolean z = efeVar instanceof efe;
                if (Arrays.equals(this.a, z ? efeVar.a : efeVar.a)) {
                    if (Arrays.equals(this.b, z ? efeVar.b : efeVar.b) && Arrays.equals(this.c, efeVar.c)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.d;
        long j2 = this.e;
        return Arrays.hashCode(this.c) ^ ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.a)) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AfDebugMetadata{");
        sb.append(this.d);
        if (this.e > 0) {
            sb.append(" ");
            sb.append(this.e);
        }
        if (this.a != null) {
            sb.append(" AEC");
        }
        if (this.b != null) {
            sb.append(" AF");
        }
        if (this.c != null) {
            sb.append(" AWB");
        }
        sb.append("}");
        return sb.toString();
    }
}
