package defpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
final class mck extends FileInputStream {
    final /* synthetic */ mcm a;
    private final int b;
    private final FileInputStream c;
    private boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mck(mcm mcmVar, FileInputStream fileInputStream) {
        super(fileInputStream.getFD());
        this.a = mcmVar;
        this.b = mcm.b.incrementAndGet();
        this.d = false;
        this.c = fileInputStream;
    }

    @Override // java.io.FileInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        IOException iOException;
        if (this.d) {
            return;
        }
        this.d = true;
        try {
            try {
                super.close();
                iOException = null;
            } catch (IOException e) {
                iOException = new IOException(e);
            }
            try {
                this.c.close();
            } catch (IOException e2) {
                if (iOException == null) {
                    iOException = new IOException(e2);
                }
            }
            if (iOException != null) {
                throw iOException;
            }
            mcm mcmVar = this.a;
            AtomicInteger atomicInteger = mcm.a;
            mcmVar.c.readLock().unlock();
            lis lisVar = this.a.d;
            String strValueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 7);
            sb.append("Closed ");
            sb.append(strValueOf);
            lisVar.f(sb.toString());
        } catch (Throwable th) {
            mcm mcmVar2 = this.a;
            AtomicInteger atomicInteger2 = mcm.a;
            mcmVar2.c.readLock().unlock();
            lis lisVar2 = this.a.d;
            String strValueOf2 = String.valueOf(this);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 7);
            sb2.append("Closed ");
            sb2.append(strValueOf2);
            lisVar2.f(sb2.toString());
            throw th;
        }
    }

    public final String toString() {
        int i = this.b;
        StringBuilder sb = new StringBuilder(28);
        sb.append("MediaInputStream-");
        sb.append(i);
        return sb.toString();
    }
}
