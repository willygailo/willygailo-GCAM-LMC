package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AlertController$RecycleListView;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ie extends ja implements DialogInterface {
    public final ic a;

    protected ie(Context context, int i) {
        super(context, a(context, i));
        this.a = new ic(getContext(), this, getWindow());
    }

    static int a(Context context, int i) {
        if ((i >>> 24) > 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0066  */
    /* JADX WARN: Code duplicated, block: B:20:0x007f  */
    /* JADX WARN: Code duplicated, block: B:54:0x01b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x01b6  */
    @Override // defpackage.ja, android.app.Dialog
    protected final void onCreate(Bundle bundle) {
        int i;
        View viewFindViewById;
        ListAdapter listAdapter;
        int i2;
        View viewFindViewById2;
        Button button;
        super.onCreate(bundle);
        ic icVar = this.a;
        icVar.b.setContentView(icVar.B == 0 ? icVar.A : icVar.A);
        View viewFindViewById3 = icVar.c.findViewById(R.id.parentPanel);
        View viewFindViewById4 = viewFindViewById3.findViewById(R.id.topPanel);
        View viewFindViewById5 = viewFindViewById3.findViewById(R.id.contentPanel);
        View viewFindViewById6 = viewFindViewById3.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3.findViewById(R.id.customPanel);
        View viewInflate = icVar.g;
        if (viewInflate == null) {
            viewInflate = icVar.h != 0 ? LayoutInflater.from(icVar.a).inflate(icVar.h, viewGroup, false) : null;
        }
        if (viewInflate == null || !ic.b(viewInflate)) {
            icVar.c.setFlags(131072, 131072);
            if (viewInflate != null) {
                ((FrameLayout) icVar.c.findViewById(R.id.f14custom)).addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
                boolean z = icVar.i;
                if (icVar.f != null) {
                    ((pa) viewGroup.getLayoutParams()).weight = 0.0f;
                }
            } else {
                viewGroup.setVisibility(8);
            }
        } else {
            ((FrameLayout) icVar.c.findViewById(R.id.f14custom)).addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
            boolean z2 = icVar.i;
            if (icVar.f != null) {
                ((pa) viewGroup.getLayoutParams()).weight = 0.0f;
            }
        }
        View viewFindViewById7 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById9 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupD = ic.d(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupD2 = ic.d(viewFindViewById8, viewFindViewById5);
        ViewGroup viewGroupD3 = ic.d(viewFindViewById9, viewFindViewById6);
        icVar.r = (NestedScrollView) icVar.c.findViewById(R.id.scrollView);
        icVar.r.setFocusable(false);
        icVar.r.setNestedScrollingEnabled(false);
        icVar.w = (TextView) viewGroupD2.findViewById(android.R.id.message);
        TextView textView = icVar.w;
        if (textView != null) {
            CharSequence charSequence = icVar.e;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                icVar.r.removeView(icVar.w);
                if (icVar.f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) icVar.r.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(icVar.r);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(icVar.f, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupD2.setVisibility(8);
                }
            }
        }
        icVar.j = (Button) viewGroupD3.findViewById(android.R.id.button1);
        icVar.j.setOnClickListener(icVar.I);
        if (TextUtils.isEmpty(icVar.k)) {
            icVar.j.setVisibility(8);
            i = 0;
        } else {
            icVar.j.setText(icVar.k);
            icVar.j.setVisibility(0);
            i = 1;
        }
        icVar.m = (Button) viewGroupD3.findViewById(android.R.id.button2);
        icVar.m.setOnClickListener(icVar.I);
        if (TextUtils.isEmpty(icVar.n)) {
            icVar.m.setVisibility(8);
        } else {
            icVar.m.setText(icVar.n);
            icVar.m.setVisibility(0);
            i |= 2;
        }
        icVar.p = (Button) viewGroupD3.findViewById(android.R.id.button3);
        icVar.p.setOnClickListener(icVar.I);
        CharSequence charSequence2 = icVar.q;
        if (TextUtils.isEmpty(null)) {
            icVar.p.setVisibility(8);
        } else {
            Button button2 = icVar.p;
            CharSequence charSequence3 = icVar.q;
            button2.setText((CharSequence) null);
            icVar.p.setVisibility(0);
            i |= 4;
        }
        Context context = icVar.a;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                button = icVar.j;
            } else if (i == 2) {
                button = icVar.m;
            } else if (i == 4) {
                button = icVar.p;
            } else if (i == 0) {
                viewGroupD3.setVisibility(8);
            }
            ic.c(button);
        } else if (i == 0) {
            viewGroupD3.setVisibility(8);
        }
        if (icVar.x != null) {
            viewGroupD.addView(icVar.x, 0, new ViewGroup.LayoutParams(-1, -2));
            icVar.c.findViewById(R.id.title_template).setVisibility(8);
        } else {
            icVar.u = (ImageView) icVar.c.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(icVar.d) || !icVar.G) {
                icVar.c.findViewById(R.id.title_template).setVisibility(8);
                icVar.u.setVisibility(8);
                viewGroupD.setVisibility(8);
            } else {
                icVar.v = (TextView) icVar.c.findViewById(R.id.alertTitle);
                icVar.v.setText(icVar.d);
                int i3 = icVar.s;
                Drawable drawable = icVar.t;
                if (drawable != null) {
                    icVar.u.setImageDrawable(drawable);
                } else {
                    icVar.v.setPadding(icVar.u.getPaddingLeft(), icVar.u.getPaddingTop(), icVar.u.getPaddingRight(), icVar.u.getPaddingBottom());
                    icVar.u.setVisibility(8);
                }
            }
        }
        boolean z3 = (viewGroup == null || viewGroup.getVisibility() == 8) ? false : true;
        int i4 = (viewGroupD == null || viewGroupD.getVisibility() == 8) ? 0 : 1;
        boolean z4 = (viewGroupD3 == null || viewGroupD3.getVisibility() == 8) ? false : true;
        if (!z4 && viewGroupD2 != null && (viewFindViewById2 = viewGroupD2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (i4 != 0) {
            NestedScrollView nestedScrollView = icVar.r;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View viewFindViewById10 = (icVar.e == null && icVar.f == null) ? null : viewGroupD.findViewById(R.id.titleDividerNoCustom);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        } else if (viewGroupD2 != null && (viewFindViewById = viewGroupD2.findViewById(R.id.textSpacerNoTitle)) != null) {
            viewFindViewById.setVisibility(0);
        }
        ListView listView = icVar.f;
        if (listView instanceof AlertController$RecycleListView) {
            if (!z4) {
                i2 = i4;
            } else if (i4 == 0) {
                i2 = 0;
            }
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) listView;
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i2 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.a, alertController$RecycleListView.getPaddingRight(), z4 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.b);
        }
        if (!z3) {
            View view = icVar.f;
            if (view == null) {
                view = icVar.r;
            }
            if (view != null) {
                int i5 = true == z4 ? 2 : 0;
                View viewFindViewById11 = icVar.c.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = icVar.c.findViewById(R.id.scrollIndicatorDown);
                gl.ae(view, i4 | i5);
                if (viewFindViewById11 != null) {
                    viewGroupD2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupD2.removeView(viewFindViewById12);
                }
            }
        }
        ListView listView2 = icVar.f;
        if (listView2 == null || (listAdapter = icVar.y) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i6 = icVar.z;
        if (i6 >= 0) {
            listView2.setItemChecked(i6, true);
            listView2.setSelection(i6);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.a.r;
        if (nestedScrollView == null || !nestedScrollView.m(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.a.r;
        if (nestedScrollView == null || !nestedScrollView.m(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // defpackage.ja, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.a.a(charSequence);
    }
}
