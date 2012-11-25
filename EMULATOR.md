

adb logcat:

    I/ActivityManager(  852): Displayed
    com.leviwilson.android/.HelloAndroidActivity: +337ms
    I/ActivityManager(  852): Starting: Intent {
    act=android.intent.action.MAIN cat=[android.intent.category.LAUNCHER]
    flg=0x10200000 cmp=com.leviwilson.android/.HelloAndroidActivity } from
    pid 943
    I/android-travis( 1226): onCreate
    I/ActivityManager(  852): Displayed
    com.leviwilson.android/.HelloAndroidActivity: +347ms


run from shell:

adb shell am start -a android.intent.action.MAIN -n com.leviwilson.android/.HelloAndroidActivity

