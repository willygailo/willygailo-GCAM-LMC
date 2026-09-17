package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AlertController$RecycleListView;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public class id {
    public final hz a;
    private final int b;

    public id(Context context) {
        this(context, ie.a(context, 0));
    }

    public id(Context context, int i) {
        this.a = new hz(new ContextThemeWrapper(context, ie.a(context, i)));
        this.b = i;
    }

    public final Context a() {
        return this.a.a;
    }

    public ie b() {
        ListAdapter ibVar;
        ie ieVar = new ie(this.a.a, this.b);
        hz hzVar = this.a;
        ic icVar = ieVar.a;
        View view = hzVar.e;
        if (view != null) {
            icVar.x = view;
        } else {
            CharSequence charSequence = hzVar.d;
            if (charSequence != null) {
                icVar.a(charSequence);
            }
            Drawable drawable = hzVar.c;
            if (drawable != null) {
                icVar.t = drawable;
                icVar.s = 0;
                ImageView imageView = icVar.u;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    icVar.u.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = hzVar.f;
        if (charSequence2 != null) {
            icVar.e = charSequence2;
            TextView textView = icVar.w;
            if (textView != null) {
                textView.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = hzVar.g;
        if (charSequence3 != null) {
            icVar.e(-1, charSequence3, hzVar.h);
        }
        CharSequence charSequence4 = hzVar.i;
        if (charSequence4 != null) {
            icVar.e(-2, charSequence4, hzVar.j);
        }
        if (hzVar.n != null || hzVar.o != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) hzVar.b.inflate(icVar.C, (ViewGroup) null);
            if (hzVar.t) {
                ibVar = new hw(hzVar, hzVar.a, icVar.D, hzVar.n, alertController$RecycleListView);
            } else {
                int i = hzVar.u ? icVar.E : icVar.F;
                ibVar = hzVar.o;
                if (ibVar == null) {
                    ibVar = new ib(hzVar.a, i, hzVar.n);
                }
            }
            icVar.y = ibVar;
            icVar.z = hzVar.v;
            if (hzVar.p != null) {
                alertController$RecycleListView.setOnItemClickListener(new hx(hzVar, icVar));
            } else if (hzVar.w != null) {
                alertController$RecycleListView.setOnItemClickListener(new hy(hzVar, alertController$RecycleListView, icVar));
            }
            if (hzVar.u) {
                alertController$RecycleListView.setChoiceMode(1);
            } else if (hzVar.t) {
                alertController$RecycleListView.setChoiceMode(2);
            }
            icVar.f = alertController$RecycleListView;
        }
        View view2 = hzVar.r;
        if (view2 != null) {
            icVar.g = view2;
            icVar.h = 0;
            icVar.i = false;
        } else {
            int i2 = hzVar.q;
            if (i2 != 0) {
                icVar.g = null;
                icVar.h = i2;
                icVar.i = false;
            }
        }
        ieVar.setCancelable(this.a.k);
        if (this.a.k) {
            ieVar.setCanceledOnTouchOutside(true);
        }
        ieVar.setOnCancelListener(null);
        ieVar.setOnDismissListener(this.a.l);
        DialogInterface.OnKeyListener onKeyListener = this.a.m;
        if (onKeyListener != null) {
            ieVar.setOnKeyListener(onKeyListener);
        }
        return ieVar;
    }

    public final ie c() {
        ie ieVarB = b();
        ieVarB.show();
        return ieVarB;
    }

    public final void d(Drawable drawable) {
        this.a.c = drawable;
    }

    public final void e(CharSequence charSequence) {
        this.a.f = charSequence;
    }

    public final void f(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        hz hzVar = this.a;
        hzVar.i = charSequence;
        hzVar.j = onClickListener;
    }

    public final void g(DialogInterface.OnKeyListener onKeyListener) {
        this.a.m = onKeyListener;
    }

    public final void h(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        hz hzVar = this.a;
        hzVar.g = charSequence;
        hzVar.h = onClickListener;
    }

    public final void i(CharSequence charSequence) {
        this.a.d = charSequence;
    }

    public final void j(View view) {
        hz hzVar = this.a;
        hzVar.r = view;
        hzVar.q = 0;
    }
}
