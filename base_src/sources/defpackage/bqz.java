package defpackage;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import com.google.android.GoogleCameraEngR18F1.R;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class bqz implements bqs, fik, fgt, fih, fgu {
    public final Activity a;
    public final brc b;
    public final DialogInterface.OnClickListener d;
    public final DialogInterface.OnClickListener e;
    public final ddf f;
    public pih g;
    public final emb i;
    private final bqt j;
    private final lar k;
    private final Executor l;
    private final boolean m;
    private final emb o;
    public final AtomicInteger c = new AtomicInteger();
    private boolean n = false;
    public ie h = null;

    public bqz(Activity activity, brc brcVar, fhv fhvVar, bqt bqtVar, emb embVar, emb embVar2, lar larVar, Executor executor, boolean z, ddf ddfVar, byte[] bArr, byte[] bArr2) {
        final int i = 1;
        this.d = new DialogInterface.OnClickListener(this) { // from class: bqu
            public final /* synthetic */ bqz a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                switch (i) {
                    case 0:
                        bqz bqzVar = this.a;
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.addCategory("android.intent.category.DEFAULT");
                        String strValueOf = String.valueOf(bqzVar.a.getPackageName());
                        intent.setData(Uri.parse(strValueOf.length() != 0 ? "package:".concat(strValueOf) : new String("package:")));
                        bqzVar.i.b(intent);
                        bqzVar.g.o(false);
                        bqzVar.b.a("Closing until required permissions are granted.");
                        break;
                    default:
                        bqz bqzVar2 = this.a;
                        bqzVar2.g.o(false);
                        bqzVar2.b.a("Required camera permissions were not granted.");
                        break;
                }
            }
        };
        final int i2 = 0;
        this.e = new DialogInterface.OnClickListener(this) { // from class: bqu
            public final /* synthetic */ bqz a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                switch (i2) {
                    case 0:
                        bqz bqzVar = this.a;
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.addCategory("android.intent.category.DEFAULT");
                        String strValueOf = String.valueOf(bqzVar.a.getPackageName());
                        intent.setData(Uri.parse(strValueOf.length() != 0 ? "package:".concat(strValueOf) : new String("package:")));
                        bqzVar.i.b(intent);
                        bqzVar.g.o(false);
                        bqzVar.b.a("Closing until required permissions are granted.");
                        break;
                    default:
                        bqz bqzVar2 = this.a;
                        bqzVar2.g.o(false);
                        bqzVar2.b.a("Required camera permissions were not granted.");
                        break;
                }
            }
        };
        this.a = activity;
        this.b = brcVar;
        this.j = bqtVar;
        this.o = embVar;
        this.i = embVar2;
        this.k = larVar;
        this.l = executor;
        this.m = z;
        this.f = ddfVar;
        enl.f(larVar, fhvVar, this);
    }

    private final void i(final int i, final boolean z) {
        this.k.execute(new Runnable() { // from class: bqy
            @Override // java.lang.Runnable
            public final void run() {
                final bqz bqzVar = this.a;
                int i2 = i;
                boolean z2 = z;
                DialogInterface.OnDismissListener onDismissListener = new DialogInterface.OnDismissListener() { // from class: bqv
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        bqz bqzVar2 = bqzVar;
                        if (dialogInterface == bqzVar2.h) {
                            bqzVar2.h = null;
                        }
                    }
                };
                final DialogInterface.OnClickListener onClickListener = bqzVar.d;
                DialogInterface.OnClickListener onClickListener2 = z2 ? null : bqzVar.e;
                lar.a();
                bqzVar.d();
                if (bqzVar.c.get() != 0) {
                    bqzVar.c.get();
                    return;
                }
                nyj nyjVar = new nyj(bqzVar.a, true != bqzVar.f.k(ddl.ay) ? 0 : 2132083558);
                nyjVar.t(bqzVar.a.getString(R.string.camera_permissions_error_title));
                nyjVar.m(bqzVar.a.getString(i2));
                nyjVar.k(false);
                nyjVar.p(new DialogInterface.OnKeyListener() { // from class: bqw
                    @Override // android.content.DialogInterface.OnKeyListener
                    public final boolean onKey(DialogInterface dialogInterface, int i3, KeyEvent keyEvent) {
                        DialogInterface.OnClickListener onClickListener3 = onClickListener;
                        if (i3 != 4) {
                            return false;
                        }
                        onClickListener3.onClick(dialogInterface, -2);
                        return true;
                    }
                });
                nyjVar.a.l = onDismissListener;
                nyjVar.o(bqzVar.a.getString(R.string.dialog_dismiss), onClickListener);
                if (onClickListener2 != null) {
                    nyjVar.r(bqzVar.a.getString(R.string.camera_menu_settings_label), onClickListener2);
                }
                bqzVar.h = nyjVar.c();
            }
        });
    }

    private final boolean j() {
        return this.m || this.j.c();
    }

    @Override // defpackage.bqs
    public final pht a() {
        pih pihVar = this.g;
        if (pihVar == null) {
            this.g = pih.f();
            if (this.j.b() && j()) {
                this.g.o(true);
            }
            if (!this.g.isDone()) {
                e();
            }
        } else {
            pihVar.isDone();
        }
        return this.g;
    }

    @Override // defpackage.bqs
    public final boolean b() {
        return this.n;
    }

    @Override // defpackage.bqs
    public final boolean c() {
        bqt bqtVar = this.j;
        String[] strArr = bqtVar.d;
        for (int i = 0; i < 2; i++) {
            String str = strArr[i];
            if (!bqtVar.b.containsKey(str)) {
                bqtVar.b.put(str, Boolean.valueOf(bqtVar.a(str)));
            }
        }
        return bqtVar.c();
    }

    public final void d() {
        ie ieVar = this.h;
        if (ieVar == null || !ieVar.isShowing()) {
            return;
        }
        this.h.dismiss();
    }

    public final void e() {
        obr.aQ(!lar.d());
        this.n = false;
        d();
        bqt bqtVar = this.j;
        String[] strArr = bqtVar.c;
        for (int i = 0; i < 6; i++) {
            String str = strArr[i];
            if (!bqtVar.b.containsKey(str) || !((Boolean) bqtVar.b.get(str)).booleanValue()) {
                bqtVar.b.put(str, Boolean.valueOf(bqtVar.a(str)));
            }
        }
        if (this.j.b() && j()) {
            this.g.o(true);
            return;
        }
        this.n = true;
        if (this.m) {
            i(R.string.error_permissions_keyguard_updated, true);
            return;
        }
        if (this.c.get() != 0) {
            this.c.get();
            return;
        }
        this.c.incrementAndGet();
        bqt bqtVar2 = this.j;
        emb embVar = this.o;
        ArrayList arrayList = new ArrayList();
        String[] strArr2 = bqtVar2.c;
        for (int i2 = 0; i2 < 6; i2++) {
            String str2 = strArr2[i2];
            if (!bqtVar2.b.containsKey(str2) || !((Boolean) bqtVar2.b.get(str2)).booleanValue()) {
                arrayList.add(str2);
            }
        }
        String[] strArr3 = (String[]) arrayList.toArray(new String[0]);
        strArr3.getClass();
        embVar.a.requestPermissions(strArr3, 151398431);
    }

    @Override // defpackage.fgt
    public final void f(int i, String[] strArr, int[] iArr) {
        if (i != 151398431) {
            return;
        }
        this.c.decrementAndGet();
        if (strArr.length == 0 || iArr.length == 0) {
            if (!lar.d()) {
                this.c.get();
                return;
            } else {
                this.c.get();
                this.l.execute(new Runnable() { // from class: bqx
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.e();
                    }
                });
                return;
            }
        }
        bqt bqtVar = this.j;
        int i2 = 0;
        while (true) {
            if (i2 >= strArr.length) {
                break;
            }
            if (!bqtVar.b.containsKey(strArr[i2]) || !((Boolean) bqtVar.b.get(strArr[i2])).booleanValue()) {
                bqtVar.b.put(strArr[i2], Boolean.valueOf(iArr[i2] == 0));
            }
            i2++;
        }
        if (!bqtVar.c()) {
            bqtVar.a.e(htu.a, false);
        }
        if (this.j.b()) {
            this.g.o(true);
        } else {
            i(R.string.error_permissions_updated, false);
        }
    }

    @Override // defpackage.fgu
    public final void g(Bundle bundle) {
        if (bundle.containsKey("PermissionsCheckerImpl.permissionsRequestCount")) {
            this.c.addAndGet(bundle.getInt("PermissionsCheckerImpl.permissionsRequestCount"));
        }
    }

    @Override // defpackage.fih
    public final void h(Bundle bundle) {
        bundle.putInt("PermissionsCheckerImpl.permissionsRequestCount", this.c.get());
    }
}
