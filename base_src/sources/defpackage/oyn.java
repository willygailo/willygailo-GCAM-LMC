package defpackage;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
public final class oyn extends oyg {
    public final MessageDigest b;
    public final int c;
    public boolean d;

    public oyn(MessageDigest messageDigest, int i) {
        this.b = messageDigest;
        this.c = i;
    }

    @Override // defpackage.oyg
    public final void ae(byte[] bArr) {
        af();
        this.b.update(bArr, 0, 2);
    }

    public final void af() {
        obr.aR(!this.d, "Cannot re-use a Hasher after calling hash() on it");
    }
}
