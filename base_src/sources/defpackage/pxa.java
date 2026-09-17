package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum pxa {
    GVR_BETA_FEATURE_DAYDREAM_6DOF_CONTROLLER(1000, "com.google.vr.beta.daydream_6dof_controller"),
    GVR_BETA_FEATURE_SEE_THROUGH(1001, "com.google.vr.beta.cameraSeeThrough");

    public final int c;
    public final String d;

    pxa(int i, String str) {
        this.c = i;
        this.d = str;
    }

    public static pxa[] a(int[] iArr) {
        pxa pxaVar;
        if (iArr == null) {
            return new pxa[0];
        }
        int length = iArr.length;
        pxa[] pxaVarArr = new pxa[length];
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            pxa[] pxaVarArrValues = values();
            int length2 = pxaVarArrValues.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    pxaVar = null;
                    break;
                }
                pxaVar = pxaVarArrValues[i3];
                if (pxaVar.c == i2) {
                    break;
                }
                i3++;
            }
            pxaVarArr[i] = pxaVar;
        }
        return pxaVarArr;
    }
}
