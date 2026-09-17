package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class lyk implements lyj, lyb, lyg {
    public final String a;
    public final lyd[] b;
    public final lya c;
    private final lyl d;

    public lyk(String str, lyd[] lydVarArr, lyl lylVar, lya lyaVar) {
        this.a = str;
        this.b = lydVarArr;
        this.d = lylVar;
        this.c = lyaVar;
    }

    @Override // defpackage.lyb
    public final void a(Object... objArr) {
        c(1L, objArr);
    }

    @Override // defpackage.lyg
    public final void b(double d, Object... objArr) {
        c(Double.valueOf(d), objArr);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0025  */
    protected final void c(Object obj, Object[] objArr) {
        String str = this.a;
        lyd[] lydVarArr = this.b;
        if (lydVarArr.length == objArr.length) {
            for (int i = 0; i < lydVarArr.length; i++) {
                Class cls = lydVarArr[i].b;
                if (cls == String.class) {
                    if (objArr[i] instanceof String) {
                        if (cls == Boolean.class || (objArr[i] instanceof Boolean)) {
                        }
                    }
                } else if (cls != Integer.class || (objArr[i] instanceof Integer)) {
                    if (cls == Boolean.class) {
                    }
                }
            }
            this.c.a(obj, lye.a(objArr));
            lyl lylVar = ((lyp) this.d).b;
            if (lylVar != null) {
                synchronized (((lys) lylVar).a) {
                    System.nanoTime();
                    lyp lypVar = ((lys) lylVar).c;
                    lyr lyrVar = ((lys) lylVar).b;
                    for (lyk lykVar : lypVar.a.values()) {
                        lykVar.c.b(lyrVar, lykVar);
                    }
                }
                return;
            }
            return;
        }
        String string = Arrays.toString(lydVarArr);
        String string2 = Arrays.toString(objArr);
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 29 + String.valueOf(string).length() + String.valueOf(string2).length());
        sb.append(str);
        sb.append(" has: ");
        sb.append(string);
        sb.append(" which does not match: ");
        sb.append(string2);
        throw new IllegalArgumentException(sb.toString());
    }
}
