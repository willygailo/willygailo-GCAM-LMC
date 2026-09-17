package defpackage;

import com.google.android.libraries.lens.lenslite.api.LinkConfig;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class mgp extends LinkConfig.Builder {
    public ByteBuffer A;
    public Boolean B;
    public ByteBuffer C;
    public Boolean D;
    public Boolean E;
    public Boolean F;
    public mie G;
    public Boolean H;
    private mhy I;
    public Boolean a;
    public Boolean b;
    public Boolean c;
    public Boolean d;
    public Boolean e;
    public List f;
    public Integer g;
    public Integer h;
    public Boolean i;
    public Boolean j;
    public Boolean k;
    public Integer l;
    public Boolean m;
    public Map n;
    public Boolean o;
    public Boolean p;
    public Boolean q;
    public Boolean r;
    public Integer s;
    public Boolean t;
    public Long u;
    public Boolean v;
    public Boolean w;
    public mhz x;
    public Long y;
    public Boolean z;

    @Override // com.google.android.libraries.lens.lenslite.api.LinkConfig.Builder
    public final void a(mhy mhyVar) {
        if (mhyVar == null) {
            throw new NullPointerException("Null dynamicLoadingMode");
        }
        this.I = mhyVar;
    }

    @Override // com.google.android.libraries.lens.lenslite.api.LinkConfig.Builder
    public final LinkConfig build() {
        Boolean bool = this.j;
        if (bool != null && this.k != null && this.I != null) {
            return new mgq(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, bool.booleanValue(), this.k.booleanValue(), this.l, this.m, this.n, this.o, this.p, this.q, this.I, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H);
        }
        StringBuilder sb = new StringBuilder();
        if (this.j == null) {
            sb.append(" aiAiShoppingDetectionEnabled");
        }
        if (this.k == null) {
            sb.append(" aiAiTranslateDetectionEnabled");
        }
        if (this.I == null) {
            sb.append(" dynamicLoadingMode");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }
}
