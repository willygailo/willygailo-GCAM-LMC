package com.google.android.apps.camera.bottombar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.ImageButton;
import com.Fix.Pref;
import com.longtap.exposure.Cswitch;
import defpackage.jrx;
import defpackage.lar;
import defpackage.mip;
import defpackage.obr;
import defpackage.oih;
import defpackage.ojc;
import defpackage.ouj;

/* JADX INFO: loaded from: classes.dex */
public class RoundedThumbnailView extends ImageButton {
    private static final float HIT_STATE_CIRCLE_OPACITY_BEGIN = 0.7f;
    private static final float HIT_STATE_CIRCLE_OPACITY_END = 0.0f;
    private static final float HIT_STATE_CIRCLE_OPACITY_HIDDEN = -1.0f;
    private static final long HIT_STATE_DURATION_MS = 150;
    private static final int MARS_PLACEHOLDER_ICON_COLOR = -7129882;
    private static final int MAX_THUMBNAIL_BITMAP_SIZE = 512;
    private static final int PLACEHOLDER_ICON_COLOR = -10525848;
    private static final long RIPPLE_DURATION_MS = 200;
    private static final float RIPPLE_OPACITY_BEGIN = 0.4f;
    private static final float RIPPLE_OPACITY_END = 0.0f;
    private static final long RIPPLE_START_DELAY_MS = 100;
    private static final float THUMBNAIL_FLASH_CIRCLE_OPACITY_BEGIN = 0.8f;
    private static final float THUMBNAIL_FLASH_CIRCLE_OPACITY_END = 0.0f;
    private static final long THUMBNAIL_FLASH_DURATION_MS = 200;
    private static final float THUMBNAIL_REVEAL_CIRCLE_OPACITY_BEGIN = 0.5f;
    private static final float THUMBNAIL_REVEAL_CIRCLE_OPACITY_END = 0.0f;
    private static final long THUMBNAIL_SHRINK_DURATION_MS = 200;
    private static final long THUMBNAIL_STRETCH_DURATION_MS = 200;
    private static final ouj logger = ouj.h("com/google/android/apps/camera/bottombar/RoundedThumbnailView");
    public Context app_context;
    private RevealRequest backgroundRequest;
    private Paint borderStrokePaint;
    private ValueAnimator burstFlashAnimator;
    private ojc callback;
    private float currentHitStateCircleOpacity;
    private float currentRevealCircleOpacity;
    private float currentRippleRingDiameter;
    private float currentRippleRingOpacity;
    private float currentRippleRingThickness;
    private float currentThumbnailDiameter;
    private RevealRequest foregroundRequest;
    private Paint hitStateCirclePaint;
    private float innerStrokeWidth;
    private boolean isMaterialNextEnabled;
    private final View.OnClickListener onClickListener;
    private ojc optionalOnClickListener;
    private RevealRequest pendingRequest;
    private Paint revealCirclePaint;
    private ValueAnimator rippleAnimator;
    private Paint ripplePaint;
    private float rippleRingDiameterBegin;
    private float rippleRingDiameterEnd;
    private float rippleRingThicknessBegin;
    private float rippleRingThicknessEnd;
    private boolean shrinkTouchArea;
    private AnimatorSet thumbnailAnimatorSet;
    private float thumbnailPadding;
    private float thumbnailShrinkDiameterBegin;
    private float thumbnailShrinkDiameterEnd;
    private float thumbnailStretchDiameterBegin;
    private float thumbnailStretchDiameterEnd;
    private float thumbnailTypeIconSize;
    private int touchShrinkSize;
    private RectF viewRect;

    /* JADX INFO: renamed from: com.google.android.apps.camera.bottombar.RoundedThumbnailView$1, reason: invalid class name */
    class AnonymousClass1 implements View.OnClickListener {
        public AnonymousClass1() {
        }

