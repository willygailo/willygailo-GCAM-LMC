package defpackage;

import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class hnr {
    public final NavigableMap a;

    public hnr() {
        TreeMap treeMap = new TreeMap();
        obr.aF(treeMap.size() <= 9000);
        this.a = oxh.k(new lia(treeMap), null);
    }
}
