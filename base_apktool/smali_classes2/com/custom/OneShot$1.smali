.class Lcom/custom/OneShot$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/custom/OneShot;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/custom/OneShot;


# direct methods
.method constructor <init>(Lcom/custom/OneShot;)V
    .locals 0

    iput-object p1, p0, Lcom/custom/OneShot$1;->this$0:Lcom/custom/OneShot;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 2

    sget v0, Lcom/custom/OneShot;->OneShotState:I

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    sput v0, Lcom/custom/OneShot;->OneShotState:I

    invoke-virtual {p1}, Landroid/widget/CompoundButton;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/custom/OneShot$1;->this$0:Lcom/custom/OneShot;

    invoke-virtual {v1, v0}, Lcom/custom/OneShot;->UpdateUi(Landroid/content/Context;)V

    invoke-static {}, Lcom/google/android/apps/camera/legacy/app/activity/main/CameraActivity;->ReInit()V

    return-void
.end method
