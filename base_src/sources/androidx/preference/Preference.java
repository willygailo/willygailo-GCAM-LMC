package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.GoogleCameraEngR18F1.R;
import defpackage.agj;
import defpackage.agk;
import defpackage.agl;
import defpackage.agm;
import defpackage.agn;
import defpackage.ago;
import defpackage.agp;
import defpackage.ahe;
import defpackage.ahi;
import defpackage.ahj;
import defpackage.ahm;
import defpackage.ahn;
import defpackage.et;
import defpackage.gl;
import defpackage.jr;
import defpackage.pu;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class Preference implements Comparable {
    public int A;
    public int B;
    public agl C;
    public PreferenceGroup D;
    public agp E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private List K;
    private boolean L;
    private ago M;
    private final View.OnClickListener N;
    private CharSequence a;
    private Bundle b;
    private boolean c;
    private boolean d;
    private boolean e;
    private String f;
    private boolean g;
    private boolean h;
    private boolean i;
    public Context j;
    public ahj k;
    public long l;
    public boolean m;
    public agm n;
    public agn o;
    public int p;
    public CharSequence q;
    public int r;
    public Drawable s;
    public String t;
    public Intent u;
    public String v;
    public boolean w;
    public Object x;
    public boolean y;
    public boolean z;

    public Preference(Context context) {
        this(context, null);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, et.u(context, R.attr.preferenceStyle, android.R.attr.preferenceStyle));
    }

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public Preference(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = Integer.MAX_VALUE;
        this.c = true;
        this.d = true;
        this.w = true;
        this.g = true;
        this.h = true;
        this.y = true;
        this.i = true;
        this.F = true;
        this.H = true;
        this.J = true;
        this.A = R.layout.preference;
        this.N = new agj(this);
        this.j = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ahn.g, i, i2);
        this.r = et.w(typedArrayObtainStyledAttributes, 23, 0, 0);
        this.t = et.z(typedArrayObtainStyledAttributes, 26, 6);
        this.q = et.y(typedArrayObtainStyledAttributes, 34, 4);
        this.a = et.y(typedArrayObtainStyledAttributes, 33, 7);
        this.p = et.D(typedArrayObtainStyledAttributes, 28, 8);
        this.v = et.z(typedArrayObtainStyledAttributes, 22, 13);
        this.A = et.w(typedArrayObtainStyledAttributes, 27, 3, R.layout.preference);
        this.B = et.w(typedArrayObtainStyledAttributes, 35, 9, 0);
        this.c = et.A(typedArrayObtainStyledAttributes, 21, 2, true);
        this.d = et.A(typedArrayObtainStyledAttributes, 30, 5, true);
        this.w = et.A(typedArrayObtainStyledAttributes, 29, 1, true);
        this.f = et.z(typedArrayObtainStyledAttributes, 19, 10);
        this.i = et.A(typedArrayObtainStyledAttributes, 16, 16, this.d);
        this.F = et.A(typedArrayObtainStyledAttributes, 17, 17, this.d);
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            this.x = f(typedArrayObtainStyledAttributes, 18);
        } else if (typedArrayObtainStyledAttributes.hasValue(11)) {
            this.x = f(typedArrayObtainStyledAttributes, 11);
        }
        this.J = et.A(typedArrayObtainStyledAttributes, 31, 12, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(32);
        this.G = zHasValue;
        if (zHasValue) {
            this.H = et.A(typedArrayObtainStyledAttributes, 32, 14, true);
        }
        this.I = et.A(typedArrayObtainStyledAttributes, 24, 15, false);
        this.y = et.A(typedArrayObtainStyledAttributes, 25, 25, true);
        this.z = et.A(typedArrayObtainStyledAttributes, 20, 20, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void k(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                k(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    public final void A() {
        agl aglVar = this.C;
        if (aglVar != null) {
            aglVar.f();
        }
    }

    public void B() {
        G();
    }

    public final void C(ahj ahjVar) {
        this.k = ahjVar;
        if (!this.m) {
            this.l = ahjVar.a();
        }
        if (Y() && q().contains(this.t)) {
            E(true, null);
            return;
        }
        Object obj = this.x;
        if (obj != null) {
            E(false, obj);
        }
    }

    public void D() {
        T();
    }

    @Deprecated
    protected void E(boolean z, Object obj) {
        h(obj);
    }

    public final void F() {
        Intent intent;
        ahi ahiVar;
        if (X() && this.d) {
            c();
            agn agnVar = this.o;
            if (agnVar == null || !agnVar.a()) {
                ahj ahjVar = this.k;
                if ((ahjVar == null || (ahiVar = ahjVar.c) == null || !ahiVar.ai(this)) && (intent = this.u) != null) {
                    this.j.startActivity(intent);
                }
            }
        }
    }

    public final void G() {
        if (TextUtils.isEmpty(this.f)) {
            return;
        }
        Preference preferenceT = t(this.f);
        if (preferenceT != null) {
            if (preferenceT.K == null) {
                preferenceT.K = new ArrayList();
            }
            preferenceT.K.add(this);
            Z(preferenceT.j());
            return;
        }
        throw new IllegalStateException("Dependency \"" + this.f + "\" not found for preference \"" + this.t + "\" (title: \"" + ((Object) this.q) + "\"");
    }

    public final void H(String str) {
        T();
        this.f = str;
        G();
    }

    public final void I(boolean z) {
        if (this.c != z) {
            this.c = z;
            z(j());
            d();
        }
    }

    public final void J(int i) {
        K(jr.b(this.j, i));
        this.r = i;
    }

    public final void K(Drawable drawable) {
        if (this.s != drawable) {
            this.s = drawable;
            this.r = 0;
            d();
        }
    }

    public final void L(String str) {
        this.t = str;
        if (!this.e || W()) {
            return;
        }
        if (TextUtils.isEmpty(this.t)) {
            throw new IllegalStateException("Preference does not have a key assigned.");
        }
        this.e = true;
    }

    public void M(agm agmVar) {
        this.n = agmVar;
    }

    public final void N(int i) {
        if (i != this.p) {
            this.p = i;
            A();
        }
    }

    public final void O(int i) {
        n(this.j.getString(i));
    }

    public final void P(agp agpVar) {
        this.E = agpVar;
        d();
    }

    public final void Q(int i) {
        R(this.j.getString(i));
    }

    public final void R(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.q)) {
            return;
        }
        this.q = charSequence;
        d();
    }

    public final void S(SharedPreferences.Editor editor) {
        if (this.k.a) {
            return;
        }
        editor.apply();
    }

    public final void T() {
        Preference preferenceT;
        List list;
        String str = this.f;
        if (str == null || (preferenceT = t(str)) == null || (list = preferenceT.K) == null) {
            return;
        }
        list.remove(this);
    }

    public final boolean U(Object obj) {
        agm agmVar = this.n;
        return agmVar == null || agmVar.b(this, obj);
    }

    protected boolean V(boolean z) {
        return !Y() ? z : this.k.d().getBoolean(this.t, z);
    }

    public final boolean W() {
        return !TextUtils.isEmpty(this.t);
    }

    public boolean X() {
        return this.c && this.g && this.h;
    }

    protected final boolean Y() {
        return this.k != null && this.w && W();
    }

    public final void Z(boolean z) {
        if (this.g == z) {
            this.g = !z;
            z(j());
            d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0096  */
    public void a(ahm ahmVar) {
        Integer numValueOf;
        Drawable drawable;
        View view = ahmVar.a;
        view.setOnClickListener(this.N);
        view.setId(0);
        TextView textView = (TextView) ahmVar.B(android.R.id.summary);
        if (textView != null) {
            CharSequence charSequenceM = m();
            if (TextUtils.isEmpty(charSequenceM)) {
                textView.setVisibility(8);
                numValueOf = null;
            } else {
                textView.setText(charSequenceM);
                textView.setVisibility(0);
                numValueOf = Integer.valueOf(textView.getCurrentTextColor());
            }
        } else {
            numValueOf = null;
        }
        TextView textView2 = (TextView) ahmVar.B(android.R.id.title);
        if (textView2 != null) {
            CharSequence charSequence = this.q;
            if (TextUtils.isEmpty(charSequence)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(charSequence);
                textView2.setVisibility(0);
                if (this.G) {
                    textView2.setSingleLine(this.H);
                }
                if (!this.d && X() && numValueOf != null) {
                    textView2.setTextColor(numValueOf.intValue());
                }
            }
        }
        ImageView imageView = (ImageView) ahmVar.B(android.R.id.icon);
        if (imageView != null) {
            int i = this.r;
            if (i != 0) {
                if (this.s == null) {
                    this.s = jr.b(this.j, i);
                }
                drawable = this.s;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                }
            } else if (this.s != null) {
                i = 0;
                if (this.s == null) {
                    this.s = jr.b(this.j, i);
                }
                drawable = this.s;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                }
            }
            if (this.s != null) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(true != this.I ? 8 : 4);
            }
        }
        View viewB = ahmVar.B(R.id.icon_frame);
        if (viewB == null) {
            viewB = ahmVar.B(android.R.id.icon_frame);
        }
        if (viewB != null) {
            if (this.s != null) {
                viewB.setVisibility(0);
            } else {
                viewB.setVisibility(true == this.I ? 4 : 8);
            }
        }
        if (this.J) {
            k(view, X());
        } else {
            k(view, true);
        }
        boolean z = this.d;
        view.setFocusable(z);
        view.setClickable(z);
        ahmVar.u = this.i;
        ahmVar.v = this.F;
        boolean z2 = this.z;
        if (z2 && this.M == null) {
            this.M = new ago(this);
        }
        view.setOnCreateContextMenuListener(z2 ? this.M : null);
        view.setLongClickable(z2);
        if (!z2 || z) {
            return;
        }
        gl.G(view, null);
    }

    public final void aa(boolean z) {
        if (this.h == z) {
            this.h = !z;
            z(j());
            d();
        }
    }

    protected final void ab(String str) {
        if (Y() && !TextUtils.equals(str, u(null))) {
            SharedPreferences.Editor editorB = this.k.b();
            editorB.putString(this.t, str);
            S(editorB);
        }
    }

    protected void c() {
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        Preference preference = (Preference) obj;
        int i = this.p;
        int i2 = preference.p;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.q;
        CharSequence charSequence2 = preference.q;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.q.toString());
    }

    protected void d() {
        int iIndexOf;
        Object obj = this.C;
        if (obj == null || (iIndexOf = ((ahe) obj).d.indexOf(this)) == -1) {
            return;
        }
        ((pu) obj).a.c(iIndexOf, this);
    }

    protected Parcelable e() {
        this.L = true;
        return agk.EMPTY_STATE;
    }

    protected Object f(TypedArray typedArray, int i) {
        return null;
    }

    public long fp() {
        return this.l;
    }

    protected void g(Parcelable parcelable) {
        this.L = true;
        if (parcelable != agk.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    public void gn(View view) {
        F();
    }

    protected void h(Object obj) {
    }

    public boolean j() {
        return !X();
    }

    public CharSequence m() {
        agp agpVar = this.E;
        return agpVar != null ? agpVar.a(this) : this.a;
    }

    public void n(CharSequence charSequence) {
        if (this.E != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if (TextUtils.equals(this.a, charSequence)) {
            return;
        }
        this.a = charSequence;
        d();
    }

    protected final int p(int i) {
        return !Y() ? i : this.k.d().getInt(this.t, i);
    }

    public final SharedPreferences q() {
        ahj ahjVar = this.k;
        if (ahjVar != null) {
            return ahjVar.d();
        }
        return null;
    }

    public final Bundle r() {
        if (this.b == null) {
            this.b = new Bundle();
        }
        return this.b;
    }

    public agm s() {
        return this.n;
    }

    protected final Preference t(String str) {
        ahj ahjVar = this.k;
        if (ahjVar == null) {
            return null;
        }
        return ahjVar.e(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.q;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence charSequenceM = m();
        if (!TextUtils.isEmpty(charSequenceM)) {
            sb.append(charSequenceM);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    protected final String u(String str) {
        return !Y() ? str : this.k.d().getString(this.t, str);
    }

    public final Set v(Set set) {
        return !Y() ? set : this.k.d().getStringSet(this.t, set);
    }

    final void w(PreferenceGroup preferenceGroup) {
        if (preferenceGroup != null && this.D != null) {
            throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
        }
        this.D = preferenceGroup;
    }

    public void x(Bundle bundle) {
        Parcelable parcelable;
        if (!W() || (parcelable = bundle.getParcelable(this.t)) == null) {
            return;
        }
        this.L = false;
        g(parcelable);
        if (!this.L) {
            throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    public void y(Bundle bundle) {
        if (W()) {
            this.L = false;
            Parcelable parcelableE = e();
            if (!this.L) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
            if (parcelableE != null) {
                bundle.putParcelable(this.t, parcelableE);
            }
        }
    }

    public void z(boolean z) {
        List list = this.K;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((Preference) list.get(i)).Z(z);
        }
    }
}
