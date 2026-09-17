.class public LMC/UI/OpenButtonListExtenderRight;
.super Landroid/widget/ToggleButton;
.source "OpenButtonListExtenderRight.java"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# static fields
.field public static Icon1:Ljava/lang/String;

.field public static Icon2:Ljava/lang/String;

.field public static SelState:Z

.field public static prefString:Ljava/lang/String;


# instance fields
.field marginw:I

.field sizew:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    sput-boolean v0, LMC/UI/OpenButtonListExtenderRight;->SelState:Z

    const-string v0, "OpenButtonListExtenderRight"

    sput-object v0, LMC/UI/OpenButtonListExtenderRight;->prefString:Ljava/lang/String;

    const-string v0, "m_off"

    sput-object v0, LMC/UI/OpenButtonListExtenderRight;->Icon1:Ljava/lang/String;

    const-string v0, "m_on"

    sput-object v0, LMC/UI/OpenButtonListExtenderRight;->Icon2:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    const/4 v4, 0x1

    const/4 v3, 0x0

    invoke-direct {p0, p1}, Landroid/widget/ToggleButton;-><init>(Landroid/content/Context;)V

    const/high16 v1, 0x42040000    # 33.0f

    invoke-virtual {p0}, LMC/UI/OpenButtonListExtenderRight;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    invoke-static {v4, v1, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v1

    float-to-int v1, v1

    iput v1, p0, LMC/UI/OpenButtonListExtenderRight;->sizew:I

    const/high16 v1, 0x40a00000    # 5.0f

    invoke-virtual {p0}, LMC/UI/OpenButtonListExtenderRight;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    invoke-static {v4, v1, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v1

    float-to-int v1, v1

    iput v1, p0, LMC/UI/OpenButtonListExtenderRight;->marginw:I

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    iget v1, p0, LMC/UI/OpenButtonListExtenderRight;->sizew:I

    iget v2, p0, LMC/UI/OpenButtonListExtenderRight;->sizew:I

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput v3, v0, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {p0, v3}, LMC/UI/OpenButtonListExtenderRight;->setBackgroundColor(I)V

    invoke-virtual {p0, v0}, LMC/UI/OpenButtonListExtenderRight;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p0, p0}, LMC/UI/OpenButtonListExtenderRight;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    invoke-virtual {p0, p1}, LMC/UI/OpenButtonListExtenderRight;->init(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public UpdateUi(Landroid/content/Context;)V
    .locals 6

    invoke-virtual {p0}, LMC/UI/OpenButtonListExtenderRight;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget-object v3, LMC/UI/OpenButtonListExtenderRight;->Icon1:Ljava/lang/String;

    const-string v4, "drawable"

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v3, v4, v5}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0}, LMC/UI/OpenButtonListExtenderRight;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget-object v3, LMC/UI/OpenButtonListExtenderRight;->Icon2:Ljava/lang/String;

    const-string v4, "drawable"

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v3, v4, v5}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    sget-boolean v2, LMC/UI/OpenButtonListExtenderRight;->SelState:Z

    if-eqz v2, :cond_0

    invoke-virtual {p0, v0}, LMC/UI/OpenButtonListExtenderRight;->setBackgroundResource(I)V

    :goto_0
    invoke-virtual {p0}, LMC/UI/OpenButtonListExtenderRight;->invalidate()V

    return-void

    :cond_0
    invoke-virtual {p0, v1}, LMC/UI/OpenButtonListExtenderRight;->setBackgroundResource(I)V

    goto :goto_0
.end method

.method public init(Landroid/content/Context;)V
    .locals 3

    const-string v1, ""

    invoke-virtual {p0, v1}, LMC/UI/OpenButtonListExtenderRight;->setText(Ljava/lang/CharSequence;)V

    const-string v1, ""

    invoke-virtual {p0, v1}, LMC/UI/OpenButtonListExtenderRight;->setTextOff(Ljava/lang/CharSequence;)V

    const-string v1, ""

    invoke-virtual {p0, v1}, LMC/UI/OpenButtonListExtenderRight;->setTextOn(Ljava/lang/CharSequence;)V

    const-string v1, "camera_preferences"

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    sget-object v1, LMC/UI/OpenButtonListExtenderRight;->prefString:Ljava/lang/String;

    invoke-static {v1}, LMC/Utils;->staticMenuValueBB(Ljava/lang/String;)Z

    move-result v1

    sput-boolean v1, LMC/UI/OpenButtonListExtenderRight;->SelState:Z

    sget-boolean v1, LMC/UI/OpenButtonListExtenderRight;->SelState:Z

    invoke-virtual {p0, v1}, LMC/UI/OpenButtonListExtenderRight;->setChecked(Z)V

    invoke-virtual {p0, p1}, LMC/UI/OpenButtonListExtenderRight;->UpdateUi(Landroid/content/Context;)V

    sget-boolean v1, LMC/UI/OpenButtonListExtenderRight;->SelState:Z

    invoke-virtual {p0, v1}, LMC/UI/OpenButtonListExtenderRight;->setPressed(Z)V

    return-void
.end method

.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 6

    sput-boolean p2, LMC/UI/OpenButtonListExtenderRight;->SelState:Z

    invoke-virtual {p1}, Landroid/widget/CompoundButton;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, LMC/hslh;->HapticFeedback(Landroid/content/Context;)V

    sget-object v2, LMC/UI/OpenButtonListExtenderRight;->prefString:Ljava/lang/String;

    sget-boolean v3, LMC/UI/OpenButtonListExtenderRight;->SelState:Z

    invoke-static {v2, v3}, LMC/Utils;->putBool(Ljava/lang/String;Z)V

    invoke-virtual {p0, v1}, LMC/UI/OpenButtonListExtenderRight;->UpdateUi(Landroid/content/Context;)V

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v2, LMC/UI/OpenButtonListExtenderRight$1;

    invoke-direct {v2, p0}, LMC/UI/OpenButtonListExtenderRight$1;-><init>(LMC/UI/OpenButtonListExtenderRight;)V

    const-wide/16 v4, 0x12c

    invoke-virtual {v0, v2, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    const-string v2, "Zoran Log: "

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "ZFlash State is : "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-boolean v4, LMC/UI/OpenButtonListExtenderRight;->SelState:Z

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
