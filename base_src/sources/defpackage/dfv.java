package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.GoogleCameraEngR18F1.R;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class dfv extends dfk {
    public static final /* synthetic */ int i = 0;
    private static final ouj j = ouj.h("com/google/android/apps/camera/data/PhotoItem");
    public ojc h;
    private final ikp k;

    public dfv(Context context, dfl dflVar, btz btzVar, ikp ikpVar, hss hssVar) {
        super(context, dflVar, btzVar, hssVar);
        this.h = oih.a;
        this.k = ikpVar;
    }

    @Override // defpackage.bty
    public final bua b() {
        return bua.PHOTO;
    }

    @Override // defpackage.bty
    public final jry e(int i2, int i3) {
        lig ligVar;
        btz btzVar = this.e;
        if (btzVar.j()) {
            ikp ikpVar = this.k;
            hsp hspVarD = btzVar.d();
            hspVarD.getClass();
            ojc ojcVarB = ikpVar.a(hspVarD).b(bxe.p);
            jrx jrxVar = jrx.PLACEHOLDER;
            return new jry(ojcVarB);
        }
        int i4 = (int) (i2 * 0.7f);
        int i5 = (int) (i3 * 0.7f);
        int i6 = btzVar.e().a;
        int i7 = btzVar.e().b;
        if (i6 <= 1 || i7 <= 1) {
            ligVar = new lig(i4, i5);
        } else {
            if (btzVar.a() % 180 != 0) {
                i7 = i6;
                i6 = i7;
            }
            while (true) {
                if (i6 <= i4 && i7 <= i5) {
                    break;
                }
                i6 >>= 1;
                i7 >>= 1;
            }
            ligVar = new lig(i6, i7);
        }
        btzVar.c();
        try {
            Bitmap bitmap = (Bitmap) this.d.a().g(this.d.c(n(btzVar), ligVar)).e(btzVar.c()).i().get();
            btzVar.c();
            bitmap.getWidth();
            bitmap.getHeight();
            ojc ojcVarI = ojc.i(bitmap);
            jrx jrxVar2 = jrx.PLACEHOLDER;
            return new jry(ojcVarI);
        } catch (InterruptedException | ExecutionException e) {
            ((oug) ((oug) ((oug) j.b()).h(e)).G((char) 759)).r("Failed to generate thumbnail for %s", btzVar.c());
            oih oihVar = oih.a;
            jrx jrxVar3 = jrx.PLACEHOLDER;
            return new jry(oihVar);
        }
    }

    @Override // defpackage.bty
    public final View i(ojc ojcVar, ViewGroup viewGroup) {
        View viewJ;
        dfj dfjVarK = null;
        if (ojcVar.g()) {
            View view = (View) ojcVar.c();
            dfjVarK = k(view);
            viewJ = view;
        } else {
            viewJ = null;
        }
        if (dfjVarK == null) {
            viewJ = j(viewGroup);
            dfjVarK = k(viewJ);
            dfjVarK.getClass();
        }
        viewJ.getClass();
        viewJ.setTag(R.id.mediadata_tag_viewtype, Integer.valueOf(bua.PHOTO.ordinal()));
        dfjVarK.b.setVisibility(8);
        if (this.f.f() && dfjVarK.c.isClickable()) {
            dfjVarK.c.setVisibility(0);
        } else {
            dfjVarK.c.setVisibility(8);
        }
        l(viewJ);
        ImageView imageView = dfjVarK.a;
        if (this.e.j()) {
            imageView.setContentDescription(this.c.getResources().getString(R.string.media_processing_content_description));
        } else {
            boolean zD = this.f.d();
            int i2 = R.string.panorama_date_content_description;
            if (!zD && !this.f.e()) {
                i2 = this.f.f() ? R.string.photosphere_date_content_description : R.string.photo_date_content_description;
            }
            imageView.setContentDescription(this.c.getResources().getString(i2, b.format(this.e.h())));
        }
        return viewJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dfk
    protected final void m(dfj dfjVar) {
        ayk aykVarE;
        if (this.e.j()) {
            hsp hspVarD = this.e.d();
            hspVarD.getClass();
            ImageView imageView = dfjVar.a;
            ojc ojcVarA = this.k.a(hspVarD);
            if (!ojcVarA.g()) {
                ((oug) ((oug) dfk.a.c()).G((char) 738)).o("renderPlaceholderInto: No placeholder. Use default resource.");
                imageView.setImageResource(R.color.photo_placeholder);
                return;
            } else {
                Drawable drawableC = ((bik) ojcVarA.c()).c();
                if (drawableC instanceof Animatable) {
                    ((Animatable) drawableC).start();
                }
                imageView.setImageDrawable(drawableC);
                return;
            }
        }
        Uri uriC = this.e.c();
        bkx bkxVarC = this.d.c(n(this.e), this.g);
        btz btzVar = this.e;
        if (btzVar != null && mbs.a(btzVar.i()) == mbs.GIF) {
            bkxVarC = (bkx) bkxVarC.o();
        }
        if (this.h.g()) {
            aykVarE = this.d.b().g((bkx) bkxVarC.u((Drawable) this.h.c())).e(uriC);
        } else {
            ayk aykVarG = this.d.b().g(bkxVarC);
            dfl dflVar = this.d;
            azp azpVarN = n(this.e);
            lig ligVarD = dfl.d(dflVar.a, dflVar.b, dfl.e());
            aykVarE = aykVarG.f(this.d.b().g((bkx) ((bkx) ((bkx) ((bkx) ((bkx) new bkx().x(azpVarN)).H()).p()).t(ligVarD.a, ligVarD.b)).w(bjb.b, true)).e(uriC)).e(uriC);
        }
        aykVarE.j(dfjVar.a);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.e);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 11);
        sb.append("PhotoItem: ");
        sb.append(strValueOf);
        return sb.toString();
    }
}
