package defpackage;

import android.R;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.preference.DialogPreference;

/* JADX INFO: loaded from: classes.dex */
public abstract class agr extends bp implements DialogInterface.OnClickListener {
    private DialogPreference aa;
    private CharSequence ab;
    private CharSequence ac;
    private CharSequence ad;
    public int ae;
    private CharSequence af;
    private int ag;
    private BitmapDrawable ah;

    protected void ah(View view) {
        View viewFindViewById = view.findViewById(R.id.message);
        if (viewFindViewById != null) {
            CharSequence charSequence = this.af;
            int i = 0;
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else if (viewFindViewById instanceof TextView) {
                ((TextView) viewFindViewById).setText(charSequence);
            }
            if (viewFindViewById.getVisibility() != i) {
                viewFindViewById.setVisibility(i);
            }
        }
    }

    public abstract void ai(boolean z);

    protected boolean aj() {
        return false;
    }

    public final DialogPreference al() {
        if (this.aa == null) {
            this.aa = (DialogPreference) ((afw) v()).a(this.l.getString("key"));
        }
        return this.aa;
    }

    @Override // defpackage.bp, defpackage.bu
    public void f(Bundle bundle) {
        super.f(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.ab);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.ac);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.ad);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.af);
        bundle.putInt("PreferenceDialogFragment.layout", this.ag);
        BitmapDrawable bitmapDrawable = this.ah;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    protected void fq(id idVar) {
    }

    @Override // defpackage.bp, defpackage.bu
    public void gA(Bundle bundle) {
        super.gA(bundle);
        aee aeeVarV = v();
        if (!(aeeVarV instanceof afw)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        afw afwVar = (afw) aeeVarV;
        String string = this.l.getString("key");
        if (bundle != null) {
            this.ab = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.ac = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.ad = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.af = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.ag = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.ah = new BitmapDrawable(t(), bitmap);
                return;
            }
            return;
        }
        DialogPreference dialogPreference = (DialogPreference) afwVar.a(string);
        this.aa = dialogPreference;
        this.ab = dialogPreference.a;
        this.ac = dialogPreference.d;
        this.ad = dialogPreference.e;
        this.af = dialogPreference.b;
        this.ag = dialogPreference.f;
        Drawable drawable = dialogPreference.c;
        if (drawable == null || (drawable instanceof BitmapDrawable)) {
            this.ah = (BitmapDrawable) drawable;
            return;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        this.ah = new BitmapDrawable(t(), bitmapCreateBitmap);
    }

    @Override // defpackage.bp
    public final Dialog l() {
        this.ae = -2;
        id idVar = new id(r());
        idVar.i(this.ab);
        idVar.d(this.ah);
        idVar.h(this.ac, this);
        idVar.f(this.ad, this);
        int i = this.ag;
        View viewInflate = null;
        if (i != 0) {
            LayoutInflater layoutInflaterAf = this.R;
            if (layoutInflaterAf == null) {
                layoutInflaterAf = af();
            }
            viewInflate = layoutInflaterAf.inflate(i, (ViewGroup) null);
        }
        if (viewInflate != null) {
            ah(viewInflate);
            idVar.j(viewInflate);
        } else {
            idVar.e(this.af);
        }
        fq(idVar);
        ie ieVarB = idVar.b();
        if (aj()) {
            agq.a(ieVarB.getWindow());
        }
        return ieVarB;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.ae = i;
    }

    @Override // defpackage.bp, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        ai(this.ae == -1);
    }
}
