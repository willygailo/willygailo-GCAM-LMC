package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lrw {
    public final lyb a;
    public final lyg b;
    final lyb c;
    public final lyb d;
    public final lyb e;
    final lyb f;
    public final lyb g;
    final lyb h;
    public final lyb i;
    public final lyb j;
    final /* synthetic */ lrx k;

    public lrw(lrx lrxVar) {
        this.k = lrxVar;
        this.a = lrxVar.b.a("/pck/frameserver/frameserver_count", lyd.b("camera_id"));
        this.b = lrxVar.b.b("/pck/frameserver/frameserver_open_durations_ns", lyd.b("camera_id"));
        this.c = lrxVar.b.a("/pck/frameserver/frame_stream_count", lyd.b("camera_id"), lyd.a("stream_count"), lyd.a("parameter_count"));
        this.d = lrxVar.b.a("/pck/frameserver/framebuffer_acquire_count", new lyd[0]);
        this.e = lrxVar.b.a("/pck/frameserver/framebuffer_release_count", new lyd[0]);
        this.f = lrxVar.b.a("/pck/frameserver/request_submit_count", lyd.a("burst_size"), new lyd("repeating", Boolean.class));
        this.g = lrxVar.b.a("/pck/frameserver/request_abort", new lyd[0]);
        this.h = lrxVar.b.a("/pck/frameserver/stream_count", lyd.b("camera_id"), lyd.b("type"), lyd.a("format"), lyd.a("width"), lyd.a("height"), lyd.a("capacity"));
        this.i = lrxVar.b.a("/pck/frameserver/image_acquire_count", lyd.a("width"), lyd.a("height"), lyd.a("format"));
        this.j = lrxVar.b.a("/pck/frameserver/image_release_count", lyd.a("width"), lyd.a("height"), lyd.a("format"));
    }
}