        /* JADX INFO: renamed from: lambda$onClick$0$com-google-android-apps-camera-bottombar-RoundedThumbnailView$1, reason: not valid java name */
        public /* synthetic */ void m33xe9db99bd(ValueAnimator valueAnimator) {
            RoundedThumbnailView.this.currentHitStateCircleOpacity = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            RoundedThumbnailView.this.invalidate();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(RoundedThumbnailView.HIT_STATE_CIRCLE_OPACITY_BEGIN, 0.0f);
            valueAnimatorOfFloat.setDuration(90L);
            valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.apps.camera.bottombar.RoundedThumbnailView$1$$ExternalSyntheticLambda0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f$0.m33xe9db99bd(valueAnimator);
                }
            });
            valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.apps.camera.bottombar.RoundedThumbnailView.1.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    RoundedThumbnailView.this.currentHitStateCircleOpacity = RoundedThumbnailView.HIT_STATE_CIRCLE_OPACITY_HIDDEN;
                    if (RoundedThumbnailView.this.callback.g()) {
                        ((Callback) RoundedThumbnailView.this.callback.c()).onHitStateFinished();
                    }
                }
            });
            valueAnimatorOfFloat.start();
            if (RoundedThumbnailView.this.optionalOnClickListener.g()) {
                ((View.OnClickListener) RoundedThumbnailView.this.optionalOnClickListener.c()).onClick(view);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.apps.camera.bottombar.RoundedThumbnailView$5, reason: invalid class name */
    /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] $SwitchMap$com$google$android$apps$camera$uiutils$TypedThumbnailBitmap$ThumbnailType;

        static {
            int[] iArr = new int[jrx.values().length];
            $SwitchMap$com$google$android$apps$camera$uiutils$TypedThumbnailBitmap$ThumbnailType = iArr;
            try {
                iArr[jrx.BURST.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$com$google$android$apps$camera$uiutils$TypedThumbnailBitmap$ThumbnailType[jrx.PHOTO.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$com$google$android$apps$camera$uiutils$TypedThumbnailBitmap$ThumbnailType[jrx.VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$com$google$android$apps$camera$uiutils$TypedThumbnailBitmap$ThumbnailType[jrx.SECURE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                $SwitchMap$com$google$android$apps$camera$uiutils$TypedThumbnailBitmap$ThumbnailType[jrx.MARS_PLACEHOLDER.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                $SwitchMap$com$google$android$apps$camera$uiutils$TypedThumbnailBitmap$ThumbnailType[jrx.PLACEHOLDER.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
        }
    }

    public interface Callback {
        void onHitStateFinished();
    }

    class RevealRequest {
        private String accessibilityString;
        private boolean animationDisabled;
        private boolean rippleAnimationFinished;
        private boolean thumbnailAnimationFinished;
        private Paint thumbnailPaint;
        private float viewSize;

        private RevealRequest(float f, String str) {
            this.accessibilityString = str;
            this.viewSize = f;
        }

        static RevealRequest createAnimatedRevealRequest(float f, String str) {
            return new RevealRequest(f, str);
        }

        static RevealRequest createNonAnimatedRevealRequest(float f, String str) {
            RevealRequest revealRequest = new RevealRequest(f, str);
            revealRequest.animationDisabled = true;
            return revealRequest;
        }

        private void precomputeThumbnailPaint(Bitmap bitmap, int i) {
            if (this.thumbnailPaint == null && bitmap != null && bitmap.getWidth() == bitmap.getHeight()) {
                BitmapShader bitmapShader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
                if (bitmap.getWidth() != this.viewSize) {
                    RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
                    float f = this.viewSize;
                    RectF rectF2 = new RectF(0.0f, 0.0f, f, f);
                    Matrix matrix = new Matrix();
                    matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
                    matrix.preRotate(i, rectF.width() / 2.0f, rectF.height() / 2.0f);
                    bitmapShader.setLocalMatrix(matrix);
                }
                Paint paint = new Paint();
                this.thumbnailPaint = paint;
                paint.setAntiAlias(true);
                this.thumbnailPaint.setShader(bitmapShader);
            }
        }

        public void finishRippleAnimation() {
            this.rippleAnimationFinished = true;
        }

        public void finishThumbnailAnimation() {
            this.thumbnailAnimationFinished = true;
        }

        public String getAccessibilityString() {
            return this.accessibilityString;
        }

        public Paint getThumbnailPaint() {
            return this.thumbnailPaint;
        }

        public boolean isAnimationDisabled() {
            return this.animationDisabled;
        }

        public boolean isFinished() {
            return this.thumbnailAnimationFinished && this.rippleAnimationFinished;
        }

        public void setThumbnailBitmap(Bitmap bitmap, int i) {
            int i2;
            if (bitmap.getWidth() != bitmap.getHeight()) {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                int i3 = 512;
                if (width > 512 || height > 512) {
                    if (width > height) {
                        i2 = (height * 512) / width;
                    } else {
                        i3 = (width * 512) / height;
                        i2 = 512;
                    }
                    bitmap = Bitmap.createScaledBitmap(bitmap, i3, i2, false);
                }
                int width2 = bitmap.getWidth();
                int height2 = bitmap.getHeight();
                bitmap = width2 >= height2 ? Bitmap.createBitmap(bitmap, (width2 / 2) - (height2 / 2), 0, height2, height2) : Bitmap.createBitmap(bitmap, 0, (height2 / 2) - (width2 / 2), width2, width2);
            }
            precomputeThumbnailPaint(bitmap, i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundedThumbnailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.app_context = context;
        this.shrinkTouchArea = false;
        this.onClickListener = new AnonymousClass1();
        initialize();
    }

    private void clearAnimations() {
        AnimatorSet animatorSet = this.thumbnailAnimatorSet;
        if (animatorSet != null && animatorSet.isStarted()) {
            this.thumbnailAnimatorSet.removeAllListeners();
            this.thumbnailAnimatorSet.cancel();
            this.thumbnailAnimatorSet = null;
        }
        ValueAnimator valueAnimator = this.rippleAnimator;
        if (valueAnimator != null && valueAnimator.isStarted()) {
            this.rippleAnimator.removeAllListeners();
            this.rippleAnimator.cancel();
            this.rippleAnimator = null;
        }
        ValueAnimator valueAnimator2 = this.burstFlashAnimator;
        if (valueAnimator2 == null || !valueAnimator2.isStarted()) {
            return;
        }
        this.burstFlashAnimator.removeAllListeners();
        this.burstFlashAnimator.cancel();
        this.burstFlashAnimator = null;
    }

    private int getColor(int i) {
        return getResources().getColor(i, null);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002f  */
    private void initialize() {
        this.callback = oih.a;
        this.optionalOnClickListener = oih.a;
        setClickable(true);
        super.setOnClickListener(this.onClickListener);
        int iMenuValue = Pref.MenuValue("pref_rounded_key");
        if (iMenuValue == 0) {
            Cswitch.setLongClickListener(this, this.app_context);
        } else if (iMenuValue == 1) {
            com.longtap.exptap.Cswitch.setLongClickListener(this, this.app_context);
        } else if (iMenuValue == 2) {
            com.longtap.upscale.Cswitch.setLongClickListener(this, this.app_context);
        } else if (iMenuValue == 3) {
            com.longtap.framehdr.Cswitch.setLongClickListener(this, this.app_context);
        } else if (iMenuValue == 4) {
            com.longtap.framezsl.Cswitch.setLongClickListener(this, this.app_context);
        } else if (iMenuValue == 5) {
            com.longtap.colort.Cswitch.setLongClickListener(this, this.app_context);
        } else if (iMenuValue == 6) {
            com.longtap.aftime.Cswitch.setLongClickListener(this, this.app_context);
        } else if (iMenuValue != 7) {
            Cswitch.setLongClickListener(this, this.app_context);
        } else {
            com.longtap.page.Cswitch.setLongClickListener(this);
        }
        this.thumbnailPadding = getResources().getDimension(R.dimen.rounded_thumbnail_padding);
        this.thumbnailStretchDiameterBegin = getResources().getDimension(R.dimen.rounded_thumbnail_diameter_min);
        float dimension = getResources().getDimension(R.dimen.rounded_thumbnail_diameter_max);
        this.thumbnailStretchDiameterEnd = dimension;
        this.thumbnailShrinkDiameterBegin = dimension;
        this.thumbnailShrinkDiameterEnd = getResources().getDimension(R.dimen.rounded_thumbnail_diameter_normal);
        this.thumbnailTypeIconSize = getResources().getDimension(R.dimen.rounded_thumbnail_type_icon_size);
        float dimension2 = getResources().getDimension(R.dimen.rounded_thumbnail_ripple_ring_diameter_max);
        this.rippleRingDiameterEnd = dimension2;
        this.viewRect = new RectF(0.0f, 0.0f, dimension2, dimension2);
        this.rippleRingDiameterBegin = getResources().getDimension(R.dimen.rounded_thumbnail_ripple_ring_diameter_min);
        this.rippleRingThicknessBegin = getResources().getDimension(R.dimen.rounded_thumbnail_ripple_ring_thick_max);
        this.rippleRingThicknessEnd = getResources().getDimension(R.dimen.rounded_thumbnail_ripple_ring_thick_min);
        this.touchShrinkSize = getResources().getDimensionPixelOffset(R.dimen.rounded_thumbnail_shrink_size);
        this.currentHitStateCircleOpacity = HIT_STATE_CIRCLE_OPACITY_HIDDEN;
        Paint paint = new Paint(iMenuValue);
        this.hitStateCirclePaint = paint;
        paint.setColor(-1);
        this.hitStateCirclePaint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(iMenuValue);
        this.ripplePaint = paint2;
        paint2.setColor(-1);
        this.ripplePaint.setStyle(Paint.Style.STROKE);
        Paint paint3 = new Paint(iMenuValue);
        this.revealCirclePaint = paint3;
        paint3.setColor(-1);
        this.revealCirclePaint.setStyle(Paint.Style.FILL);
        Paint paint4 = new Paint(iMenuValue);
        this.borderStrokePaint = paint4;
        paint4.setStyle(Paint.Style.STROKE);
        float dimension3 = getResources().getDimension(R.dimen.rounded_thumbnail_inner_stroke_width);
        this.innerStrokeWidth = dimension3;
        this.borderStrokePaint.setStrokeWidth(dimension3);
        this.borderStrokePaint.setColor(-1);
        setThumbnail(getDefaultThumbnail(jrx.PLACEHOLDER), 0);
        Drawable background = getBackground();
        if (background instanceof RippleDrawable) {
            Drawable drawableMutate = background.getConstantState().newDrawable().mutate();
            ((RippleDrawable) drawableMutate).setRadius(getResources().getDimensionPixelSize(R.dimen.camera_switch_button_ripple_diameter) / 2);
            setBackground(drawableMutate);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processRevealRequests() {
        RevealRequest revealRequest = this.foregroundRequest;
        if (revealRequest == null || !revealRequest.isFinished()) {
            return;
        }
        this.backgroundRequest = this.foregroundRequest;
        this.foregroundRequest = null;
    }

    private void runBurstFlashAnimation() {
        RevealRequest revealRequest = this.foregroundRequest;
        if (revealRequest != null) {
            this.backgroundRequest = revealRequest;
            revealRequest.finishRippleAnimation();
            this.backgroundRequest.finishThumbnailAnimation();
        }
        this.foregroundRequest = this.backgroundRequest;
        this.pendingRequest = null;
        clearAnimations();
        setVisibility(0);
        Interpolator interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(getContext(), android.R.interpolator.fast_out_slow_in);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.thumbnailStretchDiameterBegin, this.thumbnailShrinkDiameterEnd);
        this.burstFlashAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(90L);
        this.burstFlashAnimator.setInterpolator(interpolatorLoadInterpolator);
        this.burstFlashAnimator.setRepeatCount(-1);
        this.burstFlashAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.apps.camera.bottombar.RoundedThumbnailView$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.m29x8da9ea8d(valueAnimator);
            }
        });
        this.burstFlashAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.apps.camera.bottombar.RoundedThumbnailView.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                RoundedThumbnailView.this.burstFlashAnimator = null;
            }
        });
        this.burstFlashAnimator.start();
    }

    private void runPendingRequestAnimation(boolean z) {
        RevealRequest revealRequest = this.pendingRequest;
        obr.ao(revealRequest);
        boolean z2 = !revealRequest.isAnimationDisabled();
        if (z2) {
            this.backgroundRequest = null;
            RevealRequest revealRequest2 = this.foregroundRequest;
            if (revealRequest2 != null && z) {
                this.backgroundRequest = revealRequest2;
                revealRequest2.finishRippleAnimation();
                this.backgroundRequest.finishThumbnailAnimation();
            }
        }
        RevealRequest revealRequest3 = this.pendingRequest;
        this.foregroundRequest = revealRequest3;
        this.pendingRequest = null;
        if (!z2) {
            if (this.thumbnailAnimatorSet == null) {
                this.currentThumbnailDiameter = this.thumbnailShrinkDiameterEnd;
                this.currentRevealCircleOpacity = 0.0f;
                obr.ao(revealRequest3);
                revealRequest3.finishThumbnailAnimation();
            }
            if (this.rippleAnimator == null) {
                RevealRequest revealRequest4 = this.foregroundRequest;
                obr.ao(revealRequest4);
                revealRequest4.finishRippleAnimation();
            }
            invalidate();
            return;
        }
        clearAnimations();
        setVisibility(0);
        Interpolator interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(getContext(), android.R.interpolator.fast_out_slow_in);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.thumbnailStretchDiameterBegin, this.thumbnailStretchDiameterEnd);
        valueAnimatorOfFloat.setDuration(90L);
        valueAnimatorOfFloat.setInterpolator(interpolatorLoadInterpolator);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.apps.camera.bottombar.RoundedThumbnailView$$ExternalSyntheticLambda1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.m30x8966d782(valueAnimator);
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.thumbnailShrinkDiameterBegin, this.thumbnailShrinkDiameterEnd);
        valueAnimatorOfFloat2.setDuration(90L);
        valueAnimatorOfFloat2.setInterpolator(interpolatorLoadInterpolator);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.apps.camera.bottombar.RoundedThumbnailView$$ExternalSyntheticLambda2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.m31x7cf65bc3(valueAnimator);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.thumbnailAnimatorSet = animatorSet;
        animatorSet.playSequentially(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.thumbnailAnimatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.apps.camera.bottombar.RoundedThumbnailView.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (RoundedThumbnailView.this.foregroundRequest != null) {
                    RoundedThumbnailView.this.foregroundRequest.finishThumbnailAnimation();
                    RoundedThumbnailView.this.processRevealRequests();
                }
                RoundedThumbnailView.this.thumbnailAnimatorSet = null;
            }
        });
        this.thumbnailAnimatorSet.start();
        Interpolator interpolatorLoadInterpolator2 = AnimationUtils.loadInterpolator(getContext(), android.R.interpolator.linear_out_slow_in);
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(this.rippleRingDiameterBegin, this.rippleRingDiameterEnd);
        this.rippleAnimator = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(90L);
        this.rippleAnimator.setInterpolator(interpolatorLoadInterpolator2);
        this.rippleAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.apps.camera.bottombar.RoundedThumbnailView.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (RoundedThumbnailView.this.foregroundRequest != null) {
                    RoundedThumbnailView.this.foregroundRequest.finishRippleAnimation();
                    RoundedThumbnailView.this.processRevealRequests();
                }
                RoundedThumbnailView.this.rippleAnimator = null;
            }
        });
        this.rippleAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.apps.camera.bottombar.RoundedThumbnailView$$ExternalSyntheticLambda3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.m32x7085e004(valueAnimator);
            }
        });
        this.rippleAnimator.setStartDelay(RIPPLE_START_DELAY_MS);
        this.rippleAnimator.start();
        RevealRequest revealRequest5 = this.foregroundRequest;
        obr.ao(revealRequest5);
        announceForAccessibility(revealRequest5.getAccessibilityString());
    }

    private void setThumbnail(Bitmap bitmap, int i, boolean z) {
        bitmap.getClass();
        lar.a();
        if (this.pendingRequest == null) {
            this.pendingRequest = RevealRequest.createNonAnimatedRevealRequest(this.rippleRingDiameterEnd, "");
        }
        this.pendingRequest.setThumbnailBitmap(bitmap, i);
        if (getVisibility() != 0) {
            this.backgroundRequest = null;
            this.foregroundRequest = null;
        }
        runPendingRequestAnimation(z);
    }

    private void stopBurstFlashAnimation() {
        ValueAnimator valueAnimator = this.burstFlashAnimator;
        if (valueAnimator != null) {
            valueAnimator.setRepeatCount(0);
        }
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.shrinkTouchArea && motionEvent.getAction() == 0 && motionEvent.getY() < this.touchShrinkSize) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void flashThumbnail() {
        lar.a();
        runBurstFlashAnimation();
    }

    public Bitmap getDefaultThumbnail(jrx jrxVar) {
        int i = (int) this.thumbnailShrinkDiameterEnd;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.eraseColor(getColor(R.color.indicator_background));
        jrx jrxVar2 = jrx.PLACEHOLDER;
        Drawable drawable = null;
        switch (jrxVar) {
            case PLACEHOLDER:
                bitmapCreateBitmap.eraseColor(PLACEHOLDER_ICON_COLOR);
                return bitmapCreateBitmap;
            case MARS_PLACEHOLDER:
                drawable = getResources().getDrawable(R.drawable.quantum_gm_ic_lock_vd_theme_24, null);
                if (this.isMaterialNextEnabled) {
                    drawable.mutate().setTint(mip.dP(this));
                }
                bitmapCreateBitmap.eraseColor(this.isMaterialNextEnabled ? mip.dU(this) : MARS_PLACEHOLDER_ICON_COLOR);
                break;
            case PHOTO:
                drawable = getResources().getDrawable(R.drawable.ic_camera_thumbnail, null);
                break;
            case BURST:
                drawable = getResources().getDrawable(R.drawable.ic_burst_thumbnail, null);
                break;
            case VIDEO:
                drawable = getResources().getDrawable(R.drawable.ic_videocam_thumbnail, null);
                break;
            case SECURE:
                drawable = getResources().getDrawable(R.drawable.quantum_gm_ic_lock_vd_theme_24, null);
                break;
        }
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        if (drawable != null) {
            float f = this.thumbnailTypeIconSize;
            int i2 = (int) ((i - f) / 2.0f);
            int i3 = ((int) f) + i2;
            drawable.setBounds(i2, i2, i3, i3);
            drawable.draw(canvas);
        }
        return bitmapCreateBitmap;
    }

    public float getRippleRingMaxDiameterDp() {
        return this.rippleRingDiameterEnd;
    }

    public float getThumbnailFinalDiameter() {
        return this.thumbnailShrinkDiameterEnd;
    }

    public float getThumbnailPadding() {
        return this.thumbnailPadding;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return true;
    }

    /* JADX INFO: renamed from: lambda$runBurstFlashAnimation$3$com-google-android-apps-camera-bottombar-RoundedThumbnailView, reason: not valid java name */
    public /* synthetic */ void m29x8da9ea8d(ValueAnimator valueAnimator) {
        this.currentThumbnailDiameter = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.currentRevealCircleOpacity = (valueAnimator.getAnimatedFraction() * (-0.8f)) + THUMBNAIL_FLASH_CIRCLE_OPACITY_BEGIN;
        invalidate();
    }

    /* JADX INFO: renamed from: lambda$runPendingRequestAnimation$0$com-google-android-apps-camera-bottombar-RoundedThumbnailView, reason: not valid java name */
    public /* synthetic */ void m30x8966d782(ValueAnimator valueAnimator) {
        this.currentThumbnailDiameter = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.currentRevealCircleOpacity = (valueAnimator.getAnimatedFraction() * (-0.5f)) + THUMBNAIL_REVEAL_CIRCLE_OPACITY_BEGIN;
        invalidate();
    }

    /* JADX INFO: renamed from: lambda$runPendingRequestAnimation$1$com-google-android-apps-camera-bottombar-RoundedThumbnailView, reason: not valid java name */
    public /* synthetic */ void m31x7cf65bc3(ValueAnimator valueAnimator) {
        this.currentThumbnailDiameter = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    /* JADX INFO: renamed from: lambda$runPendingRequestAnimation$2$com-google-android-apps-camera-bottombar-RoundedThumbnailView, reason: not valid java name */
    public /* synthetic */ void m32x7085e004(ValueAnimator valueAnimator) {
        this.currentRippleRingDiameter = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float f = this.rippleRingThicknessBegin;
        this.currentRippleRingThickness = f + ((this.rippleRingThicknessEnd - f) * animatedFraction);
        this.currentRippleRingOpacity = (animatedFraction * (-0.4f)) + RIPPLE_OPACITY_BEGIN;
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        ValueAnimator valueAnimator;
        Paint thumbnailPaint;
        super.onDraw(canvas);
        float width = canvas.getWidth() / 2;
        float height = canvas.getHeight() / 2;
        float f = this.rippleRingDiameterEnd;
        float f2 = this.thumbnailShrinkDiameterEnd;
        canvas.clipRect(this.viewRect);
        RevealRequest revealRequest = this.backgroundRequest;
        if (revealRequest != null && (thumbnailPaint = revealRequest.getThumbnailPaint()) != null) {
            float f3 = f2 / f;
            canvas.save();
            canvas.scale(f3, f3, width, height);
            canvas.drawRoundRect(this.viewRect, width, height, thumbnailPaint);
            float f4 = this.innerStrokeWidth / f3;
            this.borderStrokePaint.setStrokeWidth(f4);
            canvas.drawCircle(width, height, width - (f4 / 2.0f), this.borderStrokePaint);
            canvas.restore();
        }
        if (this.foregroundRequest != null) {
            if (this.currentRippleRingThickness > 0.0f && (valueAnimator = this.rippleAnimator) != null && valueAnimator.isRunning()) {
                this.ripplePaint.setAlpha((int) (this.currentRippleRingOpacity * 255.0f));
                this.ripplePaint.setStrokeWidth(this.currentRippleRingThickness);
                canvas.save();
                canvas.drawCircle(width, height, this.currentRippleRingDiameter / 2.0f, this.ripplePaint);
                canvas.restore();
            }
            float f5 = this.currentThumbnailDiameter / this.rippleRingDiameterEnd;
            canvas.save();
            canvas.scale(f5, f5, width, height);
            RevealRequest revealRequest2 = this.foregroundRequest;
            obr.ao(revealRequest2);
            Paint thumbnailPaint2 = revealRequest2.getThumbnailPaint();
            if (thumbnailPaint2 != null) {
                canvas.drawRoundRect(this.viewRect, width, height, thumbnailPaint2);
                float f6 = this.innerStrokeWidth / f5;
                this.borderStrokePaint.setStrokeWidth(f6);
                canvas.drawCircle(width, height, width - (f6 / 2.0f), this.borderStrokePaint);
            }
            this.revealCirclePaint.setAlpha((int) (this.currentRevealCircleOpacity * 255.0f));
            canvas.drawCircle(width, height, this.rippleRingDiameterEnd / 2.0f, this.revealCirclePaint);
            canvas.restore();
        }
        if (this.currentHitStateCircleOpacity != HIT_STATE_CIRCLE_OPACITY_HIDDEN) {
            canvas.save();
            float f7 = f2 / f;
            canvas.scale(f7, f7, width, height);
            this.hitStateCirclePaint.setAlpha((int) (this.currentHitStateCircleOpacity * 255.0f));
            canvas.drawCircle(width, height, this.rippleRingDiameterEnd / 2.0f, this.hitStateCirclePaint);
            canvas.restore();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3 = (int) this.rippleRingDiameterEnd;
        setMeasuredDimension(i3, i3);
    }

    public void resetThumbnailView() {
        setPressed(false);
        invalidate();
    }

    public void setCallback(Callback callback) {
        this.callback = ojc.i(callback);
    }

    public void setMaterialNextEnabled(boolean z) {
        this.isMaterialNextEnabled = z;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.optionalOnClickListener = ojc.h(onClickListener);
    }

    public void setShrinkTouchArea(boolean z) {
        this.shrinkTouchArea = z;
    }

    public void setThumbnail(Bitmap bitmap, int i) {
        setThumbnail(bitmap, i, true);
    }

    public void startRevealThumbnailAnimation(String str) {
        lar.a();
        this.pendingRequest = RevealRequest.createAnimatedRevealRequest(getMeasuredWidth(), str);
    }

    public void stopFlashThumbnail() {
        lar.a();
        stopBurstFlashAnimation();
    }
}
