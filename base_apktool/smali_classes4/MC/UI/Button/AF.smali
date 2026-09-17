.class public LMC/UI/Button/AF;
.super Landroid/widget/ToggleButton;


# static fields
.field public static SelState:I


# instance fields
.field public myChangeListner:Landroid/widget/CompoundButton$OnCheckedChangeListener;

.field public myClickListener:Landroid/view/View$OnClickListener;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    sput v0, LMC/UI/Button/AF;->SelState:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0, p1}, Landroid/widget/ToggleButton;-><init>(Landroid/content/Context;)V

    new-instance v0, LMC/UI/Button/AF$1;

    invoke-direct {v0, p0}, LMC/UI/Button/AF$1;-><init>(LMC/UI/Button/AF;)V

    iput-object v0, p0, LMC/UI/Button/AF;->myChangeListner:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    new-instance v0, LMC/UI/Button/AF$2;

    invoke-direct {v0, p0}, LMC/UI/Button/AF$2;-><init>(LMC/UI/Button/AF;)V

    iput-object v0, p0, LMC/UI/Button/AF;->myClickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {p0, p1}, LMC/UI/Button/AF;->init(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Landroid/widget/ToggleButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance v0, LMC/UI/Button/AF$1;

    invoke-direct {v0, p0}, LMC/UI/Button/AF$1;-><init>(LMC/UI/Button/AF;)V

    iput-object v0, p0, LMC/UI/Button/AF;->myChangeListner:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    new-instance v0, LMC/UI/Button/AF$2;

    invoke-direct {v0, p0}, LMC/UI/Button/AF$2;-><init>(LMC/UI/Button/AF;)V

    iput-object v0, p0, LMC/UI/Button/AF;->myClickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {p0, p1}, LMC/UI/Button/AF;->init(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ToggleButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance v0, LMC/UI/Button/AF$1;

    invoke-direct {v0, p0}, LMC/UI/Button/AF$1;-><init>(LMC/UI/Button/AF;)V

    iput-object v0, p0, LMC/UI/Button/AF;->myChangeListner:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    new-instance v0, LMC/UI/Button/AF$2;

    invoke-direct {v0, p0}, LMC/UI/Button/AF$2;-><init>(LMC/UI/Button/AF;)V

    iput-object v0, p0, LMC/UI/Button/AF;->myClickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {p0, p1}, LMC/UI/Button/AF;->init(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 1

    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/ToggleButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    new-instance v0, LMC/UI/Button/AF$1;

    invoke-direct {v0, p0}, LMC/UI/Button/AF$1;-><init>(LMC/UI/Button/AF;)V

    iput-object v0, p0, LMC/UI/Button/AF;->myChangeListner:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    new-instance v0, LMC/UI/Button/AF$2;

    invoke-direct {v0, p0}, LMC/UI/Button/AF$2;-><init>(LMC/UI/Button/AF;)V

    iput-object v0, p0, LMC/UI/Button/AF;->myClickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {p0, p1}, LMC/UI/Button/AF;->init(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public UpdateUi(Landroid/content/Context;)V
    .locals 7

    sget v3, LMC/UI/Button/AF;->SelState:I

    packed-switch v3, :pswitch_data_0

    :goto_0
    invoke-virtual {p0}, LMC/UI/Button/AF;->invalidate()V

    return-void

    :pswitch_0
    invoke-virtual {p0}, LMC/UI/Button/AF;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const-string v4, "pref_focus_off"

    const-string v5, "drawable"

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v4, v5, v6}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, LMC/UI/Button/AF;->setBackgroundResource(I)V

    goto :goto_0

    :pswitch_1
    invoke-virtual {p0}, LMC/UI/Button/AF;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const-string v4, "pref_focus_on"

    const-string v5, "drawable"

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v4, v5, v6}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p0, v1}, LMC/UI/Button/AF;->setBackgroundResource(I)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public getVisibility()V
    .locals 2

    const-string v1, "pref_show_button_af"

    invoke-static {v1}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_0

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, LMC/UI/Button/AF;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public init(Landroid/content/Context;)V
    .locals 4

    const-string v1, ""

    invoke-virtual {p0, v1}, LMC/UI/Button/AF;->setText(Ljava/lang/CharSequence;)V

    const-string v1, ""

    invoke-virtual {p0, v1}, LMC/UI/Button/AF;->setTextOff(Ljava/lang/CharSequence;)V

    const-string v1, ""

    invoke-virtual {p0, v1}, LMC/UI/Button/AF;->setTextOn(Ljava/lang/CharSequence;)V

    const-string v1, "camera_preferences"

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    const-string v0, "pref_mf_key"

    invoke-static {v0}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v0

    sput v0, LMC/UI/Button/AF;->SelState:I

    invoke-virtual {p0}, LMC/UI/Button/AF;->getVisibility()V

    invoke-virtual {p0, p1}, LMC/UI/Button/AF;->UpdateUi(Landroid/content/Context;)V

    iget-object v0, p0, LMC/UI/Button/AF;->myChangeListner:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    invoke-virtual {p0, v0}, LMC/UI/Button/AF;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    iget-object v0, p0, LMC/UI/Button/AF;->myClickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {p0, v0}, LMC/UI/Button/AF;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
