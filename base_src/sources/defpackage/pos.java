package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class pos {
    private static volatile pos d;
    private static volatile pos e;
    public final Map b;
    private static volatile boolean c = false;
    static final pos a = new pos(null);

    public pos() {
        this.b = new HashMap();
    }

    public pos(byte[] bArr) {
        this.b = Collections.emptyMap();
    }

    public static pos a() {
        pos posVar = d;
        if (posVar == null) {
            synchronized (pos.class) {
                posVar = d;
                if (posVar == null) {
                    posVar = a;
                    d = posVar;
                }
            }
        }
        return posVar;
    }

    public static pos b() {
        pos posVar = e;
        if (posVar != null) {
            return posVar;
        }
        synchronized (pos.class) {
            pos posVar2 = e;
            if (posVar2 != null) {
                return posVar2;
            }
            pos posVarB = pox.b(pos.class);
            e = posVarB;
            return posVarB;
        }
    }

    public static pos c() {
        return new pos();
    }

    public poq d(pqm pqmVar, int i) {
        return (poq) this.b.get(new por(pqmVar, i));
    }
}
