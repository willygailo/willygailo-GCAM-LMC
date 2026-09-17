package com.google.android.apps.camera.bottombar;

import android.view.View;
import defpackage.dcu;
import defpackage.ddf;
import defpackage.ddl;
import defpackage.deg;
import defpackage.img;
import defpackage.jrl;
import defpackage.jrp;
import defpackage.jrz;
import defpackage.lar;
import defpackage.lie;
import defpackage.oih;
import defpackage.ojc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class BottomBarController {
    private final BottomBar bottomBar;
    private final CameraSwitchButton cameraSwitchButton;
    private final ojc gcaConfig;
    private boolean isSelfieFlashOn;
    private boolean isSocialShareOpened;
    private final BottomBarListener listenerDispatcher;
    private final List listeners;
    private final Object lock;
    private jrl mode;
    private final RoundedThumbnailView thumbnailButton;

    /* JADX INFO: renamed from: com.google.android.apps.camera.bottombar.BottomBarController$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$google$android$apps$camera$uistate$api$ApplicationMode;

        static {
            int[] iArr = new int[jrl.values().length];
            $SwitchMap$com$google$android$apps$camera$uistate$api$ApplicationMode = iArr;
            try {
                iArr[jrl.PHOTO.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$com$google$android$apps$camera$uistate$api$ApplicationMode[jrl.PORTRAIT.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$com$google$android$apps$camera$uistate$api$ApplicationMode[jrl.MOTION_BLUR.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$com$google$android$apps$camera$uistate$api$ApplicationMode[jrl.LONG_EXPOSURE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                $SwitchMap$com$google$android$apps$camera$uistate$api$ApplicationMode[jrl.TIME_LAPSE.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                $SwitchMap$com$google$android$apps$camera$uistate$api$ApplicationMode[jrl.VIDEO.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                $SwitchMap$com$google$android$apps$camera$uistate$api$ApplicationMode[jrl.SLOW_MOTION.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
            try {
                $SwitchMap$com$google$android$apps$camera$uistate$api$ApplicationMode[jrl.PHOTO_SPHERE.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
            }
            try {
                $SwitchMap$com$google$android$apps$camera$uistate$api$ApplicationMode[jrl.IMAX.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
            }
            try {
                $SwitchMap$com$google$android$apps$camera$uistate$api$ApplicationMode[jrl.REWIND.ordinal()] = 10;
            } catch (NoSuchFieldError e10) {
            }
            try {
                $SwitchMap$com$google$android$apps$camera$uistate$api$ApplicationMode[jrl.IMAGE_INTENT.ordinal()] = 11;
            } catch (NoSuchFieldError e11) {
            }
            try {
                $SwitchMap$com$google$android$apps$camera$uistate$api$ApplicationMode[jrl.VIDEO_INTENT.ordinal()] = 12;
            } catch (NoSuchFieldError e12) {
            }
            try {
                $SwitchMap$com$google$android$apps$camera$uistate$api$ApplicationMode[jrl.MORE_MODES.ordinal()] = 13;
            } catch (NoSuchFieldError e13) {
            }
            try {
                $SwitchMap$com$google$android$apps$camera$uistate$api$ApplicationMode[jrl.LENS.ordinal()] = 14;
            } catch (NoSuchFieldError e14) {
            }
            try {
                $SwitchMap$com$google$android$apps$camera$uistate$api$ApplicationMode[jrl.UNINITIALIZED.ordinal()] = 15;
            } catch (NoSuchFieldError e15) {
            }
            try {
                $SwitchMap$com$google$android$apps$camera$uistate$api$ApplicationMode[jrl.SETTINGS.ordinal()] = 16;
            } catch (NoSuchFieldError e16) {
            }
            try {
                $SwitchMap$com$google$android$apps$camera$uistate$api$ApplicationMode[jrl.ORNAMENT.ordinal()] = 17;
            } catch (NoSuchFieldError e17) {
            }
            try {
                $SwitchMap$com$google$android$apps$camera$uistate$api$ApplicationMode[jrl.MEASURE.ordinal()] = 18;
            } catch (NoSuchFieldError e18) {
            }
            try {
                $SwitchMap$com$google$android$apps$camera$uistate$api$ApplicationMode[jrl.TIARA.ordinal()] = 19;
            } catch (NoSuchFieldError e19) {
            }
        }
    }

    @Deprecated
    public BottomBarController(BottomBar bottomBar) {
        this(bottomBar, null, oih.a);
    }

    public BottomBarController(final BottomBar bottomBar, final img imgVar, ojc ojcVar) {
        this.listenerDispatcher = new BottomBarListener() { // from class: com.google.android.apps.camera.bottombar.BottomBarController.1
            @Override // com.google.android.apps.camera.bottombar.BottomBarListener
            public void onCameraSwitchButtonClicked() {
                synchronized (BottomBarController.this.lock) {
                    Iterator it = BottomBarController.this.listeners.iterator();
                    while (it.hasNext()) {
                        ((BottomBarListener) it.next()).onCameraSwitchButtonClicked();
                    }
                }
            }

            @Override // com.google.android.apps.camera.bottombar.BottomBarListener
            public void onCancelButtonPressed() {
                synchronized (BottomBarController.this.lock) {
                    Iterator it = BottomBarController.this.listeners.iterator();
                    while (it.hasNext()) {
                        ((BottomBarListener) it.next()).onCancelButtonPressed();
                    }
                }
            }

            @Override // com.google.android.apps.camera.bottombar.BottomBarListener
            public void onFpsSwitch(int i) {
                synchronized (BottomBarController.this.lock) {
                    Iterator it = BottomBarController.this.listeners.iterator();
                    while (it.hasNext()) {
                        ((BottomBarListener) it.next()).onFpsSwitch(i);
                    }
                }
            }

            @Override // com.google.android.apps.camera.bottombar.BottomBarListener, com.google.android.apps.camera.bottombar.PauseResumeButton.PauseResumeButtonListener
            public void onPauseButtonClicked() {
                synchronized (BottomBarController.this.lock) {
                    Iterator it = BottomBarController.this.listeners.iterator();
                    while (it.hasNext()) {
                        ((BottomBarListener) it.next()).onPauseButtonClicked();
                    }
                }
            }

            @Override // com.google.android.apps.camera.bottombar.BottomBarListener, com.google.android.apps.camera.bottombar.PauseResumeButton.PauseResumeButtonListener
            public void onResumeButtonClicked() {
                synchronized (BottomBarController.this.lock) {
                    Iterator it = BottomBarController.this.listeners.iterator();
                    while (it.hasNext()) {
                        ((BottomBarListener) it.next()).onResumeButtonClicked();
                    }
                }
            }

            @Override // com.google.android.apps.camera.bottombar.BottomBarListener
            public void onRetakeButtonPressed() {
                synchronized (BottomBarController.this.lock) {
                    Iterator it = BottomBarController.this.listeners.iterator();
                    while (it.hasNext()) {
                        ((BottomBarListener) it.next()).onRetakeButtonPressed();
                    }
                }
            }

            @Override // com.google.android.apps.camera.bottombar.BottomBarListener
            public void onReviewPlayButtonPressed() {
                synchronized (BottomBarController.this.lock) {
                    Iterator it = BottomBarController.this.listeners.iterator();
                    while (it.hasNext()) {
                        ((BottomBarListener) it.next()).onReviewPlayButtonPressed();
                    }
                }
            }

            @Override // com.google.android.apps.camera.bottombar.BottomBarListener
            public void onShutterButtonClicked() {
                synchronized (BottomBarController.this.lock) {
                    Iterator it = BottomBarController.this.listeners.iterator();
                    while (it.hasNext()) {
                        ((BottomBarListener) it.next()).onShutterButtonClicked();
                    }
                }
            }

            @Override // com.google.android.apps.camera.bottombar.BottomBarListener
            public void onSnapshotButtonClicked() {
                synchronized (BottomBarController.this.lock) {
                    Iterator it = BottomBarController.this.listeners.iterator();
                    while (it.hasNext()) {
                        ((BottomBarListener) it.next()).onSnapshotButtonClicked();
                    }
                }
            }

            @Override // com.google.android.apps.camera.bottombar.BottomBarListener
            public void onThumbnailButtonClicked() {
                synchronized (BottomBarController.this.lock) {
                    Iterator it = BottomBarController.this.listeners.iterator();
                    while (it.hasNext()) {
                        ((BottomBarListener) it.next()).onThumbnailButtonClicked();
                    }
                }
            }
        };
        this.bottomBar = bottomBar;
        this.gcaConfig = ojcVar;
        bottomBar.post(new Runnable() { // from class: com.google.android.apps.camera.bottombar.BottomBarController$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                bottomBar.setSysUiFlagApplier(imgVar);
            }
        });
        this.cameraSwitchButton = bottomBar.getCameraSwitchButton();
        this.thumbnailButton = bottomBar.getThumbnailButton();
        this.lock = new Object();
        this.listeners = new ArrayList();
        this.mode = jrl.UNINITIALIZED;
    }

    public void addListener(BottomBarListener bottomBarListener) {
        synchronized (this.lock) {
            this.listeners.add(bottomBarListener);
        }
    }

    public void announceAccessibilityForThumbnail(String str) {
        RoundedThumbnailView roundedThumbnailView = this.thumbnailButton;
        if (roundedThumbnailView != null) {
            roundedThumbnailView.announceForAccessibility(str);
        }
    }

    public lie disableCameraSwitchAwhile() {
        setCameraSwitchEnabled(false);
        return new lie() { // from class: com.google.android.apps.camera.bottombar.BottomBarController$$ExternalSyntheticLambda8
            @Override // defpackage.lie, java.lang.AutoCloseable
            public final void close() {
                this.f$0.m7xa05afb8c();
            }
        };
    }

    public jrp getBackgroundColorProperty() {
        return this.bottomBar.getBackgroundColorProperty();
    }

    public int getBottomBarAreaPixels() {
        return this.bottomBar.getHeight() * this.bottomBar.getWidth();
    }

    /* JADX INFO: renamed from: lambda$disableCameraSwitchAwhile$4$com-google-android-apps-camera-bottombar-BottomBarController, reason: not valid java name */
    public /* synthetic */ void m7xa05afb8c() {
        setCameraSwitchEnabled(true);
    }

    /* JADX INFO: renamed from: lambda$lowerAccessibilityImportanceAwhile$3$com-google-android-apps-camera-bottombar-BottomBarController, reason: not valid java name */
    public /* synthetic */ void m8x3d1d7b3() {
        setImportantForAccessibility(1);
    }

    /* JADX INFO: renamed from: lambda$makeClickableAwhile$1$com-google-android-apps-camera-bottombar-BottomBarController, reason: not valid java name */
    public /* synthetic */ void m9x3c98177c() {
        setClickable(false);
    }

    /* JADX INFO: renamed from: lambda$setSideButtonsClickable$2$com-google-android-apps-camera-bottombar-BottomBarController, reason: not valid java name */
    public /* synthetic */ void m10xec8d83a5(boolean z) {
        this.bottomBar.setSideButtonsClickable(z);
    }

    /* JADX INFO: renamed from: lambda$wireListeners$10$com-google-android-apps-camera-bottombar-BottomBarController, reason: not valid java name */
    public /* synthetic */ void m11x6933a54a(View view) {
        this.listenerDispatcher.onCancelButtonPressed();
    }

    /* JADX INFO: renamed from: lambda$wireListeners$11$com-google-android-apps-camera-bottombar-BottomBarController, reason: not valid java name */
    public /* synthetic */ void m12xfd7214e9(View view) {
        this.listenerDispatcher.onCancelButtonPressed();
    }

    /* JADX INFO: renamed from: lambda$wireListeners$12$com-google-android-apps-camera-bottombar-BottomBarController, reason: not valid java name */
    public /* synthetic */ void m13x91b08488(View view) {
        this.listenerDispatcher.onReviewPlayButtonPressed();
    }

    /* JADX INFO: renamed from: lambda$wireListeners$5$com-google-android-apps-camera-bottombar-BottomBarController, reason: not valid java name */
    public /* synthetic */ void m14xa80caee2(View view) {
        this.listenerDispatcher.onCameraSwitchButtonClicked();
    }

    /* JADX INFO: renamed from: lambda$wireListeners$6$com-google-android-apps-camera-bottombar-BottomBarController, reason: not valid java name */
    public /* synthetic */ void m15x3c4b1e81(View view) {
        this.listenerDispatcher.onThumbnailButtonClicked();
    }

    /* JADX INFO: renamed from: lambda$wireListeners$7$com-google-android-apps-camera-bottombar-BottomBarController, reason: not valid java name */
    public /* synthetic */ void m16xd0898e20(View view) {
        this.listenerDispatcher.onShutterButtonClicked();
    }

    /* JADX INFO: renamed from: lambda$wireListeners$8$com-google-android-apps-camera-bottombar-BottomBarController, reason: not valid java name */
    public /* synthetic */ void m17x64c7fdbf(View view) {
        this.listenerDispatcher.onSnapshotButtonClicked();
    }

    /* JADX INFO: renamed from: lambda$wireListeners$9$com-google-android-apps-camera-bottombar-BottomBarController, reason: not valid java name */
    public /* synthetic */ void m18xf9066d5e(View view) {
        this.listenerDispatcher.onRetakeButtonPressed();
    }

    public lie lowerAccessibilityImportanceAwhile() {
        setImportantForAccessibility(4);
        return new lie() { // from class: com.google.android.apps.camera.bottombar.BottomBarController$$ExternalSyntheticLambda9
            @Override // defpackage.lie, java.lang.AutoCloseable
            public final void close() {
                this.f$0.m8x3d1d7b3();
            }
        };
    }

    public lie makeClickableAwhile() {
        setClickable(true);
        return new lie() { // from class: com.google.android.apps.camera.bottombar.BottomBarController$$ExternalSyntheticLambda10
            @Override // defpackage.lie, java.lang.AutoCloseable
            public final void close() {
                this.f$0.m9x3c98177c();
            }
        };
    }

    public void pauseRecording() {
        this.bottomBar.getPauseResumeButton().transitionToResumeState(((ddf) this.gcaConfig.c()).k(ddl.aw));
    }

    public void pauseTimelapseRecording() {
        this.bottomBar.getPauseResumeButton().transitionToResumeState(((ddf) this.gcaConfig.c()).k(ddl.aw));
    }

    public void removeListener(BottomBarListener bottomBarListener) {
        synchronized (this.lock) {
            this.listeners.remove(bottomBarListener);
        }
    }

    public void resetCameraSwitch(boolean z) {
        this.bottomBar.getCameraSwitchButton().setFrontFacing(z);
    }

    public void resumeRecording() {
        this.bottomBar.getPauseResumeButton().transitionToPauseState(((ddf) this.gcaConfig.c()).k(ddl.aw));
    }

    public void resumeTimelapseRecording() {
        this.bottomBar.getPauseResumeButton().transitionToPauseState(((ddf) this.gcaConfig.c()).k(ddl.aw));
    }

    public void returnToPhotoIntent() {
        this.bottomBar.changeSideButtons(this.cameraSwitchButton, null, true);
    }

    public void returnToVideoIntent() {
        this.bottomBar.changeSideButtons(this.cameraSwitchButton, null, true);
    }

    public void setCameraSwitchEnabled(boolean z) {
        this.bottomBar.getCameraSwitchButton().setEnabled(z);
    }

    public void setClickable(boolean z) {
        this.bottomBar.setClickable(z);
        this.bottomBar.setPressed(false);
    }

    public void setImportantForAccessibility(int i) {
        this.bottomBar.setImportantForAccessibility(i);
    }

    public void setSelfieFlashState(boolean z) {
        this.isSelfieFlashOn = z;
    }

    public void setSideButtonsClickable(final boolean z) {
        this.bottomBar.post(new Runnable() { // from class: com.google.android.apps.camera.bottombar.BottomBarController$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m10xec8d83a5(z);
            }
        });
    }

    public void setSnapshotButtonClickEnabled(boolean z) {
        this.bottomBar.getSnapshotButton().setClickEnabled(z);
    }

    public void setSocialShareState(boolean z) {
        this.isSocialShareOpened = z;
    }

    public void startAutoTimerCapturing() {
        if (!this.isSelfieFlashOn) {
            this.bottomBar.fadeBackground(false, true);
        }
        this.bottomBar.changeSideButtons(null, this.thumbnailButton, true);
    }

    public void startCountdown() {
        this.bottomBar.changeSideButtons(null, null, true);
        this.bottomBar.fadeBackground(false, true);
    }

    public void startHfrRecording() {
        SnapshotButton snapshotButton;
        this.bottomBar.fadeBackground(false, true);
        PauseResumeButton pauseResumeButton = null;
        if (this.gcaConfig.g()) {
            PauseResumeButton pauseResumeButton2 = (((ddf) this.gcaConfig.c()).k(dcu.W) && ((ddf) this.gcaConfig.c()).k(dcu.p)) ? this.bottomBar.getPauseResumeButton() : null;
            if (((ddf) this.gcaConfig.c()).k(dcu.K)) {
                pauseResumeButton = pauseResumeButton2;
                snapshotButton = this.bottomBar.getSnapshotButton();
            } else {
                pauseResumeButton = pauseResumeButton2;
                snapshotButton = null;
            }
        } else {
            snapshotButton = null;
        }
        this.bottomBar.changeSideButtons(pauseResumeButton, snapshotButton, true);
    }

    public void startImaxCapture(boolean z) {
        boolean z2 = false;
        this.thumbnailButton.setClickable(false);
        jrz uiOrientation = this.bottomBar.getUiOrientation();
        if (uiOrientation == jrz.REVERSE_LANDSCAPE || uiOrientation == jrz.LANDSCAPE) {
            z2 = true;
        }
        if (z) {
            z2 = !z2;
        }
        this.bottomBar.fadeBackground(z2, true);
        BottomBar bottomBar = this.bottomBar;
        bottomBar.changeSideButtons(null, bottomBar.getCancelButton(), true);
    }

    public void startLongShot() {
        this.bottomBar.changeSideButtons(null, null, true);
    }

    public void startPanoramaCalibration() {
        BottomBar bottomBar = this.bottomBar;
        bottomBar.changeSideButtons(bottomBar.getRetakeButton(), this.bottomBar.getCancelButton(), true);
    }

    public void startPhotoSphereCapture() {
        BottomBar bottomBar = this.bottomBar;
        bottomBar.changeSideButtons(bottomBar.getRetakeButton(), this.bottomBar.getCancelButton(), true);
    }

    public void startRecording() {
        if (!this.isSelfieFlashOn) {
            this.bottomBar.fadeBackground(false, true);
        }
        BottomBar bottomBar = this.bottomBar;
        bottomBar.changeSideButtons(bottomBar.getPauseResumeButton(), this.bottomBar.getSnapshotButton(), true);
    }

    public void startTimelapseRecording() {
        this.bottomBar.fadeBackground(false, true);
        if (this.gcaConfig.g() && ((ddf) this.gcaConfig.c()).k(deg.e)) {
            BottomBar bottomBar = this.bottomBar;
            bottomBar.changeSideButtons(bottomBar.getPauseResumeButton(), this.bottomBar.getSnapshotButton(), true);
        } else {
            BottomBar bottomBar2 = this.bottomBar;
            bottomBar2.changeSideButtons(bottomBar2.getPauseResumeButton(), null, true);
        }
    }

    public void startVideoIntentRecording() {
        if (!this.isSelfieFlashOn) {
            this.bottomBar.fadeBackground(false, true);
        }
        this.bottomBar.changeSideButtons(null, null, true);
    }

    public void stopAutoTimerCapturing() {
        if (this.isSocialShareOpened) {
            return;
        }
        this.bottomBar.changeSideButtons(this.cameraSwitchButton, this.thumbnailButton, true);
    }

    public void stopCountdown() {
        switchToMode(this.mode);
    }

    public void stopHfrRecording() {
        this.bottomBar.fadeBackground(true, true);
        this.bottomBar.changeSideButtons(null, this.thumbnailButton, true);
        this.bottomBar.getPauseResumeButton().resetButton(((ddf) this.gcaConfig.c()).k(ddl.aw));
    }

    public void stopImaxCapture() {
        this.thumbnailButton.setClickable(true);
        this.bottomBar.fadeBackground(true, true);
        this.bottomBar.changeSideButtons(null, this.thumbnailButton, true);
    }

    public void stopLongShot() {
        this.bottomBar.changeSideButtons(this.cameraSwitchButton, this.thumbnailButton, true);
    }

    public void stopPanoramaCapture() {
        this.bottomBar.changeSideButtons(null, this.thumbnailButton, true);
    }

    public void stopPhotoSphereCapture() {
        this.bottomBar.changeSideButtons(null, this.thumbnailButton, true);
    }

    public void stopRecording() {
        if (!this.isSelfieFlashOn) {
            this.bottomBar.fadeBackground(true, true);
        }
        this.bottomBar.changeSideButtons(this.cameraSwitchButton, this.thumbnailButton, true);
        this.bottomBar.getPauseResumeButton().resetButton(((ddf) this.gcaConfig.c()).k(ddl.aw));
    }

    public void stopTimelapseRecording() {
        this.bottomBar.fadeBackground(true, true);
        this.bottomBar.changeSideButtons(this.cameraSwitchButton, this.thumbnailButton, true);
    }

    public void switchCamera() {
        this.cameraSwitchButton.callOnClick();
    }

    public void switchToMode(jrl jrlVar) {
        this.mode = jrlVar;
        this.bottomBar.fadeBackground(true, true);
        jrl jrlVar2 = jrl.UNINITIALIZED;
        switch (jrlVar) {
            case UNINITIALIZED:
            case ORNAMENT:
            case SETTINGS:
            case MEASURE:
            case TIARA:
                String strValueOf = String.valueOf(jrlVar);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 29);
                sb.append("Unsupported application mode ");
                sb.append(strValueOf);
                throw new UnsupportedOperationException(sb.toString());
            case PHOTO:
            case VIDEO:
            case PORTRAIT:
            case MOTION_BLUR:
            case LONG_EXPOSURE:
            case TIME_LAPSE:
                this.bottomBar.changeSideButtons(this.cameraSwitchButton, this.thumbnailButton, true);
                return;
            case IMAX:
            case PHOTO_SPHERE:
            case SLOW_MOTION:
                this.bottomBar.changeSideButtons(null, this.thumbnailButton, true);
                return;
            case IMAGE_INTENT:
            case VIDEO_INTENT:
                this.bottomBar.changeSideButtons(this.cameraSwitchButton, null, true);
                return;
            case LENS:
            case MORE_MODES:
                this.bottomBar.changeSideButtons(null, null, true);
                return;
            case REWIND:
                BottomBar bottomBar = this.bottomBar;
                bottomBar.changeSideButtons(bottomBar.getLeftSideCancelButton(), this.thumbnailButton, true);
                return;
            default:
                return;
        }
    }

    public void switchToPhotoIntentReview() {
        BottomBar bottomBar = this.bottomBar;
        bottomBar.changeSideButtons(bottomBar.getRetakeButton(), null, true);
    }

    public void switchToVideoIntentReview() {
        this.bottomBar.fadeBackground(true, true);
        BottomBar bottomBar = this.bottomBar;
        bottomBar.changeSideButtons(bottomBar.getRetakeButton(), this.bottomBar.getReviewPlayButton(), true);
    }

    public void wireListeners() {
        lar.a();
        this.bottomBar.getCameraSwitchButton().setOnClickListener(new View.OnClickListener() { // from class: com.google.android.apps.camera.bottombar.BottomBarController$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m14xa80caee2(view);
            }
        });
        this.bottomBar.getThumbnailButton().setOnClickListener(new View.OnClickListener() { // from class: com.google.android.apps.camera.bottombar.BottomBarController$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m15x3c4b1e81(view);
            }
        });
        PauseResumeButton pauseResumeButton = this.bottomBar.getPauseResumeButton();
        BottomBarListener bottomBarListener = this.listenerDispatcher;
        boolean z = !this.gcaConfig.g() || ((ddf) this.gcaConfig.c()).k(ddl.aw);
        pauseResumeButton.setListener(bottomBarListener, z);
        this.bottomBar.getShutterButton().setOnClickListener(new View.OnClickListener() { // from class: com.google.android.apps.camera.bottombar.BottomBarController$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m16xd0898e20(view);
            }
        });
        this.bottomBar.getSnapshotButton().setOnClickListener(new View.OnClickListener() { // from class: com.google.android.apps.camera.bottombar.BottomBarController$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m17x64c7fdbf(view);
            }
        });
        this.bottomBar.getSnapshotButton().wirePressedStateAnimationListener();
        this.bottomBar.getRetakeButton().setOnClickListener(new View.OnClickListener() { // from class: com.google.android.apps.camera.bottombar.BottomBarController$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m18xf9066d5e(view);
            }
        });
        this.bottomBar.getCancelButton().setOnClickListener(new View.OnClickListener() { // from class: com.google.android.apps.camera.bottombar.BottomBarController$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m11x6933a54a(view);
            }
        });
        this.bottomBar.getLeftSideCancelButton().setOnClickListener(new View.OnClickListener() { // from class: com.google.android.apps.camera.bottombar.BottomBarController$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m12xfd7214e9(view);
            }
        });
        this.bottomBar.getReviewPlayButton().setOnClickListener(new View.OnClickListener() { // from class: com.google.android.apps.camera.bottombar.BottomBarController$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m13x91b08488(view);
            }
        });
        setClickable(true);
    }
}
