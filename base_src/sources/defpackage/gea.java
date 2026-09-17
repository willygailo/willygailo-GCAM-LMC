package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class gea implements gdp {
    private final MediaFormat a;
    private final mpi b;
    private final hoh c;
    private final lvp d;
    private gbg e = null;

    public gea(MediaFormat mediaFormat, mpi mpiVar, hoh hohVar, lvp lvpVar) {
        this.a = mediaFormat;
        this.b = mpiVar;
        this.c = hohVar;
        this.d = lvpVar;
    }

    private final void c() {
        this.a.setInteger("color-format", 2130708361);
        try {
            MediaFormat mediaFormat = this.a;
            mpi mpiVar = this.b;
            String string = mediaFormat.getString("mime");
            string.getClass();
            this.e = new gbi(new gbi(new gbj(new AtomicInteger(0), new gbd(MediaCodec.createEncoderByType(string), mediaFormat, mpiVar, mrg.a(mpiVar))), 0), 1);
        } catch (IOException e) {
            throw new IllegalStateException("Could not create image encoder!", e);
        }
    }

    @Override // defpackage.gdp
    public final synchronized gbp a(mln mlnVar, lic licVar) {
        gbg gbgVar;
        if (this.e == null) {
            c();
        }
        gbgVar = this.e;
        gbgVar.getClass();
        return new gbh(gbgVar, mlnVar, this.c.e(this.d.k()) ? gen.d : gen.c);
    }

    @Override // defpackage.gdp
    public final synchronized void b() {
        c();
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final synchronized void close() {
        gbg gbgVar = this.e;
        if (gbgVar != null) {
            gbgVar.close();
        }
        this.b.close();
    }
}
