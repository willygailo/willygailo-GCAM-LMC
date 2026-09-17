package defpackage;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public final class jhn {
    private final Activity a;
    private final hvg b;
    private final huf c;
    private final cpj d;
    private final lco e;
    private final hvo f;
    private final cvo g;
    private final lwf h;
    private final emb i;

    public jhn(Activity activity, emb embVar, lwf lwfVar, hvg hvgVar, huf hufVar, cpj cpjVar, lco lcoVar, hvo hvoVar, cvo cvoVar, byte[] bArr, byte[] bArr2) {
        this.a = activity;
        this.i = embVar;
        this.h = lwfVar;
        this.b = hvgVar;
        this.c = hufVar;
        this.d = cpjVar;
        this.e = lcoVar;
        this.f = hvoVar;
        this.g = cvoVar;
    }

    public final void a() {
        Intent intent = new Intent();
        intent.setClassName("com.google.vr.apps.ornament", "com.google.vr.apps.ornament.app.MainActivity");
        b(intent);
    }

    public final void b(Intent intent) {
        intent.setFlags(65536);
        if (this.a.isVoiceInteractionRoot()) {
            intent.addFlags(268435456);
        }
        lwd lwdVarD = this.g.d();
        lwd lwdVar = lwd.BACK;
        lvs lvsVarE = this.h.e(lwdVar);
        lwd lwdVar2 = lwd.FRONT;
        lvs lvsVarE2 = this.h.e(lwdVar2);
        pvs pvsVar = new pvs();
        pvsVar.b = Boolean.valueOf(((Boolean) this.e.fA()).booleanValue());
        pvsVar.a = Boolean.valueOf(((Boolean) this.c.c(htu.a)).booleanValue());
        pvsVar.d = ((hvn) this.f.fA()).name();
        pvsVar.c = Boolean.valueOf(lwdVarD.equals(lwd.FRONT));
        pvsVar.g = this.b.a(lvsVarE2, lwdVar2).c().toString();
        pvsVar.h = this.d.a(lwdVar2).c().c().toString();
        pvsVar.e = this.b.a(lvsVarE, lwdVar).c().toString();
        pvsVar.f = this.d.a(lwdVar).c().c().toString();
        Boolean bool = pvsVar.a;
        if (bool != null) {
            intent.putExtra("settings_save_location", bool);
        }
        Boolean bool2 = pvsVar.b;
        if (bool2 != null) {
            intent.putExtra("settings_camera_sounds", bool2);
        }
        Boolean bool3 = pvsVar.c;
        if (bool3 != null) {
            intent.putExtra("settings_preferred_camera_type_is_front", bool3);
        }
        String str = pvsVar.d;
        if (str != null) {
            intent.putExtra("settings_volume_key_action", str);
        }
        String str2 = pvsVar.e;
        if (str2 != null) {
            intent.putExtra("settings_back_camera_photo_resolution", str2);
        }
        String str3 = pvsVar.f;
        if (str3 != null) {
            intent.putExtra("settings_back_camera_video_resolution", str3);
        }
        String str4 = pvsVar.g;
        if (str4 != null) {
            intent.putExtra("settings_front_camera_photo_resolution", str4);
        }
        String str5 = pvsVar.h;
        if (str5 != null) {
            intent.putExtra("settings_front_camera_video_resolution", str5);
        }
        int i = pvt.a;
        this.i.b(intent);
    }

    public final void c() {
        Intent intent = new Intent();
        intent.setClassName("com.google.vr.apps.ornament", "com.google.vr.apps.ornament.photobooth.activity.PhotoboothActivity");
        b(intent);
    }
}
