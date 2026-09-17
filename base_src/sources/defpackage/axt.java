package defpackage;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* JADX INFO: loaded from: classes.dex */
public class axt extends by {
    private axu k;

    @Override // defpackage.by, defpackage.ub, defpackage.ds, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        axu axuVar = new axu(new axs(this));
        this.k = axuVar;
        View viewInflate = getLayoutInflater().inflate(R.layout.collapsing_toolbar_base_layout, (ViewGroup) null, false);
        if (viewInflate instanceof CoordinatorLayout) {
        }
        axuVar.a = (CollapsingToolbarLayout) viewInflate.findViewById(R.id.collapsing_toolbar);
        axuVar.b = (AppBarLayout) viewInflate.findViewById(R.id.app_bar);
        CollapsingToolbarLayout collapsingToolbarLayout = axuVar.a;
        if (collapsingToolbarLayout != null) {
            collapsingToolbarLayout.a.y = 1.1f;
        }
        AppBarLayout appBarLayout = axuVar.b;
        if (appBarLayout != null) {
            aah aahVar = (aah) appBarLayout.getLayoutParams();
            AppBarLayout.Behavior behavior = new AppBarLayout.Behavior();
            ((AppBarLayout.BaseBehavior) behavior).b = new ohh((byte[]) null);
            aahVar.b(behavior);
        }
        axuVar.c = (Toolbar) viewInflate.findViewById(R.id.action_bar);
        axuVar.d = (FrameLayout) viewInflate.findViewById(R.id.content_frame);
        axs axsVar = axuVar.e;
        super.setActionBar(axuVar.c);
        ActionBar actionBar = super.getActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayShowTitleEnabled(true);
        }
        super.setContentView(viewInflate);
    }

    @Override // android.app.Activity
    public final boolean onNavigateUp() {
        if (super.onNavigateUp()) {
            return true;
        }
        finishAfterTransition();
        return true;
    }

    @Override // defpackage.ub, android.app.Activity
    public final void setContentView(int i) {
        FrameLayout frameLayout = this.k.d;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        LayoutInflater.from(this).inflate(i, frameLayout);
    }

    @Override // defpackage.ub, android.app.Activity
    public final void setContentView(View view) {
        this.k.d.addView(view);
    }

    @Override // defpackage.ub, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        this.k.d.addView(view, layoutParams);
    }

    @Override // android.app.Activity
    public final void setTitle(int i) {
        setTitle(getText(i));
    }

    @Override // android.app.Activity
    public final void setTitle(CharSequence charSequence) {
        axu axuVar = this.k;
        CollapsingToolbarLayout collapsingToolbarLayout = axuVar.a;
        if (collapsingToolbarLayout != null) {
            collapsingToolbarLayout.f(charSequence);
        } else {
            super.setTitle(charSequence);
        }
    }
}
