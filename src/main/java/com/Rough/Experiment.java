package com.Rough;

import com.Base.BaseClass;

public class Experiment extends BaseClass {

    public static String Browser="Chrome";

    public static void main(String[] args) {
        launchBrowser(Browser);
        closeBrowser(Browser);

    }
}
