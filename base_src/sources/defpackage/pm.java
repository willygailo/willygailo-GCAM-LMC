package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.support.v7.view.menu.ListMenuItemView;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;

/* JADX INFO: loaded from: classes2.dex */
public final class pm extends om {
    final int c;
    final int d;
    public pl e;
    private MenuItem f;

    public pm(Context context, boolean z) {
        super(context, z);
        if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
            this.c = 21;
            this.d = 22;
        } else {
            this.c = 22;
            this.d = 21;
        }
    }

    @Override // defpackage.om, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        kt ktVar;
        int headersCount;
        pl plVar;
        pl plVar2;
        int iPointToPosition;
        int i;
        if (this.e != null) {
            ListAdapter adapter = getAdapter();
            int i2 = 0;
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                ktVar = (kt) headerViewListAdapter.getWrappedAdapter();
            } else {
                ktVar = (kt) adapter;
                headersCount = 0;
            }
            kz item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= ktVar.getCount()) ? null : ktVar.getItem(i);
            MenuItem menuItem = this.f;
            if (menuItem != item) {
                kw kwVar = ktVar.a;
                if (menuItem != null && (plVar2 = ((pn) this.e).a) != null) {
                    ((ko) plVar2).a.a.removeCallbacksAndMessages(kwVar);
                }
                this.f = item;
                if (item != null && (plVar = ((pn) this.e).a) != null) {
                    ko koVar = (ko) plVar;
                    koVar.a.a.removeCallbacksAndMessages(null);
                    int size = koVar.a.b.size();
                    while (true) {
                        if (i2 >= size) {
                            i2 = -1;
                            break;
                        }
                        if (kwVar == ((kp) koVar.a.b.get(i2)).b) {
                            break;
                        }
                        i2++;
                    }
                    if (i2 != -1) {
                        int i3 = i2 + 1;
                        koVar.a.a.postAtTime(new kn(koVar, i3 < koVar.a.b.size() ? (kp) koVar.a.b.get(i3) : null, item, kwVar), kwVar, SystemClock.uptimeMillis() + 200);
                    }
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.c) {
            if (listMenuItemView.isEnabled() && listMenuItemView.a.hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.d) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (kt) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (kt) adapter).a.i(false);
        return true;
    }
}
