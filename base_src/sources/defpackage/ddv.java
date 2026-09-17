package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ddv {
    public static final ddg a;
    public static final ddg b;
    public static final ddg c;
    public static final ddg d;
    public static final ddg e;

    static {
        new ddh().a = "camera.optbar.hdr";
        ddh ddhVar = new ddh();
        ddhVar.a = "default_aspect_ratio";
        a = ddhVar.f();
        ddh ddhVar2 = new ddh();
        ddhVar2.a = "camera.use_video_resolution_option";
        b = ddhVar2.f();
        ddh ddhVar3 = new ddh();
        ddhVar3.a = "camera.optbar.show_auto_flash_option";
        c = ddhVar3.d();
        ddh ddhVar4 = new ddh();
        ddhVar4.a = "camera.optbar.standalone_settings_button";
        d = ddhVar4.f();
        ddh ddhVar5 = new ddh();
        ddhVar5.a = "camera.optbar.icons_on_closed_menu";
        e = ddhVar5.f();
    }
}
