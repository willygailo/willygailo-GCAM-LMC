package defpackage;

import com.google.android.apps.camera.stats.timing.TimingSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ijs implements TimingSession {
    public static final ijr j = ijr.a().a();
    public static final ijr k;
    private final long[] a;
    private Runnable b;
    public final mcx l;
    public long m;
    public final Enum[] n;
    public final mip o;

    static {
        ijq ijqVarA = ijr.a();
        ijqVarA.c(false);
        ijqVarA.b(false);
        k = ijqVarA.a();
    }

    protected ijs(mcx mcxVar, long j2, Enum[] enumArr) {
        this(mcxVar, new mip(), j2, enumArr, null, null, null, null, null);
    }

    protected ijs(mcx mcxVar, mip mipVar, long j2, Enum[] enumArr, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.l = mcxVar;
        this.o = mipVar;
        this.m = j2;
        this.n = enumArr;
        long[] jArr = new long[enumArr.length];
        this.a = jArr;
        Arrays.fill(jArr, -1L);
    }

    protected ijs(mcx mcxVar, Enum[] enumArr) {
        this(mcxVar, new mip(), mcxVar.a(), enumArr, null, null, null, null, null);
    }

    public static List h(Class cls) {
        Enum[] enumArr = (Enum[]) obr.ao((Enum[]) cls.getEnumConstants());
        ArrayList arrayList = new ArrayList(enumArr.length + 1);
        arrayList.add("TIMING_CREATION");
        for (Enum r0 : enumArr) {
            arrayList.add(r0.name());
        }
        return arrayList;
    }

    protected void a() {
        Arrays.fill(this.a, -1L);
        this.m = this.l.a();
    }

    @Override // com.google.android.apps.camera.stats.timing.TimingSession
    public final void b(Runnable runnable) {
        this.b = runnable;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final long g(Enum r4) {
        return this.a[r4.ordinal()];
    }

    public final void i(Enum r4) {
        k(r4, this.l.a(), j);
    }

    public final void j(Enum r3, ijr ijrVar) {
        k(r3, this.l.a(), ijrVar);
    }

    public final void k(Enum r6, long j2, ijr ijrVar) {
        if (l(r6)) {
            return;
        }
        int iOrdinal = r6.ordinal();
        Enum[] enumArr = this.n;
        enumArr[iOrdinal] = r6;
        long[] jArr = this.a;
        jArr[iOrdinal] = j2;
        long j3 = iOrdinal > 0 ? jArr[iOrdinal - 1] : -1L;
        Enum r0 = iOrdinal > 0 ? enumArr[iOrdinal - 1] : null;
        boolean z = false;
        if (j3 >= 0 && ijrVar.b) {
            z = true;
        }
        boolean z2 = ijrVar.a;
        if (z && z2) {
            if (r0 != null) {
                r0.name();
            }
            r6.name();
        } else if (z) {
            if (r0 != null) {
                r0.name();
            }
            r6.name();
        } else if (z2) {
            r6.name();
        }
    }

    public final boolean l(Enum r7) {
        int iOrdinal = r7.ordinal();
        obr.aF(this.n[iOrdinal] == r7);
        return this.a[iOrdinal] >= 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append("{\n");
        long j2 = Long.MAX_VALUE;
        int i = 0;
        while (true) {
            long[] jArr = this.a;
            if (i >= jArr.length) {
                break;
            }
            long j3 = jArr[i];
            if (j3 >= 0 && j3 < j2) {
                j2 = j3;
            }
            i++;
        }
        for (int i2 = 0; i2 < this.a.length; i2++) {
            sb.append("\t");
            sb.append(this.n[i2]);
            sb.append(": ");
            sb.append(this.a[i2]);
            if (this.a[i2] >= 0) {
                sb.append(" (");
                sb.append(mip.eb(this.a[i2] - j2));
                sb.append("ms)");
            }
            sb.append("\n");
        }
        sb.append("}");
        return sb.toString();
    }
}
