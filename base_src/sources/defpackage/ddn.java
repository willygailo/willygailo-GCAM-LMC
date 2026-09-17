package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ddn {
    public static final ddg a;
    public static final ddg b;
    public static final ddg c;
    public static final ddg d;

    static {
        ddh ddhVar = new ddh();
        ddhVar.a = "camera.enable_imax";
        a = ddhVar.c();
        new ddh().a = "camera.imax_keep_models";
        new ddh().a = "camera.imax_ois";
        new ddh().a = "camera.imax_show_axis";
        new ddh().a = "camera.imax_live_tex";
        ddh ddhVar2 = new ddh();
        ddhVar2.a = "camera.imax_hdrnet_input";
        b = ddhVar2.f();
        ddh ddhVar3 = new ddh();
        ddhVar3.a = "camera.imax_reg_weight";
        c = ddhVar3.e();
        ddh ddhVar4 = new ddh();
        ddhVar4.a = "camera.imax_sum_weight";
        d = ddhVar4.e();
    }
}
