package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class ais implements ajw, ajv {
    static final TreeMap a = new TreeMap();
    final long[] b;
    final double[] c;
    final String[] d;
    final byte[][] e;
    final int f;
    int g;
    private volatile String h;
    private final int[] i;

    private ais(int i) {
        this.f = i;
        int i2 = i + 1;
        this.i = new int[i2];
        this.b = new long[i2];
        this.c = new double[i2];
        this.d = new String[i2];
        this.e = new byte[i2][];
    }

    public static ais a(String str, int i) {
        TreeMap treeMap = a;
        synchronized (treeMap) {
            Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (entryCeilingEntry == null) {
                ais aisVar = new ais(i);
                aisVar.i(str, i);
                return aisVar;
            }
            treeMap.remove(entryCeilingEntry.getKey());
            ais aisVar2 = (ais) entryCeilingEntry.getValue();
            aisVar2.i(str, i);
            return aisVar2;
        }
    }

    @Override // defpackage.ajw
    public final String b() {
        return this.h;
    }

    @Override // defpackage.ajv
    public final void c(int i, byte[] bArr) {
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.ajv
    public final void d(int i, double d) {
        throw null;
    }

    @Override // defpackage.ajv
    public final void e(int i, long j) {
        this.i[i] = 2;
        this.b[i] = j;
    }

    @Override // defpackage.ajv
    public final void f(int i) {
        this.i[i] = 1;
    }

    @Override // defpackage.ajv
    public final void g(int i, String str) {
        this.i[i] = 4;
        this.d[i] = str;
    }

    @Override // defpackage.ajw
    public final void h(ajv ajvVar) {
        for (int i = 1; i <= this.g; i++) {
            switch (this.i[i]) {
                case 1:
                    ajvVar.f(i);
                    break;
                case 2:
                    ajvVar.e(i, this.b[i]);
                    break;
                case 3:
                    ajvVar.d(i, this.c[i]);
                    break;
                case 4:
                    ajvVar.g(i, this.d[i]);
                    break;
                case 5:
                    ajvVar.c(i, this.e[i]);
                    break;
            }
        }
    }

    final void i(String str, int i) {
        this.h = str;
        this.g = i;
    }

    public final void j() {
        TreeMap treeMap = a;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }
}
