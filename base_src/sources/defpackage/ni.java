package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import android.widget.ListView;

/* JADX INFO: loaded from: classes2.dex */
final class ni implements DialogInterface.OnClickListener, np {
    ie a;
    final /* synthetic */ nq b;
    private ListAdapter c;
    private CharSequence d;

    public ni(nq nqVar) {
        this.b = nqVar;
    }

    @Override // defpackage.np
    public final int a() {
        return 0;
    }

    @Override // defpackage.np
    public final int b() {
        return 0;
    }

    @Override // defpackage.np
    public final Drawable c() {
        return null;
    }

    @Override // defpackage.np
    public final CharSequence d() {
        return this.d;
    }

    @Override // defpackage.np
    public final void e(ListAdapter listAdapter) {
        this.c = listAdapter;
    }

    @Override // defpackage.np
    public final void f(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.np
    public final void g(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.np
    public final void h(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.np
    public final void i(CharSequence charSequence) {
        this.d = charSequence;
    }

    @Override // defpackage.np
    public final void j(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.np
    public final void k() {
        ie ieVar = this.a;
        if (ieVar != null) {
            ieVar.dismiss();
            this.a = null;
        }
    }

    @Override // defpackage.np
    public final void l(int i, int i2) {
        if (this.c == null) {
            return;
        }
        id idVar = new id(this.b.a);
        CharSequence charSequence = this.d;
        if (charSequence != null) {
            idVar.i(charSequence);
        }
        ListAdapter listAdapter = this.c;
        int selectedItemPosition = this.b.getSelectedItemPosition();
        hz hzVar = idVar.a;
        hzVar.o = listAdapter;
        hzVar.p = this;
        hzVar.v = selectedItemPosition;
        hzVar.u = true;
        ie ieVarB = idVar.b();
        this.a = ieVarB;
        ListView listView = ieVarB.a.f;
        listView.setTextDirection(i);
        listView.setTextAlignment(i2);
        this.a.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.b.setSelection(i);
        if (this.b.getOnItemClickListener() != null) {
            this.b.performItemClick(null, i, this.c.getItemId(i));
        }
        k();
    }

    @Override // defpackage.np
    public final boolean u() {
        ie ieVar = this.a;
        if (ieVar != null) {
            return ieVar.isShowing();
        }
        return false;
    }
}
