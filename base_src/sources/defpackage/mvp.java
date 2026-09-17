package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mvp {
    public static final mvp a = new mvp(new mvs[0]);
    public final mvs[] b;
    public final int[] c;

    public mvp(mvs[] mvsVarArr) {
        this.b = mvsVarArr;
        this.c = new int[mvsVarArr.length];
        for (int i = 0; i < mvsVarArr.length; i++) {
            int[] iArr = this.c;
            int i2 = mvsVarArr[i].b;
            iArr[i] = 0;
        }
    }
}
