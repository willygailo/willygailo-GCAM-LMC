package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListAdapter;

/* JADX INFO: loaded from: classes2.dex */
public final class hz {
    public final Context a;
    public final LayoutInflater b;
    public Drawable c;
    public CharSequence d;
    public View e;
    public CharSequence f;
    public CharSequence g;
    public DialogInterface.OnClickListener h;
    public CharSequence i;
    public DialogInterface.OnClickListener j;
    public DialogInterface.OnDismissListener l;
    public DialogInterface.OnKeyListener m;
    public CharSequence[] n;
    public ListAdapter o;
    public DialogInterface.OnClickListener p;
    public int q;
    public View r;
    public boolean[] s;
    public boolean t;
    public boolean u;
    public DialogInterface.OnMultiChoiceClickListener w;
    public int v = -1;
    public boolean k = true;

    public hz(Context context) {
        this.a = context;
        this.b = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
