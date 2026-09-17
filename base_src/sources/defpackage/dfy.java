package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.GoogleCameraEngR18F1.R;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class dfy extends dfk {
    private static final ouj h = ouj.h("com/google/android/apps/camera/data/VideoItem");
    private lig i;

    public dfy(Context context, dfl dflVar, btz btzVar, hss hssVar) {
        super(context, dflVar, btzVar, hssVar);
    }

    private final int p() {
        int iA = this.f.a();
        return iA > 0 ? iA : this.e.e().b;
    }

    private final int q() {
        int iB = this.f.b();
        return iB > 0 ? iB : this.e.e().a;
    }

    private final boolean r() {
        String strC = this.f.c();
        return "90".equals(strC) || "270".equals(strC);
    }

    @Override // defpackage.bty
    public final bua b() {
        return bua.VIDEO;
    }

    @Override // defpackage.bty
    public final jry e(int i, int i2) {
        try {
            ojc ojcVarH = ojc.h((Bitmap) this.d.a().g(this.d.c(n(this.e), o())).g(dfl.f()).e(this.e.c()).i().get());
            jrx jrxVar = jrx.PLACEHOLDER;
            return new jry(ojcVarH);
        } catch (InterruptedException | ExecutionException e) {
            ((oug) ((oug) h.b()).G((char) 761)).o("Fails to generate thumbnail");
            oih oihVar = oih.a;
            jrx jrxVar2 = jrx.PLACEHOLDER;
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
        viewJ.setTag(R.id.mediadata_tag_viewtype, Integer.valueOf(bua.VIDEO.ordinal()));
        dfjVarK.c.setVisibility(8);
        l(viewJ);
        dfjVarK.a.setContentDescription(this.c.getResources().getString(R.string.video_date_content_description, b.format(this.e.h())));
        return viewJ;
    }

    @Override // defpackage.dfk
    protected final void m(dfj dfjVar) {
        this.d.a().g(this.d.c(n(this.e), o())).g(dfl.f()).e(this.e.c()).j(dfjVar.a).c();
    }

    public final lig o() {
        int iP = r() ? p() : q();
        int iQ = r() ? q() : p();
        lig ligVar = this.i;
        if (ligVar == null || iP != ligVar.a || iQ != ligVar.b) {
            this.i = new lig(iP, iQ);
        }
        return this.i;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.e);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 11);
        sb.append("VideoItem: ");
        sb.append(strValueOf);
        return sb.toString();
    }
}
