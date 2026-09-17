package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ddq {
    public static final ddg a;
    public static final ddg b;
    public static final ddg c;
    public static final ddg d;
    public static final ddg e;
    public static final ddg f;
    public static final ddg g;
    public static final ddg h;

    static {
        ddh ddhVar = new ddh();
        ddhVar.a = "camera.enable_cuttlef";
        a = ddhVar.f();
        ddh ddhVar2 = new ddh();
        ddhVar2.a = "total_exposure_threshold_front";
        b = ddhVar2.e();
        ddh ddhVar3 = new ddh();
        ddhVar3.a = "total_exposure_threshold_rear";
        c = ddhVar3.e();
        ddh ddhVar4 = new ddh();
        ddhVar4.a = "camera.promote_night_sight";
        d = ddhVar4.f();
        ddh ddhVar5 = new ddh();
        ddhVar5.a = "camera.cuttle.glpreview";
        e = ddhVar5.f();
        ddh ddhVar6 = new ddh();
        ddhVar6.a = "camera.cuttle.sky_eager_init";
        f = ddhVar6.f();
        ddh ddhVar7 = new ddh();
        ddhVar7.a = "camera.cuttleface_edu";
        g = ddhVar7.f();
        ddh ddhVar8 = new ddh();
        ddhVar8.a = "camera.super_res_zoom_ns";
        h = ddhVar8.f();
    }

    public static float a(ddf ddfVar, lwd lwdVar) {
        return (lwdVar == lwd.FRONT ? (Float) ddfVar.g(b).c() : (Float) ddfVar.g(c).c()).floatValue();
    }

    public static float b(ddf ddfVar, lwd lwdVar) {
        return a(ddfVar, lwdVar) * (lwdVar == lwd.FRONT ? 0.9f : 0.8f);
    }
}
