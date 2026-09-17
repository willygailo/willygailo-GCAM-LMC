package defpackage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes.dex */
final class dzq implements ebp {
    final /* synthetic */ gog a;
    final /* synthetic */ dzr b;

    public dzq(dzr dzrVar, gog gogVar) {
        this.b = dzrVar;
        this.a = gogVar;
    }

    @Override // defpackage.ebp
    public final void a(dzf dzfVar) {
        this.b.i.e("DngCallback");
        final gkr gkrVarB = ((gks) this.b.e.b()).b(this.a);
        final ByteBuffer byteBufferDuplicate = dzfVar.a.duplicate();
        if (byteBufferDuplicate == null) {
            gkrVarB.b.f();
            gkrVarB.a.h();
        } else {
            byteBufferDuplicate.capacity();
            gkrVarB.c.a.execute(new Runnable() { // from class: gkq
                @Override // java.lang.Runnable
                public final void run() {
                    hgz hgzVar;
                    gkr gkrVar = gkrVarB;
                    ByteBuffer byteBuffer = byteBufferDuplicate;
                    try {
                        FileOutputStream fileOutputStreamE = gkrVar.b.e();
                        try {
                            FileChannel channel = fileOutputStreamE.getChannel();
                            try {
                                long jWrite = channel.write(byteBuffer);
                                fileOutputStreamE.flush();
                                if (channel != null) {
                                    channel.close();
                                }
                                fileOutputStreamE.close();
                                if (jWrite > 0) {
                                    gkrVar.b.g();
                                } else {
                                    gkrVar.b.f();
                                }
                                hgzVar = gkrVar.a;
                            } catch (Throwable th) {
                                if (channel != null) {
                                    try {
                                        channel.close();
                                    } catch (Throwable th2) {
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            try {
                                fileOutputStreamE.close();
                            } catch (Throwable th4) {
                            }
                            throw th3;
                        }
                    } catch (IOException e) {
                        gkrVar.b.f();
                        hgzVar = gkrVar.a;
                    } catch (Throwable th5) {
                        gkrVar.b.f();
                        gkrVar.a.h();
                        throw th5;
                    }
                    hgzVar.h();
                }
            });
        }
        this.b.i.f();
    }
}
