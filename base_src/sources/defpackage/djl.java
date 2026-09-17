package defpackage;

import android.widget.SearchView;

/* JADX INFO: loaded from: classes.dex */
final class djl implements SearchView.OnQueryTextListener {
    final /* synthetic */ djn a;

    public djl(djn djnVar) {
        this.a = djnVar;
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
