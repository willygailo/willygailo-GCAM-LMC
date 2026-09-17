package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class dcy {
    public static final ddi a;
    public static final ddi b;
    public static final ddg c;
    public static final ddg cd;
    private static final Map d;

    static {
        oon oonVarM = oor.m();
        oonVarM.e(dcx.NONE, new dcw(0.0f, 0.0f, 0.0f, 0.0f));
        oonVarM.e(dcx.P20S5, new dcw(83.0f, 83.0f, 65.0f, 55.0f));
        oonVarM.e(dcx.P20B5, new dcw(77.0f, 77.0f, 65.0f, 55.0f));
        oonVarM.e(dcx.P20R3, new dcw(80.9f, 76.9f, 65.0f, 55.0f));
        oonVarM.e(dcx.P21B9, new dcw(74.0f, 74.0f, 55.0f, 46.0f));
        oonVarM.e(dcx.P21O6, new dcw(540.0f, 63.0f, 55.0f, 50.0f));
        oonVarM.e(dcx.P21R4, new dcw(722.0f, 73.0f, 70.0f, 62.0f));
        d = oonVarM.c();
        ddh ddhVar = new ddh();
        ddhVar.a = "device_config";
        a = ddhVar.a();
        ddh ddhVar2 = new ddh();
        ddhVar2.a = "camera.cutout_trial_size";
        b = ddhVar2.a();
        ddh ddhVar3 = new ddh();
        ddhVar3.a = "camera.front_lens_indicator";
        c = ddhVar3.f();
        ddh ddhVar4 = new ddh();
        ddhVar4.a = "camera.cutout_display";
        cd = ddhVar4.a();
    }

    public static dcw a(ddf ddfVar, int i) {
        obr.aS(i <= dcx.P21R4.ordinal(), "Invalid device enum: %s", i);
        dcw dcwVar = (dcw) d.get(dcx.values()[i]);
        int iIntValue = ((Integer) ddfVar.a(b).c()).intValue();
        if (dcwVar == null || iIntValue == 0) {
            return dcwVar != null ? dcwVar : new dcw(0.0f, 0.0f, 0.0f, 0.0f);
        }
        float f = iIntValue + 40.0f;
        return new dcw(dcwVar.a, dcwVar.b, f, f);
    }
}
