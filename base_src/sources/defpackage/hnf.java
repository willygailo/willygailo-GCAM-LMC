package defpackage;

import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.os.Handler;
import android.support.constraint.Guideline;
import android.util.Size;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.rewind.RewindExportShotView;
import com.google.android.apps.camera.rewind.RewindThumbnailScrollView;
import com.google.android.apps.camera.ui.views.CaptureAnimationOverlay;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class hnf extends hnd {
    final /* synthetic */ hni b;

    public hnf(hni hniVar) {
        this.b = hniVar;
    }

    @Override // defpackage.hnd
    public void b() {
    }

    @Override // defpackage.hnd
    public void c() {
    }

    @Override // defpackage.hnd, defpackage.ihs, defpackage.iht
    public final void f() {
        ovd ovdVar = ovl.a;
        this.b.f.l();
        final hmy hmyVar = this.b.e;
        hmyVar.h.getClass();
        hmyVar.i.getClass();
        Object systemService = hmyVar.c.getSystemService("layout_inflater");
        systemService.getClass();
        LayoutInflater layoutInflater = (LayoutInflater) systemService;
        layoutInflater.inflate(R.layout.mcfly_preview, (ViewGroup) hmyVar.h, true);
        layoutInflater.inflate(R.layout.mcfly_controller_layout, (ViewGroup) hmyVar.i, true);
        ((FrameLayout) hmyVar.i.findViewById(R.id.mcfly_selection_bar)).setClipToOutline(true);
        jbt jbtVar = ((jbw) hmyVar.d.a()).b;
        int width = jbtVar.b.getWidth();
        Guideline guideline = (Guideline) hmyVar.i.findViewById(R.id.mcfly_bottom_bar_center);
        Guideline guideline2 = (Guideline) hmyVar.i.findViewById(R.id.mcfly_mode_switch_ui_bottom);
        jrz jrzVar = jrz.PORTRAIT;
        switch (((jbw) hmyVar.d.a()).a.h) {
            case PORTRAIT:
            case REVERSE_PORTRAIT:
                hmy.w(guideline, jbtVar.i.centerY());
                hmy.w(guideline2, jbtVar.l.bottom);
                break;
            case LANDSCAPE:
                hmy.w(guideline, jbtVar.i.centerX());
                hmy.w(guideline2, jbtVar.l.right);
                break;
            case REVERSE_LANDSCAPE:
                hmy.w(guideline, width - jbtVar.i.centerX());
                hmy.w(guideline2, width - jbtVar.l.left);
                break;
        }
        ImageView imageView = (ImageView) hmyVar.h.findViewById(R.id.mcfly_current_image);
        imageView.setClipToOutline(true);
        hme hmeVar = hmyVar.j;
        hna hnaVarA = hmeVar.a();
        if (hnaVarA != null) {
            hmh hmhVar = hmeVar.a;
            List listI = hnaVarA.a.i();
            if (!listI.isEmpty()) {
                otj it = ((oom) listI).iterator();
                while (it.hasNext()) {
                    lmr lmrVar = (lmr) it.next();
                    if (lmrVar == null) {
                        ((oug) ((oug) hmh.a.b().g(ovl.a, "McFlyBuffer")).G((char) 2558)).o("Error adding Raw frame to Rewind buffer: Frame is null.");
                    } else {
                        lmw lmwVarB = lmrVar.b();
                        if (lmwVarB == null) {
                            ((oug) ((oug) hmh.a.b().g(ovl.a, "McFlyBuffer")).G((char) 2557)).o("Error adding Raw frame to Rewind buffer: Frame id is null.");
                        } else if (hmhVar.c.containsKey(Long.valueOf(lmwVarB.b))) {
                            lmrVar.close();
                        } else {
                            hmhVar.c.put(Long.valueOf(lmwVarB.b), lmrVar);
                        }
                    }
                }
                if (hmhVar.c.size() > 6) {
                    ArrayList arrayList = new ArrayList(hmhVar.c.keySet());
                    Collections.sort(arrayList);
                    for (int i = 0; i < arrayList.size() - 6; i++) {
                        long jLongValue = ((Long) arrayList.get(i)).longValue();
                        ConcurrentHashMap concurrentHashMap = hmhVar.c;
                        Long lValueOf = Long.valueOf(jLongValue);
                        lmr lmrVar2 = (lmr) concurrentHashMap.get(lValueOf);
                        if (lmrVar2 != null) {
                            lmrVar2.close();
                        }
                        hmhVar.c.remove(lValueOf);
                    }
                }
            }
        }
        hmh hmhVar2 = hmeVar.a;
        hmhVar2.b.readLock().lock();
        try {
            final ArrayList arrayList2 = new ArrayList(hmhVar2.d.d());
            hmhVar2.b.readLock().unlock();
            Collections.sort(arrayList2, cdg.m);
            int size = arrayList2.size() - 1;
            if (!arrayList2.isEmpty()) {
                imageView.setImageDrawable(hmyVar.v((hnk) arrayList2.get(size)));
            }
            final CaptureAnimationOverlay captureAnimationOverlay = (CaptureAnimationOverlay) hmyVar.h.findViewById(R.id.capture_animation_overlay);
            RewindExportShotView rewindExportShotView = (RewindExportShotView) hmyVar.i.findViewById(R.id.mcfly_export_hdr_shot);
            final RewindThumbnailScrollView rewindThumbnailScrollView = (RewindThumbnailScrollView) hmyVar.i.findViewById(R.id.mcfly_thumbnail_scroller);
            rewindExportShotView.setOnClickListener(new View.OnClickListener() { // from class: hmp
                /* JADX WARN: Type inference failed for: r10v1, types: [hpr, java.lang.Object] */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    hmy hmyVar2 = hmyVar;
                    RewindThumbnailScrollView rewindThumbnailScrollView2 = rewindThumbnailScrollView;
                    List list = arrayList2;
                    CaptureAnimationOverlay captureAnimationOverlay2 = captureAnimationOverlay;
                    int iA = rewindThumbnailScrollView2.a();
                    if (iA == -1) {
                        return;
                    }
                    hmz hmzVar = hmyVar2.k;
                    hnk hnkVar = (hnk) list.get(iA);
                    Bitmap bitmapD = hnkVar.d();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    bww bwwVarC = hmzVar.a.c();
                    String strA = hmzVar.j.a(jCurrentTimeMillis);
                    hsg hsgVarA = hmzVar.i.a(jCurrentTimeMillis, dxh.NONE, "REWIND");
                    mbg mbgVar = hmzVar.k;
                    ?? r10 = mbgVar.c.get();
                    ljf ljfVar = (ljf) mbgVar.b.get();
                    ljfVar.getClass();
                    lco lcoVar = (lco) mbgVar.d.get();
                    lcoVar.getClass();
                    gqy gqyVar = (gqy) mbgVar.a.get();
                    gqyVar.getClass();
                    hhl hhlVar = (hhl) mbgVar.e.get();
                    hhlVar.getClass();
                    strA.getClass();
                    hri hriVar = new hri(r10, ljfVar, lcoVar, gqyVar, hhlVar, strA, bwwVarC, hsgVarA);
                    hmzVar.b.e(hriVar);
                    hmzVar.c.a(hriVar);
                    hriVar.P(new lig(hnkVar.b(), hnkVar.a()));
                    boolean z = ((Integer) hmzVar.h.c(htu.c)).intValue() != jbp.OFF.e;
                    boolean z2 = hnkVar.f() == lwd.FRONT;
                    hun hunVar = z2 ? htu.i : htu.j;
                    iij iijVarK = hriVar.k();
                    fka fkaVarA = fkb.a();
                    fkaVarA.c = 2;
                    String strS = hriVar.s();
                    String str = mbs.JPEG.j;
                    StringBuilder sb = new StringBuilder(strS.length() + 1 + String.valueOf(str).length());
                    sb.append(strS);
                    sb.append(".");
                    sb.append(str);
                    fkaVarA.d(sb.toString());
                    fkaVarA.g(z2);
                    fkaVarA.n(((Float) hmzVar.f.fA()).floatValue());
                    fkaVarA.e((String) hmzVar.h.c(hunVar));
                    fkaVarA.h(z);
                    fkaVarA.m(((hti) hmzVar.d.fA()).g);
                    fkaVarA.a = false;
                    fkaVarA.b(hnkVar.e());
                    fkaVarA.j((Boolean) hmzVar.h.c(htu.k));
                    fkaVarA.k((Boolean) hmzVar.g.fA());
                    fkaVarA.l(((Boolean) hmzVar.e.fA()).booleanValue());
                    fkaVarA.i(hriVar.j() == hss.MARS_STORE);
                    ((iik) iijVarK).w = fkaVarA.a();
                    hriVar.U(bitmapD, 0);
                    hriVar.W(bitmapD);
                    ikc ikcVar = new ikc(mbs.JPEG);
                    ikcVar.b(lic.b(0));
                    lmi lmiVarB = lmi.b();
                    lmiVarB.g(jCurrentTimeMillis);
                    ikcVar.a(lmiVarB.a);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmapD.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                    hriVar.r(byteArrayOutputStream.toByteArray(), ikcVar);
                    captureAnimationOverlay2.b();
                    hmyVar2.f.b(R.raw.camera_shutter);
                }
            });
            Size size2 = ((jbw) hmyVar.d.a()).b.b;
            int width2 = jrz.b(jrz.a(hmyVar.e.getDefaultDisplay(), hmyVar.c)) ? size2.getWidth() : size2.getHeight();
            rewindThumbnailScrollView.e(arrayList2, width2);
            for (final int i2 = 0; i2 < arrayList2.size(); i2++) {
                if (hmyVar.j.b((hnk) arrayList2.get(i2))) {
                    rewindThumbnailScrollView.d("Cannot set new high-quality indicators when uninitialized.");
                    FrameLayout frameLayout = (FrameLayout) rewindThumbnailScrollView.findViewById(R.id.mcfly_high_quality_indicator_container);
                    ImageView imageView2 = new ImageView(rewindThumbnailScrollView.b);
                    imageView2.setImageDrawable(rewindThumbnailScrollView.c);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(rewindThumbnailScrollView.d);
                    layoutParams.leftMargin += rewindThumbnailScrollView.c(i2);
                    imageView2.setOnClickListener(new View.OnClickListener() { // from class: hnb
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            rewindThumbnailScrollView.f(i2);
                        }
                    });
                    imageView2.setLayoutParams(layoutParams);
                    frameLayout.addView(imageView2);
                    SparseArray sparseArray = rewindThumbnailScrollView.a;
                    sparseArray.getClass();
                    sparseArray.put(i2, imageView2);
                    if (rewindThumbnailScrollView.e < i2) {
                        rewindThumbnailScrollView.e = i2;
                    }
                }
            }
            rewindThumbnailScrollView.g = new hmq(hmyVar, arrayList2, imageView, rewindExportShotView);
            hmv hmvVar = new hmv(rewindThumbnailScrollView, size, width2);
            imageView.setOnTouchListener(hmvVar);
            if (hmyVar.o == null) {
                hmyVar.o = new hmx(hmyVar, hmvVar);
                hmyVar.l.c.u(hmyVar.o);
            }
            Handler handler = hmyVar.m;
            rewindThumbnailScrollView.getClass();
            handler.post(new Runnable() { // from class: hmr
                @Override // java.lang.Runnable
                public final void run() {
                    RewindThumbnailScrollView rewindThumbnailScrollView2 = rewindThumbnailScrollView;
                    ObjectAnimator objectAnimator = rewindThumbnailScrollView2.f;
                    if (objectAnimator != null) {
                        objectAnimator.end();
                        rewindThumbnailScrollView2.f = null;
                    }
                    rewindThumbnailScrollView2.f(rewindThumbnailScrollView2.e);
                }
            });
            hmyVar.n.c();
        } catch (Throwable th) {
            hmhVar2.b.readLock().unlock();
            throw th;
        }
    }

    @Override // defpackage.hnd, defpackage.ihs, defpackage.iht
    public final void g() {
    }
}
