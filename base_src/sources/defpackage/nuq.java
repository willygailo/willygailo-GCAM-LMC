package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class nuq implements Iterable {
    public final List a;
    private final List b;

    public nuq() {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = Collections.unmodifiableList(arrayList);
    }

    public nuq(float... fArr) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = Collections.unmodifiableList(arrayList);
        c(fArr);
    }

    public final int a() {
        return this.a.size();
    }

    public final PointF b(int i) {
        return (PointF) this.a.get(i);
    }

    public final void c(float... fArr) {
        obr.aG(true, "must be even number of coordinates");
        while (this.a.size() < 4) {
            this.a.add(new PointF());
        }
        if (this.a.size() > 4) {
            List list = this.a;
            list.subList(0, list.size() - 4).clear();
        }
        for (int i = 0; i < 8; i += 2) {
            ((PointF) this.a.get(i >> 1)).set(fArr[i], fArr[i + 1]);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nuq)) {
            return false;
        }
        nuq nuqVar = (nuq) obj;
        int iA = a();
        if (nuqVar.a() != iA) {
            return false;
        }
        if (nuqVar.a() == 0 && iA == 0) {
            return true;
        }
        PointF pointF = (PointF) this.a.get(0);
        int i = 0;
        while (true) {
            if (i >= nuqVar.a()) {
                i = -1;
                break;
            }
            if (obr.x(pointF, nuqVar.b(i))) {
                break;
            }
            i++;
        }
        if (i < 0) {
            return false;
        }
        for (int i2 = 0; i2 < iA; i2++) {
            if (!obr.x(b(i2), nuqVar.b((i + i2) % iA))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a.toArray());
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.b.iterator();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Polygon(");
        for (int i = 0; i < this.a.size(); i++) {
            PointF pointF = (PointF) this.a.get(i);
            sb.append("[");
            sb.append(pointF.x);
            sb.append(",");
            sb.append(pointF.y);
            sb.append("]");
            if (i < this.a.size() - 1) {
                sb.append(" ");
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
