.class public LMC/UI/OpenButtonListRight;
.super Landroid/widget/LinearLayout;
.source "OpenButtonListRight.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field OpenButtonListHolder:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field interpolator:Landroid/view/animation/OvershootInterpolator;

.field isMenuOpen:Ljava/lang/Boolean;

.field marginw:I

.field sizew:I

.field sizewx:I

.field translationY:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    const/4 v2, 0x1

    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    new-instance v0, Landroid/view/animation/OvershootInterpolator;

    invoke-direct {v0}, Landroid/view/animation/OvershootInterpolator;-><init>()V

    iput-object v0, p0, LMC/UI/OpenButtonListRight;->interpolator:Landroid/view/animation/OvershootInterpolator;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, LMC/UI/OpenButtonListRight;->isMenuOpen:Ljava/lang/Boolean;

    const/16 v0, 0x64

    iput v0, p0, LMC/UI/OpenButtonListRight;->translationY:I

    const/high16 v0, 0x42040000    # 33.0f

    invoke-virtual {p0}, LMC/UI/OpenButtonListRight;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    invoke-static {v2, v0, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, LMC/UI/OpenButtonListRight;->sizew:I

    const/high16 v0, 0x42a00000    # 80.0f

    invoke-virtual {p0}, LMC/UI/OpenButtonListRight;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    invoke-static {v2, v0, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, LMC/UI/OpenButtonListRight;->sizewx:I

    const/high16 v0, 0x40a00000    # 5.0f

    invoke-virtual {p0}, LMC/UI/OpenButtonListRight;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    invoke-static {v2, v0, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, LMC/UI/OpenButtonListRight;->marginw:I

    invoke-virtual {p0, v2}, LMC/UI/OpenButtonListRight;->setOrientation(I)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LMC/UI/OpenButtonListRight;->OpenButtonListHolder:Ljava/util/ArrayList;

    invoke-direct {p0}, LMC/UI/OpenButtonListRight;->initFabMenu()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    const/4 v2, 0x1

    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance v0, Landroid/view/animation/OvershootInterpolator;

    invoke-direct {v0}, Landroid/view/animation/OvershootInterpolator;-><init>()V

    iput-object v0, p0, LMC/UI/OpenButtonListRight;->interpolator:Landroid/view/animation/OvershootInterpolator;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, LMC/UI/OpenButtonListRight;->isMenuOpen:Ljava/lang/Boolean;

    const/16 v0, 0x64

    iput v0, p0, LMC/UI/OpenButtonListRight;->translationY:I

    const/high16 v0, 0x42040000    # 33.0f

    invoke-virtual {p0}, LMC/UI/OpenButtonListRight;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    invoke-static {v2, v0, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, LMC/UI/OpenButtonListRight;->sizew:I

    const/high16 v0, 0x42a00000    # 80.0f

    invoke-virtual {p0}, LMC/UI/OpenButtonListRight;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    invoke-static {v2, v0, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, LMC/UI/OpenButtonListRight;->sizewx:I

    const/high16 v0, 0x40a00000    # 5.0f

    invoke-virtual {p0}, LMC/UI/OpenButtonListRight;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    invoke-static {v2, v0, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, LMC/UI/OpenButtonListRight;->marginw:I

    invoke-virtual {p0, v2}, LMC/UI/OpenButtonListRight;->setOrientation(I)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LMC/UI/OpenButtonListRight;->OpenButtonListHolder:Ljava/util/ArrayList;

    invoke-direct {p0}, LMC/UI/OpenButtonListRight;->initFabMenu()V

    return-void
.end method

.method private initFabMenu()V
    .locals 8

    const/4 v7, 0x0

    const/4 v6, 0x1

    iget-object v3, p0, LMC/UI/OpenButtonListRight;->OpenButtonListHolder:Ljava/util/ArrayList;

    new-instance v4, LMC/UI/Button/Leica;

    invoke-virtual {p0}, LMC/UI/OpenButtonListRight;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-direct {v4, v5}, LMC/UI/Button/Leica;-><init>(Landroid/content/Context;)V

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v3, p0, LMC/UI/OpenButtonListRight;->OpenButtonListHolder:Ljava/util/ArrayList;

    new-instance v4, LMC/UI/Button/HDRNet;

    invoke-virtual {p0}, LMC/UI/OpenButtonListRight;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-direct {v4, v5}, LMC/UI/Button/HDRNet;-><init>(Landroid/content/Context;)V

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v3, p0, LMC/UI/OpenButtonListRight;->OpenButtonListHolder:Ljava/util/ArrayList;

    new-instance v4, LMC/UI/Button/PRO;

    invoke-virtual {p0}, LMC/UI/OpenButtonListRight;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-direct {v4, v5}, LMC/UI/Button/PRO;-><init>(Landroid/content/Context;)V

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v3, p0, LMC/UI/OpenButtonListRight;->OpenButtonListHolder:Ljava/util/ArrayList;

    new-instance v4, LMC/UI/Button/LDR;

    invoke-virtual {p0}, LMC/UI/OpenButtonListRight;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-direct {v4, v5}, LMC/UI/Button/LDR;-><init>(Landroid/content/Context;)V

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v3, p0, LMC/UI/OpenButtonListRight;->OpenButtonListHolder:Ljava/util/ArrayList;

    new-instance v4, LMC/UI/Button/Upscale;

    invoke-virtual {p0}, LMC/UI/OpenButtonListRight;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-direct {v4, v5}, LMC/UI/Button/Upscale;-><init>(Landroid/content/Context;)V

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v3, p0, LMC/UI/OpenButtonListRight;->OpenButtonListHolder:Ljava/util/ArrayList;

    new-instance v4, LMC/UI/Button/PAT;

    invoke-virtual {p0}, LMC/UI/OpenButtonListRight;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-direct {v4, v5}, LMC/UI/Button/PAT;-><init>(Landroid/content/Context;)V

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, LMC/UI/OpenButtonListExtenderRight;->prefString:Ljava/lang/String;

    invoke-static {v3}, LMC/Utils;->staticMenuValueBB(Ljava/lang/String;)Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    iput-object v3, p0, LMC/UI/OpenButtonListRight;->isMenuOpen:Ljava/lang/Boolean;

    const/4 v1, 0x0

    :goto_0
    iget-object v3, p0, LMC/UI/OpenButtonListRight;->OpenButtonListHolder:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lt v1, v3, :cond_0

    new-instance v0, LMC/UI/OpenButtonListExtenderRight;

    invoke-virtual {p0}, LMC/UI/OpenButtonListRight;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v0, v3}, LMC/UI/OpenButtonListExtenderRight;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v6}, LMC/UI/OpenButtonListExtenderRight;->setClickable(Z)V

    invoke-virtual {v0, p0}, LMC/UI/OpenButtonListExtenderRight;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0, v0}, LMC/UI/OpenButtonListRight;->addView(Landroid/view/View;)V

    return-void

    :cond_0
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    iget v3, p0, LMC/UI/OpenButtonListRight;->sizew:I

    iget v4, p0, LMC/UI/OpenButtonListRight;->sizew:I

    invoke-direct {v2, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iget v3, p0, LMC/UI/OpenButtonListRight;->marginw:I

    iput v3, v2, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    if-nez v1, :cond_1

    iget v3, p0, LMC/UI/OpenButtonListRight;->sizew:I

    iput v3, v2, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    :cond_1
    const/16 v3, 0x53

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout$LayoutParams;->resolveLayoutDirection(I)V

    iget-object v3, p0, LMC/UI/OpenButtonListRight;->OpenButtonListHolder:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    invoke-virtual {v3, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v3, p0, LMC/UI/OpenButtonListRight;->OpenButtonListHolder:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    invoke-virtual {v3, v6}, Landroid/view/View;->setClickable(Z)V

    iget-object v3, p0, LMC/UI/OpenButtonListRight;->isMenuOpen:Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, p0, LMC/UI/OpenButtonListRight;->OpenButtonListHolder:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    invoke-virtual {v3, v7}, Landroid/view/View;->setTranslationY(F)V

    iget-object v3, p0, LMC/UI/OpenButtonListRight;->OpenButtonListHolder:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-virtual {v3, v4}, Landroid/view/View;->setAlpha(F)V

    iget-object v3, p0, LMC/UI/OpenButtonListRight;->OpenButtonListHolder:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    invoke-virtual {v3, v6}, Landroid/view/View;->setEnabled(Z)V

    :goto_1
    iget-object v3, p0, LMC/UI/OpenButtonListRight;->OpenButtonListHolder:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    invoke-virtual {p0, v3}, LMC/UI/OpenButtonListRight;->addView(Landroid/view/View;)V

    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_2
    iget-object v3, p0, LMC/UI/OpenButtonListRight;->OpenButtonListHolder:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    iget v4, p0, LMC/UI/OpenButtonListRight;->sizewx:I

    int-to-float v4, v4

    invoke-virtual {v3, v4}, Landroid/view/View;->setTranslationY(F)V

    iget-object v3, p0, LMC/UI/OpenButtonListRight;->OpenButtonListHolder:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    invoke-virtual {v3, v7}, Landroid/view/View;->setAlpha(F)V

    iget-object v3, p0, LMC/UI/OpenButtonListRight;->OpenButtonListHolder:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Landroid/view/View;->setEnabled(Z)V

    goto :goto_1
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 9

    const/4 v8, 0x1

    const/4 v5, 0x0

    const-wide/16 v6, 0x3e8

    const/4 v4, 0x0

    instance-of v2, p1, LMC/UI/OpenButtonListExtenderRight;

    if-eqz v2, :cond_0

    move-object v2, p1

    check-cast v2, LMC/UI/OpenButtonListExtenderRight;

    invoke-virtual {p0}, LMC/UI/OpenButtonListRight;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v2, v3}, LMC/UI/OpenButtonListExtenderRight;->UpdateUi(Landroid/content/Context;)V

    sget-boolean v2, LMC/UI/OpenButtonListExtenderRight;->SelState:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, p0, LMC/UI/OpenButtonListRight;->isMenuOpen:Ljava/lang/Boolean;

    const/4 v0, 0x0

    :goto_0
    iget-object v2, p0, LMC/UI/OpenButtonListRight;->OpenButtonListHolder:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lt v0, v2, :cond_1

    invoke-virtual {p1, v4}, Landroid/view/View;->setRotation(F)V

    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    iget-object v3, p0, LMC/UI/OpenButtonListRight;->interpolator:Landroid/view/animation/OvershootInterpolator;

    invoke-virtual {v2, v3}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    const/high16 v3, 0x43b40000    # 360.0f

    invoke-virtual {v2, v3}, Landroid/view/ViewPropertyAnimator;->rotation(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    invoke-virtual {v2, v6, v7}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/ViewPropertyAnimator;->start()V

    :cond_0
    return-void

    :cond_1
    iget-object v2, p0, LMC/UI/OpenButtonListRight;->OpenButtonListHolder:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    iget-object v2, p0, LMC/UI/OpenButtonListRight;->isMenuOpen:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-virtual {v2, v3}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    invoke-virtual {v2, v4}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    iget-object v3, p0, LMC/UI/OpenButtonListRight;->interpolator:Landroid/view/animation/OvershootInterpolator;

    invoke-virtual {v2, v3}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    invoke-virtual {v2, v6, v7}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    new-instance v3, LMC/UI/OpenButtonListRight$1;

    invoke-direct {v3, p0}, LMC/UI/OpenButtonListRight$1;-><init>(LMC/UI/OpenButtonListRight;)V

    invoke-virtual {v2, v3}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/ViewPropertyAnimator;->start()V

    invoke-virtual {v1, v8}, Landroid/view/View;->setEnabled(Z)V

    invoke-virtual {v1, v8}, Landroid/view/View;->setClickable(Z)V

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    invoke-virtual {v2, v4}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    iget v3, p0, LMC/UI/OpenButtonListRight;->sizewx:I

    int-to-float v3, v3

    invoke-virtual {v2, v3}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    iget-object v3, p0, LMC/UI/OpenButtonListRight;->interpolator:Landroid/view/animation/OvershootInterpolator;

    invoke-virtual {v2, v3}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    invoke-virtual {v2, v6, v7}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    new-instance v3, LMC/UI/OpenButtonListRight$2;

    invoke-direct {v3, p0}, LMC/UI/OpenButtonListRight$2;-><init>(LMC/UI/OpenButtonListRight;)V

    invoke-virtual {v2, v3}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/ViewPropertyAnimator;->start()V

    invoke-virtual {v1, v5}, Landroid/view/View;->setEnabled(Z)V

    invoke-virtual {v1, v5}, Landroid/view/View;->setClickable(Z)V

    goto :goto_1
.end method
