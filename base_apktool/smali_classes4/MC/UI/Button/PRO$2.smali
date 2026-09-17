.class LMC/UI/Button/PRO$2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LMC/UI/Button/PRO;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:LMC/UI/Button/PRO;


# direct methods
.method constructor <init>(LMC/UI/Button/PRO;)V
    .locals 0

    iput-object p1, p0, LMC/UI/Button/PRO$2;->this$1:LMC/UI/Button/PRO;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    invoke-static {}, LMC/Utils;->onRestart()V

    return-void
.end method
