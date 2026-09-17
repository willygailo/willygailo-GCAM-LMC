.class public LMC/UI/Button/Leica;
.super Landroid/widget/ToggleButton;


# static fields
.field public static SelState:I


# instance fields
.field public myChangeListner:Landroid/widget/CompoundButton$OnCheckedChangeListener;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    sput v0, LMC/UI/Button/Leica;->SelState:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0, p1}, Landroid/widget/ToggleButton;-><init>(Landroid/content/Context;)V

    new-instance v0, LMC/UI/Button/Leica$1;

    invoke-direct {v0, p0}, LMC/UI/Button/Leica$1;-><init>(LMC/UI/Button/Leica;)V

    iput-object v0, p0, LMC/UI/Button/Leica;->myChangeListner:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    invoke-virtual {p0, p1}, LMC/UI/Button/Leica;->init(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Landroid/widget/ToggleButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance v0, LMC/UI/Button/Leica$1;

    invoke-direct {v0, p0}, LMC/UI/Button/Leica$1;-><init>(LMC/UI/Button/Leica;)V

    iput-object v0, p0, LMC/UI/Button/Leica;->myChangeListner:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    invoke-virtual {p0, p1}, LMC/UI/Button/Leica;->init(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ToggleButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance v0, LMC/UI/Button/Leica$1;

    invoke-direct {v0, p0}, LMC/UI/Button/Leica$1;-><init>(LMC/UI/Button/Leica;)V

    iput-object v0, p0, LMC/UI/Button/Leica;->myChangeListner:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    invoke-virtual {p0, p1}, LMC/UI/Button/Leica;->init(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 1

    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/ToggleButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    new-instance v0, LMC/UI/Button/Leica$1;

    invoke-direct {v0, p0}, LMC/UI/Button/Leica$1;-><init>(LMC/UI/Button/Leica;)V

    iput-object v0, p0, LMC/UI/Button/Leica;->myChangeListner:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    invoke-virtual {p0, p1}, LMC/UI/Button/Leica;->init(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public UpdateUi(Landroid/content/Context;)V
    .locals 7

    sget v3, LMC/UI/Button/Leica;->SelState:I

    packed-switch v3, :pswitch_data_0

    :goto_0
    invoke-virtual {p0}, LMC/UI/Button/Leica;->invalidate()V

    return-void

    :pswitch_0
    invoke-virtual {p0}, LMC/UI/Button/Leica;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const-string v4, "leica_off"

    const-string v5, "drawable"

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v4, v5, v6}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, LMC/UI/Button/Leica;->setBackgroundResource(I)V

    goto :goto_0

    :pswitch_1
    invoke-virtual {p0}, LMC/UI/Button/Leica;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const-string v4, "leica_on"

    const-string v5, "drawable"

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v4, v5, v6}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p0, v1}, LMC/UI/Button/Leica;->setBackgroundResource(I)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public init(Landroid/content/Context;)V
    .locals 4

    const-string v1, ""

    invoke-virtual {p0, v1}, LMC/UI/Button/EXP;->setText(Ljava/lang/CharSequence;)V

    const-string v1, ""

    invoke-virtual {p0, v1}, LMC/UI/Button/EXP;->setTextOff(Ljava/lang/CharSequence;)V

    const-string v1, ""

    invoke-virtual {p0, v1}, LMC/UI/Button/EXP;->setTextOn(Ljava/lang/CharSequence;)V

    const-string v1, "camera_preferences"

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    const-string v0, "pref_shading_mode_key"

    invoke-static {v0}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v0

    sput v0, LMC/UI/Button/Leica;->SelState:I

    invoke-virtual {p0, p1}, LMC/UI/Button/Leica;->UpdateUi(Landroid/content/Context;)V

    iget-object v0, p0, LMC/UI/Button/Leica;->myChangeListner:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    invoke-virtual {p0, v0}, LMC/UI/Button/Leica;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    return-void
.end method
