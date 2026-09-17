package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.GoogleCameraEngR18F1.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class kq extends lg implements View.OnKeyListener, PopupWindow.OnDismissListener, lk {
    public final Handler a;
    View d;
    ViewTreeObserver e;
    boolean f;
    private final Context h;
    private final int i;
    private final int j;
    private final boolean k;
    private View q;
    private boolean s;
    private boolean t;
    private int u;
    private int v;
    private boolean x;
    private lj y;
    private PopupWindow.OnDismissListener z;
    private final List l = new ArrayList();
    public final List b = new ArrayList();
    final ViewTreeObserver.OnGlobalLayoutListener c = new kl(this);
    private final View.OnAttachStateChangeListener m = new km(this);
    private final pl n = new ko(this);
    private int o = 0;
    private int p = 0;
    private boolean w = false;
    private int r = y();

    public kq(Context context, View view, int i, boolean z) {
        this.h = context;
        this.q = view;
        this.j = i;
        this.k = z;
        Resources resources = context.getResources();
        this.i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.a = new Handler();
    }

    private final int y() {
        return gl.f(this.q) == 1 ? 0 : 1;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x012b  */
    private final void z(kw kwVar) {
        kp kpVar;
        View childAt;
        int i;
        MenuItem item;
        kt ktVar;
        int headersCount;
        int firstVisiblePosition;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.h);
        kt ktVar2 = new kt(kwVar, layoutInflaterFrom, this.k, R.layout.abc_cascading_menu_item_layout);
        if (!u() && this.w) {
            ktVar2.b = true;
        } else if (u()) {
            ktVar2.b = lg.w(kwVar);
        }
        int iX = x(ktVar2, this.h, this.i);
        pn pnVar = new pn(this.h, this.j);
        pnVar.a = this.n;
        pnVar.m = this;
        pnVar.v(this);
        pnVar.l = this.q;
        pnVar.j = this.p;
        pnVar.y();
        pnVar.x();
        pnVar.e(ktVar2);
        pnVar.r(iX);
        pnVar.j = this.p;
        if (this.b.size() > 0) {
            List list = this.b;
            kpVar = (kp) list.get(list.size() - 1);
            kw kwVar2 = kpVar.b;
            int size = kwVar2.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    item = null;
                    break;
                }
                item = kwVar2.getItem(i2);
                if (item.hasSubMenu() && kwVar == item.getSubMenu()) {
                    break;
                } else {
                    i2++;
                }
            }
            if (item == null) {
                childAt = null;
            } else {
                ListView listViewA = kpVar.a();
                ListAdapter adapter = listViewA.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    ktVar = (kt) headerViewListAdapter.getWrappedAdapter();
                } else {
                    ktVar = (kt) adapter;
                    headersCount = 0;
                }
                int count = ktVar.getCount();
                int i3 = 0;
                while (true) {
                    if (i3 >= count) {
                        i3 = -1;
                        break;
                    } else if (item == ktVar.getItem(i3)) {
                        break;
                    } else {
                        i3++;
                    }
                }
                childAt = (i3 != -1 && (firstVisiblePosition = (i3 + headersCount) - listViewA.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewA.getChildCount()) ? listViewA.getChildAt(firstVisiblePosition) : null;
            }
        } else {
            kpVar = null;
            childAt = null;
        }
        if (childAt != null) {
            pnVar.q.setTouchModal(false);
            pnVar.q.setEnterTransition(null);
            List list2 = this.b;
            ListView listViewA2 = ((kp) list2.get(list2.size() - 1)).a();
            int[] iArr = new int[2];
            listViewA2.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.d.getWindowVisibleDisplayFrame(rect);
            if (this.r == 1) {
                if (iArr[0] + listViewA2.getWidth() + iX > rect.right) {
                    i = 0;
                } else {
                    i = 1;
                }
            } else if (iArr[0] - iX < 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.r = i;
            pnVar.l = childAt;
            if ((this.p & 5) != 5) {
                iX = i != 0 ? childAt.getWidth() : -iX;
            } else if (i == 0) {
                iX = -childAt.getWidth();
            }
            pnVar.g = iX;
            pnVar.i = true;
            pnVar.h = true;
            pnVar.j(0);
        } else {
            if (this.s) {
                pnVar.g = this.u;
            }
            if (this.t) {
                pnVar.j(this.v);
            }
            pnVar.t(this.g);
        }
        this.b.add(new kp(pnVar, kwVar, this.r));
        pnVar.s();
        om omVar = pnVar.e;
        omVar.setOnKeyListener(this);
        if (kpVar == null && this.x && kwVar.e != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) omVar, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(kwVar.e);
            omVar.addHeaderView(frameLayout, null, false);
            pnVar.s();
        }
    }

    @Override // defpackage.lk
    public final void c(kw kwVar, boolean z) {
        int size = this.b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (kwVar == ((kp) this.b.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < this.b.size()) {
            ((kp) this.b.get(i2)).b.i(false);
        }
        kp kpVar = (kp) this.b.remove(i);
        kpVar.b.m(this);
        if (this.f) {
            kpVar.a.q.setExitTransition(null);
            kpVar.a.q.setAnimationStyle(0);
        }
        kpVar.a.k();
        int size2 = this.b.size();
        if (size2 > 0) {
            this.r = ((kp) this.b.get(size2 - 1)).c;
        } else {
            this.r = y();
        }
        if (size2 != 0) {
            if (z) {
                ((kp) this.b.get(0)).b.i(false);
                return;
            }
            return;
        }
        k();
        lj ljVar = this.y;
        if (ljVar != null) {
            ljVar.a(kwVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.e;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.e.removeGlobalOnLayoutListener(this.c);
            }
            this.e = null;
        }
        this.d.removeOnAttachStateChangeListener(this.m);
        this.z.onDismiss();
    }

    @Override // defpackage.lk
    public final void d(lj ljVar) {
        this.y = ljVar;
    }

    @Override // defpackage.lk
    public final boolean e() {
        return false;
    }

    @Override // defpackage.lk
    public final boolean f(ls lsVar) {
        for (kp kpVar : this.b) {
            if (lsVar == kpVar.b) {
                kpVar.a().requestFocus();
                return true;
            }
        }
        if (!lsVar.hasVisibleItems()) {
            return false;
        }
        j(lsVar);
        lj ljVar = this.y;
        if (ljVar != null) {
            ljVar.b(lsVar);
        }
        return true;
    }

    @Override // defpackage.lo
    public final ListView fn() {
        if (this.b.isEmpty()) {
            return null;
        }
        List list = this.b;
        return ((kp) list.get(list.size() - 1)).a();
    }

    @Override // defpackage.lk
    public final void i() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            v(((kp) it.next()).a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // defpackage.lg
    public final void j(kw kwVar) {
        kwVar.h(this, this.h);
        if (u()) {
            z(kwVar);
        } else {
            this.l.add(kwVar);
        }
    }

    @Override // defpackage.lo
    public final void k() {
        int size = this.b.size();
        if (size > 0) {
            kp[] kpVarArr = (kp[]) this.b.toArray(new kp[size]);
            for (int i = size - 1; i >= 0; i--) {
                kp kpVar = kpVarArr[i];
                if (kpVar.a.u()) {
                    kpVar.a.k();
                }
            }
        }
    }

    @Override // defpackage.lg
    public final void l(View view) {
        if (this.q != view) {
            this.q = view;
            this.p = Gravity.getAbsoluteGravity(this.o, gl.f(view));
        }
    }

    @Override // defpackage.lg
    public final void m(boolean z) {
        this.w = z;
    }

    @Override // defpackage.lg
    public final void n(int i) {
        if (this.o != i) {
            this.o = i;
            this.p = Gravity.getAbsoluteGravity(i, gl.f(this.q));
        }
    }

    @Override // defpackage.lg
    public final void o(int i) {
        this.s = true;
        this.u = i;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        kp kpVar;
        int size = this.b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                kpVar = null;
                break;
            }
            kpVar = (kp) this.b.get(i);
            if (!kpVar.a.u()) {
                break;
            } else {
                i++;
            }
        }
        if (kpVar != null) {
            kpVar.b.i(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        k();
        return true;
    }

    @Override // defpackage.lg
    public final void p(PopupWindow.OnDismissListener onDismissListener) {
        this.z = onDismissListener;
    }

    @Override // defpackage.lg
    public final void q(boolean z) {
        this.x = z;
    }

    @Override // defpackage.lg
    public final void r(int i) {
        this.t = true;
        this.v = i;
    }

    @Override // defpackage.lo
    public final void s() {
        if (u()) {
            return;
        }
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            z((kw) it.next());
        }
        this.l.clear();
        View view = this.q;
        this.d = view;
        if (view != null) {
            ViewTreeObserver viewTreeObserver = this.e;
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            this.e = viewTreeObserver2;
            if (viewTreeObserver == null) {
                viewTreeObserver2.addOnGlobalLayoutListener(this.c);
            }
            this.d.addOnAttachStateChangeListener(this.m);
        }
    }

    @Override // defpackage.lg
    protected final boolean t() {
        return false;
    }

    @Override // defpackage.lo
    public final boolean u() {
        return this.b.size() > 0 && ((kp) this.b.get(0)).a.u();
    }
}
