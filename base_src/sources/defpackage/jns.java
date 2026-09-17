package defpackage;

import android.view.ViewStub;
import android.widget.FrameLayout;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.bottombar.BottomBar;
import com.google.android.apps.camera.bottombar.RoundedThumbnailView;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuContainer;
import com.google.android.apps.camera.ui.breadcrumbs.BreadcrumbsView;
import com.google.android.apps.camera.ui.modeswitcher.ModeSwitcher;
import com.google.android.apps.camera.ui.modeswitcher.MoreModesGrid;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButtonProgressOverlay;
import com.google.android.apps.camera.ui.views.GradientBar;
import com.google.android.apps.camera.ui.views.MainActivityLayout;
import com.google.android.apps.camera.ui.views.ViewfinderCover;
import com.google.android.apps.camera.ui.zoomlock.ZoomLockView;

/* JADX INFO: loaded from: classes2.dex */
public final class jns {
    final ViewStub a;
    final ViewStub b;
    public final MainActivityLayout c;
    public final FrameLayout d;
    public final ViewfinderCover e;
    public final BottomBar f;
    public final RoundedThumbnailView g;
    public final OptionsMenuContainer h;
    public final ModeSwitcher i;
    public final BreadcrumbsView j;
    public final jus k;
    public final ShutterButton l;
    public final MoreModesGrid m;
    public final GradientBar n;
    public final ShutterButtonProgressOverlay o;
    public final ZoomLockView p;

    public jns(jus jusVar) {
        lar.a();
        this.k = jusVar;
        this.c = (MainActivityLayout) jusVar.c(R.id.activity_root_view);
        this.a = (ViewStub) jusVar.c(R.id.camera_frame_bottom_layout_stub);
        this.b = (ViewStub) jusVar.c(R.id.camera_frame_overlay_layout_stub);
        this.d = (FrameLayout) jusVar.c(R.id.viewfinder_frame);
        this.e = (ViewfinderCover) jusVar.c(R.id.viewfinder_cover);
        this.i = (ModeSwitcher) jusVar.c(R.id.mode_switcher);
        this.j = (BreadcrumbsView) jusVar.c(R.id.breadcrumbs_ui);
        this.l = (ShutterButton) jusVar.c(R.id.shutter_button);
        this.m = (MoreModesGrid) jusVar.c(R.id.more_modes_grid);
        this.h = (OptionsMenuContainer) jusVar.c(R.id.options_menu_container);
        BottomBar bottomBar = (BottomBar) jusVar.c(R.id.bottom_bar);
        this.f = bottomBar;
        this.n = (GradientBar) jusVar.c(R.id.gradient_bar);
        this.g = bottomBar.getThumbnailButton();
        this.o = (ShutterButtonProgressOverlay) jusVar.c(R.id.shutter_progress_overlay);
        this.p = (ZoomLockView) jusVar.c(R.id.zoom_lock_view);
    }
}
