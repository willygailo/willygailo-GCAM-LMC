package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class yc implements Comparator {
    private final /* synthetic */ int d;
    public static final Comparator a = new yc(12);
    public static final yc c = new yc(11);
    public static final yc b = new yc(10);

    public yc(int i) {
        this.d = i;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int iB;
        int iB2;
        switch (this.d) {
            case 0:
                return ((yf) obj).c - ((yf) obj2).c;
            case 1:
                ov ovVar = (ov) obj;
                ov ovVar2 = (ov) obj2;
                RecyclerView recyclerView = ovVar.d;
                if ((recyclerView == null) != (ovVar2.d == null)) {
                    return recyclerView == null ? 1 : -1;
                }
                boolean z = ovVar.a;
                if (z != ovVar2.a) {
                    return z ? -1 : 1;
                }
                int i = ovVar2.b - ovVar.b;
                if (i != 0) {
                    return i;
                }
                int i2 = ovVar.c - ovVar2.c;
                if (i2 == 0) {
                    return 0;
                }
                return i2;
            case 2:
                float fB = gl.b((View) obj);
                float fB2 = gl.b((View) obj2);
                if (fB > fB2) {
                    return -1;
                }
                return fB < fB2 ? 1 : 0;
            case 3:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                int length = bArr.length;
                int length2 = bArr2.length;
                if (length != length2) {
                    return length - length2;
                }
                for (int i3 = 0; i3 < bArr.length; i3++) {
                    byte b2 = bArr[i3];
                    byte b3 = bArr2[i3];
                    if (b2 != b3) {
                        return b2 - b3;
                    }
                }
                return 0;
            case 4:
                return ((int[]) obj)[0] - ((int[]) obj2)[0];
            case 5:
                int[] iArr = (int[]) obj;
                int[] iArr2 = (int[]) obj2;
                int i4 = iArr[0];
                int i5 = iArr2[0];
                return i4 == i5 ? iArr[1] - iArr2[1] : i4 - i5;
            case 6:
                axn axnVar = (axn) obj;
                axn axnVar2 = (axn) obj2;
                if (axnVar.b() == axnVar2.b()) {
                    iB = axnVar.a();
                    iB2 = axnVar2.a();
                } else {
                    iB = axnVar.b();
                    iB2 = axnVar2.b();
                }
                return iB - iB2;
            case 7:
                lig ligVar = (lig) obj;
                lig ligVar2 = (lig) obj2;
                return (ligVar2.a * ligVar2.b) - (ligVar.a * ligVar.b);
            case 8:
                return ((Scope) obj).b.compareTo(((Scope) obj2).b);
            case 9:
                long jA = ((leb) obj).a();
                long jA2 = ((leb) obj2).a();
                if (jA < jA2) {
                    return 1;
                }
                return jA > jA2 ? -1 : 0;
            case 10:
                lig ligVar3 = (lig) obj;
                lig ligVar4 = (lig) obj2;
                long jB = ligVar3.b();
                long jB2 = ligVar4.b();
                int iBv = (jB > jB2 ? 1 : (jB == jB2 ? 0 : -1));
                if (jB == jB2) {
                    iBv = mip.bv(Math.min(ligVar3.a, ligVar3.b), Math.min(ligVar4.a, ligVar4.b));
                }
                return iBv == 0 ? mip.bv(ligVar3.a, ligVar4.a) : iBv;
            case 11:
                return (((low) obj).r() > ((low) obj2).r() ? 1 : (((low) obj).r() == ((low) obj2).r() ? 0 : -1));
            default:
                return lsx.a.compare(((lsu) obj).b, ((lsu) obj2).b);
        }
    }
}
