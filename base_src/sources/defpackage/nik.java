package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class nik extends njd {
    private final List a;

    public nik(OutputStream outputStream, List list) {
        super(outputStream);
        this.a = list;
        myw.b(true, "Output was null", new Object[0]);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((njl) it.next()).close();
        }
        super.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        this.out.write(i);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((njl) it.next()).a();
        }
    }

    @Override // defpackage.njd, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.out.write(bArr);
        for (njl njlVar : this.a) {
            int length = bArr.length;
            njlVar.a();
        }
    }

    @Override // defpackage.njd, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.out.write(bArr, i, i2);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((njl) it.next()).a();
        }
    }
}
