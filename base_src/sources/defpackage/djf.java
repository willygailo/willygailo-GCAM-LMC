package defpackage;

import android.widget.SearchView;

/* JADX INFO: loaded from: classes.dex */
final class djf implements SearchView.OnQueryTextListener {
    final /* synthetic */ djh a;

    public djf(djh djhVar) {
        this.a = djhVar;
    }

    @Override // android.widget.SearchView.OnQueryTextListener
    public final boolean onQueryTextChange(String str) {
        this.a.b(str);
        return false;
    }

    @Override // android.widget.SearchView.OnQueryTextListener
    public final boolean onQueryTextSubmit(String str) {
        this.a.b(str);
        return true;
    }
}
