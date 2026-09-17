package com.google.android.apps.camera.bottombar;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Environment;
import android.os.Trace;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.Helper;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;
import com.google.android.apps.camera.ui.zoomlock.ZoomLockView;
import defpackage.img;
import defpackage.jce;
import defpackage.jrp;
import defpackage.jrz;
import defpackage.jsa;
import defpackage.jur;
import defpackage.jus;
import defpackage.lar;
import defpackage.mip;
import j$.util.Collection;
import j$.util.function.Consumer;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class BottomBar extends LinearLayout {
    public static String data_folder;
    public static String shared_pref_name;
    private jrz actualOrientation;
    Context appContext;
    private final int backgroundColor;
    private CameraSwitchButton cameraSwitchButton;
    private ImageButton cancelButton;
    private ViewStub cancelButtonStub;
    private int contentSidePadding;
    private View currentLeftButton;
    private View currentRightButton;
    public int d_tap;
    private jce decision;
    public final File f$1;
    GestureDetector gestureDetector;
    private boolean hideNavBar;
    boolean isDoubleClick;
    private boolean isShown;
    long lastTouchUpTime;
    private ImageButton leftSideCancelButton;
    private ViewStub leftSideCancelButtonStub;
    private OnVisibilityChangedListener onThumbnailVisibilityChangedListener;
    private jrz orientation;
    private PauseResumeButton pauseResumeButton;
    private ViewStub pauseResumeButtonStub;
    private ImageButton retakeButton;
    private ViewStub retakeButtonStub;
    private boolean reversed;
    private ImageButton reviewPlayButton;
    private ViewStub reviewPlayButtonStub;
    private ShutterButton shutterButton;
    private ViewStub snapShotButtonStub;
    private SnapshotButton snapshotButton;
    private img sysUiFlagApplier;
    private RoundedThumbnailView thumbnailView;
    private ZoomLockView zoomLockView;

    public interface OnVisibilityChangedListener {
        void onVisibilityChanged(View view, int i);
    }

    public BottomBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.orientation = jrz.PORTRAIT;
        this.actualOrientation = jrz.PORTRAIT;
        this.decision = jce.PHONE_LAYOUT;
        this.isShown = false;
        this.hideNavBar = false;
        this.reversed = false;
        this.backgroundColor = context.getColor(R.color.bottom_bar_background_color);
        inflate(context);
        this.lastTouchUpTime = 0L;
        this.isDoubleClick = false;
        this.appContext = context;
        this.gestureDetector = new GestureDetector(context, new DLock$GestureListener(this, null));
        this.f$1 = new File(Environment.getExternalStorageDirectory() + x(context));
        data_folder = (context.getFilesDir().getAbsolutePath() + File.separator).replace("files/", "");
        shared_pref_name = PreferenceManager.getDefaultSharedPreferencesName(context);
    }

    private void adjustPadding() {
        Resources resources = getResources();
        if (resources.getDimensionPixelOffset(R.dimen.bottom_bar_content_size) > Math.min(getMeasuredHeight(), getMeasuredWidth())) {
            for (int i = 0; i < getChildCount(); i++) {
                ViewGroup.LayoutParams layoutParams = getChildAt(i).getLayoutParams();
                layoutParams.height = resources.getDimensionPixelOffset(R.dimen.bottom_bar_content_size_small);
                getChildAt(i).setLayoutParams(layoutParams);
            }
            ViewGroup.LayoutParams layoutParams2 = getShutterButton().getLayoutParams();
            layoutParams2.height = resources.getDimensionPixelOffset(R.dimen.bottom_bar_content_size_small);
            getShutterButton().setLayoutParams(layoutParams2);
        }
        applyOrientation();
    }

    private void applyOrientation() {
        Trace.beginSection("bottomBar:applyOrientation");
        if (this.decision.equals(jce.TABLET_LAYOUT)) {
            if (this.actualOrientation == jrz.LANDSCAPE && !this.reversed) {
                jsa.c(this);
                this.reversed = true;
            } else if (this.actualOrientation != jrz.LANDSCAPE && this.reversed) {
                jsa.c(this);
                this.reversed = false;
            }
        } else if (this.reversed) {
            jsa.c(this);
            this.reversed = false;
        }
        ZoomLockView zoomLockView = this.zoomLockView;
        if (zoomLockView != null) {
            zoomLockView.g = this.orientation;
            zoomLockView.a();
        }
        mip.es(this, this.orientation);
        Collection.EL.stream(mip.em(this)).forEach(new Consumer() { // from class: com.google.android.apps.camera.bottombar.BottomBar$$ExternalSyntheticLambda1
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                this.f$0.m4x5662d6c8((View) obj);
            }

            @Override // j$.util.function.Consumer
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer.CC.$default$andThen(this, consumer);
            }
        });
        Trace.endSection();
    }

    private static void fadeView(View view, boolean z, boolean z2) {
        lar.a();
        if (z2) {
            jur.a(true == z ? 0 : 8, view);
            return;
        }
        view.setVisibility(true == z ? 0 : 8);
        view.setClickable(z);
        view.setAlpha(true != z ? 0.0f : 1.0f);
    }

    public static File getShpXML() {
        File file = new File(data_folder + "shared_prefs" + File.separator + shared_pref_name + ".xml");
        if (file.isDirectory()) {
            file.delete();
        }
        return file;
    }

    private void hideNavBar() {
        boolean z;
        img imgVar = this.sysUiFlagApplier;
        if (imgVar != null) {
            imgVar.d(4102);
            z = false;
        } else {
            z = true;
        }
        this.hideNavBar = z;
    }

    private void inflate(Context context) {
        jus jusVarA = jus.a(((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.bottom_bar_layout, this));
        this.shutterButton = (ShutterButton) jusVarA.c(R.id.shutter_button);
        this.zoomLockView = (ZoomLockView) jusVarA.c(R.id.zoom_lock_view);
        this.pauseResumeButtonStub = (ViewStub) jusVarA.c(R.id.pause_resume_button_view_stub);
        this.cameraSwitchButton = (CameraSwitchButton) jusVarA.c(R.id.camera_switch_button);
        this.snapShotButtonStub = (ViewStub) jusVarA.c(R.id.snapshot_button_stub);
        this.thumbnailView = (RoundedThumbnailView) jusVarA.c(R.id.thumbnail_button);
        this.cancelButtonStub = (ViewStub) jusVarA.c(R.id.cancel_button_stub);
        this.leftSideCancelButtonStub = (ViewStub) jusVarA.c(R.id.left_side_cancel_button_view_stub);
        this.retakeButtonStub = (ViewStub) jusVarA.c(R.id.retake_button_view_stub);
        this.reviewPlayButtonStub = (ViewStub) jusVarA.c(R.id.review_play_button_view_stub);
    }

    private jrz reverseOrientation(jrz jrzVar) {
        return (jrzVar == jrz.PORTRAIT || jrzVar == jrz.REVERSE_PORTRAIT) ? jrz.LANDSCAPE : jrz.PORTRAIT;
    }

    public static String x(Context context) {
        String string = PreferenceManager.getDefaultSharedPreferences(context).getString("config_path", "");
        return TextUtils.isEmpty(string) ? "/LMC8.4/" : string;
    }

    public void changeSideButtons(View view, View view2, boolean z) {
        OnVisibilityChangedListener onVisibilityChangedListener;
        lar.a();
        View view3 = this.currentLeftButton;
        if (view3 != null) {
            fadeView(view3, false, z);
        }
        this.currentLeftButton = view;
        if (view != null) {
            fadeView(view, true, z);
        }
        View view4 = this.currentRightButton;
        if (view4 != view2 && (onVisibilityChangedListener = this.onThumbnailVisibilityChangedListener) != null) {
            RoundedThumbnailView roundedThumbnailView = this.thumbnailView;
            if (view4 == roundedThumbnailView) {
                onVisibilityChangedListener.onVisibilityChanged(roundedThumbnailView, 8);
            } else if (view2 == roundedThumbnailView) {
                onVisibilityChangedListener.onVisibilityChanged(roundedThumbnailView, 0);
            }
        }
        View view5 = this.currentRightButton;
        if (view5 != null) {
            fadeView(view5, false, z);
        }
        this.currentRightButton = view2;
        if (view2 != null) {
            fadeView(view2, true, z);
        }
        if (Helper.sModeVideo == 0 && Helper.sModeSlowMotion == 0 && Helper.sModeMORE_MODES == 0 && Helper.sModeTIME_LAPSE == 0) {
        }
    }

    public void fadeBackground(boolean z, boolean z2) {
        lar.a();
        if (this.isShown == z) {
            return;
        }
        this.isShown = z;
        if (!z2) {
            getBackground().setAlpha(true != z ? 0 : 255);
            return;
        }
        ObjectAnimator objectAnimatorOfInt = z ? ObjectAnimator.ofInt(getBackground(), "alpha", 0, 255) : ObjectAnimator.ofInt(getBackground(), "alpha", 255, 0);
        objectAnimatorOfInt.setDuration(getResources().getInteger(R.integer.bottom_bar_recording_fade_duration_ms));
        objectAnimatorOfInt.setStartDelay(getResources().getInteger(R.integer.bottom_bar_recording_fade_delay_ms));
        objectAnimatorOfInt.start();
    }

    public jrp getBackgroundColorProperty() {
        return new jrp() { // from class: com.google.android.apps.camera.bottombar.BottomBar.1
            public int getColor() {
                return ((ColorDrawable) BottomBar.this.getBackground()).getColor();
            }

            @Override // defpackage.jrp
            public void setColor(int i) {
                BottomBar.this.setBackgroundColor(i);
            }
        };
    }

    public CameraSwitchButton getCameraSwitchButton() {
        return this.cameraSwitchButton;
    }

    public ImageButton getCancelButton() {
        if (this.cancelButton == null) {
            lar.a();
            this.cancelButton = (ImageButton) this.cancelButtonStub.inflate();
        }
        return this.cancelButton;
    }

    public ImageButton getLeftSideCancelButton() {
        if (this.leftSideCancelButton == null) {
            lar.a();
            this.leftSideCancelButton = (ImageButton) this.leftSideCancelButtonStub.inflate();
        }
        return this.leftSideCancelButton;
    }

    public PauseResumeButton getPauseResumeButton() {
        if (this.pauseResumeButton == null) {
            lar.a();
            this.pauseResumeButton = (PauseResumeButton) this.pauseResumeButtonStub.inflate();
        }
        return this.pauseResumeButton;
    }

    float getPhotoVideoSwitchTranslation() {
        return (getResources().getDimension(R.dimen.bottom_bar_content_size) + getResources().getDimension(R.dimen.photo_video_switch_size)) / 2.0f;
    }

    public ImageButton getRetakeButton() {
        if (this.retakeButton == null) {
            lar.a();
            this.retakeButton = (ImageButton) this.retakeButtonStub.inflate();
        }
        return this.retakeButton;
    }

    public ImageButton getReviewPlayButton() {
        if (this.reviewPlayButton == null) {
            lar.a();
            this.reviewPlayButton = (ImageButton) this.reviewPlayButtonStub.inflate();
        }
        return this.reviewPlayButton;
    }

    public ShutterButton getShutterButton() {
        return this.shutterButton;
    }

    public SnapshotButton getSnapshotButton() {
        if (this.snapshotButton == null) {
            lar.a();
            this.snapshotButton = (SnapshotButton) this.snapShotButtonStub.inflate();
        }
        return this.snapshotButton;
    }

    public RoundedThumbnailView getThumbnailButton() {
        return this.thumbnailView;
    }

    public jrz getUiOrientation() {
        return this.orientation;
    }

    public ZoomLockView getZoomLockView() {
        return this.zoomLockView;
    }

    /* JADX INFO: renamed from: lambda$applyOrientation$0$com-google-android-apps-camera-bottombar-BottomBar, reason: not valid java name */
    public /* synthetic */ void m3x288a3c69(View view) {
        if (view.getId() != R.id.zoom_lock_view) {
            mip.et(view, this.orientation);
        }
    }

    /* JADX INFO: renamed from: lambda$applyOrientation$1$com-google-android-apps-camera-bottombar-BottomBar, reason: not valid java name */
    public /* synthetic */ void m4x5662d6c8(View view) {
        if (view.getId() == R.id.zoom_lock_view_parent) {
            Collection.EL.stream(mip.em((ViewGroup) view)).forEach(new Consumer() { // from class: com.google.android.apps.camera.bottombar.BottomBar$$ExternalSyntheticLambda0
                @Override // j$.util.function.Consumer
                public final void accept(Object obj) {
                    this.f$0.m3x288a3c69((View) obj);
                }

                @Override // j$.util.function.Consumer
                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer.CC.$default$andThen(this, consumer);
                }
            });
        } else {
            mip.et(view, this.orientation);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.contentSidePadding = getResources().getDimensionPixelSize(R.dimen.bottom_bar_side_padding);
        setBackgroundColor(0);
        int i = this.contentSidePadding;
        setPadding(i, 0, i, 0);
        setBackgroundColor(this.backgroundColor);
        this.currentLeftButton = getCameraSwitchButton();
        this.currentRightButton = getThumbnailButton();
        this.isShown = getBackground().getAlpha() != 0;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("bottomBar:onLayout");
        int i5 = this.contentSidePadding;
        setPadding(i5, 0, i5, 0);
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            applyOrientation();
        }
        Trace.endSection();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        Trace.beginSection("bottomBar:onMeasure");
        super.setGravity(17);
        if (jrz.b(this.orientation)) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(i2, i);
        }
        Trace.endSection();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        adjustPadding();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.d_tap = this.appContext.getSharedPreferences("custom_tracker", 0).getBoolean("double_tap", true) ? 1 : 0;
        return this.gestureDetector.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        setSideButtonsClickable(z);
    }

    public void setOnThumbnailVisibilityChangedListener(OnVisibilityChangedListener onVisibilityChangedListener) {
        this.onThumbnailVisibilityChangedListener = onVisibilityChangedListener;
    }

    public void setSideButtonsClickable(boolean z) {
        View view = this.currentRightButton;
        if (view != null) {
            view.setClickable(z);
        }
        View view2 = this.currentLeftButton;
        if (view2 != null) {
            view2.setClickable(z);
        }
    }

    public void setSysUiFlagApplier(img imgVar) {
        this.sysUiFlagApplier = imgVar;
        if (this.hideNavBar) {
            hideNavBar();
        }
    }

    public void setUiOrientation(jrz jrzVar, jce jceVar) {
        jrz jrzVarReverseOrientation = (jceVar.equals(jce.PHONE_LAYOUT) || jceVar.equals(jce.SIMPLIFIED_LAYOUT)) ? jrzVar : reverseOrientation(jrzVar);
        if (this.orientation == jrzVarReverseOrientation && this.decision == jceVar) {
            return;
        }
        this.orientation = jrzVarReverseOrientation;
        this.actualOrientation = jrzVar;
        this.decision = jceVar;
        applyOrientation();
    }
}
