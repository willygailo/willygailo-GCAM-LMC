package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dcs {
    public static final ddi a;
    public static final ddg b;
    public static final ddg c;
    public static final ddg d;
    public static final ddg e;
    public static final ddg f;

    static {
        ddh ddhVar = new ddh();
        ddhVar.a = "camera.advice";
        b = ddhVar.c();
        ddh ddhVar2 = new ddh();
        ddhVar2.a = "camera.advice.dirtylens";
        c = ddhVar2.f();
        ddh ddhVar3 = new ddh();
        ddhVar3.a = "camera.advice.distance";
        d = ddhVar3.c();
        ddh ddhVar4 = new ddh();
        ddhVar4.a = "advice_total_exposure_threshold_front";
        e = ddhVar4.e();
        ddh ddhVar5 = new ddh();
        ddhVar5.a = "advice_total_exposure_threshold_rear";
        f = ddhVar5.e();
        ddh ddhVar6 = new ddh();
        ddhVar6.a = "dirty_lens_detector_timeout";
        a = ddhVar6.a();
        new ddh().a = "camera.advice.dld_log";
    }
}
