package defpackage;

import android.net.Uri;
import com.google.android.gms.common.data.DataHolder;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class kxq extends klr {
    private final int d;

    public kxq(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.d = i2;
    }

    public final String toString() {
        DataHolder dataHolder = this.a;
        int i = this.b;
        int i2 = this.c;
        dataHolder.c("data", i);
        byte[] blob = dataHolder.d[i2].getBlob(i, dataHolder.c.getInt("data"));
        HashMap map = new HashMap(this.d);
        for (int i3 = 0; i3 < this.d; i3++) {
            klr klrVar = new klr(this.a, this.b + i3);
            if (klrVar.c() != null) {
                map.put(klrVar.c(), klrVar);
            }
        }
        StringBuilder sb = new StringBuilder("DataItemRef{ ");
        String strValueOf = String.valueOf(Uri.parse(a("path")));
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 4);
        sb2.append("uri=");
        sb2.append(strValueOf);
        sb.append(sb2.toString());
        String strValueOf2 = String.valueOf(blob == null ? "null" : Integer.valueOf(blob.length));
        StringBuilder sb3 = new StringBuilder(String.valueOf(strValueOf2).length() + 9);
        sb3.append(", dataSz=");
        sb3.append(strValueOf2);
        sb.append(sb3.toString());
        int size = map.size();
        StringBuilder sb4 = new StringBuilder(23);
        sb4.append(", numAssets=");
        sb4.append(size);
        sb.append(sb4.toString());
        sb.append(" }");
        return sb.toString();
    }
}
