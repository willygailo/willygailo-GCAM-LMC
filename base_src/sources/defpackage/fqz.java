package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
final class fqz implements mln {
    final /* synthetic */ fra c;
    private final mln d;
    public final AtomicInteger a = new AtomicInteger(0);
    private final AtomicBoolean e = new AtomicBoolean(false);
    public final pih b = pih.f();

    public fqz(fra fraVar, mln mlnVar) {
        this.c = fraVar;
        this.d = mlnVar;
    }

    @Override // defpackage.mln
    public final void a(pht phtVar) {
        this.d.a(phtVar);
        this.b.e(phtVar);
    }

    @Override // defpackage.msx
    public final void b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        try {
            this.d.b(byteBuffer, bufferInfo);
            this.a.incrementAndGet();
        } catch (CancellationException e) {
        } catch (Throwable th) {
            ((oug) ((oug) ((oug) fra.a.c()).h(th)).G((char) 1918)).o("Error occurred while writing");
            this.c.b.c();
        }
    }

    @Override // defpackage.msx, java.lang.AutoCloseable
    public final void close() {
        mln mlnVar;
        int i;
        this.e.set(true);
        try {
            int iDecrementAndGet = this.c.d.decrementAndGet();
            fra fraVar = this.c;
            if (fraVar.f && !fraVar.b.b().isCancelled() && iDecrementAndGet == 0) {
                synchronized (this.c.e) {
                    fra fraVar2 = this.c;
                    ArrayList arrayList = new ArrayList();
                    synchronized (fraVar2.e) {
                        Iterator it = fraVar2.c.iterator();
                        i = -1;
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            fqz fqzVar = (fqz) it.next();
                            if (fqzVar.b.isDone()) {
                                String string = ((MediaFormat) plk.ad(fqzVar.b)).getString("mime");
                                if (mip.aG(string)) {
                                    arrayList.add(Integer.valueOf(fqzVar.a.get()));
                                } else if (string.equals("application/microvideo-meta-stream")) {
                                    i = fqzVar.a.get();
                                }
                            } else {
                                obr.aQ(fqzVar.a.get() == 0);
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        throw new RuntimeException("No video tracks are being added; aborting microvideo.");
                    }
                    if (i != -1) {
                        Iterator it2 = arrayList.iterator();
                        do {
                            if (!it2.hasNext()) {
                                StringBuilder sb = new StringBuilder();
                                Iterator it3 = arrayList.iterator();
                                while (it3.hasNext()) {
                                    sb.append(((Integer) it3.next()).intValue());
                                    sb.append(",");
                                }
                                throw new RuntimeException(String.format("Number of motion and video frames substantially differ (video=%s motion=%d).", sb, Integer.valueOf(i)));
                            }
                        } while (Math.abs(((Integer) it2.next()).intValue() - i) >= 25);
                    }
                    this.c.c.clear();
                }
            }
            mlnVar = this.d;
        } catch (CancellationException e) {
            mlnVar = this.d;
        } catch (Throwable th) {
            try {
                ((oug) ((oug) ((oug) fra.a.c()).h(th)).G(1916)).o("Error occurred while closing");
                this.c.b.c();
                mlnVar = this.d;
            } catch (Throwable th2) {
                this.d.close();
                throw th2;
            }
        }
        mlnVar.close();
    }
}
