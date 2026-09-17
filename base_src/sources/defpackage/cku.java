package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class cku {
    public llz a;
    public File b;
    public hsc c;
    public hsg d;
    public ojc e;
    public mbs f;
    public lig g;
    public Integer h;
    public Long i;
    public hsq j;
    private Long k;
    private Integer l;

    public cku() {
    }

    public cku(byte[] bArr) {
        this.e = oih.a;
    }

    public final ckv a() {
        File file;
        hsc hscVar;
        hsg hsgVar;
        mbs mbsVar;
        lig ligVar;
        Integer num;
        llz llzVar = this.a;
        if (llzVar != null && (file = this.b) != null && (hscVar = this.c) != null && (hsgVar = this.d) != null && (mbsVar = this.f) != null && (ligVar = this.g) != null && (num = this.h) != null && this.i != null && this.k != null && this.l != null && this.j != null) {
            return new ckv(llzVar, file, hscVar, hsgVar, this.e, mbsVar, ligVar, num.intValue(), this.i.longValue(), this.k.longValue(), this.l.intValue(), this.j);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" exifInfo");
        }
        if (this.b == null) {
            sb.append(" filePath");
        }
        if (this.c == null) {
            sb.append(" gcaMediaFile");
        }
        if (this.d == null) {
            sb.append(" gcaMediaGroup");
        }
        if (this.f == null) {
            sb.append(" mimeType");
        }
        if (this.g == null) {
            sb.append(" size");
        }
        if (this.h == null) {
            sb.append(" orientation");
        }
        if (this.i == null) {
            sb.append(" takenTime");
        }
        if (this.k == null) {
            sb.append(" requestProcessingTimeMilliseconds");
        }
        if (this.l == null) {
            sb.append(" retries");
        }
        if (this.j == null) {
            sb.append(" shotInfo");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }

    public final void b(long j) {
        this.k = Long.valueOf(j);
    }

    public final void c(int i) {
        this.l = Integer.valueOf(i);
    }
}
