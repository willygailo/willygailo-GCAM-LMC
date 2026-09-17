package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface imt {
    public static final Map b;

    static {
        oon oonVarM = oor.m();
        oonVarM.e(0, ims.NORMAL);
        oonVarM.e(1, ims.HEAT_LIGHT);
        oonVarM.e(2, ims.HEAT_MODERATE);
        oonVarM.e(3, ims.HEAT_SEVERE);
        oonVarM.e(4, ims.HEAT_CRITICAL);
        oonVarM.e(5, ims.HEAT_EMERGENCY);
        oonVarM.e(6, ims.HEAT_SHUTDOWN);
        b = oonVarM.c();
    }

    ims c();

    lie d(imr imrVar);
}
