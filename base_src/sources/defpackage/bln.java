package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class bln implements azp {
    private final String b;
    private final long c;
    private final int d;

    public bln(String str, long j, int i) {
        this.b = str;
        this.c = j;
        this.d = i;
    }

    @Override // defpackage.azp
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(ByteBuffer.allocate(12).putLong(this.c).putInt(this.d).array());
        messageDigest.update(this.b.getBytes(a));
    }

    @Override // defpackage.azp
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bln blnVar = (bln) obj;
        return this.c == blnVar.c && this.d == blnVar.d && this.b.equals(blnVar.b);
    }

    @Override // defpackage.azp
    public final int hashCode() {
        int iHashCode = this.b.hashCode();
        long j = this.c;
        return (((iHashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.d;
    }
}
