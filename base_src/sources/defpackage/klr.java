package defpackage;

import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class klr implements kwi {
    protected final DataHolder a;
    protected int b;
    public int c;

    public klr(DataHolder dataHolder, int i) {
        mip.dk(dataHolder);
        this.a = dataHolder;
        boolean z = false;
        if (i >= 0 && i < dataHolder.h) {
            z = true;
        }
        mip.dq(z);
        this.b = i;
        this.c = dataHolder.a(i);
    }

    protected final String a(String str) {
        return this.a.b(str, this.b, this.c);
    }

    protected final int b() {
        DataHolder dataHolder = this.a;
        int i = this.b;
        int i2 = this.c;
        dataHolder.c("event_type", i);
        return dataHolder.d[i2].getInt(i, dataHolder.c.getInt("event_type"));
    }

    @Override // defpackage.kwi
    public final String c() {
        return a("asset_key");
    }

    @Override // defpackage.kwi
    public final String d() {
        return a("asset_id");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof klr) {
            klr klrVar = (klr) obj;
            if (mip.dx(Integer.valueOf(klrVar.b), Integer.valueOf(this.b)) && mip.dx(Integer.valueOf(klrVar.c), Integer.valueOf(this.c)) && klrVar.a == this.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), this.a});
    }
}
