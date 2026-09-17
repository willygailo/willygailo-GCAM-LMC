package defpackage;

import android.graphics.Rect;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ibb implements ibm {
    protected final ih a;
    protected final img b;
    protected final ojz c;
    protected final ddf d;
    protected final int e;
    protected final WindowManager f;
    public final Rect g = new Rect();
    public FrameLayout h;
    public ViewGroup i;
    public View j;
    private bty k;
    private jrz l;

    public ibb(ih ihVar, img imgVar, ojz ojzVar, ddf ddfVar, WindowManager windowManager) {
        this.a = ihVar;
        this.b = imgVar;
        this.c = ojzVar;
        this.d = ddfVar;
        this.f = windowManager;
        this.e = ihVar.getResources().getInteger(R.integer.social_anim_duration_default);
    }

    private final ojc h(bty btyVar, ojz ojzVar) {
        lhs lhsVarE = lhs.e(btyVar.a().e());
        if (lhs.a.k(lhsVarE) || lhs.a.l(lhsVarE)) {
            return a(lhs.a, ojzVar);
        }
        return (lhs.b.k(lhsVarE) || lhs.b.l(lhsVarE)) ? a(lhs.b, ojzVar) : oih.a;
    }

    private final void i() {
        View view = this.j;
        view.getClass();
        view.setPadding(this.g.left, this.g.top, this.g.right, this.g.bottom);
    }

    private final void j(ojc ojcVar) {
        if (!ojcVar.g()) {
            this.g.setEmpty();
            return;
        }
        Rect rect = ((jbt) ojcVar.c()).k;
        Rect rect2 = ((jbt) ojcVar.c()).e;
        if (jrz.LANDSCAPE.equals(this.l)) {
            int iWidth = rect.width();
            int iWidth2 = rect2.width();
            this.g.set(rect2.left, 0, (iWidth - iWidth2) - rect2.left, 0);
            return;
        }
        if (jrz.REVERSE_LANDSCAPE.equals(this.l)) {
            int i = rect.right - rect2.right;
            this.g.set((rect.width() - rect2.width()) - i, 0, i, 0);
            return;
        }
        int iHeight = rect.height();
        int iHeight2 = rect2.height();
        this.g.set(0, rect2.top, 0, (iHeight - iHeight2) - rect2.top);
    }

    protected final ojc a(lhs lhsVar, ojz ojzVar) {
        boolean z = true;
        if (!lhs.a.k(lhsVar) && !lhs.b.k(lhsVar)) {
            z = false;
        }
        obr.aQ(z);
        jbw jbwVar = (jbw) this.c.a();
        jbv jbvVar = jbwVar.a;
        Size size = jbvVar.b;
        if (size == null) {
            return oih.a;
        }
        Size size2 = jbvVar.d;
        lhs lhsVarG = size2 == null ? null : lhs.g(size2);
        if (lhsVarG != null && lhsVarG.k(lhsVar)) {
            return ojc.i(jbwVar.b);
        }
        boolean zK = this.d.k(dcu.J);
        Size size3 = (jrz.LANDSCAPE.equals(jbvVar.h) || jrz.REVERSE_LANDSCAPE.equals(jbvVar.h)) ? new Size((int) ((size.getHeight() * lhsVar.d) / lhsVar.e), size.getHeight()) : new Size(size.getWidth(), (int) lhsVar.a(size.getWidth()));
        jbu jbuVarB = jbvVar.b();
        jbuVarB.b = size3;
        jbv jbvVarA = jbuVarB.a();
        boolean zED = mip.eD(this.a, this.f.getDefaultDisplay());
        ih ihVar = this.a;
        img imgVar = this.b;
        this.d.k(ddv.e);
        return ojc.i(jbr.c(jbvVarA, zED, ihVar, imgVar, ojzVar, zK));
    }

    protected final void b() {
        cu cuVarFm = this.a.fm();
        bu buVarD = cuVarFm.d("VIDEO_PLAYER_TAG");
        if (buVarD != null) {
            dd ddVarH = cuVarFm.h();
            ddVarH.j(buVarD);
            ddVarH.b();
        }
    }

    @Override // defpackage.ibm
    public final void c(final boolean z) {
        b();
        FrameLayout frameLayout = this.h;
        frameLayout.getClass();
        Runnable runnable = new Runnable() { // from class: ibq
            @Override // java.lang.Runnable
            public final void run() {
                ibb ibbVar = this.b;
                if (z) {
                    FrameLayout frameLayout2 = ibbVar.h;
                    frameLayout2.getClass();
                    frameLayout2.announceForAccessibility(frameLayout2.getResources().getText(R.string.accessibility_close_social_share));
                }
            }
        };
        frameLayout.animate().cancel();
        if (frameLayout.getAlpha() != 0.0f || frameLayout.getVisibility() != 8) {
            if (z) {
                frameLayout.animate().alpha(0.0f).setDuration((int) (this.e * frameLayout.getAlpha())).withEndAction(new iba(frameLayout, runnable, 0)).start();
            } else {
                frameLayout.setVisibility(8);
                frameLayout.setAlpha(0.0f);
                runnable.run();
            }
        }
        this.k = null;
    }

    @Override // defpackage.ibm
    public final void d(View view) {
        View viewFindViewById = view.findViewById(R.id.social_root_background);
        View viewFindViewById2 = view.findViewById(R.id.social_preview_container);
        viewFindViewById.setVisibility(8);
        viewFindViewById2.setVisibility(8);
        FrameLayout frameLayout = (FrameLayout) ((ViewGroup) view.getParent()).findViewById(R.id.social_preview_container2);
        this.h = frameLayout;
        this.i = (ViewGroup) frameLayout.findViewById(R.id.social_preview_video_container);
    }

    @Override // defpackage.ibm
    public final void e(jrz jrzVar) {
        this.l = jrzVar;
        bty btyVar = this.k;
        if (btyVar != null) {
            FrameLayout frameLayout = this.h;
            frameLayout.getClass();
            j(h(btyVar, new ibo(frameLayout)));
            i();
            bu buVarD = this.a.fm().d("VIDEO_PLAYER_TAG");
            if (buVarD instanceof jux) {
                ((jux) buVarD).a.d(this.g);
            }
        }
    }

    @Override // defpackage.ibm
    public final void f(View.OnTouchListener onTouchListener) {
        FrameLayout frameLayout = this.h;
        frameLayout.getClass();
        frameLayout.setOnTouchListener(onTouchListener);
    }

    @Override // defpackage.ibm
    public final void g(final bty btyVar) {
        bty btyVar2 = this.k;
        boolean z = btyVar2 == null || btyVar.equals(btyVar2);
        obr.aQ(z);
        if (btyVar.equals(this.k) && (btyVar instanceof dfv)) {
            dfv dfvVar = (dfv) btyVar;
            View view = this.j;
            view.getClass();
            dfj dfjVarK = dfv.k(view);
            dfvVar.h = ojc.h(dfjVarK == null ? null : dfjVarK.a.getDrawable());
        }
        this.k = btyVar;
        FrameLayout frameLayout = this.h;
        frameLayout.getClass();
        ojc ojcVarH = h(btyVar, new ibo(frameLayout));
        if (ojcVarH.g()) {
            bty btyVar3 = this.k;
            btyVar3.getClass();
            lig ligVarE = btyVar3.a().e();
            lig ligVarG = lig.g(((jbt) ojcVarH.c()).e);
            lig ligVarD = ligVarE.k() ? ligVarG.d() : ligVarG.e();
            bty btyVar4 = this.k;
            btyVar4.getClass();
            btyVar4.h(ligVarD.a, ligVarD.b);
        }
        ojc ojcVarH2 = ojc.h(this.j);
        FrameLayout frameLayout2 = this.h;
        frameLayout2.getClass();
        View viewI = btyVar.i(ojcVarH2, frameLayout2);
        this.j = viewI;
        viewI.setVisibility(0);
        j(ojcVarH);
        i();
        if (this.j.getParent() == null) {
            this.h.addView(this.j);
        }
        FrameLayout frameLayout3 = this.h;
        Runnable runnable = new Runnable() { // from class: ibp
            @Override // java.lang.Runnable
            public final void run() {
                final ibb ibbVar = this.b;
                bty btyVar5 = btyVar;
                if (btyVar5 instanceof dfy) {
                    MediaPlayer.OnInfoListener onInfoListener = new MediaPlayer.OnInfoListener() { // from class: ibn
                        @Override // android.media.MediaPlayer.OnInfoListener
                        public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
                            ibb ibbVar2 = ibbVar;
                            if (i == 3) {
                                View view2 = ibbVar2.j;
                                view2.getClass();
                                view2.setVisibility(8);
                                return false;
                            }
                            if (i != 805 && i != 804) {
                                return false;
                            }
                            Toast.makeText(ibbVar2.a, R.string.toast_cannot_play_video, 1).show();
                            ibbVar2.b();
                            return false;
                        }
                    };
                    ViewGroup viewGroup = ibbVar.i;
                    viewGroup.getClass();
                    Rect rect = ibbVar.g;
                    Uri uriC = ((dfy) btyVar5).e.c();
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("no_seek_bar", false);
                    bundle.putBoolean("auto_loop_enabled", true);
                    bundle.putParcelable("video_view_padding", rect);
                    jux juxVarK = jux.k(bundle, uriC);
                    juxVarK.b = ojc.i(onInfoListener);
                    dd ddVarH = ibbVar.a.fm().h();
                    ddVarH.m(viewGroup.getId(), juxVarK, "VIDEO_PLAYER_TAG");
                    ddVarH.b();
                }
                FrameLayout frameLayout4 = ibbVar.h;
                frameLayout4.getClass();
                frameLayout4.announceForAccessibility(frameLayout4.getResources().getText(R.string.accessibility_open_social_share));
            }
        };
        frameLayout3.animate().cancel();
        if (frameLayout3.getAlpha() == 1.0f && frameLayout3.getVisibility() == 0) {
            return;
        }
        frameLayout3.setAlpha(Math.max(frameLayout3.getAlpha(), 1.0E-4f));
        frameLayout3.setVisibility(0);
        frameLayout3.animate().alpha(1.0f).setDuration((int) (this.e * (1.0f - frameLayout3.getAlpha()))).withEndAction(new iba(frameLayout3, runnable, 1)).start();
    }
}
