package defpackage;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Shader;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.google.android.apps.camera.bottombar.R;
import com.google.android.apps.camera.bottombar.RoundedThumbnailView;
import com.google.android.apps.camera.filmstrip.transition.FilmstripTransitionLayout;
import com.google.android.apps.camera.filmstrip.transition.FilmstripTransitionThumbnailView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class dtz implements dtp {
    public static final ouj a = ouj.h("com/google/android/apps/camera/filmstrip/photos/PhotosReviewLauncherImpl");
    private static final int h = R.dimen.rounded_thumbnail_diameter_normal;
    public final pyn b;
    public final FilmstripTransitionLayout c;
    public final RoundedThumbnailView d;
    public final lar e;
    public final huf f;
    public pht g = plk.V(Boolean.FALSE);
    private final Context i;
    private final boolean j;
    private final ixj k;
    private final dej l;
    private final hrd m;
    private final fjs n;
    private final jue o;
    private final ivj p;
    private final pyn q;
    private final Activity r;
    private final bqh s;
    private final boolean t;
    private hnw u;
    private final ikm v;
    private final emb w;

    public dtz(Context context, boolean z, pyn pynVar, ixj ixjVar, dej dejVar, emb embVar, hrd hrdVar, fjs fjsVar, Activity activity, lar larVar, jue jueVar, jnr jnrVar, ivj ivjVar, pyn pynVar2, ikm ikmVar, bqh bqhVar, huf hufVar, boolean z2, byte[] bArr, byte[] bArr2) {
        this.i = context;
        this.j = z;
        this.b = pynVar;
        this.k = ixjVar;
        this.l = dejVar;
        this.w = embVar;
        this.m = hrdVar;
        this.n = fjsVar;
        this.e = larVar;
        this.s = bqhVar;
        this.r = activity;
        this.o = jueVar;
        this.c = (FilmstripTransitionLayout) jnrVar.c.c(com.google.android.GoogleCameraEngR18F1.R.id.filmstrip_transition_layout);
        this.d = (RoundedThumbnailView) jnrVar.c.c(R.id.thumbnail_button);
        this.p = ivjVar;
        this.q = pynVar2;
        this.v = ikmVar;
        this.f = hufVar;
        this.t = z2;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0062  */
    /* JADX WARN: Code duplicated, block: B:15:0x006c  */
    /* JADX WARN: Code duplicated, block: B:16:0x0075  */
    private final pht i(Intent intent) {
        if (intent.resolveActivity(this.i.getPackageManager()) == null) {
            ((dtt) this.q.get()).fV();
            this.d.setVisibility(0);
            return plk.U(new CancellationException("Photos is disabled."));
        }
        this.k.c();
        this.s.e = 3;
        if (this.t) {
            if (this.o.b(true != Build.ID.startsWith("RD2") ? "5.29" : "5.38")) {
                intent.putExtra("shared_element_return_transition", true);
                intent.putExtra("return_transition_thumbnail_diameter", this.r.getResources().getDimension(h));
                ActivityOptions activityOptionsMakeSceneTransitionAnimation = ActivityOptions.makeSceneTransitionAnimation(this.r, this.d, "photos:filmstrip_transition_view");
                emb embVar = this.w;
                Bundle bundle = activityOptionsMakeSceneTransitionAnimation.toBundle();
                bundle.getClass();
                embVar.a.startActivityForResult(intent, 0, bundle);
            } else if (this.o.b("3.9")) {
                this.w.c(intent, com.google.android.GoogleCameraEngR18F1.R.anim.photos_transition_noanim, com.google.android.GoogleCameraEngR18F1.R.anim.photos_transition_noanim);
            } else {
                this.w.c(intent, com.google.android.GoogleCameraEngR18F1.R.anim.on_photos_enter, com.google.android.GoogleCameraEngR18F1.R.anim.on_camera_exit);
            }
        } else if (this.o.b("3.9")) {
            this.w.c(intent, com.google.android.GoogleCameraEngR18F1.R.anim.photos_transition_noanim, com.google.android.GoogleCameraEngR18F1.R.anim.photos_transition_noanim);
        } else {
            this.w.c(intent, com.google.android.GoogleCameraEngR18F1.R.anim.on_photos_enter, com.google.android.GoogleCameraEngR18F1.R.anim.on_camera_exit);
        }
        return plk.V(Boolean.TRUE);
    }

    @Override // defpackage.dtp
    public final pht a() {
        Intent intentD = aap.d(this.j, true, this.r.isVoiceInteractionRoot(), new long[0]);
        intentD.setData(nhn.a);
        hnw hnwVar = this.u;
        if (hnwVar != null) {
            hnwVar.B();
        }
        return i(intentD);
    }

    @Override // defpackage.dtp
    public final void b() {
        lar.a();
        if (e()) {
            return;
        }
        final int i = 0;
        final byte[] bArr = null;
        if (this.o.a() == null) {
            ((oug) ((oug) a.c()).G((char) 929)).o("Cannot find Photos package info. Canceling.");
            final ikm ikmVar = this.v;
            nyj nyjVar = new nyj(ikmVar.a, ikmVar.b);
            nyjVar.s(com.google.android.GoogleCameraEngR18F1.R.string.photos_required_title);
            nyjVar.l(com.google.android.GoogleCameraEngR18F1.R.string.photos_required_message);
            nyjVar.q(com.google.android.GoogleCameraEngR18F1.R.string.play_store_button, new DialogInterface.OnClickListener(ikmVar, i, bArr) { // from class: dtq
                public final /* synthetic */ ikm a;
                private final /* synthetic */ int b;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    switch (this.b) {
                        case 0:
                            ikm ikmVar2 = this.a;
                            ikmVar2.a.startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse("market://details?id=com.google.android.apps.photos")).addCategory("android.intent.category.BROWSABLE"));
                            break;
                        default:
                            ikm ikmVar3 = this.a;
                            ikmVar3.a.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.parse("package:com.google.android.apps.photos")));
                            break;
                    }
                }
            });
            nyjVar.n(android.R.string.cancel, null);
            nyjVar.c();
            return;
        }
        final int i2 = 1;
        try {
            Context context = this.o.b;
            int applicationEnabledSetting = context.getPackageManager().getApplicationEnabledSetting(context.getPackageName());
            if (applicationEnabledSetting == 0 || applicationEnabledSetting == 1) {
                this.r.getWindow().setSharedElementsUseOverlay(false);
                obr.aQ(!e());
                final bty btyVarF = f((bue) this.b.get());
                pht phtVarH = pfj.h((btyVarF == null && this.j) ? plk.U(new CancellationException("FilmstripDataAdapter is empty in secure activity")) : (pht) this.p.b().b(new oiu() { // from class: dtu
                    @Override // defpackage.oiu
                    public final Object a(Object obj) {
                        dtz dtzVar = this.a;
                        bty btyVar = btyVarF;
                        Bitmap bitmap = (Bitmap) obj;
                        pih pihVarF = pih.f();
                        dtzVar.c.setVisibility(0);
                        FilmstripTransitionLayout filmstripTransitionLayout = dtzVar.c;
                        filmstripTransitionLayout.f = dtzVar.d;
                        filmstripTransitionLayout.g = false;
                        dty dtyVar = new dty(dtzVar, pihVarF, btyVar);
                        FilmstripTransitionThumbnailView filmstripTransitionThumbnailView = filmstripTransitionLayout.e;
                        synchronized (filmstripTransitionThumbnailView.a) {
                            filmstripTransitionThumbnailView.b = bitmap;
                            filmstripTransitionThumbnailView.setLayoutParams(new FrameLayout.LayoutParams(filmstripTransitionThumbnailView.b.getWidth(), filmstripTransitionThumbnailView.b.getHeight()));
                            filmstripTransitionThumbnailView.requestLayout();
                            Paint paint = new Paint(1);
                            paint.setShader(new BitmapShader(filmstripTransitionThumbnailView.b, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
                            filmstripTransitionThumbnailView.c = new Paint(paint);
                        }
                        if (filmstripTransitionLayout.a.isRunning()) {
                            filmstripTransitionLayout.h = filmstripTransitionLayout.a().a();
                        }
                        filmstripTransitionLayout.i = dtyVar;
                        filmstripTransitionLayout.h = filmstripTransitionLayout.a().a();
                        float fB = filmstripTransitionLayout.h.b(1.0f);
                        filmstripTransitionLayout.e.setScaleX(fB);
                        filmstripTransitionLayout.e.setScaleY(fB);
                        PointF pointFC = filmstripTransitionLayout.h.c(1.0f);
                        filmstripTransitionLayout.e.setTranslationX(pointFC.x);
                        filmstripTransitionLayout.e.setTranslationY(pointFC.y);
                        filmstripTransitionLayout.e.b(filmstripTransitionLayout.h.a(1.0f));
                        filmstripTransitionLayout.b(due.d(1.0f));
                        filmstripTransitionLayout.a.start();
                        return pihVarF;
                    }
                }).d(new ojz() { // from class: dtv
                    @Override // defpackage.ojz
                    public final Object a() {
                        final dtz dtzVar = this.a;
                        final bty btyVar = btyVarF;
                        ((oug) ((oug) dtz.a.c()).G((char) 918)).o("Thumbnail is null when startLaunchingPhotos. Launch Photos Anyway.");
                        return plk.aa(new pgj() { // from class: dtw
                            @Override // defpackage.pgj
                            public final pht a() {
                                return dtzVar.h(btyVar);
                            }
                        }, dtzVar.e);
                    }
                }), CancellationException.class, bxe.q, pgr.INSTANCE);
                this.g = phtVarH;
                plk.af(phtVarH, new cdd(2), pgr.INSTANCE);
                return;
            }
        } catch (IllegalArgumentException e) {
            ((oug) ((oug) ((oug) jue.a.c()).h(e)).G((char) 3520)).o("Photos app package not found.");
        }
        ((oug) ((oug) a.c()).G((char) 928)).o("Photos is disabled. Canceling.");
        final ikm ikmVar2 = this.v;
        nyj nyjVar2 = new nyj(ikmVar2.a, ikmVar2.b);
        nyjVar2.s(com.google.android.GoogleCameraEngR18F1.R.string.photos_disabled_title);
        nyjVar2.l(com.google.android.GoogleCameraEngR18F1.R.string.photos_disabled_message);
        nyjVar2.q(com.google.android.GoogleCameraEngR18F1.R.string.settings_button, new DialogInterface.OnClickListener(ikmVar2, i2, bArr) { // from class: dtq
            public final /* synthetic */ ikm a;
            private final /* synthetic */ int b;

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                switch (this.b) {
                    case 0:
                        ikm ikmVar3 = this.a;
                        ikmVar3.a.startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse("market://details?id=com.google.android.apps.photos")).addCategory("android.intent.category.BROWSABLE"));
                        break;
                    default:
                        ikm ikmVar4 = this.a;
                        ikmVar4.a.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.parse("package:com.google.android.apps.photos")));
                        break;
                }
            }
        });
        nyjVar2.n(android.R.string.cancel, null);
        nyjVar2.c();
    }

    @Override // defpackage.dtp
    public final void c() {
        if (e()) {
            ((buc) this.q.get()).f();
            this.g.cancel(false);
            this.g = plk.V(Boolean.FALSE);
        }
    }

    @Override // defpackage.dtp
    public final void d(hnw hnwVar) {
        this.u = hnwVar;
    }

    @Override // defpackage.dtp
    public final boolean e() {
        if (!this.g.isDone()) {
            return true;
        }
        Boolean bool = (Boolean) mip.bY(this.g);
        obr.ao(bool);
        return bool.booleanValue();
    }

    final bty f(bue bueVar) {
        Iterator it = bueVar.iterator();
        while (it.hasNext()) {
            bty btyVar = (bty) it.next();
            btyVar.getClass();
            if (!btyVar.a().j()) {
                return btyVar;
            }
            hsp hspVarD = btyVar.a().d();
            String.format(Locale.ROOT, "Null ShotId encountered for item: %s", btyVar.a());
            hspVarD.getClass();
            if (!this.m.a.contains(hspVarD)) {
                return btyVar;
            }
        }
        return null;
    }

    public final pht g(bty btyVar) {
        String str;
        hsr hsrVar;
        hsr hsrVar2;
        String str2;
        int i;
        obr.aQ(!this.g.isDone());
        boolean z = this.j;
        boolean zBooleanValue = ((Boolean) this.f.c(htu.ab)).booleanValue();
        boolean zIsVoiceInteractionRoot = this.r.isVoiceInteractionRoot();
        btx<bty> btxVar = (btx) this.b.get();
        btxVar.a();
        ArrayList arrayList = new ArrayList();
        for (bty btyVar2 : btxVar) {
            oom oomVarF = btyVar2.a().f();
            if (oomVarF.isEmpty()) {
                arrayList.add(Long.valueOf(btyVar2.a().b()));
            } else {
                int size = oomVarF.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Long l = (Long) oomVarF.get(i2);
                    if (l.longValue() != -1) {
                        arrayList.add(l);
                    }
                }
            }
        }
        Object[] array = arrayList.toArray();
        int length = array.length;
        long[] jArr = new long[length];
        for (int i3 = 0; i3 < length; i3++) {
            Object obj = array[i3];
            obj.getClass();
            jArr[i3] = ((Number) obj).longValue();
        }
        arrayList.size();
        Arrays.toString(jArr);
        Intent intentD = aap.d(z, zBooleanValue, zIsVoiceInteractionRoot, jArr);
        long jA = this.n.a();
        obr.aI(true, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", 10);
        if (jA == 0) {
            str = "0";
        } else if (jA > 0) {
            str = Long.toString(jA, 10);
        } else {
            char[] cArr = new char[64];
            long j = (jA >>> 1) / 5;
            int i4 = 63;
            cArr[63] = Character.forDigit((int) (jA - (j * 10)), 10);
            for (long j2 = 0; j > j2; j2 = 0) {
                i4--;
                cArr[i4] = Character.forDigit((int) (j % 10), 10);
                j /= 10;
            }
            str = new String(cArr, i4, 64 - i4);
        }
        intentD.putExtra("external_session_id", str);
        fmh fmhVarC = btyVar.c();
        if (fmhVarC == null) {
            hsrVar = hsr.UNKNOWN;
        } else if (fmhVarC.d()) {
            hsrVar = hsr.PANORAMA;
        } else if (fmhVarC.e()) {
            hsrVar = hsr.PHOTOSPHERE;
        } else {
            hsrVar = (fmhVarC.b() <= 0 || fmhVarC.b.d <= 0 || fmhVarC.a() <= 0 || fmhVarC.c().length() <= 0) ? hsr.UNKNOWN : hsr.VIDEO;
        }
        btz btzVarA = btyVar.a();
        if (((Boolean) this.f.c(htu.ab)).booleanValue() || !btzVarA.j() || btzVarA.d() == null) {
            obr.aR(true ^ btzVarA.c().equals(Uri.EMPTY), "Item is no longer in progress but data doesn't have a valid URI.");
            intentD.setData(btzVarA.c());
            hsrVar2 = hsrVar;
        } else {
            hrd hrdVar = this.m;
            hsp hspVarD = btzVarA.d();
            hspVarD.getClass();
            hsj hsjVar = (hsj) hrdVar.b.get(hspVarD);
            if (hsjVar != null) {
                hsrVar = hsjVar.c;
            }
            Uri uriC = hsjVar != null ? hsjVar.b : btyVar.a().c();
            intentD.setDataAndType(uriC, mbs.JPEG.i);
            intentD.putExtra("processing_uri_intent_extra", new Uri.Builder().scheme("content").authority(this.l.e).appendPath("processing").appendPath(uriC.getLastPathSegment()).build());
            hsrVar2 = hsrVar;
        }
        PackageInfo packageInfoA = this.o.a();
        if (packageInfoA != null) {
            str2 = packageInfoA.versionName;
            i = packageInfoA.versionCode;
        } else {
            str2 = null;
            i = 0;
        }
        this.n.B(str, btyVar.a().j(), hsrVar2, str2, i);
        return i(intentD);
    }

    public final pht h(bty btyVar) {
        obr.aQ(!this.g.isDone());
        if (btyVar != null) {
            return g(btyVar);
        }
        final pih pihVarF = pih.f();
        ((bue) this.b.get()).g().d(new Runnable() { // from class: dtx
            @Override // java.lang.Runnable
            public final void run() {
                dtz dtzVar = this.a;
                pih pihVar = pihVarF;
                if (dtzVar.g.isDone()) {
                    CancellationException cancellationException = new CancellationException("Photos Launch was already cancelled.");
                    ((oug) ((oug) ((oug) dtz.a.c()).h(cancellationException)).G((char) 927)).o("launchPhotos");
                    pihVar.a(cancellationException);
                    return;
                }
                bty btyVarF = dtzVar.f((bue) dtzVar.b.get());
                if (btyVarF != null) {
                    pihVar.e(dtzVar.g(btyVarF));
                } else {
                    if (((Boolean) dtzVar.f.c(htu.ab)).booleanValue()) {
                        pihVar.e(dtzVar.a());
                        return;
                    }
                    CancellationException cancellationException2 = new CancellationException("filmstrip item was null");
                    ((oug) ((oug) ((oug) dtz.a.b()).h(cancellationException2)).G((char) 926)).o("launchPhotos");
                    pihVar.a(cancellationException2);
                }
            }
        }, this.e);
        return pihVarF;
    }
}
