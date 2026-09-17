package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class kls extends klo implements kiv {
    private boolean b;
    private ArrayList c;
    private final Status d;

    public kls(DataHolder dataHolder) {
        super(dataHolder);
        this.b = false;
        this.d = new Status(dataHolder.e);
    }

    private final void f() {
        synchronized (this) {
            if (!this.b) {
                DataHolder dataHolder = this.a;
                mip.dk(dataHolder);
                int i = dataHolder.h;
                ArrayList arrayList = new ArrayList();
                this.c = arrayList;
                if (i > 0) {
                    arrayList.add(0);
                    String strB = this.a.b("path", 0, this.a.a(0));
                    for (int i2 = 1; i2 < i; i2++) {
                        int iA = this.a.a(i2);
                        String strB2 = this.a.b("path", i2, iA);
                        if (strB2 == null) {
                            StringBuilder sb = new StringBuilder(82);
                            sb.append("Missing value for markerColumn: ");
                            sb.append("path");
                            sb.append(", at row: ");
                            sb.append(i2);
                            sb.append(", for window: ");
                            sb.append(iA);
                            throw new NullPointerException(sb.toString());
                        }
                        if (!strB2.equals(strB)) {
                            this.c.add(Integer.valueOf(i2));
                            strB = strB2;
                        }
                    }
                }
                this.b = true;
            }
        }
    }

    @Override // defpackage.kiv
    public final Status a() {
        return this.d;
    }

    @Override // defpackage.klo, defpackage.klp
    public final int c() {
        f();
        return this.c.size();
    }

    @Override // defpackage.klp
    public final Object d(int i) {
        f();
        int iE = e(i);
        int iIntValue = 0;
        if (i >= 0 && i != this.c.size()) {
            if (i == this.c.size() - 1) {
                DataHolder dataHolder = this.a;
                mip.dk(dataHolder);
                iIntValue = dataHolder.h - ((Integer) this.c.get(i)).intValue();
            } else {
                iIntValue = ((Integer) this.c.get(i + 1)).intValue() - ((Integer) this.c.get(i)).intValue();
            }
            if (iIntValue == 1) {
                int iE2 = e(i);
                DataHolder dataHolder2 = this.a;
                mip.dk(dataHolder2);
                dataHolder2.a(iE2);
                iIntValue = 1;
            }
        }
        return new kxo(this.a, iE, iIntValue);
    }

    final int e(int i) {
        if (i >= 0 && i < this.c.size()) {
            return ((Integer) this.c.get(i)).intValue();
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append("Position ");
        sb.append(i);
        sb.append(" is out of bounds for this buffer");
        throw new IllegalArgumentException(sb.toString());
    }
}
