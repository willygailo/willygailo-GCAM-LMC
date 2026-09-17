package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes.dex */
final class ayv extends ByteArrayOutputStream {
    final /* synthetic */ ayw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayv(ayw aywVar, int i) {
        super(i);
        this.a = aywVar;
    }

    @Override // java.io.ByteArrayOutputStream
    public final String toString() {
        try {
            return new String(this.buf, 0, (this.count <= 0 || this.buf[this.count + (-1)] != 13) ? this.count : this.count - 1, this.a.a.name());
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
