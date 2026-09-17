package com.google.android.material.internal;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import defpackage.kw;
import defpackage.lm;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuView extends RecyclerView implements lm {
    public NavigationMenuView(Context context) {
        this(context, null);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        V(new LinearLayoutManager());
    }

    @Override // defpackage.lm
    public final void a(kw kwVar) {
    }
}
